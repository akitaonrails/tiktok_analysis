package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0nJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430200nJy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ PrivacySettingsRestrictionItem LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0<Integer> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430200nJy(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, PrivacySettingsRestrictionItem privacySettingsRestrictionItem, AwS572S0100000_28 awS572S0100000_28, boolean z) {
        super(0);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c19eg;
        this.LLILLL = privacySettingsRestrictionItem;
        this.LLILZ = z;
        this.LLILZIL = awS572S0100000_28;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        VideoPublishEditModel videoPublishEditModel = this.LL;
        c0lab.LJ("creation_id", videoPublishEditModel != null ? videoPublishEditModel.getCreationId() : "model is null");
        c0lab.LJ("to_status", "disabled");
        C20684815ws.LJIILLIIL("click_add_story_control", c0lab.LIZ);
        C10IZ.LJFF(this.LLILLJJLI, this.LL, this.LLILLL, this.LLILZIL, this.LLILZ);
        return Unit.LIZ;
    }
}
