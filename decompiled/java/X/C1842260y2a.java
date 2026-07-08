package X;

import Y.AgS307S0100000_27;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;

/* JADX INFO: renamed from: X.0y2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel$onRefresh$2$1$2", f = "ExploreFeedListViewModel.kt", l = {1163}, m = "emit")
public final class C1842260y2a extends AbstractC23140094w {
    public ExploreAwemeList LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AgS307S0100000_27<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1842260y2a(AgS307S0100000_27<? super T> agS307S0100000_27, InterfaceC1364105Vn<? super C1842260y2a> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS307S0100000_27;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreFeedListViewModel@1463.onRefresh$2$1$2$emit$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ$0 = this.LLILLL.LIZ$0(null, this);
        C1C7U.LIZIZ("ExploreFeedListViewModel@1463.onRefresh$2$1$2$emit$1");
        return objLIZ$0;
    }
}
