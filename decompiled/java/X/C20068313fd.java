package X;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20068313fd extends AbstractC20081013hg implements InterfaceC20057213dq, InterfaceC20062513eh {
    public final InterfaceC20070313fx LIZ;
    public final C20064713f3 LIZIZ;
    public final View LIZJ;
    public final C20058913e7 LIZLLL;
    public final String LJ;
    public final Rect LJFF = new Rect();
    public final AutofillId LJI;
    public final C20036313aT LJII;
    public boolean LJIIIIZZ;

    @Override // X.InterfaceC20062513eh
    public final void LIZ(FocusTargetNode focusTargetNode, InterfaceC1697450uH1 interfaceC1697450uH1) {
        C20053713dH c20053713dHLJFF;
        C13WG c13wgLIZIZ;
        C20053713dH c20053713dHLJFF2;
        C13WG c13wgLIZIZ2;
        if (focusTargetNode != null && (c20053713dHLJFF2 = C20052513d5.LJFF(focusTargetNode)) != null && (c13wgLIZIZ2 = c20053713dHLJFF2.LIZIZ()) != null && c13wgLIZIZ2.LL.LIZ(C1694480uCE.LJI)) {
            this.LIZ.LJ(c20053713dHLJFF2.LLILLJJLI, this.LIZJ);
        }
        if (interfaceC1697450uH1 != null && (c20053713dHLJFF = C20052513d5.LJFF(interfaceC1697450uH1)) != null && (c13wgLIZIZ = c20053713dHLJFF.LIZIZ()) != null && c13wgLIZIZ.LL.LIZ(C1694480uCE.LJI)) {
            int i = c20053713dHLJFF.LLILLJJLI;
            this.LIZLLL.LIZ.LIZIZ(i, new C20069713fr(this, i));
        }
    }

    @Override // X.InterfaceC20057213dq
    public final void LIZIZ(InterfaceC20070113fv interfaceC20070113fv, C13WG c13wg) {
        String str;
        boolean z;
        C1692220u8a c1692220u8a;
        C1692220u8a c1692220u8a2;
        C13WG c13wgLIZIZ = interfaceC20070113fv.LIZIZ();
        int iLJIJJLI = interfaceC20070113fv.LJIJJLI();
        String str2 = null;
        if (c13wg != null && (c1692220u8a2 = (C1692220u8a) C20069413fo.LIZ(c13wg, C1696500uFU.LJJIIJZLJL)) != null) {
            str = c1692220u8a2.LLILLJJLI;
        } else {
            str = null;
        }
        if (c13wgLIZIZ != null && (c1692220u8a = (C1692220u8a) C20069413fo.LIZ(c13wgLIZIZ, C1696500uFU.LJJIIJZLJL)) != null) {
            str2 = c1692220u8a.LLILLJJLI;
        }
        boolean z2 = false;
        if (str != str2) {
            if (str == null) {
                this.LIZ.LIZJ(iLJIJJLI, this.LIZJ, true);
            } else if (str2 == null) {
                this.LIZ.LIZJ(iLJIJJLI, this.LIZJ, false);
            } else {
                Object objLIZ = C20069413fo.LIZ(c13wgLIZIZ, C1696500uFU.LJIIZILJ);
                InterfaceC1694380uC4.LIZ.getClass();
                if (Intrinsics.LJFF(objLIZ, C1694360uC2.LIZIZ)) {
                    this.LIZ.LIZIZ(this.LIZJ, iLJIJJLI, AutofillValue.forText(str2));
                }
            }
        }
        if (c13wg != null && c13wg.LL.LIZ(C1696500uFU.LJIILLIIL)) {
            z = true;
        } else {
            z = false;
        }
        if (c13wgLIZIZ != null && c13wgLIZIZ.LL.LIZ(C1696500uFU.LJIILLIIL)) {
            z2 = true;
        }
        if (z != z2) {
            if (z2) {
                this.LJII.LIZIZ(iLJIJJLI);
            } else {
                this.LJII.LJ(iLJIJJLI);
            }
        }
    }

    public C20068313fd(C20070613g0 c20070613g0, C20064713f3 c20064713f3, View view, C20058913e7 c20058913e7, String str) {
        AutofillId autofillId;
        this.LIZ = c20070613g0;
        this.LIZIZ = c20064713f3;
        this.LIZJ = view;
        this.LIZLLL = c20058913e7;
        this.LJ = str;
        view.setImportantForAutofill(1);
        C20078613hI c20078613hILIZ = C20077413h6.LIZ(view);
        if (c20078613hILIZ != null && (autofillId = (AutofillId) c20078613hILIZ.LIZ) != null) {
            this.LJI = autofillId;
            this.LJII = new C20036313aT(6);
        } else {
            C1696250uF5.LIZJ("Required value was null.");
            throw new C2197108jB();
        }
    }
}
