package X;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS0S0412100_25;
import kotlin.jvm.internal.AwS24S0410000_25;

/* JADX INFO: renamed from: X.0tS2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665840tS2 {
    public static final void LIZ(Function0<Unit> function0, Function0<Unit> function02, Function1<? super C1378605aS, Unit> function1, EnumC1308705Af enumC1308705Af, long j, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        boolean z2;
        C05P1 c05p1;
        int i10;
        C1665850tS3 c1665850tS3;
        C1665850tS3 c1665850tS32;
        boolean z3 = z;
        long j2 = j;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(624075134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1308705Af.ordinal())) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIJJ(j2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i12 = i2 & 32;
        if (i12 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                j2 = C1665860tS4.LIZIZ;
            }
            boolean z4 = true;
            if (i12 != 0) {
                z3 = true;
            }
            final C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function0, c13zcLJIIJ);
            final C05P0 c05p0LJIIIIZZ2 = C20028913Yh.LJIIIIZZ(function02, c13zcLJIIJ);
            final C05P0 c05p0LJIIIIZZ3 = C20028913Yh.LJIIIIZZ(function1, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                c13zcLJIIJ.LJJIJIIJI(C20028913Yh.LJI(Boolean.FALSE));
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            final C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            EnumC1308705Af enumC1308705Af2 = EnumC1308705Af.RECORDING;
            if (enumC1308705Af == enumC1308705Af2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            C05P1 c05p1LIZIZ = C1675660ths.LIZIZ(f, C1671550tbF.LIZLLL((int) j2, 0, C05Y0.LIZLLL, 2), 0.0f, "Progress Animation", null, c13zcLJIIJ, 3072, 20);
            Float fValueOf = Float.valueOf(((Number) c05p1LIZIZ.getValue()).floatValue());
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p1LIZIZ) | z2;
            if ((i3 & 112) != 32) {
                z4 = false;
            }
            boolean z5 = zLJJIIJ | z4;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (!z5 && objLJJ3 != c1680520tpi) {
                c05p1 = c05p1LIZIZ;
                i10 = 2;
            } else {
                c05p1 = c05p1LIZIZ;
                i10 = 2;
                objLJJ3 = new C05P7(enumC1308705Af, function02, c05p1LIZIZ, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJ(enumC1308705Af, fValueOf, (Function2) objLJJ3, c13zcLJIIJ);
            if (enumC1308705Af == enumC1308705Af2) {
                c1665850tS3 = C1665860tS4.LIZLLL;
            } else {
                c1665850tS3 = C1665860tS4.LIZJ;
            }
            C05P1 c05p1LIZ = C1675660ths.LIZ(c1665850tS3.LIZIZ, C1671550tbF.LIZLLL(350, 0, C1670400tZO.LIZ(c13zcLJIIJ).LJII, i10), "outer radius", null, c13zcLJIIJ, 384, 8);
            if (enumC1308705Af == enumC1308705Af2) {
                c1665850tS32 = C1665860tS4.LIZLLL;
            } else {
                c1665850tS32 = C1665860tS4.LIZJ;
            }
            C05P1 c05p1LIZ2 = C1675660ths.LIZ(c1665850tS32.LIZ, C1671550tbF.LIZLLL(350, 0, C1670400tZO.LIZ(c13zcLJIIJ).LJII, 2), "inner radius", null, c13zcLJIIJ, 384, 8);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(InterfaceC1685750ty9.LIZ, C1665860tS4.LIZ);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ) | c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ3) | c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ2);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new PointerInputEventHandler() { // from class: X.05U0
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C1360105Tz(c05p0, c05p0LJIIIIZZ, c05p0LJIIIIZZ3, c05p0LJIIIIZZ2, null), interfaceC1364105Vn);
                        if (objLIZIZ == C099R.LJFF()) {
                            return objLIZIZ;
                        }
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1668160tVm.LIZ(C1679720toQ.LIZ(interfaceC1685750ty9LJIILIIL, unit, (PointerInputEventHandler) objLJJ4), null, false, C13Z4.LIZJ(1975553364, new AwS24S0410000_25(enumC1308705Af, (EnumC1308705Af) z3, (boolean) c05p1LIZ, (C05P1<C1668650tWZ>) c05p1LIZ2, (C05P1<C1668650tWZ>) c05p1, (C05P1<Float>) 0), c13zcLJIIJ), c13zcLJIIJ, 3072, 6);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0412100_25((Function0) function0, function02, (Function0<Unit>) function1, (Function1<? super C1378605aS, Unit>) enumC1308705Af, (EnumC1308705Af) j2, (long) z3, (boolean) i, i2, 0);
        }
    }
}
