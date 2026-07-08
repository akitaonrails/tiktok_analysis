package X;

/* JADX INFO: renamed from: X.0k62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.graph.StrategyGraphContainer", f = "StrategyGraphContainer.kt", l = {224, 231}, m = "runStrategyInternal")
public final class C1306240k62 extends AbstractC23140094w {
    public InterfaceC1307160k7W LL;
    public C259800zU LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1306250k63 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306240k62(C1306250k63 c1306250k63, InterfaceC1364105Vn<? super C1306240k62> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1306250k63;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("StrategyGraphContainer@a2bb.runStrategyInternal$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIZILJ = this.LLILZIL.LJIIZILJ(null, this);
        C1C7U.LIZIZ("StrategyGraphContainer@a2bb.runStrategyInternal$1");
        return objLJIIZILJ;
    }
}
