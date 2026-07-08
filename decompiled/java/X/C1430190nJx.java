package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0nJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430190nJx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ String LLILLJJLI = "video_edit_page";
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ PrivacySettingsRestrictionItem LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Integer> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430190nJx(VideoPublishEditModel videoPublishEditModel, C19EG c19eg, PrivacySettingsRestrictionItem privacySettingsRestrictionItem, boolean z, AwS572S0100000_28 awS572S0100000_28) {
        super(0);
        this.LL = videoPublishEditModel;
        this.LLILLL = c19eg;
        this.LLILZ = privacySettingsRestrictionItem;
        this.LLILZIL = z;
        this.LLILZLL = awS572S0100000_28;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LL;
        c0lab.LJ("creation_id", videoPublishEditModel != null ? videoPublishEditModel.getCreationId() : "model is null");
        c0lab.LJ("enter_from", this.LLILLJJLI);
        VideoPublishEditModel videoPublishEditModel2 = this.LL;
        c0lab.LJ("shoot_way", videoPublishEditModel2 != null ? videoPublishEditModel2.mShootWay : null);
        c0lab.LJ("to_status", "disabled");
        C20684815ws.LJIILLIIL("change_sticker_status", c0lab.LIZ);
        C10IZ.LJ(this.LLILLL, this.LL, this.LLILZ, this.LLILZLL, this.LLILZIL);
        return Unit.LIZ;
    }
}
