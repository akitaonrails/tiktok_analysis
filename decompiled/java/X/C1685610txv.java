package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0txv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685610txv {
    @InterfaceC1294060jmO
    public static final void LIZ(C1692220u8a c1692220u8a, InterfaceC1685750ty9 interfaceC1685750ty9, C1693430uAX c1693430uAX, boolean z, int i, int i2, Function1<? super C1692150u8T, Unit> function1, final Function1<? super Integer, Unit> function12, InterfaceC1680500tpg interfaceC1680500tpg, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        Function1<? super C1692150u8T, Unit> function13 = function1;
        int i14 = i2;
        boolean z4 = z;
        int i15 = i;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-246609449);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692220u8a)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i17 = i4 & 4;
        if (i17 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        int i18 = i4 & 8;
        if (i18 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i19 = i4 & 16;
        if (i19 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJI(i15)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        int i20 = i4 & 32;
        if (i20 != 0) {
            i5 |= 196608;
        } else if ((196608 & i3) == 0) {
            if (c13zcLJIIJ.LJIJI(i14)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        int i21 = i4 & 64;
        if (i21 != 0) {
            i5 |= 1572864;
        } else if ((1572864 & i3) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else if ((12582912 & i3) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i5 |= i13;
        }
        boolean z5 = true;
        if ((4793491 & i5) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i5 & 1, z2)) {
            if (i16 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i17 != 0) {
                c1693430uAX2 = C1693430uAX.LIZLLL;
            }
            if (i18 != 0) {
                z4 = true;
            }
            if (i19 != 0) {
                i15 = 1;
            }
            if (i20 != 0) {
                i14 = Integer.MAX_VALUE;
            }
            if (i21 != 0) {
                function13 = AFwS266S0000000_25.get$arr$(581);
            }
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final C05P0 c05p0 = (C05P0) objLJJ;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            if ((29360128 & i5) == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new PointerInputEventHandler() { // from class: X.0txu
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Object objLJ = C1374405Zm.LJ(interfaceC1369205Xm, interfaceC1364105Vn, null, null, new AwS391S0200000_25(c05p0, function12, 403), C1374405Zm.LIZ);
                        if (objLJ == C099R.LJFF()) {
                            return objLJ;
                        }
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = interfaceC1685750ty92.LIZ(C1679720toQ.LIZ(c1685760tyA, function12, (PointerInputEventHandler) objLJJ2));
            if ((i5 & 3670016) != 1048576) {
                z5 = false;
            }
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z5 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS391S0200000_25(c05p0, function13, 402);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C1693430uAX c1693430uAX3 = c1693430uAX2;
            int i22 = i15;
            boolean z6 = z4;
            C1691640u7e.LIZIZ(c1692220u8a, interfaceC1685750ty9LIZ, c1693430uAX3, (Function1) objLJJ3, i22, z6, i14, 0, null, null, null, c13zcLJIIJ, (i5 & 14) | (i5 & 896) | (57344 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1685620txw(c1692220u8a, interfaceC1685750ty92, c1693430uAX2, z4, i15, i14, function13, function12, i3, i4);
        }
    }
}
