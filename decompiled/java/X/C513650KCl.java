package X;

import Y.AgS288S0100000_7;

/* JADX INFO: renamed from: X.0KCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel$closeNewPackagePageEvents$$inlined$filterIsInstance$1$2", f = "SubscriptionBridgeViewModel.kt", l = {223}, m = "emit")
public final class C513650KCl extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS288S0100000_7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C513650KCl(AgS288S0100000_7 agS288S0100000_7, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS288S0100000_7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscriptionBridgeViewModel@3ee.closeNewPackagePageEvents$$inlined$filterIsInstance$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SubscriptionBridgeViewModel@3ee.closeNewPackagePageEvents$$inlined$filterIsInstance$1$2$1");
        return objEmit;
    }
}
