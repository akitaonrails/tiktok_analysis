package X;

/* JADX INFO: renamed from: X.0Z22, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.SinglePinToTopActionKt$bindEnableFromSpamStatus$1$invokeSuspend$$inlined$map$1$2", f = "SinglePinToTopAction.kt", l = {223}, m = "emit")
public final class C0Z22 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0Z21 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z22(C0Z21 c0z21, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0z21;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return this.LLILLL.emit(null, this);
    }
}
