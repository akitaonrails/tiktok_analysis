package X;

/* JADX INFO: renamed from: X.13jP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {175}, m = "tryApproach")
public final class C20091713jP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20091513jN LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20091713jP(C20091513jN c20091513jN, InterfaceC1364105Vn<? super C20091713jP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20091513jN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return C20091513jN.LIZJ(this.LLILLJJLI, null, 0.0f, 0.0f, null, this);
    }
}
