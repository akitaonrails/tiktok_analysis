package X;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.FocusGroupPropertiesElement;
import androidx.compose.ui.viewinterop.FocusTargetPropertiesElement;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.AwS3S0302000_6;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.13iE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20084413iE {
    public static final AFwS274S0000000_30 LIZ = AFwS274S0000000_30.get$arr$(25);

    public static final C20084613iG LIZJ(C20053713dH c20053713dH) {
        C20084713iH c20084713iH = c20053713dH.LLJJ;
        if (c20084713iH != null) {
            return (C20084613iG) c20084713iH;
        }
        C1696250uF5.LIZJ("Required value was null.");
        throw new C2197108jB();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> kotlin.jvm.functions.Function0<X.C20053713dH> LIZLLL(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> r9, X.InterfaceC1680500tpg r10, int r11) {
        /*
            int r7 = X.C0MXE.LIZ(r10)
            X.13DR r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LIZIZ
            java.lang.Object r3 = r10.LJJIL(r0)
            android.content.Context r3 = (android.content.Context) r3
            X.13Z0 r5 = r10.LJIILLIIL()
            X.13DR r0 = X.C20043213ba.LIZ
            java.lang.Object r6 = r10.LJJIL(r0)
            X.13bJ r6 = (X.InterfaceC20041513bJ) r6
            X.13DR r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LJFF
            java.lang.Object r8 = r10.LJJIL(r0)
            android.view.View r8 = (android.view.View) r8
            boolean r2 = r10.LJII(r3)
            r0 = r11 & 14
            r0 = r0 ^ 6
            r1 = 4
            r4 = r9
            if (r0 <= r1) goto L32
            boolean r0 = r10.LJJIIJ(r4)
            if (r0 != 0) goto L66
        L32:
            r0 = r11 & 6
            if (r0 == r1) goto L66
            r1 = 0
        L37:
            r1 = r1 | r2
            boolean r0 = r10.LJII(r5)
            r1 = r1 | r0
            boolean r0 = r10.LJII(r6)
            r1 = r1 | r0
            boolean r0 = r10.LJIJI(r7)
            r1 = r1 | r0
            boolean r0 = r10.LJII(r8)
            r1 = r1 | r0
            java.lang.Object r2 = r10.LJJ()
            if (r1 != 0) goto L5b
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L63
        L5b:
            X.13iF r2 = new X.13iF
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.LJJIJIIJI(r2)
        L63:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            return r2
        L66:
            r1 = 1
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20084413iE.LIZLLL(kotlin.jvm.functions.Function1, X.0tpg, int):kotlin.jvm.functions.Function0");
    }

    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function1 function1, Function1 function12) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        Function1 function13 = function12;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
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
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i8 != 0) {
                function13 = LIZ;
            }
            LIZIZ(function1, interfaceC1685750ty92, null, LIZ, function13, c13zcLJIIJ, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S0302000_6(i, i2, interfaceC1685750ty92, function1, function13, 2);
        }
    }

    public static final <T extends View> void LIZIZ(Function1<? super Context, ? extends T> function1, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, Function1<? super T, Unit> function14, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        Function1<? super T, Unit> function15 = function13;
        Function1<? super T, Unit> function16 = function12;
        Function1<? super T, Unit> function17 = function14;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-180024211);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
            if (c13zcLJIIJ.LJII(function16)) {
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
            if (c13zcLJIIJ.LJII(function15)) {
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
            if (c13zcLJIIJ.LJII(function17)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i10 != 0) {
                function16 = null;
            }
            if (i11 != 0) {
                function15 = LIZ;
            }
            if (i12 != 0) {
                function17 = LIZ;
            }
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = interfaceC1685750ty92.LIZ(FocusGroupPropertiesElement.LIZIZ);
            FocusTargetNode.FocusTargetElement focusTargetElement = FocusTargetNode.FocusTargetElement.LIZIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ.LIZ(focusTargetElement).LIZ(FocusTargetPropertiesElement.LIZIZ).LIZ(focusTargetElement));
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            EnumC1671200tag enumC1671200tag = (EnumC1671200tag) c13zcLJIIJ.LJJIL(C20055113dV.LJIILIIL);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c13zcLJIIJ.LJJIL(C13GF.LIZ);
            C128Y c128y = (C128Y) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LJ);
            if (function16 != null) {
                c13zcLJIIJ.LJJIIJZLJL(607780130);
                Function0<C20053713dH> function0LIZLLL = LIZLLL(function1, c13zcLJIIJ, i3 & 14);
                if (c13zcLJIIJ.LIZIZ instanceof C20037713ah) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(function0LIZLLL);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    LJ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, iLIZ, interfaceC1690500u5o, lifecycleOwner, c128y, enumC1671200tag, c13d2LJJJIL);
                    C1665930tSB.LIZ(c13zcLJIIJ, function16, AFwS318S0000000_30.get$arr$(5));
                    C1665930tSB.LIZ(c13zcLJIIJ, function17, AFwS318S0000000_30.get$arr$(6));
                    C1665930tSB.LIZ(c13zcLJIIJ, function15, AFwS318S0000000_30.get$arr$(7));
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                c13zcLJIIJ.LJJIIJZLJL(608635513);
                Function0<C20053713dH> function0LIZLLL2 = LIZLLL(function1, c13zcLJIIJ, i3 & 14);
                if (c13zcLJIIJ.LIZIZ instanceof C20037713ah) {
                    c13zcLJIIJ.LJLIIL();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(function0LIZLLL2);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    c13zcLJIIJ = c13zcLJIIJ;
                    LJ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, iLIZ, interfaceC1690500u5o, lifecycleOwner, c128y, enumC1671200tag, c13d2LJJJIL);
                    C1665930tSB.LIZ(c13zcLJIIJ, function17, AFwS318S0000000_30.get$arr$(8));
                    C1665930tSB.LIZ(c13zcLJIIJ, function15, AFwS318S0000000_30.get$arr$(9));
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C564300MBg(function1, interfaceC1685750ty92, function16, function15, function17, i, i2);
        }
    }

    public static final <T extends View> void LJ(InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, int i, InterfaceC1690500u5o interfaceC1690500u5o, LifecycleOwner lifecycleOwner, C128Y c128y, EnumC1671200tag enumC1671200tag, InterfaceC20036213aS interfaceC20036213aS) {
        g.LJLIIIL.getClass();
        C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20036213aS, g.a.LJFF);
        C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9, AFwS318S0000000_30.get$arr$(10));
        C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1690500u5o, AFwS318S0000000_30.get$arr$(11));
        C1665930tSB.LIZ(interfaceC1680500tpg, lifecycleOwner, AFwS318S0000000_30.get$arr$(12));
        C1665930tSB.LIZ(interfaceC1680500tpg, c128y, AFwS318S0000000_30.get$arr$(13));
        C1665930tSB.LIZ(interfaceC1680500tpg, enumC1671200tag, AFwS311S0000000_25.get$arr$(3));
        AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
        if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(i))) {
            interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(i));
            interfaceC1680500tpg.LIZIZ(Integer.valueOf(i), aFwS311S0000000_25);
        }
    }
}
