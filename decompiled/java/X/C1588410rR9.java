package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0rR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588410rR9 extends AbstractC1216410hl9<C1588840rRq, C1588420rRA> implements InterfaceC1603420rpM {
    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 1;
    }

    public C1588410rR9(AbstractC1255880imo abstractC1255880imo) {
        this.mModel = abstractC1255880imo instanceof C1588840rRq ? abstractC1255880imo : new C1588840rRq();
        this.mPresenter = new AbstractC666280QBm<C1588840rRq, FollowFeed>() { // from class: X.0rRA
            @Override // X.AbstractC666280QBm
            public final List<Aweme> LJIJJ() {
                return C1588840rRq.LJIILJJIL(((AbstractC1255880imo) this.LL).getItems());
            }

            @Override // X.AbstractC666280QBm
            public final List<FollowFeed> LJIJJLI() {
                T t = this.LL;
                if (t == 0) {
                    return null;
                }
                return ((AbstractC1255880imo) t).getItems();
            }

            @Override // X.AbstractC666280QBm
            public final String LJIJI(FollowFeed followFeed) {
                FollowFeed followFeed2 = followFeed;
                if (followFeed2 == null) {
                    return "";
                }
                return C735370Ssx.LIZJ(followFeed2.getAweme());
            }
        };
    }

    @Override // X.InterfaceC1603420rpM
    public final void bindPreLoadView(InterfaceC666290QBn interfaceC666290QBn) {
        ((AbstractC666280QBm) this.mPresenter).LLILZIL = interfaceC666290QBn;
    }

    @Override // X.InterfaceC1603420rpM
    public final void setPreLoad(boolean z) {
        ((AbstractC666280QBm) this.mPresenter).LLILZLL = true;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        if (i == 1) {
            this.mPresenter.LIZJ(1, new C1588400rR8(1, 0, 0, C0TJ8.LIZJ("feed").LJ()).LIZ());
            return;
        }
        if (i == 4) {
            PRESENTER presenter = this.mPresenter;
            C1588400rR8 c1588400rR8 = new C1588400rR8(4, 2, 0, C0TJ8.LIZJ("feed").LJ());
            c1588400rR8.LIZLLL = C0TJ8.LIZJ("feed").LIZLLL();
            presenter.LIZJ(4, c1588400rR8.LIZ());
            return;
        }
        PRESENTER presenter2 = this.mPresenter;
        C1588400rR8 c1588400rR82 = new C1588400rR8(i, 2, 0, C0TJ8.LIZJ("feed").LJ());
        c1588400rR82.LIZLLL = C0TJ8.LIZJ("feed").LIZLLL();
        presenter2.LIZJ(Integer.valueOf(i), c1588400rR82.LIZ());
    }
}
