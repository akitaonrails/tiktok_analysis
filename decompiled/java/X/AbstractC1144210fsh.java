package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0fsh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1144210fsh extends AbstractC1338480kw2 {
    public RecyclerView LIZ;
    public final C1144220fsi LIZIZ = new AbstractC1585810rMx() { // from class: X.0fsi
        public boolean LL;

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIJ(RecyclerView recyclerView, int i) {
            if (i == 0) {
                if (!this.LL) {
                    this.LL = this.LLILLJJLI.LJFF();
                    return;
                } else {
                    this.LL = false;
                    return;
                }
            }
            if (i != 1) {
                return;
            }
            this.LL = false;
        }
    };

    public abstract int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view);

    public abstract View LIZLLL(RecyclerView.LayoutManager layoutManager);

    public abstract int LJ(RecyclerView.LayoutManager layoutManager, int i, int i2);

    public final boolean LJFF() {
        RecyclerView.LayoutManager layoutManager;
        View viewLIZLLL;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewLIZLLL = LIZLLL(layoutManager)) == null) {
            return false;
        }
        int[] iArrLIZJ = LIZJ(layoutManager, viewLIZLLL);
        int i = iArrLIZJ[0];
        if (i == 0 && iArrLIZJ[1] == 0) {
            return false;
        }
        this.LIZ.smoothScrollBy(i, iArrLIZJ[1]);
        return true;
    }

    public final void LIZIZ(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.LIZ;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.LIZIZ);
            this.LIZ.setOnFlingListener(null);
        }
        this.LIZ = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.LIZ.addOnScrollListener(this.LIZIZ);
                this.LIZ.setOnFlingListener(this);
                new Scroller(this.LIZ.getContext(), new DecelerateInterpolator());
                LJFF();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    @Override // X.AbstractC1338480kw2
    public final boolean LIZ(int i, int i2) {
        RecyclerView.LayoutManager layoutManager;
        C21683819tc c21683819tc;
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.LIZ;
        if (recyclerView2 == null || (layoutManager = recyclerView2.getLayoutManager()) == null || this.LIZ.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.LIZ.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof InterfaceC20634915op) || (recyclerView = (c21683819tc = (C21683819tc) this).LIZ) == null) {
            return false;
        }
        C1151510g4T c1151510g4T = new C1151510g4T(recyclerView.getContext(), c21683819tc, 2);
        int iLJ = LJ(layoutManager, i, i2);
        if (iLJ == -1) {
            return false;
        }
        c1151510g4T.LIZ = iLJ;
        layoutManager.startSmoothScroll(c1151510g4T);
        return true;
    }
}
