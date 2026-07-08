package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS0S0602000_25;
import kotlin.jvm.internal.AwS0S1412000_25;
import kotlin.jvm.internal.AwS0S1502000_25;
import kotlin.jvm.internal.AwS0S1602000_25;
import kotlin.jvm.internal.AwS1S1512000_25;

/* JADX INFO: renamed from: X.0tjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676630tjR {
    public static final EnumC1676720tja LJIIIIZZ(C1676910tjt c1676910tjt, Function1 function1, Object obj, InterfaceC1680500tpg interfaceC1680500tpg) {
        EnumC1676720tja enumC1676720tja;
        interfaceC1680500tpg.LJIIL(-902032957, c1676910tjt);
        if (c1676910tjt.LJII()) {
            interfaceC1680500tpg.LJJIIJZLJL(2101770115);
            interfaceC1680500tpg.LJ();
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enumC1676720tja = EnumC1676720tja.Visible;
            } else if (((Boolean) function1.invoke(c1676910tjt.LIZJ())).booleanValue()) {
                enumC1676720tja = EnumC1676720tja.PostExit;
            } else {
                enumC1676720tja = EnumC1676720tja.PreEnter;
            }
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(2102044248);
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            if (((Boolean) function1.invoke(c1676910tjt.LIZJ())).booleanValue()) {
                c05p0.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enumC1676720tja = EnumC1676720tja.Visible;
            } else if (((Boolean) c05p0.getValue()).booleanValue()) {
                enumC1676720tja = EnumC1676720tja.PostExit;
            } else {
                enumC1676720tja = EnumC1676720tja.PreEnter;
            }
            interfaceC1680500tpg.LJ();
        }
        interfaceC1680500tpg.LJJIJL();
        return enumC1676720tja;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void LJII(X.C1676910tjt<T> r13, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r14, X.InterfaceC1685750ty9 r15, X.AbstractC1676640tjS r16, X.AbstractC1676650tjT r17, X.InterfaceC1631620sYq<? super X.InterfaceC1671930tbr, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r18, X.InterfaceC1680500tpg r19, int r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676630tjR.LJII(X.0tjt, kotlin.jvm.functions.Function1, X.0ty9, X.0tjS, X.0tjT, X.0sYq, X.0tpg, int):void");
    }

    public static final void LIZIZ(C1676880tjq<Boolean> c1676880tjq, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, String str, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) throws Throwable {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        String str2 = str;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        AbstractC1676650tjT abstractC1676650tjTLIZIZ = abstractC1676650tjT;
        AbstractC1676640tjS abstractC1676640tjSLIZIZ = abstractC1676640tjS;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-222898426);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1676880tjq);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1676880tjq);
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
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676640tjSLIZIZ)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676650tjTLIZIZ)) {
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
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                C1676540tjI c1676540tjILJ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
                C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(0.0f, 400.0f, new C1682900ttY(C1675670tht.LIZIZ()), 1);
                InterfaceC1668050tVb.LIZ.getClass();
                abstractC1676640tjSLIZIZ = c1676540tjILJ.LIZIZ(C1676510tjF.LIZIZ(c1676890tjrLIZJ, C1668040tVa.LJIIIZ, AFwS266S0000000_25.get$arr$(387), true));
            }
            if (i12 != 0) {
                C1676550tjJ c1676550tjJLJI = C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
                C1676890tjr c1676890tjrLIZJ2 = C1671550tbF.LIZJ(0.0f, 400.0f, new C1682900ttY(C1675670tht.LIZIZ()), 1);
                InterfaceC1668050tVb.LIZ.getClass();
                abstractC1676650tjTLIZIZ = c1676550tjJLJI.LIZIZ(C1676510tjF.LJIIJJI(c1676890tjrLIZJ2, C1668040tVa.LJIIIZ, AFwS266S0000000_25.get$arr$(388), true));
            }
            if (i13 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i14 = i3 << 3;
            int i15 = i3 & 458752;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            AbstractC1676640tjS abstractC1676640tjS2 = abstractC1676640tjSLIZIZ;
            AbstractC1676650tjT abstractC1676650tjT2 = abstractC1676650tjTLIZIZ;
            LJII(C1676860tjo.LIZLLL(c1676880tjq, str2, c13zcLJIIJ, (i3 & 14) | ((i3 >> 9) & 112)), AFwS266S0000000_25.get$arr$(12), interfaceC1685750ty93, abstractC1676640tjS2, abstractC1676650tjT2, interfaceC1631620sYq, c13zcLJIIJ, i15 | (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168));
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1502000_25((C1676880tjq) c1676880tjq, (C1676880tjq<Boolean>) interfaceC1685750ty92, (InterfaceC1685750ty9) abstractC1676640tjSLIZIZ, (AbstractC1676640tjS) abstractC1676650tjTLIZIZ, (AbstractC1676650tjT) str2, (String) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 0);
        }
    }

    public static final <T> void LIZJ(C1676910tjt<T> c1676910tjt, Function1<? super T, Boolean> function1, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        AbstractC1676650tjT abstractC1676650tjTLIZIZ = abstractC1676650tjT;
        AbstractC1676640tjS abstractC1676640tjSLIZIZ = abstractC1676640tjS;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1031950689);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1676910tjt)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 2;
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
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676640tjSLIZIZ)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676650tjTLIZIZ)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                C1676540tjI c1676540tjILJ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
                C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(0.0f, 400.0f, new C1682900ttY(C1675670tht.LIZIZ()), 1);
                InterfaceC1668050tVb.LIZ.getClass();
                abstractC1676640tjSLIZIZ = c1676540tjILJ.LIZIZ(C1676510tjF.LIZIZ(c1676890tjrLIZJ, C1668040tVa.LJIIIZ, AFwS266S0000000_25.get$arr$(387), true));
            }
            if (i12 != 0) {
                C1676890tjr c1676890tjrLIZJ2 = C1671550tbF.LIZJ(0.0f, 400.0f, new C1682900ttY(C1675670tht.LIZIZ()), 1);
                InterfaceC1668050tVb.LIZ.getClass();
                abstractC1676650tjTLIZIZ = C1676510tjF.LJIIJJI(c1676890tjrLIZJ2, C1668040tVa.LJIIIZ, AFwS266S0000000_25.get$arr$(388), true).LIZIZ(C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)));
            }
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            AbstractC1676640tjS abstractC1676640tjS2 = abstractC1676640tjSLIZIZ;
            AbstractC1676650tjT abstractC1676650tjT2 = abstractC1676650tjTLIZIZ;
            LJII(c1676910tjt, function1, interfaceC1685750ty93, abstractC1676640tjS2, abstractC1676650tjT2, interfaceC1631620sYq, c13zcLJIIJ, (i3 & 458752) | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3));
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0602000_25((C1676910tjt) c1676910tjt, (Function1) function1, interfaceC1685750ty92, (InterfaceC1685750ty9) abstractC1676640tjSLIZIZ, (AbstractC1676640tjS) abstractC1676650tjTLIZIZ, (AbstractC1676650tjT) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 1);
        }
    }

    public static final void LJI(boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, String str, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        String str2 = str;
        AbstractC1676650tjT abstractC1676650tjTLIZIZ = abstractC1676650tjT;
        AbstractC1676640tjS abstractC1676640tjSLIZIZ = abstractC1676640tjS;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2088733774);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676640tjSLIZIZ)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676650tjTLIZIZ)) {
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
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z2)) {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                C1676540tjI c1676540tjILJ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
                C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(0.0f, 400.0f, new C1682900ttY(C1675670tht.LIZIZ()), 1);
                InterfaceC1668050tVb.LIZ.getClass();
                abstractC1676640tjSLIZIZ = c1676540tjILJ.LIZIZ(C1676510tjF.LIZIZ(c1676890tjrLIZJ, C1668040tVa.LJIIIZ, AFwS266S0000000_25.get$arr$(387), true));
            }
            if (i12 != 0) {
                C1676890tjr c1676890tjrLIZJ2 = C1671550tbF.LIZJ(0.0f, 400.0f, new C1682900ttY(C1675670tht.LIZIZ()), 1);
                InterfaceC1668050tVb.LIZ.getClass();
                abstractC1676650tjTLIZIZ = C1676510tjF.LJIIJJI(c1676890tjrLIZJ2, C1668040tVa.LJIIIZ, AFwS266S0000000_25.get$arr$(388), true).LIZIZ(C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)));
            }
            if (i13 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i14 = i3 << 3;
            int i15 = i3 & 458752;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            AbstractC1676640tjS abstractC1676640tjS2 = abstractC1676640tjSLIZIZ;
            AbstractC1676650tjT abstractC1676650tjT2 = abstractC1676650tjTLIZIZ;
            LJII(C1676860tjo.LJ(Boolean.valueOf(z), str2, c13zcLJIIJ, (i3 & 14) | ((i3 >> 9) & 112), 0), AFwS266S0000000_25.get$arr$(9), interfaceC1685750ty93, abstractC1676640tjS2, abstractC1676650tjT2, interfaceC1631620sYq, c13zcLJIIJ, i15 | (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168));
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1412000_25(z, (boolean) interfaceC1685750ty92, (InterfaceC1685750ty9) abstractC1676640tjSLIZIZ, (AbstractC1676640tjS) abstractC1676650tjTLIZIZ, (AbstractC1676650tjT) str2, (String) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C1676910tjt r35, kotlin.jvm.functions.Function1 r36, X.InterfaceC1685750ty9 r37, X.AbstractC1676640tjS r38, X.AbstractC1676650tjT r39, kotlin.jvm.functions.Function2 r40, X.InterfaceC1631620sYq r41, X.InterfaceC1680500tpg r42, int r43, int r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676630tjR.LIZ(X.0tjt, kotlin.jvm.functions.Function1, X.0ty9, X.0tjS, X.0tjT, kotlin.jvm.functions.Function2, X.0sYq, X.0tpg, int, int):void");
    }

    public static final void LIZLLL(InterfaceC1686920u02 interfaceC1686920u02, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, String str, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        String str2 = str;
        AbstractC1676650tjT abstractC1676650tjTLIZIZ = abstractC1676650tjT;
        AbstractC1676640tjS abstractC1676640tjSLIZIZ = abstractC1676640tjS;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1766503102);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676640tjSLIZIZ)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676650tjTLIZIZ)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((599185 & i3) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z2)) {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                abstractC1676640tjSLIZIZ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)).LIZIZ(C1676510tjF.LIZLLL(null, 15));
            }
            if (i12 != 0) {
                abstractC1676650tjTLIZIZ = C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)).LIZIZ(C1676510tjF.LJIILIIL(null, 15));
            }
            if (i13 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i14 = i3 >> 3;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            AbstractC1676640tjS abstractC1676640tjS2 = abstractC1676640tjSLIZIZ;
            AbstractC1676650tjT abstractC1676650tjT2 = abstractC1676650tjTLIZIZ;
            LJII(C1676860tjo.LJ(Boolean.valueOf(z), str2, c13zcLJIIJ, (i14 & 14) | ((i3 >> 12) & 112), 0), AFwS266S0000000_25.get$arr$(11), interfaceC1685750ty93, abstractC1676640tjS2, abstractC1676650tjT2, interfaceC1631620sYq, c13zcLJIIJ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & 458752));
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            AbstractC1676640tjS abstractC1676640tjS3 = abstractC1676640tjSLIZIZ;
            c20030013YsLJJJJZI.LIZLLL = new AwS1S1512000_25(interfaceC1686920u02, (InterfaceC1686920u02) z, (boolean) interfaceC1685750ty92, (InterfaceC1685750ty9) abstractC1676640tjS3, (AbstractC1676640tjS) abstractC1676650tjTLIZIZ, (AbstractC1676650tjT) str2, (String) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 1);
        }
    }

    public static final void LJ(InterfaceC1675480tha interfaceC1675480tha, C1676880tjq<Boolean> c1676880tjq, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, String str, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) throws Throwable {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        String str2 = str;
        AbstractC1676650tjT abstractC1676650tjTLIZIZ = abstractC1676650tjT;
        AbstractC1676640tjS abstractC1676640tjSLIZIZ = abstractC1676640tjS;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(836509870);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1676880tjq);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1676880tjq);
            }
            if (zLJII) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676640tjSLIZIZ)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676650tjTLIZIZ)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((599185 & i3) != 599184) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                abstractC1676640tjSLIZIZ = C1676510tjF.LIZ().LIZIZ(C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)));
            }
            if (i12 != 0) {
                abstractC1676650tjTLIZIZ = C1676510tjF.LJIIJ().LIZIZ(C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)));
            }
            if (i13 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i14 = i3 >> 3;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            AbstractC1676640tjS abstractC1676640tjS2 = abstractC1676640tjSLIZIZ;
            AbstractC1676650tjT abstractC1676650tjT2 = abstractC1676650tjTLIZIZ;
            LJII(C1676860tjo.LIZLLL(c1676880tjq, str2, c13zcLJIIJ, (i14 & 14) | ((i3 >> 12) & 112)), AFwS266S0000000_25.get$arr$(13), interfaceC1685750ty93, abstractC1676640tjS2, abstractC1676650tjT2, interfaceC1631620sYq, c13zcLJIIJ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & 458752));
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1602000_25(interfaceC1675480tha, (InterfaceC1675480tha) c1676880tjq, (C1676880tjq<Boolean>) interfaceC1685750ty92, (InterfaceC1685750ty9) abstractC1676640tjSLIZIZ, (AbstractC1676640tjS) abstractC1676650tjTLIZIZ, (AbstractC1676650tjT) str2, (String) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 1);
        }
    }

    public static final void LJFF(InterfaceC1675480tha interfaceC1675480tha, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, String str, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        String str2 = str;
        AbstractC1676650tjT abstractC1676650tjTLIZIZ = abstractC1676650tjT;
        AbstractC1676640tjS abstractC1676640tjSLIZIZ = abstractC1676640tjS;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1741346906);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676640tjSLIZIZ)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1676650tjTLIZIZ)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((599185 & i3) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z2)) {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                abstractC1676640tjSLIZIZ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)).LIZIZ(C1676510tjF.LIZ());
            }
            if (i12 != 0) {
                abstractC1676650tjTLIZIZ = C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)).LIZIZ(C1676510tjF.LJIIJ());
            }
            if (i13 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i14 = i3 >> 3;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            AbstractC1676640tjS abstractC1676640tjS2 = abstractC1676640tjSLIZIZ;
            AbstractC1676650tjT abstractC1676650tjT2 = abstractC1676650tjTLIZIZ;
            LJII(C1676860tjo.LJ(Boolean.valueOf(z), str2, c13zcLJIIJ, (i14 & 14) | ((i3 >> 12) & 112), 0), AFwS266S0000000_25.get$arr$(10), interfaceC1685750ty93, abstractC1676640tjS2, abstractC1676650tjT2, interfaceC1631620sYq, c13zcLJIIJ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & 458752));
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS1S1512000_25(interfaceC1675480tha, (InterfaceC1675480tha) z, (boolean) interfaceC1685750ty92, (InterfaceC1685750ty9) abstractC1676640tjSLIZIZ, (AbstractC1676640tjS) abstractC1676650tjTLIZIZ, (AbstractC1676650tjT) str2, (String) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 0);
        }
    }
}
