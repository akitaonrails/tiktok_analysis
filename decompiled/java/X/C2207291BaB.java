package X;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.1BaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207291BaB {
    public static final SparseArray<C2207301BaC> LIZ = new SparseArray<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Boolean] */
    public static void LIZ(Context context) {
        C2207281BaA.LIZ.getClass();
        if (C2207311BaD.LJIIJ.LIZ().booleanValue()) {
            C2207271Ba9 c2207271Ba9 = C2207311BaD.LJIIIZ;
            if (!c2207271Ba9.LIZ().booleanValue()) {
                C2207231Ba5.LIZ(4);
                C2207431BaP.LIZJ.LIZIZ = context;
                C2207431BaP.LIZIZ();
                c2207271Ba9.LIZIZ = Boolean.TRUE;
            }
        }
    }

    public static void LIZLLL(HashSet<Integer> hashSet) {
        C2207311BaD c2207311BaD = C2207281BaA.LIZ;
        c2207311BaD.getClass();
        for (Integer num : hashSet) {
            synchronized (c2207311BaD.LJI) {
                try {
                    c2207311BaD.LJI.LIZ().append(num.intValue(), true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LIZIZ(C1ET4 c1et4, int i) {
        C2207301BaC c2207301BaC = new C2207301BaC(EnumC2207531BaZ.PRESET_SCENE, c1et4);
        c2207301BaC.LIZJ = i;
        C2207281BaA.LIZ.LIZ(c2207301BaC);
    }

    public static void LIZJ(C1ET4 c1et4, EnumC1649640t1u enumC1649640t1u) {
        if (enumC1649640t1u == EnumC1649640t1u.END) {
            SparseArray<C2207301BaC> sparseArray = LIZ;
            C2207301BaC c2207301BaC = sparseArray.get(c1et4.getId());
            if (c2207301BaC == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("restore a not start scene: ");
                sbLIZ.append(c1et4.getDesc());
                C2188811AlT.LIZIZ(sbLIZ);
                C2207231Ba5.LIZ(5);
                return;
            }
            c2207301BaC.LJ = true;
            C2207281BaA.LIZ.LIZ(c2207301BaC);
            sparseArray.remove(c1et4.getId());
            return;
        }
        C2207301BaC c2207301BaC2 = new C2207301BaC(EnumC2207531BaZ.PRESET_SCENE, c1et4);
        c2207301BaC2.LJ = false;
        if (C2207281BaA.LIZ.LIZ(c2207301BaC2) != null) {
            LIZ.put(c1et4.getId(), c2207301BaC2);
        }
    }
}
