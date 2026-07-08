package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.Intrinsics;
import uxk.a;

/* JADX INFO: renamed from: X.10CE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CE {
    public static final C10CE LIZ = new C10CE();

    public static boolean LIZIZ() {
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJJIJ = ComplianceServiceProvider.LJIJJ().LJJIJ("video_visibility_select");
        return privacySettingsAgreementRecordLJJIJ != null && 1 == privacySettingsAgreementRecordLJJIJ.status;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getAdsAuthorizationSwitch()) {
            if (videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getSparkAdsAuth() != null && !Intrinsics.LJFF(videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getSparkAdsAuth(), "{}")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (C1444450ngx.LIZ()) {
            a.LIZ.getClass();
            if (a.LJIIJJI()) {
                a.LJI();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "halfsheet");
                int iLIZLLL = a.LIZLLL();
                if (iLIZLLL != 1) {
                    if (iLIZLLL != 2) {
                        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
                        if (privacyUserSettingsV2LJIIIIZZ != null && C103K.LIZ(privacyUserSettingsV2LJIIIIZZ)) {
                            str = "Follower";
                        } else {
                            str = "Everyone";
                        }
                    } else {
                        str = "Friend";
                    }
                } else {
                    str = "Only you";
                }
                c2344009Gk.LJIIIIZZ("default_status", str);
                c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
                C20684815ws.LJIILLIIL("show_visibility_notice", c2344009Gk.LIZ);
            }
        }
        if (C1444450ngx.LIZ()) {
            a.LIZ.getClass();
            if (a.LJIIJJI()) {
                return;
            }
        }
        if (LIZIZ()) {
            return;
        }
        C1444600nhC.LIZ.getClass();
        if (!C1444600nhC.LIZ() || LIZ(videoPublishEditModel)) {
            return;
        }
        a.LIZ.getClass();
        Keva keva = a.LJIIIIZZ;
        String str2 = a.LIZLLL;
        keva.storeInt(str2, keva.getInt(str2, 0) + 1);
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (C1444450ngx.LIZ()) {
            a.LIZ.getClass();
            if (a.LJIIJJI()) {
                return true;
            }
        }
        if (LIZIZ()) {
            return true;
        }
        C1444600nhC.LIZ.getClass();
        if (!C1444600nhC.LIZ() || LIZ(videoPublishEditModel)) {
            return false;
        }
        a.LIZ.getClass();
        if (a.LJIIIIZZ.getInt(a.LIZLLL, 0) < 5) {
            return true;
        }
        return false;
    }
}
