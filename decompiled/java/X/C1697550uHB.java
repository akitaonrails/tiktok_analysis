package X;

/* JADX INFO: renamed from: X.0uHB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {544}, m = "tryAwaitRelease")
public final class C1697550uHB extends AbstractC23140094w {
    public C1697530uH9 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1697530uH9 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697550uHB(C1697530uH9 c1697530uH9, InterfaceC1364105Vn<? super C1697550uHB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1697530uH9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LJJIJIIJIL(this);
    }
}
