package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0riI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599040riI extends AbstractC1585810rMx {
    public final SkylightListViewModel LL;
    public final C2369609Qg LLILLJJLI = new C2369609Qg("CustomLoadMoreTrigger");

    public C1599040riI(SkylightListViewModel skylightListViewModel, C1598650rhf c1598650rhf) {
        this.LL = skylightListViewModel;
        skylightListViewModel.zc1(c1598650rhf, new AwS603S0100000_24(this, 665), null, new AwS603S0100000_24(this, 666));
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        Object c098200Yq;
        boolean z;
        int i3;
        int i4;
        if (this.LLILLJJLI.LIZIZ.LIZIZ() || this.LL.LJJIIJZLJL() || this.LL.GQ2()) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Object obj = null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (C1206204nk.LIZ()) {
            if (this.LL.LLJJJJLIIL.length() <= 0) {
                return;
            }
        } else {
            try {
                if (this.LL.FQ2().pageToken() != null) {
                    z = true;
                } else {
                    z = false;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            Boolean bool = (Boolean) obj;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
        }
        if (linearLayoutManager != null) {
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int itemCount = linearLayoutManager.getItemCount();
            if (iFindLastVisibleItemPosition >= 0 && itemCount > iFindLastVisibleItemPosition && (i3 = (itemCount - iFindLastVisibleItemPosition) - 1) <= (i4 = C1599090riN.LIZIZ().maxInvisibleCountForLoadMore)) {
                C2369609Qg c2369609Qg = this.LLILLJJLI;
                SkylightListViewModel skylightListViewModel = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("trigger load more when curInvisibleCount=");
                sbLIZ.append(i3);
                sbLIZ.append(", maxInvisibleCount=");
                sbLIZ.append(i4);
                c2369609Qg.LIZIZ(skylightListViewModel, C2188811AlT.LIZIZ(sbLIZ), new AwS568S0100000_24(this, 1853));
            }
        }
    }
}
