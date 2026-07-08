package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Piu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652700Piu extends AbstractC653010PjP {
    public final InterfaceC648270Pbl LIZLLL;
    public int LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(547));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(548));

    @Override // X.InterfaceC653060PjU
    public final void LIZ() {
    }

    @Override // X.AbstractC653010PjP
    public final Rect LIZJ() {
        View viewLJJIIJ = this.LIZLLL.LJJIIJ();
        if (viewLJJIIJ != null) {
            viewLJJIIJ.getLocationOnScreen((int[]) this.LJFF.getValue());
            ((Rect) this.LJI.getValue()).set(((int[]) this.LJFF.getValue())[0], ((int[]) this.LJFF.getValue())[1], ((int[]) this.LJFF.getValue())[0] + viewLJJIIJ.getWidth(), ((int[]) this.LJFF.getValue())[1] + viewLJJIIJ.getHeight());
        }
        return (Rect) this.LJI.getValue();
    }

    @Override // X.AbstractC653010PjP
    public final void LIZLLL() {
        this.LIZLLL.LLJJJ();
    }

    @Override // X.AbstractC653010PjP
    public final int LIZIZ() {
        return this.LJ;
    }

    public C652700Piu(C652690Pit c652690Pit) {
        this.LIZLLL = c652690Pit;
    }

    @Override // X.AbstractC653010PjP
    public final void LJ(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.LIZLLL.LLLLLIL();
    }

    @Override // X.AbstractC653010PjP
    public final void LJFF(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.LIZLLL.LLLLLIL();
    }
}
