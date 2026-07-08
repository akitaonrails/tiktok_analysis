package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0yXE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861260yXE {
    public static EnumC1861280yXG LIZ(RecyclerView recyclerView, Rect rect) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter == null) {
                return EnumC1861280yXG.ABOVE_BOTTOM;
            }
            int itemCount = adapter.getItemCount();
            if (itemCount <= 1) {
                return EnumC1861280yXG.ABOVE_BOTTOM;
            }
            if (linearLayoutManager.getChildAt(0) == null) {
                return EnumC1861280yXG.ABOVE_BOTTOM;
            }
            int i = (itemCount - 1) - 1;
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
            if (viewFindViewByPosition == null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (i < iFindFirstVisibleItemPosition) {
                    return EnumC1861280yXG.ABOVE_TOP;
                }
                if (i > iFindLastVisibleItemPosition) {
                    return EnumC1861280yXG.BELOW_BOTTOM;
                }
                return EnumC1861280yXG.BELOW_BOTTOM;
            }
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            if (rect == null) {
                rect = new Rect();
            }
            linearLayoutManager.getDecoratedBoundsWithMargins(viewFindViewByPosition, rect);
            int i2 = rect.bottom;
            if (i2 <= paddingTop) {
                return EnumC1861280yXG.ABOVE_TOP;
            }
            int i3 = rect.top;
            if (i3 >= height) {
                return EnumC1861280yXG.BELOW_BOTTOM;
            }
            if (i3 >= paddingTop && i2 <= height) {
                return EnumC1861280yXG.FULLY_VISIBLE;
            }
            if (i3 >= paddingTop && i2 > height) {
                return EnumC1861280yXG.PARTIAL_BOTTOM;
            }
            if (i3 < paddingTop && i2 <= height) {
                return EnumC1861280yXG.ABOVE_BOTTOM;
            }
            if (i3 < paddingTop && i2 > height) {
                return EnumC1861280yXG.PARTIAL_BOTTOM;
            }
            return EnumC1861280yXG.PARTIAL_BOTTOM;
        }
        return EnumC1861280yXG.ABOVE_BOTTOM;
    }
}
