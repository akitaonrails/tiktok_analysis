package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322200kVm {
    public static final Class<?> LIZ = C1322200kVm.class;
    public static C1320820kTY LIZIZ;
    public static C1321360kUQ LIZJ;
    public static volatile boolean LIZLLL;
    public static boolean LJ;

    static {
        C1332730kml.LJJJJI.getClass();
        C01GW c01gw = C1332730kml.LJII;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332730kml.LIZ;
        LIZLLL = c01gw.getValue() != null;
        LJ = true;
    }

    public static void LIZLLL() {
        C1321360kUQ c1321360kUQ;
        if (LIZIZ == null) {
            C1322140kVg.LIZJ.getClass();
            C01GW c01gw = C1322140kVg.LIZIZ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1322140kVg.LIZ;
            if (c01gw.getValue() != null) {
                LIZIZ = (C1320820kTY) ((InterfaceC1320070kSL) c01gw.getValue());
            }
        }
        if (LIZIZ != null || (c1321360kUQ = LIZJ) == null) {
            return;
        }
        LIZIZ = c1321360kUQ.LIZ();
    }

    public static C1325540kbA LIZ() {
        return C1328130kfL.LJIILIIL().LJIIL();
    }

    public static C1320810kTX LIZJ() {
        LIZLLL();
        C1320820kTY c1320820kTY = LIZIZ;
        c1320820kTY.getClass();
        return new C1320810kTX(c1320820kTY.LIZ, c1320820kTY.LIZJ, c1320820kTY.LIZIZ, c1320820kTY.LIZLLL);
    }

    public static void LIZIZ(Context context, C1328800kgQ c1328800kgQ) {
        C1336010ks3.LIZIZ();
        boolean z = LIZLLL;
        Class<?> cls = LIZ;
        if (z) {
            C1328570kg3.LIZJ(cls, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            if (!LJ) {
                C1336010ks3.LIZIZ();
                return;
            }
        } else {
            LIZLLL = true;
        }
        try {
            C1336010ks3.LIZIZ();
            C1322210kVn.LIZ(context);
            C1336010ks3.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJIJ(cls, e, "Could not initialize SoLoader", new Object[0]);
            C1336010ks3.LIZIZ();
        }
        Context contextN3 = C786410Ut5.N3(context);
        if (c1328800kgQ == null) {
            C1328130kfL.LJIL(contextN3);
        } else {
            C1328130kfL.LJJ(c1328800kgQ);
            C1328130kfL.LJIILIIL().LJJIII = C1328730kgJ.LIZ;
            C1328130kfL.LJIILIIL().LJJIIJ = C1328730kgJ.LIZIZ;
            C1328130kfL.LJIILIIL().LJJIIJZLJL = C1328730kgJ.LIZJ;
            C1328130kfL.LJIILIIL().LJJIIZ = C1328730kgJ.LJFF;
        }
        C1336010ks3.LIZIZ();
        C1321360kUQ c1321360kUQ = new C1321360kUQ(contextN3);
        LIZJ = c1321360kUQ;
        C1322110kVd.initialize(c1321360kUQ);
        C1336010ks3.LIZIZ();
        C1336010ks3.LIZIZ();
    }
}
