package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19s9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21674719s9 implements InterfaceC21677019sW {
    public final /* synthetic */ RecyclerView LIZ;

    public C21674719s9(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
    }

    public final void LIZ(C13UV c13uv) {
        int i = c13uv.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        RecyclerView recyclerView = this.LIZ;
                        recyclerView.mLayout.onItemsMoved(recyclerView, c13uv.LIZIZ, c13uv.LIZLLL, 1);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.LIZ;
                recyclerView2.mLayout.onItemsUpdated(recyclerView2, c13uv.LIZIZ, c13uv.LIZLLL, c13uv.LIZJ);
                return;
            }
            RecyclerView recyclerView3 = this.LIZ;
            recyclerView3.mLayout.onItemsRemoved(recyclerView3, c13uv.LIZIZ, c13uv.LIZLLL);
            return;
        }
        RecyclerView recyclerView4 = this.LIZ;
        recyclerView4.mLayout.onItemsAdded(recyclerView4, c13uv.LIZIZ, c13uv.LIZLLL);
    }
}
