package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13jQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {115}, m = "fling")
public final class C20091813jQ extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20091513jN LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20091813jQ(C20091513jN c20091513jN, InterfaceC1364105Vn<? super C20091813jQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20091513jN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LIZLLL(null, 0.0f, null, this);
    }
}
