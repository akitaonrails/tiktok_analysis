package X;

/* JADX INFO: renamed from: X.13jR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {101}, m = "performFling")
public final class C20091913jR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20091513jN LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20091913jR(C20091513jN c20091513jN, InterfaceC1364105Vn<? super C20091913jR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20091513jN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LIZIZ(null, 0.0f, null, this);
    }
}
