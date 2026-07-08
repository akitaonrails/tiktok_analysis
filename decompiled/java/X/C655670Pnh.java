package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655670Pnh extends AbstractC653010PjP {
    public final InterfaceC648270Pbl LIZLLL;
    public final InterfaceC655620Pnc LJ;
    public int LJFF = 0;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(549));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(550));

    @Override // X.InterfaceC653060PjU
    public final void LIZ() {
    }

    @Override // X.AbstractC653010PjP
    public final Rect LIZJ() {
        View viewLJJIIJ;
        InterfaceC648270Pbl interfaceC648270Pbl = this.LIZLLL;
        if (interfaceC648270Pbl != null && (viewLJJIIJ = interfaceC648270Pbl.LJJIIJ()) != null) {
            viewLJJIIJ.getLocationOnScreen((int[]) this.LJI.getValue());
            ((Rect) this.LJII.getValue()).set(((int[]) this.LJI.getValue())[0], ((int[]) this.LJI.getValue())[1], ((int[]) this.LJI.getValue())[0] + viewLJJIIJ.getWidth(), ((int[]) this.LJI.getValue())[1] + viewLJJIIJ.getHeight());
        }
        return (Rect) this.LJII.getValue();
    }

    @Override // X.AbstractC653010PjP
    public final void LIZLLL() {
        InterfaceC655620Pnc interfaceC655620Pnc = this.LJ;
        if (interfaceC655620Pnc != null) {
            interfaceC655620Pnc.LLJJJ();
        }
    }

    @Override // X.AbstractC653010PjP
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC653010PjP
    public final void LJ(int i) {
        InterfaceC655620Pnc interfaceC655620Pnc;
        if (i == 0 && (interfaceC655620Pnc = this.LJ) != null) {
            interfaceC655620Pnc.u4(150L);
        }
    }

    @Override // X.AbstractC653010PjP
    public final void LJFF(int i) {
        InterfaceC655620Pnc interfaceC655620Pnc;
        if (i == 0 && (interfaceC655620Pnc = this.LJ) != null) {
            interfaceC655620Pnc.u4(0L);
        }
    }

    public C655670Pnh(InterfaceC648270Pbl interfaceC648270Pbl, InterfaceC655620Pnc interfaceC655620Pnc) {
        this.LIZLLL = interfaceC648270Pbl;
        this.LJ = interfaceC655620Pnc;
    }
}
