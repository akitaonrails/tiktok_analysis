package X;

import Y.IDgS859S0100000;

/* JADX INFO: renamed from: X.01P3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel$subscribeToMessageFlows$1$1", f = "AudienceRankingEntranceViewModel.kt", l = {70}, m = "emit")
public final class C01P3 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IDgS859S0100000<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01P3(IDgS859S0100000<? super T> iDgS859S0100000, InterfaceC1364105Vn<? super C01P3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iDgS859S0100000;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudienceRankingEntranceViewModel@5276.subscribeToMessageFlows$1$1$emit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ$0 = this.LLILLJJLI.LIZ$0(null, this);
        C1C7U.LIZIZ("AudienceRankingEntranceViewModel@5276.subscribeToMessageFlows$1$1$emit$1");
        return objLIZ$0;
    }
}
