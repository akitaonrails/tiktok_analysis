package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PD1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PD1<T> extends AbstractC1585810rMx {
    public final C0PD2<T> LL;
    public final C0PD3<T> LLILLJJLI;
    public final List<T> LLILLL = new ArrayList();

    public C0PD1(C0PD2<T> c0pd2, C0PD3<T> c0pd3) {
        this.LL = c0pd2;
        this.LLILLJJLI = c0pd3;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            if (iFindFirstCompletelyVisibleItemPosition > iFindLastCompletelyVisibleItemPosition) {
                return;
            }
            while (true) {
                T item = this.LL.getItem(iFindFirstCompletelyVisibleItemPosition);
                if (item != null && !((ArrayList) this.LLILLL).contains(item)) {
                    ((ArrayList) this.LLILLL).add(item);
                    C0PD3<T> c0pd3 = this.LLILLJJLI;
                    if (c0pd3 != null) {
                        c0pd3.LIZ(iFindFirstCompletelyVisibleItemPosition, item);
                    }
                }
                if (iFindFirstCompletelyVisibleItemPosition != iFindLastCompletelyVisibleItemPosition) {
                    iFindFirstCompletelyVisibleItemPosition++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("ItemShowDetector Only support LinearLayoutManager");
        }
    }
}
