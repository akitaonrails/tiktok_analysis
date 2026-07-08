package X;

/* JADX INFO: renamed from: X.05RJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
public final class C05RJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C05RI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05RJ(C05RI c05ri, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c05ri;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return this.LLILLL.emit(null, this);
    }
}
