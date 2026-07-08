package X;

import Y.AgS210S0200000_27;

/* JADX INFO: renamed from: X.0wc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.restore.action.ListenToPurchaseUpdateAction$perform$$inlined$filter$4$2", f = "ListenToPurchaseUpdateAction.kt", l = {223}, m = "emit")
public final class C1787360wc2 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS210S0200000_27 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787360wc2(AgS210S0200000_27 agS210S0200000_27, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS210S0200000_27;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToPurchaseUpdateAction@815b.perform$$inlined$filter$4$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("ListenToPurchaseUpdateAction@815b.perform$$inlined$filter$4$2$1");
        return objEmit;
    }
}
