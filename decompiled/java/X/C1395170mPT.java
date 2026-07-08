package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0mPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395170mPT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(392));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(390));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(395));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(396));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(394));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(393));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(391));

    public static int LIZ() {
        if (LIZJ(((Number) LJFF.getValue()).floatValue())) {
            return 2;
        }
        return LIZIZ(((Number) LJI.getValue()).floatValue()) ? 0 : 1;
    }

    public static boolean LIZIZ(float f) {
        if (C2215011Bmd.LIZIZ() > 3) {
            if (C2215011Bmd.LIZ() == 0 || Float.compare(C2215011Bmd.LIZ(), f) >= 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(float f) {
        int iLIZIZ = C2215011Bmd.LIZIZ();
        if (iLIZIZ > 3 || iLIZIZ == 0) {
            if (C2215011Bmd.LIZ() != 0 && Float.compare(C2215011Bmd.LIZ(), f) < 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static C1395180mPU LIZLLL(List list) {
        try {
            if (list.isEmpty()) {
                return new C1395180mPU(-2, (InterfaceC1395230mPZ) null, 6);
            }
            if (C2215011Bmd.LIZIZ() <= 2 && C2215011Bmd.LIZIZ() != 0) {
                return new C1395180mPU(-2, LJ(list), 4);
            }
            if (LIZJ(((Number) LIZ.getValue()).floatValue())) {
                return new C1395180mPU(1, (InterfaceC1395230mPZ) list.get(list.size() - 1), ((Number) LIZJ.getValue()).longValue());
            }
            if (LIZIZ(((Number) LIZIZ.getValue()).floatValue())) {
                return new C1395180mPU(1, (InterfaceC1395230mPZ) list.get(0), ((Number) LJ.getValue()).longValue());
            }
            if (list.size() > 2) {
                return new C1395180mPU(1, (InterfaceC1395230mPZ) list.get(1), ((Number) LIZLLL.getValue()).longValue());
            }
            return new C1395180mPU(1, (InterfaceC1395230mPZ) list.get(0), ((Number) LIZLLL.getValue()).longValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C1395180mPU(-1, (InterfaceC1395230mPZ) null, 6);
        }
    }

    public static InterfaceC1395230mPZ LJ(List list) {
        if (Float.compare(C2215011Bmd.LIZ(), ((Number) LIZ.getValue()).floatValue()) < 0) {
            return (InterfaceC1395230mPZ) ListProtector.get(list, list.size() - 1);
        }
        if (Float.compare(C2215011Bmd.LIZ(), ((Number) LIZIZ.getValue()).floatValue()) >= 0) {
            return (InterfaceC1395230mPZ) ListProtector.get(list, 0);
        }
        if (list.size() > 2) {
            return (InterfaceC1395230mPZ) ListProtector.get(list, 1);
        }
        return (InterfaceC1395230mPZ) ListProtector.get(list, 0);
    }
}
