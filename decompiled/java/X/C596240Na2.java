package X;

/* JADX INFO: renamed from: X.0Na2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {114}, m = "emitExit")
public final class C596240Na2 extends AbstractC23140094w {
    public C596220Na0 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C596220Na0 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596240Na2(C596220Na0 c596220Na0, InterfaceC1364105Vn<? super C596240Na2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c596220Na0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return C596220Na0.LLJJI(this.LLILLL, this);
    }
}
