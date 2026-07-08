package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19sB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21674919sB extends AbstractC21673719rz {
    public boolean LLIZ = true;

    public abstract boolean LJJI(RecyclerView.ViewHolder viewHolder);

    public abstract boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    public abstract boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    public abstract boolean LJJIII(RecyclerView.ViewHolder viewHolder);

    public void LJJIIJZLJL(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // X.AbstractC21673719rz
    public boolean LJII(RecyclerView.ViewHolder viewHolder) {
        if (this.LLIZ && !viewHolder.isInvalid()) {
            return false;
        }
        return true;
    }

    public final void LJJIIJ(RecyclerView.ViewHolder viewHolder) {
        LJJIIJZLJL(viewHolder);
        LJIIIZ(viewHolder);
    }

    @Override // X.AbstractC21673719rz
    public final boolean LIZJ(RecyclerView.ViewHolder viewHolder, C21676319sP c21676319sP, C21676319sP c21676319sP2) {
        int i;
        int i2;
        if (c21676319sP != null && ((i = c21676319sP.LIZ) != (i2 = c21676319sP2.LIZ) || c21676319sP.LIZIZ != c21676319sP2.LIZIZ)) {
            return LJJII(viewHolder, i, c21676319sP.LIZIZ, i2, c21676319sP2.LIZIZ);
        }
        return LJJI(viewHolder);
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJ(RecyclerView.ViewHolder viewHolder, C21676319sP c21676319sP, C21676319sP c21676319sP2) {
        int left;
        int top;
        int i = c21676319sP.LIZ;
        int i2 = c21676319sP.LIZIZ;
        View view = viewHolder.itemView;
        if (c21676319sP2 == null) {
            left = view.getLeft();
        } else {
            left = c21676319sP2.LIZ;
        }
        if (c21676319sP2 == null) {
            top = view.getTop();
        } else {
            top = c21676319sP2.LIZIZ;
        }
        if (!viewHolder.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return LJJII(viewHolder, i, i2, left, top);
        }
        return LJJIII(viewHolder);
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJFF(RecyclerView.ViewHolder viewHolder, C21676319sP c21676319sP, C21676319sP c21676319sP2) {
        int i = c21676319sP.LIZ;
        int i2 = c21676319sP2.LIZ;
        if (i == i2 && c21676319sP.LIZIZ == c21676319sP2.LIZIZ) {
            LJIIIZ(viewHolder);
            return false;
        }
        return LJJII(viewHolder, i, c21676319sP.LIZIZ, i2, c21676319sP2.LIZIZ);
    }

    @Override // X.AbstractC21673719rz
    public boolean LIZLLL(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, C21676319sP c21676319sP, C21676319sP c21676319sP2) {
        int i;
        int i2;
        int i3 = c21676319sP.LIZ;
        int i4 = c21676319sP.LIZIZ;
        if (viewHolder2.shouldIgnore()) {
            i = c21676319sP.LIZ;
            i2 = c21676319sP.LIZIZ;
        } else {
            i = c21676319sP2.LIZ;
            i2 = c21676319sP2.LIZIZ;
        }
        return LJJIFFI(viewHolder, viewHolder2, i3, i4, i, i2);
    }
}
