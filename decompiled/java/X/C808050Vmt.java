package X;

/* JADX INFO: renamed from: X.0Vmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.frequency.repository.adapter.OutreachFrequencyDbAdapter", f = "OutreachFrequencyDbAdapter.kt", l = {37}, m = "getCount")
public final class C808050Vmt extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C808030Vmr LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C808050Vmt(C808030Vmr c808030Vmr, InterfaceC1364105Vn<? super C808050Vmt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c808030Vmr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachFrequencyDbAdapter@8ed0.getCount$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("OutreachFrequencyDbAdapter@8ed0.getCount$1");
        return objLJFF;
    }
}
