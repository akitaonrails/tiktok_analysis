package X;

import Y.AgS212S0200000_30;

/* JADX INFO: renamed from: X.13kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {142, 143}, m = "emit")
public final class C20099613kg extends AbstractC23140094w {
    public AgS212S0200000_30 LL;
    public /* synthetic */ Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AgS212S0200000_30 LLILZ;
    public Object LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20099613kg(AgS212S0200000_30 agS212S0200000_30, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS212S0200000_30;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILZ.emit(null, this);
    }
}
