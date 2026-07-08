package X;

/* JADX INFO: renamed from: X.0wfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.base.MetricEngine", f = "MetricEngine.kt", l = {27}, m = "process$suspendImpl")
public final class C1789500wfU<IN, OUT> extends AbstractC23140094w {
    public AbstractC1789510wfV LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC1789510wfV<IN, OUT> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789500wfU(AbstractC1789510wfV<IN, OUT> abstractC1789510wfV, InterfaceC1364105Vn<? super C1789500wfU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC1789510wfV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MetricEngine@6348.process$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = AbstractC1789510wfV.LJIIIIZZ(this.LLILZIL, null, this);
        C1C7U.LIZIZ("MetricEngine@6348.process$1");
        return objLJIIIIZZ;
    }
}
