package X;

/* JADX INFO: renamed from: X.13iA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {244, 295}, m = "dispatchMouseWheelScroll")
public final class C20084013iA extends AbstractC23140094w {
    public C20083813i8 LL;
    public C20082713hx LLILLJJLI;
    public C817403Hg LLILLL;
    public float LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C20083813i8 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20084013iA(C20083813i8 c20083813i8, InterfaceC1364105Vn<? super C20084013iA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c20083813i8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        return C20083813i8.LIZIZ(this.LLILZLL, null, null, 0.0f, 0.0f, this);
    }
}
