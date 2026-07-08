package X;

/* JADX INFO: renamed from: X.13iX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {223, 225}, m = "dispatchPostFling-RZ2iAVY")
public final class C20086313iX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20085913iT LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20086313iX(C20085913iT c20085913iT, InterfaceC1364105Vn<? super C20086313iX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20085913iT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LIZ(0L, 0L, this);
    }
}
