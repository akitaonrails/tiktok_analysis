package X;

import Y.AgS212S0200000_30;

/* JADX INFO: renamed from: X.13ki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {125}, m = "collect")
public final class C20099813ki extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20308414dG LLILLL;
    public AgS212S0200000_30 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20099813ki(C20308414dG c20308414dG, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20308414dG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return this.LLILLL.collect(null, this);
    }
}
