package X;

import Y.AObjectS1S0212000_25;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668190tVp {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, final InterfaceC1631620sYq<? super Boolean, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2142718500);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i8 != 0) {
                z2 = true;
            }
            c13zcLJIIJ.LJJIIJZLJL(1863149273);
            if (((Boolean) c13zcLJIIJ.LJJIL(C1674190tfV.LIZ)).booleanValue()) {
                interfaceC1631620sYq.invoke(Boolean.FALSE, c13zcLJIIJ, Integer.valueOf(((i3 >> 3) & 112) | 6));
                c13zcLJIIJ.LJJJJL(false);
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AObjectS1S0212000_25(i, i2, interfaceC1685750ty92, interfaceC1631620sYq, z2, 1);
                    return;
                }
                return;
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ2;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(interfaceC497601wk);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new Function1() { // from class: X.10C8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final InterfaceC497601wk interfaceC497601wk2 = interfaceC497601wk;
                        final C05P0 c05p02 = c05p0;
                        C157F c157f = new C157F((Context) obj, null, 6);
                        c157f.setAutoDarkListener(new C157D() { // from class: X.05AU
                            @Override // X.C157D
                            public final void LIZ() {
                            }

                            @Override // X.C157D
                            public final void LIZIZ(boolean z3) {
                                C23250099c.LIZLLL(interfaceC497601wk2, null, null, new C05AT(z3, c05p02, null), 3);
                            }
                        });
                        c157f.LLILZIL = true;
                        return c157f;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ((i3 << 3) & 112, 4, c13zcLJIIJ, interfaceC1685750ty92, (Function1) objLJJ3, null);
            if (z2) {
                c13zcLJIIJ.LJJIIJZLJL(1923842373);
                C1670410tZP.LIZ(C1ETL.LIZLLL(true ^ ((Boolean) c05p0.getValue()).booleanValue(), c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(708392813, new Function2<InterfaceC1680500tpg, Integer, Unit>() { // from class: X.05aV
                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg2, Integer num) {
                        InterfaceC1680500tpg interfaceC1680500tpg3 = interfaceC1680500tpg2;
                        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg3.LIZ()) {
                            interfaceC1680500tpg3.LIZJ();
                        } else {
                            interfaceC1631620sYq.invoke(Boolean.valueOf(c05p0.getValue().booleanValue()), interfaceC1680500tpg3, 0);
                        }
                        return Unit.LIZ;
                    }
                }, c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1923966032);
                interfaceC1631620sYq.invoke(Boolean.valueOf(((Boolean) c05p0.getValue()).booleanValue()), c13zcLJIIJ, Integer.valueOf((i3 >> 3) & 112));
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AObjectS1S0212000_25(i, i2, interfaceC1685750ty92, interfaceC1631620sYq, z2, 2);
        }
    }
}
