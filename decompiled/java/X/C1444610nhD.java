package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import uxk.a;

/* JADX INFO: renamed from: X.0nhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444610nhD {
    public static final C1444610nhD LIZ = new C1444610nhD();

    public static final void LIZ(int i) {
        if (C298680BnG.LIZ() || i != 4) {
            a.LIZ.getClass();
            a.LJIIIZ(i);
        }
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJJIJ = ComplianceServiceProvider.LJIJJ().LJJIJ("video_visibility_select");
        if (privacySettingsAgreementRecordLJJIJ != null && privacySettingsAgreementRecordLJJIJ.status == 1) {
            ComplianceServiceProvider.LJIJJLI().LIZJ();
            ComplianceServiceProvider.LJIJJ().LJIJI(null, "video_visibility_select", null);
        }
    }
}
