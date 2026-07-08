package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS63S0301000_30;

/* JADX INFO: renamed from: X.13dV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20055113dV {
    public static final C13DR LIZ = new C13DR(AFwS214S0000000_25.get$arr$(2));
    public static final C13DR LIZIZ = new C13DR(AFwS219S0000000_30.get$arr$(25));
    public static final C13DR LIZJ = new C13DR(AFwS219S0000000_30.get$arr$(27));
    public static final C13DR LIZLLL = new C13DR(AFwS219S0000000_30.get$arr$(26));
    public static final C13DR LJ = new C13DR(AFwS219S0000000_30.get$arr$(29));
    public static final C13DR LJFF = new C13DR(AFwS219S0000000_30.get$arr$(28));
    public static final C13DR LJI = new C13DR(AFwS219S0000000_30.get$arr$(35));
    public static final C13DR LJII = new C13DR(AFwS219S0000000_30.get$arr$(31));
    public static final C13DR LJIIIIZZ = new C13DR(AFwS219S0000000_30.get$arr$(32));
    public static final C13DR LJIIIZ = new C13DR(AFwS219S0000000_30.get$arr$(34));
    public static final C13DR LJIIJ = new C13DR(AFwS219S0000000_30.get$arr$(33));
    public static final C13DR LJIIJJI = new C13DR(AFwS219S0000000_30.get$arr$(36));
    public static final C13DR LJIIL = new C13DR(AFwS219S0000000_30.get$arr$(37));
    public static final C13DR LJIILIIL = new C13DR(AFwS219S0000000_30.get$arr$(38));
    public static final C13DR LJIILJJIL = new C13DR(AFwS214S0000000_25.get$arr$(4));
    public static final C13DR LJIILL = new C13DR(AFwS214S0000000_25.get$arr$(3));
    public static final C13DR LJIILLIIL = new C13DR(AFwS219S0000000_30.get$arr$(41));
    public static final C13DR LJIIZILJ = new C13DR(AFwS219S0000000_30.get$arr$(42));
    public static final C13DR LJIJ = new C13DR(AFwS219S0000000_30.get$arr$(43));
    public static final C13DR LJIJI = new C13DR(AFwS219S0000000_30.get$arr$(44));
    public static final C13DR LJIJJ = new C13DR(AFwS219S0000000_30.get$arr$(39));
    public static final C13DQ LJIJJLI = C13ZT.LIZJ(AFwS219S0000000_30.get$arr$(40));
    public static final C13DR LJIL = new C13DR(AFwS219S0000000_30.get$arr$(30));

    public static final C13DR LIZJ() {
        return LJII;
    }

    public static final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompositionLocal ");
        sbLIZ.append(str);
        sbLIZ.append(" not present");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final void LIZ(InterfaceC20055013dU interfaceC20055013dU, InterfaceC1693160uA6 interfaceC1693160uA6, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        boolean zLJII;
        int i4;
        boolean zLJII2;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(874662829);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII2 = c13zcLJIIJ.LJJIIJ(interfaceC20055013dU);
            } else {
                zLJII2 = c13zcLJIIJ.LJII(interfaceC20055013dU);
            }
            if (zLJII2) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1693160uA6);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1693160uA6);
            }
            if (zLJII) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i2 & 1, z)) {
            C13DO c13doLIZJ = LJIIIZ.LIZJ(interfaceC20055013dU.getFontLoader());
            c13doLIZJ.LJII = false;
            C13DO c13doLIZJ2 = LJIIJ.LIZJ(interfaceC20055013dU.getFontFamilyResolver());
            c13doLIZJ2.LJII = false;
            C13ZT.LIZIZ(new C13DO[]{LIZ.LIZJ(interfaceC20055013dU.getAccessibilityManager()), LIZIZ.LIZJ(interfaceC20055013dU.getAutofill()), LIZLLL.LIZJ(interfaceC20055013dU.getAutofillManager()), LIZJ.LIZJ(interfaceC20055013dU.getAutofillTree()), LJ.LIZJ(interfaceC20055013dU.getClipboardManager()), LJFF.LIZJ(interfaceC20055013dU.getClipboard()), LJII.LIZJ(interfaceC20055013dU.getDensity()), LJIIIIZZ.LIZJ(interfaceC20055013dU.getFocusOwner()), c13doLIZJ, c13doLIZJ2, LJIIJJI.LIZJ(interfaceC20055013dU.getHapticFeedBack()), LJIIL.LIZJ(interfaceC20055013dU.getInputModeManager()), LJIILIIL.LIZJ(interfaceC20055013dU.getLayoutDirection()), LJIILJJIL.LIZJ(interfaceC20055013dU.getTextInputService()), LJIILL.LIZJ(interfaceC20055013dU.getSoftwareKeyboardController()), LJIILLIIL.LIZJ(interfaceC20055013dU.getTextToolbar()), LJIIZILJ.LIZJ(interfaceC1693160uA6), LJIJ.LIZJ(interfaceC20055013dU.getViewConfiguration()), LJIJI.LIZJ(interfaceC20055013dU.getWindowInfo()), LJIJJ.LIZJ(interfaceC20055013dU.getPointerIconService()), LJI.LIZJ(interfaceC20055013dU.getGraphicsContext())}, function2, c13zcLJIIJ, ((i2 >> 3) & 112) | 8);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS63S0301000_30(interfaceC20055013dU, (InterfaceC20055013dU) interfaceC1693160uA6, (InterfaceC1693160uA6) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, 0);
        }
    }
}
