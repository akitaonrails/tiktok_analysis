package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: X.0Q9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665740Q9k {
    public static Rect LIZIZ(RecyclerView.ViewHolder viewHolder) {
        View view;
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            int i = iArr[0];
            rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
            return rect;
        }
        return null;
    }

    public static C0WIY<Integer, Integer> LIZJ(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new C0WIY<>(Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()), Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()));
        }
        if (layoutManager instanceof GridLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager;
            return new C0WIY<>(Integer.valueOf(linearLayoutManager2.findFirstVisibleItemPosition()), Integer.valueOf(linearLayoutManager2.findLastVisibleItemPosition()));
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int iLJJIII = staggeredGridLayoutManager.LJJIII();
            int[] iArr = new int[iLJJIII];
            staggeredGridLayoutManager.LJIJJ(iArr);
            int i = iArr[0];
            for (int i2 = 0; i2 < iLJJIII; i2++) {
                int i3 = iArr[i2];
                if (i3 > i) {
                    i = i3;
                }
            }
            staggeredGridLayoutManager.LJIJ(iArr);
            int i4 = iArr[0];
            for (int i5 = 0; i5 < iLJJIII; i5++) {
                int i6 = iArr[i5];
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            return new C0WIY<>(Integer.valueOf(i4), Integer.valueOf(i));
        }
        throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
    }

    public static void LIZ(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            return;
        }
        recyclerView.setPadding(0, (int) C12ES.LIZJ(i, recyclerView.getContext()), 0, 0);
        recyclerView.setClipToPadding(false);
    }
}
