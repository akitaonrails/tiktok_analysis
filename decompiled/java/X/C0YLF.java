package X;

/* JADX INFO: renamed from: X.0YLF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.utils.CoreReversalHelper", f = "CoreReversalHelper.kt", l = {54}, m = "delayForFlowSuspend")
public final class C0YLF extends AbstractC23140094w {
    public C0YLC LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0YLE LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YLF(C0YLE c0yle, InterfaceC1364105Vn<? super C0YLF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0yle;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CoreReversalHelper@d525.delayForFlowSuspend$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, this);
        C1C7U.LIZIZ("CoreReversalHelper@d525.delayForFlowSuspend$1");
        return objLIZIZ;
    }
}
