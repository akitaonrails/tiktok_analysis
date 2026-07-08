package X;

/* JADX INFO: renamed from: X.0wew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.arch.BaseEngine", f = "BaseEngine.kt", l = {25, 30}, m = "process$suspendImpl")
public final class C1789160wew<IN, OUT, ERR> extends AbstractC23140094w {
    public AbstractC1789150wev LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AbstractC1789150wev<IN, OUT, ERR> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789160wew(AbstractC1789150wev<IN, OUT, ERR> abstractC1789150wev, InterfaceC1364105Vn<? super C1789160wew> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = abstractC1789150wev;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseEngine@87d9.process$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJ = AbstractC1789150wev.LJ(this.LLILZ, null, this);
        C1C7U.LIZIZ("BaseEngine@87d9.process$1");
        return objLJ;
    }
}
