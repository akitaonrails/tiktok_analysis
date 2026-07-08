package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;

/* JADX INFO: renamed from: X.0kQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319070kQj {
    public static int LIZJ = 80;
    public final RecyclerView LIZ;
    public final RunnableC1319050kQh LIZIZ;

    public C1319070kQj(Context context, RecyclerView recyclerView) {
        LIZJ = context.getResources().getDisplayMetrics().densityDpi / 4;
        this.LIZ = recyclerView;
        this.LIZIZ = new RunnableC1319050kQh(this.LIZ);
    }

    public final void LIZ(int i, int i2, Callback callback) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListScroller scrollToPositionNoSmooth: position=");
        sbLIZ.append(i);
        sbLIZ.append(", offset=");
        sbLIZ.append(i2);
        LynxLog.i("UIList", C2188811AlT.LIZIZ(sbLIZ));
        RunnableC1319050kQh runnableC1319050kQh = this.LIZIZ;
        if (runnableC1319050kQh != null && runnableC1319050kQh.LLJ) {
            LynxLog.e("UIList", "ListScroller scrollToPositionSmoothly is scrolling ");
            if (callback != null) {
                callback.invoke(1, "dumplicated, scrollToPositionSmoothly is working");
                return;
            }
            return;
        }
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView != null) {
            recyclerView.stopScroll();
            this.LIZ.stopNestedScroll();
        }
        RecyclerView.LayoutManager layoutManager = this.LIZ.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }
}
