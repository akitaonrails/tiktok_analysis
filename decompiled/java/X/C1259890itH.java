package X;

import Y.ARunnableS38S0110000_19;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0itH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259890itH {
    public final RecyclerView LIZ;
    public final C1260260its LIZIZ;

    public final void LIZIZ() {
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childViewHolder = this.LIZ.getChildViewHolder(this.LIZ.getChildAt(i));
            if (childViewHolder instanceof InterfaceC1259900itI) {
                InterfaceC1259900itI interfaceC1259900itI = (InterfaceC1259900itI) childViewHolder;
                interfaceC1259900itI.setUserVisibleHint(false);
                interfaceC1259900itI.c1();
            }
        }
    }

    public C1259890itH(RecyclerView recyclerView, C1260260its c1260260its) {
        this.LIZIZ = c1260260its;
        this.LIZ = recyclerView;
    }

    public final void LIZ(boolean z, boolean z2) {
        int i;
        ARunnableS38S0110000_19 aRunnableS38S0110000_19 = new ARunnableS38S0110000_19(this, z, 0);
        if (z2) {
            i = 100;
        } else {
            i = 0;
        }
        C810560Vqw.LIZLLL(aRunnableS38S0110000_19, i);
    }
}
