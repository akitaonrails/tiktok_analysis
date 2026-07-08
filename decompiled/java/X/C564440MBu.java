package X;

import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564440MBu extends C09AY implements Function1<C0LAB, Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ PromptModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564440MBu(VideoPublishEditModel videoPublishEditModel, long j, long j2, PromptModel promptModel) {
        super(1);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = promptModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LAB c0lab) {
        String modelPrompt;
        C0LAB c0lab2 = c0lab;
        AILivePhotoModel aILivePhotoModel = this.LL.getAILivePhotoModel();
        PromptPageMobParam promptPageMobParam = aILivePhotoModel.mobParam;
        c0lab2.LIZIZ(this.LLILLJJLI, "process_duration");
        AIAliveInfo originAIAliveInfo = aILivePhotoModel.consumptionModel.getOriginAIAliveInfo();
        if (originAIAliveInfo != null && (modelPrompt = originAIAliveInfo.getModelPrompt()) != null) {
            c0lab2.LJ("origin_ai_alive_prompt", modelPrompt);
        }
        c0lab2.LIZIZ(this.LLILLL, "upload_duration");
        c0lab2.LJ("prompt_type", this.LLILZ.promptTypeMob);
        c0lab2.LJ("prompt_text", this.LLILZ.prompt);
        Integer num = promptPageMobParam.aiWriteLastFailReason;
        if (num != null) {
            c0lab2.LIZ(num.intValue(), "ai_writing_fail_reason");
        }
        return Unit.LIZ;
    }
}
