package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20634115oh extends AbstractC1338480kw2 {
    public RecyclerView LIZ;
    public Scroller LIZIZ;
    public final C20634215oi LIZJ = new AbstractC1585810rMx() { // from class: X.15oi
        public boolean LL;

        @Override // X.AbstractC1585810rMx
        public final void LJJIIJ(RecyclerView recyclerView, int i) {
            if (i == 0 && this.LL) {
                this.LL = false;
                this.LLILLJJLI.LJII();
            }
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.LL = true;
            }
        }
    };

    public abstract int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view);

    public abstract View LJFF(RecyclerView.LayoutManager layoutManager);

    public abstract int LJI(RecyclerView.LayoutManager layoutManager, int i, int i2);

    public final void LJII() {
        RecyclerView.LayoutManager layoutManager;
        View viewLJFF;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewLJFF = LJFF(layoutManager)) == null) {
            return;
        }
        int[] iArrLIZJ = LIZJ(layoutManager, viewLJFF);
        int i = iArrLIZJ[0];
        if (i == 0 && iArrLIZJ[1] == 0) {
            return;
        }
        this.LIZ.smoothScrollBy(i, iArrLIZJ[1]);
    }

    public void LIZIZ(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.LIZ;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.LIZJ);
            this.LIZ.setOnFlingListener(null);
        }
        this.LIZ = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.LIZ.addOnScrollListener(this.LIZJ);
                this.LIZ.setOnFlingListener(this);
                this.LIZIZ = new Scroller(this.LIZ.getContext(), new DecelerateInterpolator());
                LJII();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public AbstractC21674019s2 LIZLLL(RecyclerView.LayoutManager layoutManager) {
        return LJ(layoutManager);
    }

    public C21674119s3 LJ(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof InterfaceC20634915op)) {
            return null;
        }
        return new C20748216Gy(this, this.LIZ.getContext(), 1);
    }

    @Override // X.AbstractC1338480kw2
    public final boolean LIZ(int i, int i2) {
        AbstractC21674019s2 abstractC21674019s2LIZLLL;
        int iLJI;
        RecyclerView.LayoutManager layoutManager = this.LIZ.getLayoutManager();
        if (layoutManager == null || this.LIZ.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.LIZ.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof InterfaceC20634915op) || (abstractC21674019s2LIZLLL = LIZLLL(layoutManager)) == null || (iLJI = LJI(layoutManager, i, i2)) == -1) {
            return false;
        }
        abstractC21674019s2LIZLLL.LIZ = iLJI;
        layoutManager.startSmoothScroll(abstractC21674019s2LIZLLL);
        return true;
    }
}
