package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688060u1s {
    public static final /* synthetic */ int LIZ = 0;

    static {
        int i = AbstractC1688180u24.LIZ;
        InterfaceC1668050tVb.LIZ.getClass();
        new C1688040u1q(C1668040tVa.LJIIJ);
        new C1688020u1o(C1668040tVa.LJIILIIL);
    }

    public static final long LIZJ(InterfaceC1673370teB interfaceC1673370teB, InterfaceC1688100u1w interfaceC1688100u1w, long j, Function1<? super AbstractC1686530tzP, Unit> function1) {
        int iLJJIJ;
        int iLJJII;
        if (C1688080u1u.LIZIZ(C1688080u1u.LIZ(interfaceC1673370teB)) == 0.0f) {
            C1688080u1u.LIZ(interfaceC1673370teB);
            AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j);
            function1.invoke(abstractC1686530tzPLJJJJZ);
            return C1688300u2G.LIZ(interfaceC1688100u1w.LJI(abstractC1686530tzPLJJJJZ), interfaceC1688100u1w.LJ(abstractC1686530tzPLJJJJZ));
        }
        if (interfaceC1688100u1w.LJII()) {
            iLJJIJ = interfaceC1673370teB.LJJII(Integer.MAX_VALUE);
        } else {
            iLJJIJ = interfaceC1673370teB.LJJIJ(Integer.MAX_VALUE);
        }
        if (interfaceC1688100u1w.LJII()) {
            iLJJII = interfaceC1673370teB.LJJIJ(iLJJIJ);
        } else {
            iLJJII = interfaceC1673370teB.LJJII(iLJJIJ);
        }
        return C1688300u2G.LIZ(iLJJIJ, iLJJII);
    }

    public static final void LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1672520tco interfaceC1672520tco, InterfaceC1688160u22 interfaceC1688160u22, InterfaceC1682270tsX interfaceC1682270tsX, int i, int i2, InterfaceC1631620sYq<? super InterfaceC1678210tlz, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13 = i2;
        InterfaceC1682270tsX interfaceC1682270tsX2 = interfaceC1682270tsX;
        int i14 = i;
        InterfaceC1688160u22 interfaceC1688160u222 = interfaceC1688160u22;
        InterfaceC1672520tco interfaceC1672520tco2 = interfaceC1672520tco;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2070229740);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1672520tco2)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1688160u222)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1682270tsX2)) {
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
            if (c13zcLJIIJ.LJIJI(i14)) {
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
            if (c13zcLJIIJ.LJIJI(i13)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((i4 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        if ((i5 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i5 & 1, z)) {
            if (i15 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i16 != 0) {
                interfaceC1672520tco2 = C1679930tol.LIZ;
            }
            if (i17 != 0) {
                interfaceC1688160u222 = C1679930tol.LIZJ;
            }
            if (i18 != 0) {
                InterfaceC1668050tVb.LIZ.getClass();
                interfaceC1682270tsX2 = C1668040tVa.LJIIJ;
            }
            int i21 = Integer.MAX_VALUE;
            if (i19 != 0) {
                i14 = Integer.MAX_VALUE;
            }
            if (i20 == 0) {
                i21 = i13;
            }
            i13 = i21;
            InterfaceC1688160u22 interfaceC1688160u223 = interfaceC1688160u222;
            InterfaceC1682270tsX interfaceC1682270tsX3 = interfaceC1682270tsX2;
            int i22 = i14;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            InterfaceC1672520tco interfaceC1672520tco3 = interfaceC1672520tco2;
            LIZ(interfaceC1685750ty93, interfaceC1672520tco3, interfaceC1688160u223, interfaceC1682270tsX3, i22, i21, C1688090u1v.LJFF, interfaceC1631620sYq, c13zcLJIIJ, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1675490thb(interfaceC1685750ty92, interfaceC1672520tco2, interfaceC1688160u222, interfaceC1682270tsX2, i14, i13, interfaceC1631620sYq, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014a  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.InterfaceC1685750ty9 r20, X.InterfaceC1672520tco r21, X.InterfaceC1688160u22 r22, X.InterfaceC1682270tsX r23, int r24, int r25, X.C1688090u1v r26, X.InterfaceC1631620sYq<? super X.InterfaceC1678210tlz, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r27, X.InterfaceC1680500tpg r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688060u1s.LIZ(X.0ty9, X.0tco, X.0u22, X.0tsX, int, int, X.0u1v, X.0sYq, X.0tpg, int, int):void");
    }
}
