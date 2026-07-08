package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS123S0201000_19;
import kotlin.jvm.internal.AwS126S0201000_30;

/* JADX INFO: renamed from: X.13ZT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZT {
    public static C13DQ LIZJ(Function0 function0) {
        return new C13DQ(C595410NWx.LIZ, function0);
    }

    public static final void LIZ(C13DO<?> c13do, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1350970552);
        c13zcLJIIJ.LJLIL(c13do);
        function2.invoke(c13zcLJIIJ, Integer.valueOf((i >> 3) & 14));
        c13zcLJIIJ.LJJJJLL();
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS123S0201000_19((C13DO) c13do, (C13DO<?>) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, 0);
        }
    }

    public static final void LIZIZ(C13DO<?>[] c13doArr, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1390796515);
        c13zcLJIIJ.LJLILLLLZI(c13doArr);
        function2.invoke(c13zcLJIIJ, Integer.valueOf((i >> 3) & 14));
        c13zcLJIIJ.LJJJJZ();
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS126S0201000_30((C13DO[]) c13doArr, (C13DO<?>[]) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, 0);
        }
    }
}
