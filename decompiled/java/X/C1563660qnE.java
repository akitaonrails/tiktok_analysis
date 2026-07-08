package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0qnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563660qnE implements InterfaceC1853660yKy {
    public final RecyclerView LIZ;
    public final C2252331DDr LIZIZ;
    public final C2252331DDr LIZJ;
    public final ViewOnLayoutChangeListenerC1620710sHF LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC1853660yKy
    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LIZ.addOnLayoutChangeListener(this.LIZLLL);
    }

    @Override // X.InterfaceC1853660yKy
    public final void LJI() {
        if (this.LJ) {
            this.LJ = false;
            this.LIZ.removeOnLayoutChangeListener(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC1853660yKy
    public final C2252331DDr getEvents() {
        return this.LIZJ;
    }

    public C1563660qnE(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 8, EnumC2252401DDy.DROP_OLDEST);
        this.LIZIZ = c2252331DDrLIZ;
        this.LIZJ = c2252331DDrLIZ;
        this.LIZLLL = new ViewOnLayoutChangeListenerC1620710sHF(this, 6);
    }
}
