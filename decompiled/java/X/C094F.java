package X;

import Y.AgS33S0500000_3;

/* JADX INFO: renamed from: X.094F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", l = {128}, m = "emit")
public final class C094F extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS33S0500000_3<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C094F(AgS33S0500000_3<? super T> agS33S0500000_3, InterfaceC1364105Vn<? super C094F> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS33S0500000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.emit(null, this);
    }
}
