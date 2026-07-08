package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DFG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DFG implements InterfaceC300801Eo<AbstractC335880DEs>, Function1<C0DFT, Unit> {
    public final C0DF6 LL;
    public final ShopifyEcpCheckout LLILLJJLI;
    public InterfaceC2329309At<AbstractC335880DEs> LLILLL;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0DFT c0dft) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0DFE(c0dft, this, null), 3);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<AbstractC335880DEs> interfaceC2329309At) {
        this.LLILLL = interfaceC2329309At;
    }

    public C0DFG(C0DF6 c0df6, ShopifyEcpCheckout shopifyEcpCheckout) {
        this.LL = c0df6;
        this.LLILLJJLI = shopifyEcpCheckout;
    }
}
