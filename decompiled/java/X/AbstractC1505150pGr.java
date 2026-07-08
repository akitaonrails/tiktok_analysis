package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1505150pGr {
    public boolean LIZ;

    public abstract boolean LIZ(String str);

    public void LIZIZ() {
    }

    public abstract String LIZJ(String str);

    public abstract ConcurrentHashMap<String, String> LJI();

    public final synchronized void LJII() {
        if (!this.LIZ) {
            this.LIZ = true;
            LIZIZ();
        }
    }

    public final double LIZLLL(String str) {
        String strLIZJ = LIZJ(str);
        if (strLIZJ != null && C786830Utl.LIZ(strLIZJ)) {
            try {
                return CastDoubleProtector.parseDouble(strLIZJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0.0d;
            }
        }
        return 0.0d;
    }

    public final float LJ(String str) {
        String strLIZJ = LIZJ(str);
        if (strLIZJ != null && C786830Utl.LIZ(strLIZJ)) {
            try {
                return CastFloatProtector.parseFloat(strLIZJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final int LJFF(int i, String str) {
        String strLIZJ = LIZJ(str);
        if (strLIZJ != null && C786830Utl.LIZ(strLIZJ)) {
            try {
                i = (int) CastDoubleProtector.parseDouble(strLIZJ);
                return i;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }
}
