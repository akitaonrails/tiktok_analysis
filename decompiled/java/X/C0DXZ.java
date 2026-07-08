package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DXZ extends C0DXR {
    public final int LL;

    public C0DXZ(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        GridLayoutManager gridLayoutManager;
        C21681919tJ c21681919tJ;
        AbstractC214823195h abstractC214823195h;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof C21681919tJ) || (c21681919tJ = (C21681919tJ) layoutParams) == null || (abstractC214823195h = gridLayoutManager.LLIZ) == null) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = gridLayoutManager.LLILLJJLI;
            if (1 == c21681919tJ.LLILLJJLI) {
                int i2 = c21681919tJ.LL;
                int i3 = this.LL;
                rect.left = (i2 * i3) / i;
                rect.right = i3 - (((i2 + 1) * i3) / i);
                if (abstractC214823195h.LIZLLL(childAdapterPosition, i) > 0) {
                    rect.top = this.LL;
                }
            }
        }
    }
}
