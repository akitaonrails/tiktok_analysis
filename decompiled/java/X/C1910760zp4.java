package X;

import com.ss.android.ugc.aweme.notification.aggnotice.vm.AggregateListViewModel;

/* JADX INFO: renamed from: X.0zp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.aggnotice.vm.AggregateListViewModel", f = "AggregateListViewModel.kt", l = {48}, m = "onRefresh")
public final class C1910760zp4 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AggregateListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910760zp4(AggregateListViewModel aggregateListViewModel, InterfaceC1364105Vn<? super C1910760zp4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aggregateListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AggregateListViewModel@ead9.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("AggregateListViewModel@ead9.onRefresh$1");
        return objOnRefresh;
    }
}
