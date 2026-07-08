package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS0S1602000_25;

/* JADX INFO: renamed from: X.0tbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671870tbl {
    public static final long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    static {
        long j = Integer.MIN_VALUE;
        LIZ = (j & 4294967295L) | (j << 32);
    }

    public static final C1672120tcA LIZJ(AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT) {
        return new C1672120tcA(abstractC1676640tjS, abstractC1676650tjT);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void LIZ(X.C1676910tjt<S> r20, X.InterfaceC1685750ty9 r21, kotlin.jvm.functions.Function1<? super X.InterfaceC1676580tjM<S>, X.C1672120tcA> r22, X.InterfaceC1668050tVb r23, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r24, X.InterfaceC1631630sYr<? super X.InterfaceC1671910tbp, ? super S, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r25, X.InterfaceC1680500tpg r26, int r27, int r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671870tbl.LIZ(X.0tjt, X.0ty9, kotlin.jvm.functions.Function1, X.0tVb, kotlin.jvm.functions.Function1, X.0sYr, X.0tpg, int, int):void");
    }

    public static final <S> void LIZIZ(S s, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super InterfaceC1676580tjM<S>, C1672120tcA> function1, InterfaceC1668050tVb interfaceC1668050tVb, String str, Function1<? super S, ? extends Object> function12, InterfaceC1631630sYr<? super InterfaceC1671910tbp, ? super S, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        InterfaceC1668050tVb interfaceC1668050tVb2 = interfaceC1668050tVb;
        Function1<? super S, ? extends Object> function13 = function12;
        Function1<? super InterfaceC1676580tjM<S>, C1672120tcA> function14 = function1;
        String str2 = str;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2132720749);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(s);
            } else {
                zLJII = c13zcLJIIJ.LJII(s);
            }
            if (zLJII) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function14)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1668050tVb2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i15 = i2 & 32;
        if (i15 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631630sYr)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i12 != 0) {
                function14 = AFwS266S0000000_25.get$arr$(6);
            }
            if (i13 != 0) {
                InterfaceC1668050tVb.LIZ.getClass();
                interfaceC1668050tVb2 = C1668040tVa.LIZIZ;
            }
            if (i14 != 0) {
                str2 = "AnimatedContent";
            }
            if (i15 != 0) {
                function13 = AFwS257S0000000_19.get$arr$(2);
            }
            int i16 = i3 >> 3;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            Function1<? super InterfaceC1676580tjM<S>, C1672120tcA> function15 = function14;
            InterfaceC1668050tVb interfaceC1668050tVb3 = interfaceC1668050tVb2;
            Function1<? super S, ? extends Object> function16 = function13;
            LIZ(C1676860tjo.LJ(s, str2, c13zcLJIIJ, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0), interfaceC1685750ty93, function15, interfaceC1668050tVb3, function16, interfaceC1631630sYr, c13zcLJIIJ, (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i16) | (i16 & 458752), 0);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty92;
            Function1<? super InterfaceC1676580tjM<S>, C1672120tcA> function17 = function14;
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1602000_25((Object) s, interfaceC1685750ty94, (InterfaceC1685750ty9) function17, (Function1<? super InterfaceC1676580tjM<InterfaceC1685750ty9>, C1672120tcA>) interfaceC1668050tVb2, (InterfaceC1668050tVb) str2, (String) function13, (Function1<? super InterfaceC1685750ty9, ? extends Object>) interfaceC1631630sYr, (InterfaceC1631630sYr<? super InterfaceC1671910tbp, ? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 0);
        }
    }
}
