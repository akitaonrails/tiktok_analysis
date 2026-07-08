package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361690EFz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Pair<Integer, Integer> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361690EFz(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, long j, Pair<Integer, Integer> pair, boolean z, boolean z2) {
        super(0);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c0e48;
        this.LLILLL = j;
        this.LLILZ = pair;
        this.LLILZIL = z;
        this.LLILZLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0LAB c0labLJFF = C361680EFy.LJFF(this.LLILLL, this.LL, this.LLILLJJLI, this.LLILZ);
        c0labLJFF.LJ("enter_method", this.LLILZIL ? "click_button" : "click_material");
        c0labLJFF.LJ("track_type", this.LLILZIL ? CardStruct.IStatusCode.DEFAULT : this.LLILZLL ? "video" : "pip");
        c0labLJFF.LIZ(this.LL.creativeModel.audioCopyrightDetectModel.getCopyrightClaimShowing() ? 1 : 0, "is_copyright_claim");
        c0labLJFF.LIZ(this.LL.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.SHORT_VIDEO.getScene())) ? 1 : 0, "is_short_video");
        c0labLJFF.LIZ(this.LL.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.ECOMMERCE.getScene())) ? 1 : 0, "is_ecommerce_video");
        c0labLJFF.LIZ(this.LL.creativeModel.audioCopyrightDetectModel.getDetectScenes().contains(Integer.valueOf(C0FPS.LONG_VIDEO.getScene())) ? 1 : 0, "is_long_video");
        C20684815ws.LJIILLIIL("click_edit_tab", c0labLJFF.LIZ);
        return Unit.LIZ;
    }
}
