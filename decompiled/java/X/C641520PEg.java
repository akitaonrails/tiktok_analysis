package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: X.0PEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641520PEg {
    public static Integer LIZ(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        Integer numValueOf;
        Integer numLJJJJLL;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            numValueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition());
        } else {
            numValueOf = null;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            numLJJJJLL = C13LQ.LJJJJLL(((StaggeredGridLayoutManager) layoutManager).LJIJ(null));
        } else {
            numLJJJJLL = numValueOf;
        }
        if (layoutManager instanceof GridLayoutManager) {
            return Integer.valueOf(((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition());
        }
        return numLJJJJLL;
    }

    public static Integer LIZIZ(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        Integer numValueOf;
        Integer numLJJJJJL;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            numValueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).findLastVisibleItemPosition());
        } else {
            numValueOf = null;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            numLJJJJJL = C13LQ.LJJJJJL(((StaggeredGridLayoutManager) layoutManager).LJIJJ(null));
        } else {
            numLJJJJJL = numValueOf;
        }
        if (layoutManager instanceof GridLayoutManager) {
            return Integer.valueOf(((LinearLayoutManager) layoutManager).findLastVisibleItemPosition());
        }
        return numLJJJJJL;
    }

    public static int LIZJ(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        int i = 1;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return 1;
        }
        if (layoutManager instanceof GridLayoutManager) {
            i = ((GridLayoutManager) layoutManager).LLILLJJLI;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).LJJIII();
        }
        return i;
    }
}
