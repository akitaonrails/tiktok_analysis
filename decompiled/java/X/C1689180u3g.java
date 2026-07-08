package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.SPMMappingConfig;

/* JADX INFO: renamed from: X.0u3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689180u3g {
    public static final SPMMappingConfig LIZ;
    public static final SPMMappingConfig LIZIZ;

    static {
        SPMMappingConfig sPMMappingConfig = new SPMMappingConfig(null, null);
        LIZ = sPMMappingConfig;
        try {
            SPMMappingConfig sPMMappingConfig2 = (SPMMappingConfig) C0C64.LJIILLIIL().LJJII(SPMMappingConfig.class, sPMMappingConfig, "feedback_access_control", true);
            if (sPMMappingConfig2 != null) {
                sPMMappingConfig = sPMMappingConfig2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            sPMMappingConfig = LIZ;
        }
        LIZIZ = sPMMappingConfig;
    }
}
