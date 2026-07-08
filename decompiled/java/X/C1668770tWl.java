package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668770tWl {
    public static final void LIZ(final C1294720jnS c1294720jnS, final Function0<Float> function0, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1668050tVb interfaceC1668050tVb, InterfaceC1671600tbK interfaceC1671600tbK, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC1671600tbK interfaceC1671600tbK2 = interfaceC1671600tbK;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC1668050tVb interfaceC1668050tVb2 = interfaceC1668050tVb;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1005555973);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1294720jnS)) {
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
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1668050tVb2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1671600tbK2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                InterfaceC1668050tVb.LIZ.getClass();
                interfaceC1668050tVb2 = C1668040tVa.LJFF;
            }
            if (i12 != 0) {
                InterfaceC1671600tbK.LIZ.getClass();
                interfaceC1671600tbK2 = C1671610tbL.LIZJ;
            }
            if (i13 != 0) {
                z2 = true;
            }
            int i14 = i3 >> 12;
            InterfaceC1668050tVb interfaceC1668050tVb3 = interfaceC1668050tVb2;
            InterfaceC1671600tbK interfaceC1671600tbK3 = interfaceC1671600tbK2;
            boolean z3 = z2;
            C1668780tWm.LIZIZ(c1294720jnS, function0, interfaceC1685750ty92, false, false, false, null, false, null, interfaceC1668050tVb3, interfaceC1671600tbK3, z3, null, null, c13zcLJIIJ, (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 << 18) & 1879048192), (i14 & 14) | (i14 & 112), 12792);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final InterfaceC1668050tVb interfaceC1668050tVb4 = interfaceC1668050tVb2;
            final InterfaceC1671600tbK interfaceC1671600tbK4 = interfaceC1671600tbK2;
            final boolean z4 = z2;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tWn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C1294720jnS c1294720jnS2 = c1294720jnS;
                    Function0 function02 = function0;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    InterfaceC1668050tVb interfaceC1668050tVb5 = interfaceC1668050tVb4;
                    InterfaceC1671600tbK interfaceC1671600tbK5 = interfaceC1671600tbK4;
                    boolean z5 = z4;
                    int i15 = i;
                    int i16 = i2;
                    ((Integer) obj2).intValue();
                    C1668770tWl.LIZ(c1294720jnS2, function02, interfaceC1685750ty94, interfaceC1668050tVb5, interfaceC1671600tbK5, z5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i15 | 1), i16);
                    return Unit.LIZ;
                }
            };
        }
    }
}
