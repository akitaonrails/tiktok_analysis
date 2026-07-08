package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658630PsT extends AbstractC653010PjP {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public Function0<? extends InterfaceC648270Pbl> LIZLLL;
    public Function0<? extends InterfaceC655620Pnc> LJ;
    public Function0<Integer> LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(18));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(19));

    @Override // X.InterfaceC653060PjU
    public final void LIZ() {
    }

    @Override // X.AbstractC653010PjP
    public final int LIZIZ() {
        Function0<Integer> function0 = this.LJFF;
        if (function0 != null) {
            return function0.invoke().intValue();
        }
        return 0;
    }

    @Override // X.AbstractC653010PjP
    public final Rect LIZJ() {
        InterfaceC648270Pbl interfaceC648270PblInvoke;
        Function0<? extends InterfaceC648270Pbl> function0 = this.LIZLLL;
        View viewLJJIIJ = (function0 == null || (interfaceC648270PblInvoke = function0.invoke()) == null) ? null : interfaceC648270PblInvoke.LJJIIJ();
        if (viewLJJIIJ != null) {
            viewLJJIIJ.getLocationOnScreen((int[]) this.LJI.getValue());
            ((Rect) this.LJII.getValue()).set(((int[]) this.LJI.getValue())[0], ((int[]) this.LJI.getValue())[1], ((int[]) this.LJI.getValue())[0] + viewLJJIIJ.getWidth(), ((int[]) this.LJI.getValue())[1] + viewLJJIIJ.getHeight());
        } else {
            ((Rect) this.LJII.getValue()).set(0, 0, 0, 0);
        }
        return (Rect) this.LJII.getValue();
    }

    @Override // X.AbstractC653010PjP
    public final void LIZLLL() {
        InterfaceC655620Pnc interfaceC655620PncInvoke;
        Function0<? extends InterfaceC655620Pnc> function0 = this.LJ;
        if (function0 == null || (interfaceC655620PncInvoke = function0.invoke()) == null) {
            return;
        }
        interfaceC655620PncInvoke.LLJJJ();
    }

    @Override // X.AbstractC653010PjP
    public final void LJ(int i) {
        InterfaceC655620Pnc interfaceC655620PncInvoke;
        Function0<? extends InterfaceC655620Pnc> function0 = this.LJ;
        if (function0 != null && (interfaceC655620PncInvoke = function0.invoke()) != null) {
            interfaceC655620PncInvoke.u4(0L);
        }
    }

    @Override // X.AbstractC653010PjP
    public final void LJFF(int i) {
        InterfaceC655620Pnc interfaceC655620PncInvoke;
        Function0<? extends InterfaceC655620Pnc> function0 = this.LJ;
        if (function0 != null && (interfaceC655620PncInvoke = function0.invoke()) != null) {
            interfaceC655620PncInvoke.u4(0L);
        }
    }
}
