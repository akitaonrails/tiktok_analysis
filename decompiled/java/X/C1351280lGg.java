package X;

import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351280lGg {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZ(String str, String str2) {
        int iHashCode = str.hashCode();
        if (iHashCode != -897050771) {
            if (iHashCode != 97308242) {
                if (iHashCode == 109254796 && str.equals(Scene.SCENE_SERVICE) && Intrinsics.LJFF(str2, "qc_follow_scene_not_met")) {
                    return "qc_exempt_scene_not_met";
                }
                return str2;
            }
            if (!str.equals("feed0")) {
                return str2;
            }
            switch (str2.hashCode()) {
                case -1409095534:
                    if (!str2.equals("qc_feed0_exit_cooldown")) {
                        return str2;
                    }
                    return "qc_exempt_feed0_exit_cooldown";
                case -84319534:
                    if (!str2.equals("qc_feed0_daily_cap")) {
                        return str2;
                    }
                    return "qc_exempt_feed0_daily_cap";
                case 1376737552:
                    if (!str2.equals("qc_follow_gate_feed0_other")) {
                        return str2;
                    }
                    return "qc_exempt_feed0_other";
                case 1690510387:
                    if (!str2.equals("qc_feed0_max_exit")) {
                        return str2;
                    }
                    return "qc_exempt_feed0_max_exit";
                default:
                    return str2;
            }
        }
        if (!str.equals("social")) {
            return str2;
        }
        switch (str2.hashCode()) {
            case -2056360590:
                if (!str2.equals("qc_freq_daily_cap")) {
                    return str2;
                }
                return "qc_exempt_muf_freq_daily_cap";
            case -1984847054:
                if (!str2.equals("qc_freq_exit_cooldown")) {
                    return str2;
                }
                return "qc_exempt_muf_freq_exit_cooldown";
            case -1670243101:
                if (!str2.equals("qc_legacy_social_daily_cap")) {
                    return str2;
                }
                return "qc_exempt_muf_legacy_daily_cap";
            case 272882536:
                if (!str2.equals("qc_social_freq_unknown")) {
                    return str2;
                }
                return "qc_exempt_muf_freq_unknown";
            case 408477780:
                if (!str2.equals("qc_legacy_social_cooldown")) {
                    return str2;
                }
                return "qc_exempt_muf_legacy_cooldown";
            case 1211254163:
                if (!str2.equals("qc_freq_max_exit")) {
                    return str2;
                }
                return "qc_exempt_muf_freq_max_exit";
            case 1362256898:
                if (!str2.equals("qc_legacy_social_max_exit")) {
                    return str2;
                }
                return "qc_exempt_muf_legacy_max_exit";
            case 1374003007:
                if (!str2.equals("qc_freq_interval")) {
                    return str2;
                }
                return "qc_exempt_muf_freq_interval";
            default:
                return str2;
        }
    }
}
