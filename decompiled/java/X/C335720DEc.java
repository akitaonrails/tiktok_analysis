package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335720DEc implements InterfaceC300801Eo<AbstractC335880DEs>, InterfaceC1631620sYq<EnumC336190DFx, C0DD3, String, Unit> {
    public final C0DF6 LL;
    public final ShopifyEcpCheckout LLILLJJLI;
    public final ShopifyEcpCheckout.Payment.Instrument LLILLL;
    public final InterfaceC335280DCk LLILZ;
    public InterfaceC2329309At<AbstractC335880DEs> LLILZIL;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<AbstractC335880DEs> interfaceC2329309At) {
        this.LLILZIL = interfaceC2329309At;
        this.LLILZ.LJI(this.LL.LIZ, this);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(EnumC336190DFx enumC336190DFx, C0DD3 c0dd3, String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C335700DEa(enumC336190DFx, c0dd3, this, str, null), 3);
        return Unit.LIZ;
    }

    public C335720DEc(C0DF6 c0df6, ShopifyEcpCheckout shopifyEcpCheckout, ShopifyEcpCheckout.Payment.Instrument instrument, InterfaceC335280DCk interfaceC335280DCk) {
        this.LL = c0df6;
        this.LLILLJJLI = shopifyEcpCheckout;
        this.LLILLL = instrument;
        this.LLILZ = interfaceC335280DCk;
    }
}
