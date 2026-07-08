package X;

import Y.ARunnableS129S0100000_29;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.12UZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12UZ extends AbstractC1585810rMx {
    public boolean LL;
    public final /* synthetic */ C12UW LLILLJJLI;

    public C12UZ(C12UW c12uw) {
        this.LLILLJJLI = c12uw;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (this.LL) {
                this.LLILLJJLI.LLIZLLLIL.LLJILLL.setValue(null);
                this.LL = false;
            }
            HandlerHook.viewPostDelay(recyclerView, new ARunnableS129S0100000_29(this, 246), 100L);
            return;
        }
        this.LLILLJJLI.LLJJJJJIL = true;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (i == 0) {
            return;
        }
        this.LL = true;
        C12UW c12uw = this.LLILLJJLI;
        int i3 = c12uw.LLLIIIL;
        if (C1336470ksn.LIZJ(recyclerView.getContext())) {
            i = -i;
        }
        c12uw.LLLIIIL = i3 + i;
        this.LLILLJJLI.LJ();
        this.LLILLJJLI.LJIL();
        this.LLILLJJLI.LJIJI();
        this.LLILLJJLI.LLIZLLLIL.LLJILJILJ.setValue(null);
    }
}
