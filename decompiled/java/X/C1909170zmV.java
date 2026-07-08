package X;

import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.FavoriteListResponse;
import com.ss.android.ugc.aweme.notification.model.FavoriteUserListModel;
import java.util.List;

/* JADX INFO: renamed from: X.0zmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909170zmV extends C1260870iur<FavoriteUserListModel, InterfaceC1212360hec<DiggInfo>> implements InterfaceC1909070zmL {
    @Override // X.InterfaceC1909070zmL
    public final int LIZLLL() {
        FavoriteListResponse favoriteListResponse;
        T t = this.LL;
        if (t == 0 || (favoriteListResponse = (FavoriteListResponse) t.getData()) == null) {
            return 0;
        }
        return favoriteListResponse.LL;
    }

    @Override // X.C1260870iur
    public final void LJIILIIL() {
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        if (((FavoriteUserListModel) t).isLoadMore) {
            ((InterfaceC1212360hec) this.LLILLJJLI).showLoadMoreLoading();
        } else {
            ((InterfaceC1212360hec) this.LLILLJJLI).LJ();
        }
    }

    @Override // X.InterfaceC1909070zmL
    public final void LJJIFFI() {
        FavoriteUserListModel favoriteUserListModel = (FavoriteUserListModel) this.LL;
        if (favoriteUserListModel != null) {
            favoriteUserListModel.loadMore();
        }
        LJIILIIL();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        FavoriteListResponse favoriteListResponse;
        FavoriteListResponse favoriteListResponse2;
        List<DiggInfo> list;
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        FavoriteUserListModel favoriteUserListModel = (FavoriteUserListModel) t;
        if (favoriteUserListModel.isLoadMore) {
            InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI;
            List<DiggInfo> list2 = favoriteUserListModel.getData().diggInfos;
            T t2 = this.LL;
            interfaceC1212360hec.Pj(list2, (t2 == 0 || (favoriteListResponse2 = (FavoriteListResponse) t2.getData()) == null || favoriteListResponse2.hasMore != 1 || (list = ((FavoriteListResponse) this.LL.getData()).diggInfos) == null || list.isEmpty()) ? false : true);
            return;
        }
        List<DiggInfo> list3 = favoriteUserListModel.getData().diggInfos;
        if (list3 == null || list3.isEmpty()) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
            return;
        }
        InterfaceC1212360hec interfaceC1212360hec2 = (InterfaceC1212360hec) this.LLILLJJLI;
        List<DiggInfo> list4 = ((FavoriteListResponse) this.LL.getData()).diggInfos;
        T t3 = this.LL;
        interfaceC1212360hec2.LLJJJIL(list4, (t3 == 0 || (favoriteListResponse = (FavoriteListResponse) t3.getData()) == null || favoriteListResponse.hasMore != 1) ? false : true);
    }

    @Override // X.InterfaceC1909070zmL
    public final void refresh() {
        FavoriteUserListModel favoriteUserListModel = (FavoriteUserListModel) this.LL;
        if (favoriteUserListModel != null) {
            favoriteUserListModel.refresh();
        }
        LJIILIIL();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        T t = this.LL;
        if (t != 0 && this.LLILLJJLI != 0) {
            if (((FavoriteUserListModel) t).isLoadMore) {
                ((InterfaceC1212360hec) this.LLILLJJLI).Wi(exc);
            } else {
                ((InterfaceC1212360hec) this.LLILLJJLI).Uq2(exc);
            }
        }
    }
}
