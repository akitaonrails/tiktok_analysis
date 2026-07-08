package X;

/* JADX INFO: renamed from: X.0tqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", l = {455, 458}, m = "fling")
public final class C1681230tqr extends AbstractC23140094w {
    public C817403Hg LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1681210tqp<Object> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681230tqr(C1681210tqp<Object> c1681210tqp, InterfaceC1364105Vn<? super C1681230tqr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1681210tqp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return C1681210tqp.LLJJLIIIJLLLLLLLZ(this.LLILLL, 0.0f, this);
    }
}
