package X;

import Y.AgS193S0200000_2;

/* JADX INFO: renamed from: X.05Yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
public final class C1371205Yg extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS193S0200000_2<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1371205Yg(AgS193S0200000_2<? super T> agS193S0200000_2, InterfaceC1364105Vn<? super C1371205Yg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS193S0200000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LIZ$2(0, this);
    }
}
