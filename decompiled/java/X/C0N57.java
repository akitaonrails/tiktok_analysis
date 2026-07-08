package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0N57, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N57 {
    public static final C0N57 LIZ = new C0N57();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(559));
    public static volatile float LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;

    public final float LIZ() {
        if (LIZJ > 0.0f) {
            return LIZJ;
        }
        if (!LIZLLL) {
            synchronized (this) {
                try {
                    if (!LIZLLL) {
                        LIZLLL = true;
                        float f = ((Keva) LIZIZ.getValue()).getFloat("panel_height_dp", 0.0f);
                        if (f > 0.0f) {
                            LIZJ = f;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZIZ(final float f) {
        if (f <= 0.0f) {
            return;
        }
        LIZJ = f;
        if (!LJ) {
            synchronized (this) {
                try {
                    if (LJ) {
                        return;
                    }
                    LJ = true;
                    C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0N56
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("TakoSharePanelHeightCache@69be.writeToDiskOnce$2");
                            try {
                                ((Keva) C0N57.LIZIZ.getValue()).storeFloat("panel_height_dp", f);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TakoSharePanelHeightCache@69be.writeToDiskOnce$2");
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
