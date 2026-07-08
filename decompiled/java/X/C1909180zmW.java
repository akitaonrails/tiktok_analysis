package X;

import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.bean.LikeListResponse;
import com.ss.android.ugc.aweme.notification.model.LikeListModel;
import java.util.List;

/* JADX INFO: renamed from: X.0zmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909180zmW extends C1260870iur<LikeListModel, InterfaceC1212360hec<DiggInfo>> implements InterfaceC1909070zmL {
    @Override // X.InterfaceC1909070zmL
    public final int LIZLLL() {
        LikeListResponse likeListResponse;
        T t = this.LL;
        if (t == 0 || (likeListResponse = (LikeListResponse) t.getData()) == null) {
            return 0;
        }
        return likeListResponse.LL;
    }

    @Override // X.C1260870iur
    public final void LJIILIIL() {
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        if (((LikeListModel) t).isLoadMore) {
            ((InterfaceC1212360hec) this.LLILLJJLI).showLoadMoreLoading();
        } else {
            ((InterfaceC1212360hec) this.LLILLJJLI).LJ();
        }
    }

    @Override // X.InterfaceC1909070zmL
    public final void LJJIFFI() {
        LikeListModel likeListModel = (LikeListModel) this.LL;
        if (likeListModel != null) {
            likeListModel.loadMore();
        }
        LJIILIIL();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        LikeListResponse likeListResponse;
        LikeListResponse likeListResponse2;
        List<DiggInfo> list;
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        LikeListModel likeListModel = (LikeListModel) t;
        if (likeListModel.isLoadMore) {
            InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI;
            List<DiggInfo> list2 = likeListModel.getData().diggInfos;
            T t2 = this.LL;
            interfaceC1212360hec.Pj(list2, (t2 == 0 || (likeListResponse2 = (LikeListResponse) t2.getData()) == null || likeListResponse2.hasMore != 1 || (list = ((LikeListResponse) this.LL.getData()).diggInfos) == null || list.isEmpty()) ? false : true);
            return;
        }
        List<DiggInfo> list3 = likeListModel.getData().diggInfos;
        if (list3 == null || list3.isEmpty()) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
            return;
        }
        InterfaceC1212360hec interfaceC1212360hec2 = (InterfaceC1212360hec) this.LLILLJJLI;
        List<DiggInfo> list4 = ((LikeListResponse) this.LL.getData()).diggInfos;
        T t3 = this.LL;
        interfaceC1212360hec2.LLJJJIL(list4, (t3 == 0 || (likeListResponse = (LikeListResponse) t3.getData()) == null || likeListResponse.hasMore != 1) ? false : true);
    }

    @Override // X.InterfaceC1909070zmL
    public final void refresh() {
        LikeListModel likeListModel = (LikeListModel) this.LL;
        if (likeListModel != null) {
            likeListModel.refresh();
        }
        LJIILIIL();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        T t = this.LL;
        if (t != 0 && this.LLILLJJLI != 0) {
            if (((LikeListModel) t).isLoadMore) {
                ((InterfaceC1212360hec) this.LLILLJJLI).Wi(exc);
            } else {
                ((InterfaceC1212360hec) this.LLILLJJLI).Uq2(exc);
            }
        }
    }
}
