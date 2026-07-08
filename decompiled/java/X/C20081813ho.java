package X;

/* JADX INFO: renamed from: X.13ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {132, 135}, m = "onScrollCaptureImageRequest")
public final class C20081813ho extends AbstractC23140094w {
    public ScrollCaptureCallbackC20081513hl LL;
    public Object LLILLJJLI;
    public C1680470tpd LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ ScrollCaptureCallbackC20081513hl LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20081813ho(ScrollCaptureCallbackC20081513hl scrollCaptureCallbackC20081513hl, InterfaceC1364105Vn<? super C20081813ho> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = scrollCaptureCallbackC20081513hl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC20081513hl.LIZ(this.LLIZ, null, null, this);
    }
}
