package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0riU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599160riU extends AbstractC1585810rMx {
    public final SkylightListViewModel LL;
    public boolean LLILLJJLI;

    public C1599160riU(SkylightListViewModel skylightListViewModel, C1598650rhf c1598650rhf) {
        this.LL = skylightListViewModel;
        skylightListViewModel.zc1(c1598650rhf, new AwS603S0100000_24(this, 667), null, new AwS603S0100000_24(this, 668));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int iFindLastVisibleItemPosition;
        int itemCount;
        if (this.LLILLJJLI || !(((InboxSkylightListState) this.LL.getState()).getLoadMoreState() instanceof C491001vg)) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition()) > 0 && linearLayoutManager != null && (itemCount = linearLayoutManager.getItemCount()) > 0 && iFindLastVisibleItemPosition >= itemCount - 2) {
            this.LLILLJJLI = true;
            AssemSingleListViewModel.manualListLoadMore$default(this.LL, null, 1, null);
        }
    }
}
