package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798980VVw {
    public static boolean LIZIZ;
    public static InterfaceC798870VVl LIZJ;
    public static C0VWE LIZLLL;
    public static C0VWB LJ;
    public static C0VWF LJFF;
    public static final C798980VVw LIZ = new C798980VVw();
    public static final Map<String, C799000VVy> LJI = new LinkedHashMap();

    public static final void LIZIZ(String str) {
        if (!LIZIZ) {
            return;
        }
        C0VWF c0vwf = LJFF;
        InterfaceC798870VVl interfaceC798870VVl = null;
        if (c0vwf == null) {
            c0vwf = null;
        }
        if (!c0vwf.LIZ(str)) {
            return;
        }
        Map<String, C799000VVy> map = LJI;
        C799000VVy c799000VVy = (C799000VVy) ((LinkedHashMap) map).get(str);
        if (c799000VVy == null) {
            c799000VVy = new C799000VVy(str);
            map.put(str, c799000VVy);
        }
        if (!c799000VVy.LIZJ) {
            C0VWB c0vwb = LJ;
            if (c0vwb == null) {
                c0vwb = null;
            }
            c0vwb.LIZIZ(c799000VVy.LIZIZ());
            InterfaceC798870VVl interfaceC798870VVl2 = LIZJ;
            if (interfaceC798870VVl2 != null) {
                interfaceC798870VVl = interfaceC798870VVl2;
            }
            interfaceC798870VVl.LJIIL(c799000VVy);
            c799000VVy.LIZJ = true;
        }
    }

    public static final void LIZJ(String str) {
        C799000VVy c799000VVyRemove;
        if (LIZIZ && (c799000VVyRemove = LJI.remove(str)) != null && c799000VVyRemove.LIZJ) {
            C0VWB c0vwb = LJ;
            InterfaceC798870VVl interfaceC798870VVl = null;
            if (c0vwb == null) {
                c0vwb = null;
            }
            c0vwb.LIZ(c799000VVyRemove.LIZIZ());
            InterfaceC798870VVl interfaceC798870VVl2 = LIZJ;
            if (interfaceC798870VVl2 != null) {
                interfaceC798870VVl = interfaceC798870VVl2;
            }
            interfaceC798870VVl.LJIIIZ(c799000VVyRemove);
            c799000VVyRemove.LIZIZ = 1;
        }
    }

    public static final void LIZ(C798860VVk c798860VVk, C0VW8 c0vw8, C0VW7 c0vw7, C0VW9 c0vw9) {
        if (!LIZIZ) {
            synchronized (LIZ) {
                try {
                    if (!LIZIZ) {
                        LIZJ = c798860VVk;
                        LIZLLL = c0vw8;
                        LJ = c0vw7;
                        LJFF = c0vw9;
                        LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
