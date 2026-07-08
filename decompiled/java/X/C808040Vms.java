package X;

/* JADX INFO: renamed from: X.0Vms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.frequency.repository.adapter.OutreachFrequencyDbAdapter", f = "OutreachFrequencyDbAdapter.kt", l = {28, 30}, m = "queryInitial")
public final class C808040Vms extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C808030Vmr LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C808040Vms(C808030Vmr c808030Vmr, InterfaceC1364105Vn<? super C808040Vms> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c808030Vmr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachFrequencyDbAdapter@8ed0.queryInitial$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("OutreachFrequencyDbAdapter@8ed0.queryInitial$1");
        return objLIZLLL;
    }
}
