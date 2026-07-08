package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpRequestParams;
import kotlin.jvm.internal.AwS213S0300000_4;

/* JADX INFO: renamed from: X.0DFB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DFB implements InterfaceC1487280oo2<AbstractC335880DEs, AbstractC19484711Kz<AbstractC335880DEs>> {
    public final C0DF6 LL;
    public final ShopifyEcpRequestParams LLILLJJLI;

    @Override // X.InterfaceC1487280oo2
    public final AbstractC19484711Kz<AbstractC335880DEs> apply(AbstractC335880DEs abstractC335880DEs) {
        final AbstractC335880DEs abstractC335880DEs2 = abstractC335880DEs;
        if (abstractC335880DEs2 instanceof C335870DEr) {
            C335870DEr c335870DEr = (C335870DEr) abstractC335880DEs2;
            boolean z = true;
            if (c335870DEr != null && c335870DEr.LIZJ) {
                String str = this.LL.LIZIZ;
                final InterfaceC334930DBb interfaceC334930DBbLIZ = C0DF9.LIZ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gate credential_ready: containerId=");
                sbLIZ.append(str);
                sbLIZ.append(", hasCb=");
                if (interfaceC334930DBbLIZ == null) {
                    z = false;
                }
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                if (interfaceC334930DBbLIZ == null) {
                    return AbstractC19484711Kz.LJIJJLI(abstractC335880DEs2);
                }
                return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0DFC
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<AbstractC335880DEs> interfaceC2329309At) {
                        InterfaceC334930DBb interfaceC334930DBb = interfaceC334930DBbLIZ;
                        C0DFB c0dfb = this;
                        interfaceC334930DBb.LIZIZ(new C0DB2(c0dfb.LLILLJJLI), new AwS213S0300000_4((C11KT) interfaceC2329309At, abstractC335880DEs2, c0dfb, 16));
                    }
                });
            }
        }
        return AbstractC19484711Kz.LJIJJLI(abstractC335880DEs2);
    }

    public C0DFB(C0DF6 c0df6, ShopifyEcpRequestParams shopifyEcpRequestParams) {
        this.LL = c0df6;
        this.LLILLJJLI = shopifyEcpRequestParams;
    }
}
