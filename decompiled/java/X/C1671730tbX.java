package X;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671730tbX {
    public static final void LIZ(final boolean z, final Integer num, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        InterfaceC1670680tZq interfaceC1670680tZq;
        Window window;
        WindowManager.LayoutParams attributes;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1167968787);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(num)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            ViewParent parent = ((View) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LJFF)).getParent();
            if ((parent instanceof InterfaceC1670680tZq) && (interfaceC1670680tZq = (InterfaceC1670680tZq) parent) != null && (window = interfaceC1670680tZq.getWindow()) != null) {
                c13zcLJIIJ.LJIIL(-1431531932, Boolean.valueOf(z));
                window.setWindowAnimations(-1);
                window.setLayout(-1, -1);
                if (z) {
                    window.addFlags(2);
                    window.setDimAmount(0.5f);
                } else {
                    window.clearFlags(2);
                }
                window.addFlags(256);
                if (Build.VERSION.SDK_INT >= 30 && (attributes = window.getAttributes()) != null) {
                    attributes.setFitInsetsSides(0);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJIIL(-1431528854, num);
                if (num != null) {
                    window.setSoftInputMode(num.intValue());
                }
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tbW
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2 = z;
                    Integer num2 = num;
                    int i5 = i;
                    ((Integer) obj2).intValue();
                    C1671730tbX.LIZ(z2, num2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i5 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }
}
