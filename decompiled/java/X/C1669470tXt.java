package X;

import Y.AObjectS317S0200000_25;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669470tXt {
    public static final void LIZ(boolean z, final Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z2, C1669440tXq c1669440tXq, C1669500tXw c1669500tXw, boolean z3, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1669490tXv interfaceC1669490tXv, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        InterfaceC1669490tXv interfaceC1669490tXvLIZ;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        float f;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        InterfaceC1669490tXv interfaceC1669490tXv2;
        int i12;
        InterfaceC595010NVj interfaceC595010NVj2 = interfaceC595010NVj;
        boolean z11 = z3;
        C1669500tXw c1669500tXw2 = c1669500tXw;
        C1669440tXq c1669440tXq2 = c1669440tXq;
        boolean z12 = z2;
        InterfaceC1669490tXv interfaceC1669490tXv3 = interfaceC1669490tXv;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(688585604);
        boolean z13 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z13)) {
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
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z12)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i15 = i2 & 16;
        if (i15 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1669440tXq2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1669500tXw2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i17 = i2 & 64;
        if (i17 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z11)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i18 = i2 & 128;
        if (i18 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC595010NVj2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((100663296 & i) == 0) {
            if ((i2 & 256) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1669490tXv3)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((i3 & 38347923) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            interfaceC1669490tXv2 = interfaceC1669490tXv3;
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                interfaceC1669490tXvLIZ = interfaceC1669490tXv3;
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    interfaceC1669490tXvLIZ = interfaceC1669490tXv3;
                }
            } else {
                if (i13 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i14 != 0) {
                    z12 = false;
                }
                if (i15 != 0) {
                    c1669440tXq2 = C1669440tXq.LIZIZ;
                }
                if (i16 != 0) {
                    c1669500tXw2 = C1669500tXw.LIZLLL;
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if (i18 != 0) {
                    interfaceC595010NVj2 = null;
                }
                interfaceC1669490tXvLIZ = interfaceC1669490tXv3;
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    interfaceC1669490tXvLIZ = C1669380tXk.LIZ(0L, 0L, 0L, c13zcLJIIJ, 24576, 15);
                }
            }
            c13zcLJIIJ.LJJJJLI();
            c13zcLJIIJ.LJJIIJZLJL(305815799);
            if (function0 != null) {
                z13 = z13;
                interfaceC1685750ty9LIZ = C634490Oud.LIZ(interfaceC1685750ty92, z13, interfaceC595010NVj2, C1673460teK.LIZIZ(c1669500tXw2.LIZIZ, c13zcLJIIJ, 0), z11, new C20279814Wu(1), function0);
            } else {
                interfaceC1685750ty9LIZ = interfaceC1685750ty92;
            }
            c13zcLJIIJ.LJJJJL(false);
            if (z11) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(Float.valueOf(f), c13zcLJIIJ);
            C05P1 c05p1LIZJ = interfaceC1669490tXvLIZ.LIZJ(z13, c13zcLJIIJ);
            C05P0 c05p0LIZIZ = interfaceC1669490tXvLIZ.LIZIZ(c13zcLJIIJ);
            C05P0 c05p0LIZ = interfaceC1669490tXvLIZ.LIZ(c13zcLJIIJ);
            long j = ((C1685910tyP) c05p1LIZJ.getValue()).LIZ;
            long j2 = ((C1685910tyP) c05p0LIZ.getValue()).LIZ;
            int i19 = ((i3 >> 9) & 896) | (i3 & 14) | ((i3 >> 6) & 112) | ((i3 >> 3) & 7168);
            c13zcLJIIJ.LJJIIJZLJL(-508770555);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C413090GHr();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            AbstractC413080GHq abstractC413080GHq = (AbstractC413080GHq) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new C413070GHp();
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C413070GHp c413070GHp = (C413070GHp) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = new C413100GHs();
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            AbstractC413080GHq abstractC413080GHq2 = (AbstractC413080GHq) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((((i19 & 896) ^ 384) <= 256 || !c13zcLJIIJ.LJJIIJ(c1669500tXw2)) && (i19 & 384) != 256) {
                z4 = false;
            } else {
                z4 = true;
            }
            if ((((i19 & 7168) ^ 3072) <= 2048 || !c13zcLJIIJ.LJJIIJ(c1669440tXq2)) && (i19 & 3072) != 2048) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z14 = z5 | z4;
            if ((((i19 & 14) ^ 6) <= 4 || !c13zcLJIIJ.LJIIZILJ(z13)) && (i19 & 6) != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z15 = z14 | z6;
            if ((((57344 & i19) ^ 24576) <= 16384 || !c13zcLJIIJ.LJIJJ(j)) && (i19 & 24576) != 16384) {
                z7 = false;
            } else {
                z7 = true;
            }
            boolean z16 = z15 | z7;
            if ((((i19 & 112) ^ 48) <= 32 || !c13zcLJIIJ.LJIIZILJ(z12)) && (i19 & 48) != 32) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean z17 = z16 | z8;
            if ((((458752 & i19) ^ 196608) <= 131072 || !c13zcLJIIJ.LJIJJ(j2)) && (i19 & 196608) != 131072) {
                z9 = false;
            } else {
                z9 = true;
            }
            boolean z18 = z17 | z9;
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (z18 || objLJJ4 == c1680520tpi) {
                if (z12) {
                    abstractC413080GHq2.LJ(C1685850tyJ.LJIIIZ(j));
                }
                if (z13) {
                    abstractC413080GHq.LJ(C1685850tyJ.LJIIIZ(j));
                    abstractC413080GHq.LJ.setColor(C1685850tyJ.LJIIIZ(j2));
                } else {
                    c413070GHp.LIZIZ.setColor(C1685850tyJ.LJIIIZ(j));
                }
                boolean zLJFF = Intrinsics.LJFF(c1669500tXw2, C1669500tXw.LIZLLL);
                abstractC413080GHq.LIZLLL(c1669500tXw2.LIZIZ, c1669440tXq2.LIZ, zLJFF);
                c413070GHp.LIZJ(c1669500tXw2.LIZIZ, c1669440tXq2.LIZ, zLJFF);
                abstractC413080GHq2.LIZLLL(c1669500tXw2.LIZIZ, c1669440tXq2.LIZ, zLJFF);
                Drawable drawable = abstractC413080GHq;
                if (!z13) {
                    drawable = c413070GHp;
                }
                objLJJ4 = new C1685380txY(drawable);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            AbstractC1676270tir abstractC1676270tir = (AbstractC1676270tir) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJJJL(false);
            float density = ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII)).getDensity();
            float f2 = c1669500tXw2.LIZ;
            final float f3 = (density * f2) / 24;
            InterfaceC1671600tbK interfaceC1671600tbK = new InterfaceC1671600tbK(f3) { // from class: X.0jqT
                public final float LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1296590jqT) && Float.compare(this.LIZIZ, ((C1296590jqT) obj).LIZIZ) == 0;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FixedScale(value=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public final int hashCode() {
                    return Float.floatToIntBits(this.LIZIZ);
                }

                {
                    this.LIZIZ = f3;
                }

                @Override // X.InterfaceC1671600tbK
                public final long LIZ(long j3, long j4) {
                    float f4 = this.LIZIZ;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f4)));
                    int i20 = C1296550jqP.LIZ;
                    return jFloatToRawIntBits;
                }
            };
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(interfaceC1685750ty9LIZ, f2);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if ((i3 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | z10;
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ5 == c1680520tpi) {
                objLJJ5 = new AObjectS317S0200000_25(c1669500tXw2, c05p0LIZIZ, 2);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1668230tVt.LIZ(abstractC1676270tir, "CheckBox", C1665900tS8.LIZ(C1680910tqL.LIZJ(interfaceC1685750ty9LJIILIIL, (Function1) objLJJ5), ((Number) c05p0LJIIIIZZ.getValue()).floatValue()), null, interfaceC1671600tbK, 0.0f, null, c13zcLJIIJ, 48, 104);
            interfaceC1669490tXv2 = interfaceC1669490tXvLIZ;
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final boolean z19 = z13;
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final boolean z20 = z12;
            final C1669440tXq c1669440tXq3 = c1669440tXq2;
            final C1669500tXw c1669500tXw3 = c1669500tXw2;
            final boolean z21 = z11;
            final InterfaceC595010NVj interfaceC595010NVj3 = interfaceC595010NVj2;
            final InterfaceC1669490tXv interfaceC1669490tXv4 = interfaceC1669490tXv2;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tXu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z22 = z19;
                    Function0 function02 = function0;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    boolean z23 = z20;
                    C1669440tXq c1669440tXq4 = c1669440tXq3;
                    C1669500tXw c1669500tXw4 = c1669500tXw3;
                    boolean z24 = z21;
                    InterfaceC595010NVj interfaceC595010NVj4 = interfaceC595010NVj3;
                    InterfaceC1669490tXv interfaceC1669490tXv5 = interfaceC1669490tXv4;
                    int i20 = i;
                    int i21 = i2;
                    ((Integer) obj2).intValue();
                    C1669470tXt.LIZ(z22, function02, interfaceC1685750ty94, z23, c1669440tXq4, c1669500tXw4, z24, interfaceC595010NVj4, interfaceC1669490tXv5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i20 | 1), i21);
                    return Unit.LIZ;
                }
            };
        }
    }
}
