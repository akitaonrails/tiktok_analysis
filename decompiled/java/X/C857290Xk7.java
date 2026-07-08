package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: renamed from: X.0Xk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857290Xk7 extends AbstractC857240Xk2<Unit> {
    public final C19EG LLILZ;
    public final VideoPublishEditModel LLILZIL;

    @Override // X.AbstractC857240Xk2
    public final void LIZIZ() {
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZLLL() {
    }

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.PRIVACY_CONFIRMATION_CHECK_STORY.getValue().getSecond();
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(C857220Xk0 c857220Xk0) {
        boolean z;
        if (this.LLILZIL.isPrivate() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (C1439620nZA.LIZIZ(this.LLILZIL)) {
            c857220Xk0.LIZ(this);
            return;
        }
        if (z || C0C64.LJIILLIIL().LJIJ(31744, 1, "story_publish_privacy_account_confirm", true) != 1 || !ComplianceServiceProvider.LJIJJLI().LIZLLL()) {
            VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_lightning_editpage_popup_with_settings_up", true, false) || !C1439620nZA.LIZ(videoPublishEditModel)) {
                c857220Xk0.LIZ(this);
                return;
            }
        }
        c857220Xk0.LIZIZ(this);
        IPrivateAccountService iPrivateAccountServiceLJIJJLI = ComplianceServiceProvider.LJIJJLI();
        C19EG c19eg = this.LLILZ;
        iPrivateAccountServiceLJIJJLI.LJI(c19eg, c19eg.getString(2131858431), "video_edit_page", new AwS415S0200000_14(c857220Xk0, this, 129), new AwS415S0200000_14(c857220Xk0, this, 130));
    }

    public C857290Xk7(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        this.LLILZ = c19eg;
        this.LLILZIL = videoPublishEditModel;
    }
}
