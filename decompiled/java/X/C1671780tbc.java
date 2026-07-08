package X;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS141S0110000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS3S0112000_6;

/* JADX INFO: renamed from: X.0tbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671780tbc {
    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-361453782);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
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
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            boolean z3 = true;
            if (i6 != 0) {
                z2 = true;
            }
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function0, c13zcLJIIJ);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C1698030uHx(c05p0LJIIIIZZ, z2, 1);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1698030uHx c1698030uHx = (C1698030uHx) objLJJ;
            if ((i3 & 14) != 4) {
                z3 = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS141S0110000_25(c1698030uHx, z2, 4);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C1680540tpk.LJII((Function0) objLJJ2, c13zcLJIIJ);
            InterfaceC1671500tbA interfaceC1671500tbALIZ = C1688550u2f.LIZ(c13zcLJIIJ);
            if (interfaceC1671500tbALIZ != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = interfaceC1671500tbALIZ.getOnBackPressedDispatcher();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean zLJII = c13zcLJIIJ.LJII(onBackPressedDispatcher) | c13zcLJIIJ.LJII(lifecycleOwner);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new AwS234S0300000_25(onBackPressedDispatcher, lifecycleOwner, c1698030uHx, 42);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                C1680540tpk.LIZ(lifecycleOwner, onBackPressedDispatcher, (Function1) objLJJ3, c13zcLJIIJ);
            } else {
                "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString();
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S0112000_6(i, i2, function0, z2, 1);
        }
    }
}
