package X;

import com.ss.android.ugc.aweme.notification.aggnotice.vm.AggregateListViewModel;

/* JADX INFO: renamed from: X.0zp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.aggnotice.vm.AggregateListViewModel", f = "AggregateListViewModel.kt", l = {53}, m = "onLoadMore")
public final class C1910770zp5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AggregateListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910770zp5(AggregateListViewModel aggregateListViewModel, InterfaceC1364105Vn<? super C1910770zp5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aggregateListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AggregateListViewModel@ead9.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("AggregateListViewModel@ead9.onLoadMore$1");
        return objXQ2;
    }
}
