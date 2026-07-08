package X;

import Y.AsS50S0100000_24;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0qnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563650qnD implements InterfaceC1853660yKy {
    public final RecyclerView LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C2252331DDr LIZLLL;
    public final C2252331DDr LJ;
    public long LJFF;
    public int LJI;
    public int LJII;
    public final AsS50S0100000_24 LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.InterfaceC1853660yKy
    public final void LIZ() {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        this.LJFF = 0L;
        this.LIZ.addOnScrollListener(this.LJIIIIZZ);
    }

    @Override // X.InterfaceC1853660yKy
    public final void LJI() {
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
            this.LIZ.removeOnScrollListener(this.LJIIIIZZ);
        }
    }

    @Override // X.InterfaceC1853660yKy
    public final C2252331DDr getEvents() {
        return this.LJ;
    }

    public C1563650qnD(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        int iIntValue = ((Number) C1819307Ap.LIZ.getValue()).intValue();
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZIZ = iIntValue;
        this.LIZJ = 50;
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 8, EnumC2252401DDy.DROP_OLDEST);
        this.LIZLLL = c2252331DDrLIZ;
        this.LJ = c2252331DDrLIZ;
        this.LJIIIIZZ = new AsS50S0100000_24(this, 10);
    }
}
