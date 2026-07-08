package X;

/* JADX INFO: renamed from: X.13iY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {200}, m = "dispatchPreFling-QWom1Mo")
public final class C20086413iY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20085913iT LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20086413iY(C20085913iT c20085913iT, InterfaceC1364105Vn<? super C20086413iY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20085913iT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LIZJ(0L, this);
    }
}
