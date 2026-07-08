package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340810DXr extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C340810DXr(int i, int i2, int i3) {
        this.LLILLJJLI = i;
        this.LL = i2;
        this.LLILLL = i3;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        int i2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if ((adapter instanceof AbstractC683560Qra) && ((AbstractC683560Qra) adapter).LL != null) {
            if (childAdapterPosition == 0) {
                return;
            } else {
                childAdapterPosition++;
            }
        }
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        AbstractC214823195h abstractC214823195h = gridLayoutManager.LLIZ;
        int i3 = gridLayoutManager.LLILLJJLI;
        int iLJ = abstractC214823195h.LJ(childAdapterPosition, i3);
        int iLJFF = abstractC214823195h.LJFF(childAdapterPosition);
        boolean zLIZIZ = C444960Hcc.LIZIZ();
        if (iLJ == 0) {
            i = this.LL;
        } else {
            int i4 = this.LLILLJJLI;
            i = i4 - ((iLJ * i4) / i3);
        }
        int i5 = iLJ + 1;
        if (i5 / i3 == 1) {
            i2 = this.LL;
        } else {
            i2 = (i5 * this.LLILLJJLI) / i3;
        }
        if (iLJFF != i3) {
            if (!zLIZIZ) {
                rect.left = i;
                rect.right = i2;
            } else {
                rect.right = i;
                rect.left = i2;
            }
            rect.top = this.LLILLL;
            rect.bottom = 0;
        }
    }
}
