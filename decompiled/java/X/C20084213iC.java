package X;

/* JADX INFO: renamed from: X.13iC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {122}, m = "userScroll")
public final class C20084213iC extends AbstractC23140094w {
    public C20083813i8 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20083813i8 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20084213iC(C20083813i8 c20083813i8, InterfaceC1364105Vn<? super C20084213iC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20083813i8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LJFF(null, this, null);
    }
}
