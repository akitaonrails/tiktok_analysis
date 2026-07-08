package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;

/* JADX INFO: renamed from: X.0OHT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OHT extends C2217421BqW implements InterfaceC1631630sYr<String, String, Long, InterfaceC1364105Vn<? super BulletinListResponse>, Object>, InterfaceC842703Qz {
    public C0OHT(BulletinListViewModel bulletinListViewModel) {
        super(4, bulletinListViewModel, BulletinListViewModel.class, "tryToLoadMore", "tryToLoadMore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(String str, String str2, Long l, InterfaceC1364105Vn<? super BulletinListResponse> interfaceC1364105Vn) {
        Long l2 = l;
        return ((C0OKS) ((BulletinListViewModel) this.receiver).zQ2().getOperator()).LLLIIIIL(l2, str, str2, interfaceC1364105Vn);
    }
}
