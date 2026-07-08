package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nZA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439620nZA {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isPrivate() == 1 || !C0CHQ.LIZ().getAccountService().isLogin() || !ComplianceServiceProvider.LJIJJLI().LJFF() || C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return false;
        }
        C1428640nHS.LIZ.getClass();
        if (!C1428640nHS.LIZJ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_lightning_editpage_popup_remove", true, false) && LIZ(videoPublishEditModel) && !videoPublishEditModel.isEnterFromDM()) {
            return true;
        }
        return false;
    }
}
