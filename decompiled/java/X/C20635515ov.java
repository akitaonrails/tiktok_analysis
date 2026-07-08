package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20635515ov extends C20635115or {
    public C21679719sx LJFF;
    public C21679619sw LJI;
    public RecyclerView LJII;

    @Override // X.C20635115or, X.AbstractC20634115oh
    public int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
        throw null;
    }

    public View LJIIL(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
        throw null;
    }

    @Override // X.AbstractC20634115oh
    public final void LIZIZ(RecyclerView recyclerView) {
        super.LIZIZ(recyclerView);
        this.LJII = recyclerView;
    }

    @Override // X.AbstractC20634115oh
    public final C21674119s3 LJ(final RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        final Context context = null;
        if (!(layoutManager instanceof InterfaceC20634915op) || (recyclerView = this.LJII) == null || recyclerView.getContext() == null) {
            return null;
        }
        RecyclerView recyclerView2 = this.LJII;
        if (recyclerView2 != null) {
            context = recyclerView2.getContext();
        }
        return new C21674119s3(context) { // from class: X.15ok
            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // X.C21674119s3
            public final int LJIILIIL(int i) {
                int iLJIILIIL = super.LJIILIIL(i);
                if (100 <= iLJIILIIL) {
                    return 100;
                }
                return iLJIILIIL;
            }

            @Override // X.C21674119s3, X.AbstractC21674019s2
            public final void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
                int[] iArrLIZJ = this.LJIILL.LIZJ(layoutManager, view);
                int i = iArrLIZJ[0];
                int i2 = 1;
                int i3 = iArrLIZJ[1];
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i3);
                if (iAbs < iAbs2) {
                    iAbs = iAbs2;
                }
                int iLJIIL = LJIIL(iAbs);
                if (iLJIIL >= 1) {
                    i2 = iLJIIL;
                }
                c21675319sF.LIZIZ(i, i3, this.LJIIIIZZ, i2);
            }
        };
    }

    @Override // X.C20635115or, X.AbstractC20634115oh
    public final View LJFF(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            if (this.LJFF == null) {
                this.LJFF = new C21679719sx(layoutManager);
            }
            return LJIIL(layoutManager, this.LJFF);
        }
        if (layoutManager.canScrollHorizontally()) {
            return LJIIL(layoutManager, LJIIJ(layoutManager));
        }
        return null;
    }

    public final AbstractC21679819sy LJIIJ(RecyclerView.LayoutManager layoutManager) {
        if (this.LJI == null) {
            this.LJI = new C21679619sw(layoutManager);
        }
        return this.LJI;
    }
}
