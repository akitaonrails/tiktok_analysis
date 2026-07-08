package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS27S1400000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS39S1400000_25;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS6S0402000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;
import p2.j1;

/* JADX INFO: renamed from: X.0tpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680580tpo {
    public static final C13DQ LIZ = C13ZT.LIZJ(AFwS214S0000000_25.get$arr$(518));

    public static final boolean LIZJ(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    public static final void LIZ(InterfaceC1686820tzs interfaceC1686820tzs, Function0<Unit> function0, C1686720tzi c1686720tzi, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C1686720tzi c1686720tzi2 = c1686720tzi;
        Function0<Unit> function02 = function0;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-830247068);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1686820tzs)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
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
            if (c13zcLJIIJ.LJJIIJ(c1686720tzi2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i8 != 0) {
                function02 = null;
            }
            if (i9 != 0) {
                c1686720tzi2 = new C1686720tzi(false, false, false, 15);
            }
            View view = (View) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LJFF);
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            String str = (String) c13zcLJIIJ.LJJIL(LIZ);
            final EnumC1671200tag enumC1671200tag = (EnumC1671200tag) c13zcLJIIJ.LJJIL(C20055113dV.LJIILIIL);
            C13Z0 c13z0LJIILLIIL = c13zcLJIIJ.LJIILLIIL();
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function2, c13zcLJIIJ);
            UUID uuid = (UUID) C20041813bM.LIZ(new Object[0], null, AFwS214S0000000_25.get$arr$(519), c13zcLJIIJ, 6);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj = objLJJ;
            if (objLJJ == c1680520tpi) {
                C1686700tzg c1686700tzg = c1686700tzg;
                C1686700tzg c1686700tzg2 = new C1686700tzg(function02, c1686720tzi2, str, view, interfaceC1690500u5o, interfaceC1686820tzs, uuid);
                c1686700tzg.LJIIJ(c13z0LJIILLIIL, new C19719212De(1302892335, new AwS460S0200000_25(c1686700tzg, c05p0LJIIIIZZ, 29), true));
                c13zcLJIIJ.LJJIJIIJI(c1686700tzg);
                obj = c1686700tzg;
            }
            final C1686700tzg c1686700tzg3 = (C1686700tzg) obj;
            boolean zLJII = c13zcLJIIJ.LJII(c1686700tzg3);
            int i10 = i3 & 112;
            if (i10 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z8 = zLJII | z2;
            int i11 = i3 & 896;
            if (i11 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLJJIIJ = z8 | z3 | c13zcLJIIJ.LJJIIJ(str) | c13zcLJIIJ.LJJIIJ(enumC1671200tag);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS27S1400000_25(c1686700tzg3, (C1686700tzg) function02, (Function0<Unit>) c1686720tzi2, (C1686720tzi) str, (String) enumC1671200tag, (EnumC1671200tag) 1);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C1680540tpk.LIZIZ(c1686700tzg3, (Function1) objLJJ2, c13zcLJIIJ);
            boolean zLJII2 = c13zcLJIIJ.LJII(c1686700tzg3);
            if (i10 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = zLJII2 | z4;
            if (i11 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zLJJIIJ2 = z9 | z5 | c13zcLJIIJ.LJJIIJ(str) | c13zcLJIIJ.LJJIIJ(enumC1671200tag);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS39S1400000_25(c1686700tzg3, (C1686700tzg) function02, (Function0<Unit>) c1686720tzi2, (C1686720tzi) str, (String) enumC1671200tag, (EnumC1671200tag) 4);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C1680540tpk.LJII((Function0) objLJJ3, c13zcLJIIJ);
            boolean zLJII3 = c13zcLJIIJ.LJII(c1686700tzg3);
            if ((i3 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = zLJII3 | z6;
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (!z10 && objLJJ4 != c1680520tpi) {
                z7 = true;
            } else {
                z7 = true;
                objLJJ4 = new AwS391S0200000_25(c1686700tzg3, interfaceC1686820tzs, 325);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C1680540tpk.LIZIZ(interfaceC1686820tzs, (Function1) objLJJ4, c13zcLJIIJ);
            boolean zLJII4 = c13zcLJIIJ.LJII(c1686700tzg3);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (zLJII4 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new C1680610tpr(c1686700tzg3, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            C1680540tpk.LJFF(c1686700tzg3, (Function2) objLJJ5, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            boolean zLJII5 = c13zcLJIIJ.LJII(c1686700tzg3);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (zLJII5 || objLJJ6 == c1680520tpi) {
                objLJJ6 = new AwS604S0100000_25(c1686700tzg3, 728);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(c1685760tyA, (Function1) objLJJ6);
            boolean zLJII6 = c13zcLJIIJ.LJII(c1686700tzg3) | c13zcLJIIJ.LJJIIJ(enumC1671200tag);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (zLJII6 || objLJJ7 == c1680520tpi) {
                objLJJ7 = new InterfaceC20053113dB() { // from class: X.0tpp
                    @Override // X.InterfaceC20053113dB
                    public final /* synthetic */ int LIZ(j1 j1Var, List list, int i12) {
                        return C1688390u2P.LIZJ(this, j1Var, list, i12);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final /* synthetic */ int LIZIZ(j1 j1Var, List list, int i12) {
                        return C1688390u2P.LIZLLL(this, j1Var, list, i12);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final /* synthetic */ int LIZJ(j1 j1Var, List list, int i12) {
                        return C1688390u2P.LIZ(this, j1Var, list, i12);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final /* synthetic */ int LIZLLL(j1 j1Var, List list, int i12) {
                        return C1688390u2P.LIZIZ(this, j1Var, list, i12);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                        c1686700tzg3.setParentLayoutDirection(enumC1671200tag);
                        return interfaceC1689940u4u.LJLJJL(0, 0, C2097608Jq.LJ(), AFwS266S0000000_25.get$arr$(504));
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
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
                C1665930tSB.LIZ(c13zcLJIIJ, objLJJ7, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                c13zcLJIIJ.LJJJJL(z7);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0402000_25(interfaceC1686820tzs, (InterfaceC1686820tzs) function02, (Function0<Unit>) c1686720tzi2, (C1686720tzi) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC1668050tVb r12, long r13, kotlin.jvm.functions.Function0<kotlin.Unit> r15, X.C1686720tzi r16, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r17, X.InterfaceC1680500tpg r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680580tpo.LIZIZ(X.0tVb, long, kotlin.jvm.functions.Function0, X.0tzi, kotlin.jvm.functions.Function2, X.0tpg, int, int):void");
    }
}
