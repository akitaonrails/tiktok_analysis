package X;

import com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileAwemeListFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;

/* JADX INFO: renamed from: X.0hes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212520hes extends C1255920ims<C1252850ihv> {
    @Override // X.C1255920ims, X.C1260870iur
    public final void LJIILIIL() {
        K k;
        T t = this.LL;
        if (t == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        int i = ((AbstractC1255880imo) t).mListQueryType;
        if (i == 1) {
            ((InterfaceC1212360hec) k).LJ();
        } else if (i == 4) {
            ((InterfaceC1212360hec) k).showLoadMoreLoading();
        }
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        K k;
        T t = this.LL;
        if (t == 0 || (k = this.LLILLJJLI) == 0) {
            return;
        }
        if (k instanceof AdFakeUserProfileAwemeListFragment) {
            ((AdFakeUserProfileAwemeListFragment) k).LLJILLL = ((FeedItemList) t.getData()).maxCursor;
        } else if (k instanceof DetailFragmentPanel) {
            ((BaseListFragmentPanel) k).LLLLIIIILLL.setMaxCursor(((FeedItemList) t.getData()).maxCursor);
        }
        T t2 = this.LL;
        if (((AbstractC1255880imo) t2).mListQueryType != 1) {
            if (((AbstractC1255880imo) t2).mListQueryType == 4) {
                ((InterfaceC1212360hec) this.LLILLJJLI).Pj(((AbstractC1255880imo) t2).getItems(), ((AbstractC1255880imo) this.LL).isHasMore());
            }
        } else if (((AbstractC1255880imo) t2).isDataEmpty()) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
        } else {
            ((InterfaceC1212360hec) this.LLILLJJLI).Pj(((AbstractC1255880imo) this.LL).getItems(), ((AbstractC1255880imo) this.LL).isHasMore());
        }
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k;
        T t = this.LL;
        if (t != 0 && (k = this.LLILLJJLI) != 0) {
            int i = ((AbstractC1255880imo) t).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((InterfaceC1212360hec) k).Wi(exc);
                    return;
                }
                return;
            }
            ((InterfaceC1212360hec) k).Uq2(exc);
        }
    }
}
