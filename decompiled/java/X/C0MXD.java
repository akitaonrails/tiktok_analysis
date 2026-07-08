package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MXD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXD {
    public static final Function0 LIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, final Function0 function0) {
        boolean z;
        interfaceC1680500tpg.LJJIIJZLJL(1434227762);
        int i2 = ((i << 3) & 112) | ((i >> 3) & 14);
        interfaceC1680500tpg.LJJIIJZLJL(364690826);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = C20028913Yh.LJI(0L);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        final C05P0 c05p0 = (C05P0) objLJJ;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        boolean z2 = true;
        final long j = 300;
        if ((((i2 & 14) ^ 6) <= 4 || !interfaceC1680500tpg.LJIJJ(300L)) && (i2 & 6) != 4) {
            z = false;
        } else {
            z = true;
        }
        if ((((i2 & 112) ^ 48) <= 32 || !interfaceC1680500tpg.LJJIIJ(function0)) && (i2 & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (z3 || objLJJ2 == c1680520tpi) {
            objLJJ2 = new Function0() { // from class: X.05Aw
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    long j2 = j;
                    Function0 function02 = function0;
                    C05P0 c05p02 = c05p0;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - ((Number) c05p02.getValue()).longValue() > j2) {
                        c05p02.setValue(Long.valueOf(jCurrentTimeMillis));
                        function02.invoke();
                    }
                    return Unit.LIZ;
                }
            };
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        Function0 function02 = (Function0) objLJJ2;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJ();
        return function02;
    }
}
