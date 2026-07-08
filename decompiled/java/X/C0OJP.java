package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OJP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OJP extends C2217421BqW implements Function2<Long, InterfaceC1364105Vn<? super BulletinFetchEventResponse>, Object>, InterfaceC842703Qz {
    public C0OJP(Object obj) {
        super(2, obj, BulletinListViewModel.class, "fetchBulletinItemEvents", "fetchBulletinItemEvents(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, InterfaceC1364105Vn<? super BulletinFetchEventResponse> interfaceC1364105Vn) {
        return ((BulletinListViewModel) this.receiver).yQ2(l.longValue(), interfaceC1364105Vn);
    }
}
