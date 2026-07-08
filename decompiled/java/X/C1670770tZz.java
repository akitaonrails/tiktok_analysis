package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS2S0412000_25;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0tZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670770tZz {
    public static final void LIZ(EnumC1670920taE enumC1670920taE, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, InterfaceC1631620sYq<? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02 = function0;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1357367576);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1670920taE.ordinal())) {
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
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i10 != 0) {
                function02 = null;
            }
            int i11 = C1670910taD.LIZ[enumC1670920taE.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            c13zcLJIIJ.LJJIIJZLJL(-218833839);
                            interfaceC1631620sYq.invoke(interfaceC1685750ty92, c13zcLJIIJ, Integer.valueOf(((i3 >> 9) & 112) | ((i3 >> 6) & 14)));
                            c13zcLJIIJ.LJJJJL(false);
                        } else {
                            c13zcLJIIJ.LJJIIJZLJL(1239827314);
                            c13zcLJIIJ.LJJJJL(false);
                            throw new C1954807lC();
                        }
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(-219617860);
                        C1667870tVJ.LIZ(interfaceC1685750ty92, false, null, null, null, C1668870tWv.LIZ(C1669660tYC.LLLIIII, 0L, 0.0f, 0.0f, false, c13zcLJIIJ, 0, 30), null, C0MBB.LIZIZ(2131849146, c13zcLJIIJ), C0MBB.LIZIZ(2131849144, c13zcLJIIJ), C13Z4.LIZJ(-1868043386, new AwS674S0100000_25(function02, (Function0<Unit>) 41), c13zcLJIIJ), null, c13zcLJIIJ, ((i3 >> 6) & 14) | 805306416, 0, 1116);
                        c13zcLJIIJ.LJJJJL(false);
                    }
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-219933285);
                    if (z) {
                        c13zcLJIIJ.LJJIIJZLJL(-219889079);
                        interfaceC1631620sYq.invoke(interfaceC1685750ty92, c13zcLJIIJ, Integer.valueOf(((i3 >> 9) & 112) | ((i3 >> 6) & 14)));
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(-219831729);
                        C1667870tVJ.LIZ(interfaceC1685750ty92, true, null, null, null, null, null, null, null, null, null, c13zcLJIIJ, ((i3 >> 6) & 14) | 48, 0, 2044);
                        c13zcLJIIJ.LJJJJL(false);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                }
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-220029199);
                interfaceC1631620sYq.invoke(interfaceC1685750ty92, c13zcLJIIJ, Integer.valueOf(((i3 >> 9) & 112) | ((i3 >> 6) & 14)));
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0412000_25(enumC1670920taE, (EnumC1670920taE) z, (boolean) interfaceC1685750ty92, (InterfaceC1685750ty9) function02, (Function0<Unit>) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 2);
        }
    }
}
