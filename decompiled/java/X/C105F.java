package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* JADX INFO: renamed from: X.105F, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C105F {
    public static final int LIZ(PrivacyUserSettingsV2 privacyUserSettingsV2, String str, int i) {
        Integer numLIZ;
        if (privacyUserSettingsV2 != null && (numLIZ = privacyUserSettingsV2.LIZ(str)) != null) {
            return numLIZ.intValue();
        }
        return i;
    }
}
