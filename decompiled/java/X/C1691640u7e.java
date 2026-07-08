package X;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0u7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691640u7e {
    public static final List LJFF(List list, Function0 function0) {
        C1691730u7n c1691730u7n;
        if (((Boolean) function0.invoke()).booleanValue()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                InterfaceC1673370teB interfaceC1673370teB = (InterfaceC1673370teB) ListProtector.get(list, i);
                C1691740u7o c1691740u7o = (C1691740u7o) ((C1690620u60) interfaceC1673370teB.LJJJ()).LIZIZ;
                C1692980u9o c1692980u9o = c1691740u7o.LIZ;
                C1692270u8f c1692270u8f = c1691740u7o.LIZIZ;
                C1692150u8T c1692150u8T = (C1692150u8T) ((C13FE) c1692980u9o.LIZ).getValue();
                if (c1692150u8T == null) {
                    c1691730u7n = new C1691730u7n(0, 0, AFwS214S0000000_25.get$arr$(580));
                } else {
                    C1692270u8f c1692270u8fLIZJ = C1692980u9o.LIZJ(c1692270u8f, c1692150u8T);
                    if (c1692270u8fLIZJ == null) {
                        c1691730u7n = new C1691730u7n(0, 0, AFwS214S0000000_25.get$arr$(581));
                    } else {
                        C1680470tpd c1680470tpdLIZ = C1691700u7k.LIZ(c1692150u8T.LJIILJJIL(c1692270u8fLIZJ.LIZIZ, c1692270u8fLIZJ.LIZJ).getBounds());
                        c1691730u7n = new C1691730u7n(c1680470tpdLIZ.LIZJ - c1680470tpdLIZ.LIZ, c1680470tpdLIZ.LIZLLL - c1680470tpdLIZ.LIZIZ, new AwS569S0100000_25(c1680470tpdLIZ, 1137));
                    }
                }
                int i2 = c1691730u7n.LIZ;
                int i3 = c1691730u7n.LIZIZ;
                arrayList.add(new Pair(interfaceC1673370teB.LJJJJZ(C1682400tsk.LIZIZ(i2, i2, i3, i3)), c1691730u7n.LIZJ));
            }
            return arrayList;
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static final void LIZ(String str, InterfaceC1685750ty9 interfaceC1685750ty9, C1693430uAX c1693430uAX, Function1 function1, int i, boolean z, int i2, InterfaceC1680500tpg interfaceC1680500tpg, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13 = i2;
        boolean z3 = z;
        int i14 = i;
        Function1 function12 = function1;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1022429478);
        String str2 = str;
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i16 = i4 & 4;
        if (i16 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        int i17 = i4 & 8;
        if (i17 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i18 = i4 & 16;
        if (i18 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJI(i14)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        int i19 = i4 & 32;
        if (i19 != 0) {
            i5 |= 196608;
        } else if ((196608 & i3) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        int i20 = i4 & 64;
        if (i20 != 0) {
            i5 |= 1572864;
        } else if ((1572864 & i3) == 0) {
            if (c13zcLJIIJ.LJIJI(i13)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        if ((i5 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i5 & 1, z2)) {
            if (i15 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i16 != 0) {
                c1693430uAX2 = C1693430uAX.LIZLLL;
            }
            if (i17 != 0) {
                function12 = null;
            }
            if (i18 != 0) {
                i14 = 1;
            }
            if (i19 != 0) {
                z3 = true;
            }
            if (i20 != 0) {
                i13 = Integer.MAX_VALUE;
            }
            int i21 = (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016);
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            C1693430uAX c1693430uAX3 = c1693430uAX2;
            str2 = str2;
            LIZJ(str2, interfaceC1685750ty93, c1693430uAX3, function12, i14, z3, i13, 1, null, null, c13zcLJIIJ, i21, 768);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1689730u4Z(str2, interfaceC1685750ty92, c1693430uAX2, function12, i14, z3, i13, i3, i4);
        }
    }

    @InterfaceC1294060jmO
    public static final void LIZLLL(String str, InterfaceC1685750ty9 interfaceC1685750ty9, C1693430uAX c1693430uAX, Function1 function1, int i, boolean z, int i2, int i3, InterfaceC1691620u7c interfaceC1691620u7c, InterfaceC1680500tpg interfaceC1680500tpg, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        InterfaceC1691620u7c interfaceC1691620u7c2;
        int i16 = i3;
        int i17 = i2;
        int i18 = i;
        Function1 function12 = function1;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        boolean z3 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1186827822);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i4;
        } else {
            i6 = i4;
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        int i20 = i5 & 4;
        if (i20 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        int i21 = i5 & 8;
        if (i21 != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i10 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i10 = 1024;
            }
            i6 |= i10;
        }
        int i22 = i5 & 16;
        if (i22 != 0) {
            i6 |= 24576;
        } else if ((i4 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJI(i18)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i6 |= i11;
        }
        int i23 = i5 & 32;
        if (i23 != 0) {
            i6 |= 196608;
        } else if ((196608 & i4) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i6 |= i12;
        }
        int i24 = i5 & 64;
        if (i24 != 0) {
            i6 |= 1572864;
        } else if ((1572864 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i17)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i6 |= i13;
        }
        int i25 = i5 & 128;
        if (i25 != 0) {
            i6 |= 12582912;
        } else if ((12582912 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i16)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i6 |= i14;
        }
        int i26 = i5 & 256;
        if (i26 != 0) {
            i6 |= 100663296;
        } else if ((100663296 & i4) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1691620u7c)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i6 |= i15;
        }
        if ((i6 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i6 & 1, z2)) {
            if (i19 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i20 != 0) {
                c1693430uAX2 = C1693430uAX.LIZLLL;
            }
            interfaceC1691620u7c2 = null;
            if (i21 != 0) {
                function12 = null;
            }
            if (i22 != 0) {
                i18 = 1;
            }
            if (i23 != 0) {
                z3 = true;
            }
            if (i24 != 0) {
                i17 = Integer.MAX_VALUE;
            }
            if (i25 != 0) {
                i16 = 1;
            }
            if (i26 == 0) {
                interfaceC1691620u7c2 = interfaceC1691620u7c;
            }
            LIZJ(str, interfaceC1685750ty92, c1693430uAX2, function12, i18, z3, i17, i16, interfaceC1691620u7c2, null, c13zcLJIIJ, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), 512);
        } else {
            c13zcLJIIJ.LIZJ();
            interfaceC1691620u7c2 = interfaceC1691620u7c;
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1691680u7i(str, interfaceC1685750ty92, c1693430uAX2, function12, i18, z3, i17, i16, interfaceC1691620u7c2, i4, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1 A[PHI: r12
      0x01f1: PHI (r12v2 X.0u7z) = (r12v4 X.0u7z), (r12v4 X.0u7z), (r12v11 X.0u7z) binds: [B:76:0x013a, B:77:0x013c, B:75:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(java.lang.String r25, X.InterfaceC1685750ty9 r26, X.C1693430uAX r27, kotlin.jvm.functions.Function1<? super X.C1692150u8T, kotlin.Unit> r28, int r29, boolean r30, int r31, int r32, X.InterfaceC1691620u7c r33, X.InterfaceC1691630u7d r34, X.InterfaceC1680500tpg r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691640u7e.LIZJ(java.lang.String, X.0ty9, X.0uAX, kotlin.jvm.functions.Function1, int, boolean, int, int, X.0u7c, X.0u7d, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C1692220u8a r33, X.InterfaceC1685750ty9 r34, X.C1693430uAX r35, kotlin.jvm.functions.Function1<? super X.C1692150u8T, kotlin.Unit> r36, int r37, boolean r38, int r39, int r40, java.util.Map<java.lang.String, X.C1672660td2> r41, X.InterfaceC1691620u7c r42, X.InterfaceC1691630u7d r43, X.InterfaceC1680500tpg r44, int r45, int r46, int r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691640u7e.LIZIZ(X.0u8a, X.0ty9, X.0uAX, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, X.0u7c, X.0u7d, X.0tpg, int, int, int):void");
    }

    public static final InterfaceC1685750ty9 LJI(InterfaceC1685750ty9 interfaceC1685750ty9, C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, Function1<? super C1692150u8T, Unit> function1, int i, boolean z, int i2, int i3, InterfaceC594710NUf interfaceC594710NUf, List<C1692270u8f<C1680210tpD>> list, Function1<? super List<C1683130ttv>, Unit> function12, C1691850u7z c1691850u7z, InterfaceC1691620u7c interfaceC1691620u7c, Function1<? super C1691710u7l, Unit> function13, InterfaceC1691630u7d interfaceC1691630u7d) {
        if (c1691850u7z == null) {
            return interfaceC1685750ty9.LIZ(InterfaceC1685750ty9.LIZ).LIZ(new TextAnnotatedStringElement(c1692220u8a, c1693430uAX, interfaceC594710NUf, function1, i, z, i2, i3, list, function12, interfaceC1691620u7c, interfaceC1691630u7d, function13));
        }
        return interfaceC1685750ty9.LIZ(c1691850u7z.LLILZLL).LIZ(new SelectableTextAnnotatedStringElement(c1692220u8a, c1693430uAX, interfaceC594710NUf, function1, i, z, i2, i3, list, function12, c1691850u7z, interfaceC1691620u7c, interfaceC1691630u7d));
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(X.InterfaceC1685750ty9 r21, X.C1692220u8a r22, kotlin.jvm.functions.Function1<? super X.C1692150u8T, kotlin.Unit> r23, boolean r24, java.util.Map<java.lang.String, X.C1672660td2> r25, X.C1693430uAX r26, int r27, boolean r28, int r29, int r30, X.InterfaceC594710NUf r31, X.C1691850u7z r32, X.InterfaceC1691620u7c r33, kotlin.jvm.functions.Function1<? super X.C1691710u7l, kotlin.Unit> r34, X.InterfaceC1691630u7d r35, X.InterfaceC1680500tpg r36, int r37, int r38, int r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691640u7e.LJ(X.0ty9, X.0u8a, kotlin.jvm.functions.Function1, boolean, java.util.Map, X.0uAX, int, boolean, int, int, X.0NUf, X.0u7z, X.0u7c, kotlin.jvm.functions.Function1, X.0u7d, X.0tpg, int, int, int):void");
    }
}
