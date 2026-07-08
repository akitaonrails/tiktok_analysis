package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;

/* JADX INFO: renamed from: X.10BY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10BY {
    public static final C10BY LIZ = new C10BY();

    public static boolean LIZ() {
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJJIJ = ComplianceServiceProvider.LJIJJ().LJJIJ("video_visibility_select");
        return privacySettingsAgreementRecordLJJIJ != null && 1 == privacySettingsAgreementRecordLJJIJ.status;
    }
}
