package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;

/* JADX INFO: renamed from: X.0M0V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M0V extends C0M0U {
    public final /* synthetic */ DraftFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0V(DraftFragment draftFragment, final LinearLayoutManager linearLayoutManager) {
        new AbstractC1585810rMx(linearLayoutManager) { // from class: X.0M0U
            public final LinearLayoutManager LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
            }

            {
                this.LL = linearLayoutManager;
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                int childCount = this.LL.getChildCount();
                int itemCount = this.LL.getItemCount();
                int iFindFirstVisibleItemPosition = this.LL.findFirstVisibleItemPosition();
                C0M0V c0m0v = (C0M0V) this;
                DraftFragment draftFragment2 = c0m0v.LLILLJJLI;
                if (draftFragment2.LLLI && !draftFragment2.LLJL && draftFragment2.LLJLIL != draftFragment2.PR().LLJILJILJ - 1 && childCount + iFindFirstVisibleItemPosition >= itemCount && iFindFirstVisibleItemPosition >= 0) {
                    C201955140j.LIZJ(C0MAY.LIZIZ, "DraftFragment -> loadMoreItems is running");
                    DraftFragment draftFragment3 = c0m0v.LLILLJJLI;
                    if (draftFragment3.LLLI) {
                        draftFragment3.LLJLIL++;
                        draftFragment3.LLJL = true;
                        C23250099c.LIZLLL(draftFragment3.LLL, null, null, new C2386909Wx(draftFragment3, null), 3);
                    }
                }
            }
        };
        this.LLILLJJLI = draftFragment;
    }
}
