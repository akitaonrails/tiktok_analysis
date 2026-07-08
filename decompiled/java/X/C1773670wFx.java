package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0wFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773670wFx implements InterfaceC1768150w73 {
    public final C1773450wFb LL;

    public C1773670wFx(C1773450wFb c1773450wFb) {
        this.LL = c1773450wFb;
    }

    public final void LIZ(int i) {
        C1773130wF5 c1773130wF5;
        if (i == this.LL.LLJJIJIIJIL.getCurrentItem()) {
            return;
        }
        this.LL.LLJJIJIIJIL.LJ(i, false);
        RecyclerView recyclerViewV6 = this.LL.v6();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
        if (recyclerViewV6 != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerViewV6.findViewHolderForAdapterPosition(i);
        }
        if ((viewHolderFindViewHolderForAdapterPosition instanceof C1773130wF5) && (c1773130wF5 = (C1773130wF5) viewHolderFindViewHolderForAdapterPosition) != null) {
            c1773130wF5.T5();
        }
        this.LL.w6(i);
    }
}
