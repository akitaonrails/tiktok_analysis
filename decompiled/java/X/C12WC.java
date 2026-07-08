package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.12WC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12WC extends AbstractC21688119uJ {
    public final C12WD LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // X.AbstractC21688119uJ
    public final void LJIILL() {
    }

    public C12WC(C12W6 c12w6) {
        this.LIZJ = c12w6;
    }

    @Override // X.AbstractC21688119uJ
    public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        this.LIZJ.LLJILJIL(viewHolder, this.LIZLLL);
        super.LIZJ(recyclerView, viewHolder);
        this.LIZLLL = false;
    }

    @Override // X.AbstractC21688119uJ
    public int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return AbstractC21688119uJ.LJIIIZ(15, 0);
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0) {
            if (viewHolder != null) {
                C12UY.LIZLLL(100, C0CHQ.LIZ);
                this.LIZJ.LLJLILLLLZIIL(viewHolder);
                return;
            }
            return;
        }
        if (viewHolder == null) {
        }
    }

    @Override // X.AbstractC21688119uJ
    public boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C12UY.LIZLLL(50, C0CHQ.LIZ);
        this.LIZJ.LJLZ(viewHolder, viewHolder2);
        this.LIZLLL = true;
        return true;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        float bottom = f2;
        View view = viewHolder.itemView;
        double height = (((double) view.getHeight()) * 0.25d) / ((double) 2);
        double top = (((double) viewHolder.itemView.getTop()) - height) + ((double) bottom);
        double height2 = ((double) (viewHolder.itemView.getHeight() * 1.25f)) + top;
        if (top < 0.0d) {
            bottom = -((float) (((double) viewHolder.itemView.getTop()) - height));
        } else if (height2 > recyclerView.getHeight()) {
            bottom = (float) (((double) recyclerView.getBottom()) - (((double) view.getBottom()) + height));
        }
        if (i == 2 && !z) {
            if (this.LJ) {
                this.LJ = false;
                this.LIZJ.LLJL(viewHolder).translationX(0.0f).translationY(0.0f).setDuration(AbstractC21688119uJ.LIZLLL(recyclerView, 8)).start();
                return;
            }
            return;
        }
        super.LJIIJ(canvas, recyclerView, viewHolder, f, bottom, i, z);
        this.LJ = true;
    }
}
