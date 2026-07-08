package X;

import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830770WiR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1541440qDO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C830770WiR(InterfaceC1541440qDO interfaceC1541440qDO) {
        super(0);
        this.LL = interfaceC1541440qDO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            InterfaceC1541390qDJ ttWebViewRuntimeService = TTWebViewHelper.INSTANCE.getTtWebViewRuntimeService();
            if (ttWebViewRuntimeService != null) {
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                ttWebViewRuntimeService.uninstallTTWebView(C1161970gLL.LIZIZ().LIZJ());
            }
            this.LL.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        TTWebViewHelper.INSTANCE.getKeva().clear();
        return Unit.LIZ;
    }
}
