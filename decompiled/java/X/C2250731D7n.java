package X;

/* JADX INFO: renamed from: X.1D7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
public final class C2250731D7n extends AbstractC23140094w {
    public C2250721D7m LL;
    public C09A4 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C2250721D7m<Object> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250731D7n(C2250721D7m<Object> c2250721D7m, InterfaceC1364105Vn<? super C2250731D7n> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c2250721D7m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.LIZ(this);
    }
}
