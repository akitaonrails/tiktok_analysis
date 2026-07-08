package X;

/* JADX INFO: renamed from: X.0u5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {49}, m = "waitForFirstLayout")
public final class C1690610u5z extends AbstractC23140094w {
    public InterfaceC1364105Vn LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1690600u5y LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690610u5z(C1690600u5y c1690600u5y, InterfaceC1364105Vn<? super C1690610u5z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1690600u5y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LJIJI(this);
    }
}
