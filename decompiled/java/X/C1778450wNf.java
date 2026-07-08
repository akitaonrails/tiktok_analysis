package X;

import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0wNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778450wNf {
    public static final VEVideoEncodeSettings.ENCODE_PROFILE LIZ(EnumC1778480wNi enumC1778480wNi) {
        int i = C1778460wNg.LIZ[enumC1778480wNi.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
                    }
                    throw new C1954807lC();
                }
                return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
            }
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        }
        return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
    }
}
