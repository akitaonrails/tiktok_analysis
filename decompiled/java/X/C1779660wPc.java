package X;

import com.bytedance.ies.cutsame.prepare.FeatureConfig;
import com.bytedance.ies.cutsame.prepare.VECompileBpsConfig;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0wPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1779660wPc {
    public static final VEConfig LIZ = new VEConfig(true, 30, 35, new VECompileBpsConfig(16777216, 10485760, false), 10000000, "high", new FeatureConfig(40, 3686400));

    public static VEVideoEncodeSettings.ENCODE_PROFILE LIZ() {
        String str = LIZ.encodeProfile;
        int iHashCode = str.hashCode();
        if (iHashCode != 3016401) {
            if (iHashCode != 3202466) {
                if (iHashCode == 3343801 && str.equals("main")) {
                    return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
                }
            } else if (str.equals("high")) {
                return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
            }
        } else if (str.equals("base")) {
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        }
        return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
    }
}
