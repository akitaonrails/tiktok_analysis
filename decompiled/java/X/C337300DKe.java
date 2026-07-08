package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.agentbridge.BrowserUserAgentProvider$loadOnMainThread$userAgent$1", f = "PIPOCashierAgentBridgeServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C337300DKe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337300DKe(Context context, InterfaceC1364105Vn<? super C337300DKe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C337300DKe(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BrowserUserAgentProvider@3a5c.loadOnMainThread$userAgent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLJ = C337310DKf.LJ(this.LL);
        C1C7U.LIZIZ("BrowserUserAgentProvider@3a5c.loadOnMainThread$userAgent$1");
        return strLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
