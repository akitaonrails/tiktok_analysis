package X;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS163S0400000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS6S0302000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669570tY3 {
    public static final void LIZ(final C05ZJ c05zj, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super C0MAE, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1302535644);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05zj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            final C05ZM c05zm = (C05ZM) c13zcLJIIJ.LJJIL(C20055113dV.LJIIJJI);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            final C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(interfaceC1685750ty92, 1.0f);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJII = c13zcLJIIJ.LJII(c05zm);
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII2 = z | zLJII | c13zcLJIIJ.LJII(interfaceC497601wk);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new PointerInputEventHandler() { // from class: X.05ZK
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C1369605Xq(null, new AwS546S0100000_2(c05zj, 1072), new AwS546S0100000_2(c05zj, 1073), new AwS368S0200000_2(c05zm, c05zj, 111), new AwS163S0400000_2(c05zj, (C05ZJ) interfaceC1369205Xm, (InterfaceC1369205Xm) c05p0, (C05P0<C09AE>) interfaceC497601wk, (InterfaceC497601wk) 0)), interfaceC1364105Vn);
                        if (objLIZIZ != C099R.LJFF()) {
                            objLIZIZ = Unit.LIZ;
                        }
                        if (objLIZIZ == C099R.LJFF()) {
                            return objLIZIZ;
                        }
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C636400Oxi.LIZJ(C1679720toQ.LIZ(interfaceC1685750ty9LJ, unit, (PointerInputEventHandler) objLJJ3), c05zj.LIZ, null, false, C1679930tol.LJI(12), null, null, false, null, function1, c13zcLJIIJ, ((i3 << 21) & 1879048192) | 24576, 492);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0302000_25(c05zj, (C05ZJ) interfaceC1685750ty92, (InterfaceC1685750ty9) function1, (Function1<? super C0MAE, Unit>) i, i2, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.InterfaceC1685750ty9 r52, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r53, boolean r54, int r55, X.AbstractC1690640u62 r56, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r57, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r58, kotlin.jvm.functions.Function1<? super X.C1683130ttv, kotlin.Unit> r59, X.InterfaceC1680500tpg r60, int r61, int r62) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1669570tY3.LIZJ(X.0ty9, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel, boolean, int, X.0u62, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.0tpg, int, int):void");
    }

    public static final void LIZIZ(SocMediaResource socMediaResource, MediaEngine mediaEngine, Function1<? super SocMediaResource, Unit> function1, Function1<? super SocMediaResource, Unit> function12, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, float f, float f2, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        float f3 = f2;
        float f4 = f;
        boolean z3 = z;
        boolean z4 = z2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1270583154);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
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
            if (c13zcLJIIJ.LJJIIJ(mediaEngine)) {
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
            if (c13zcLJIIJ.LJII(function12)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i14 = i2 & 32;
        if (i14 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i15 = i2 & 64;
        if (i15 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f4)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i16 = i2 & 128;
        if (i16 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        int i17 = i2 & 256;
        if (i17 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((i3 & 38347923) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i13 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i14 != 0) {
                z3 = false;
            }
            if (i15 != 0) {
                f4 = 1.0f;
            }
            if (i16 != 0) {
                f3 = 0.0f;
            }
            if (i17 != 0) {
                z4 = true;
            }
            c13zcLJIIJ.LJJIIJZLJL(1259712676);
            c13zcLJIIJ.LJJIIJZLJL(1259713344);
            if (z3) {
                interfaceC1685750ty9LIZ = C1675890tiF.LIZ(interfaceC1685750ty92, 2, C1670400tZO.LIZIZ(c13zcLJIIJ).V2(), C1669050tXD.LIZIZ(f3));
            } else {
                interfaceC1685750ty9LIZ = interfaceC1685750ty92;
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1669600tY6.LIZIZ(C1675450thX.LIZ(InterfaceC1685750ty9.LIZ, f4), socMediaResource, true, function12, null, C13Z4.LIZJ(1124705138, new C1669540tY0(socMediaResource, mediaEngine, f3, z4, function1), c13zcLJIIJ), c13zcLJIIJ, ((i3 << 3) & 112) | 196992 | (i3 & 7168), 16);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1669550tY1(socMediaResource, mediaEngine, function1, function12, interfaceC1685750ty92, z3, f4, f3, z4, i, i2);
        }
    }
}
