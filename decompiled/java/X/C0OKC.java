package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OKC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OKC extends C1696260uF6 implements Function1<List<? extends BulletinFetchEvent>, Unit> {
    public C0OKC(Object obj) {
        super(1, obj, BulletinListViewModel.class, "handleFetchEvents", "handleFetchEvents(Ljava/util/List;Ljava/util/Map;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends BulletinFetchEvent> list) {
        ((BulletinListViewModel) this.receiver).p81(list, null);
        return Unit.LIZ;
    }
}
