package X;

import com.ss.android.ugc.aweme.config.End2EndConfig;

/* JADX INFO: renamed from: X.0POj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644150POj {
    public static final End2EndConfig LIZ = new End2EndConfig(2600, 600, 2000);
    public static End2EndConfig LIZIZ;

    public static final End2EndConfig LIZ() {
        End2EndConfig end2EndConfig = LIZIZ;
        if (end2EndConfig != null) {
            return end2EndConfig;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        End2EndConfig end2EndConfig2 = LIZ;
        End2EndConfig end2EndConfig3 = (End2EndConfig) c0c64LJIILLIIL.LJJII(End2EndConfig.class, end2EndConfig2, "search_bsr_end_2_end_config", true);
        if (end2EndConfig3 != null) {
            end2EndConfig2 = end2EndConfig3;
        }
        LIZIZ = end2EndConfig2;
        return end2EndConfig2;
    }
}
