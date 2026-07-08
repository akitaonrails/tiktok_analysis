package X;

/* JADX INFO: renamed from: X.13i4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {898, 901}, m = "onPostFling-RZ2iAVY")
public final class C20083413i4 extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20083013i0 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20083413i4(C20083013i0 c20083013i0, InterfaceC1364105Vn<? super C20083413i4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20083013i0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LLFII(0L, 0L, this);
    }
}
