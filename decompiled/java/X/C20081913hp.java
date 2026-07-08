package X;

/* JADX INFO: renamed from: X.13hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {296}, m = "scrollBy")
public final class C20081913hp extends AbstractC23140094w {
    public C20081713hn LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20081713hn LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20081913hp(C20081713hn c20081713hn, InterfaceC1364105Vn<? super C20081913hp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20081713hn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LIZ(0.0f, this);
    }
}
