package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* JADX INFO: renamed from: X.103K, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C103K {
    public static final boolean LIZ(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        Integer numLIZ = privacyUserSettingsV2.LIZ("private_account");
        if (numLIZ != null && numLIZ.intValue() == 1) {
            return true;
        }
        return false;
    }
}
