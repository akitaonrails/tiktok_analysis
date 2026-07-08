package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0PEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641510PEf {
    public static final List<Integer> LIZ(RecyclerView recyclerView) {
        int iIntValue;
        int iIntValue2;
        int iMin;
        int iMax;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (itemCount <= 0) {
                return C13BV.INSTANCE;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1 && iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition) {
                    return C13LP.LLIIII(new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition));
                }
                return C13BV.INSTANCE;
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArrLJIJ = staggeredGridLayoutManager.LJIJ(null);
                int[] iArrLJIJJ = staggeredGridLayoutManager.LJIJJ(null);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int iLJJIII = staggeredGridLayoutManager.LJJIII();
                for (int i = 0; i < iLJJIII; i++) {
                    Integer numLJJIIJ = C13LQ.LJJIIJ(i, iArrLJIJ);
                    if (numLJJIIJ != null) {
                        iIntValue = numLJJIIJ.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    Integer numLJJIIJ2 = C13LQ.LJJIIJ(i, iArrLJIJJ);
                    if (numLJJIIJ2 != null) {
                        iIntValue2 = numLJJIIJ2.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    if (iIntValue != -1 && iIntValue2 != -1 && (iMin = Math.min(iIntValue, iIntValue2)) <= (iMax = Math.max(iIntValue, iIntValue2))) {
                        while (true) {
                            if (iMin >= 0 && iMin < itemCount) {
                                linkedHashSet.add(Integer.valueOf(iMin));
                            }
                            if (iMin != iMax) {
                                iMin++;
                            }
                        }
                    }
                }
                return C13LP.LJLLJ(linkedHashSet);
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }

    public static final boolean LIZIZ(RecyclerView recyclerView, boolean z) {
        if (recyclerView == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (z) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition == null || viewFindViewByPosition.getTop() != 0 || iFindFirstVisibleItemPosition != 0) {
                    return false;
                }
            } else if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() != 0) {
                return false;
            }
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return false;
            }
            if (z) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                for (int i : staggeredGridLayoutManager.LJIJ(null)) {
                    if (i == 0) {
                        View viewFindViewByPosition2 = staggeredGridLayoutManager.findViewByPosition(0);
                        if (viewFindViewByPosition2 == null || viewFindViewByPosition2.getTop() != recyclerView.getPaddingTop()) {
                            return false;
                        }
                    }
                }
                return false;
            }
            for (int i2 : ((StaggeredGridLayoutManager) layoutManager).LJIILL(null)) {
                if (i2 != 0) {
                }
            }
            return false;
        }
        return true;
    }
}
