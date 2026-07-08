package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DXU extends C0DXR {
    public final int LL;

    public C0DXU(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        GridLayoutManager gridLayoutManager;
        AbstractC214823195h abstractC214823195h;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null && (abstractC214823195h = gridLayoutManager.LLIZ) != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = gridLayoutManager.LLILLJJLI;
            if (abstractC214823195h.LJFF(childAdapterPosition) == 1) {
                int iLJ = abstractC214823195h.LJ(childAdapterPosition, i);
                int i2 = this.LL;
                rect.left = (iLJ * i2) / i;
                rect.right = i2 - (((iLJ + 1) * i2) / i);
                if (abstractC214823195h.LIZLLL(childAdapterPosition, i) > 0) {
                    rect.top = this.LL;
                }
            }
        }
    }
}
