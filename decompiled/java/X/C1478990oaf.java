package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* JADX INFO: renamed from: X.0oaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478990oaf {
    public static boolean LIZ;
    public static MLModel LIZIZ;

    public static MLModel LIZ() {
        if (!LIZ) {
            try {
                C0C64.LJIILLIIL().getClass();
                LIZIZ = (MLModel) C0C64.LJJI(MLModel.class, "speed_ml", false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZIZ = null;
            }
            LIZ = true;
        }
        return LIZIZ;
    }
}
