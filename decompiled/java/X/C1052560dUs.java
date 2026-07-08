package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052560dUs extends AbstractC1052570dUt {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1052580dUu interfaceC1052580dUu = (InterfaceC1052580dUu) xBaseParamModel;
        C1544050qHb c1544050qHb = C1544050qHb.LIZ;
        String jsbSecureDataflowId = interfaceC1052580dUu.getJsbSecureDataflowId();
        String name = getName();
        c1544050qHb.getClass();
        C443120HZe c443120HZeLIZ = C1544050qHb.LIZ(jsbSecureDataflowId, name);
        Integer num = (Integer) c443120HZeLIZ.getSecond();
        if (num == null) {
            C2382909Vj.LIZ(completionBlock, 0, (String) c443120HZeLIZ.getThird(), null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            if (interfaceC1052580dUu.getUrl().length() == 0 || (!u.LJJIIJZLJL(interfaceC1052580dUu.getUrl(), "http://", false) && !u.LJJIIJZLJL(interfaceC1052580dUu.getUrl(), "https://", false))) {
                C2382909Vj.LIZ(completionBlock, 0, "Only supports H5 starting with http", null, 4);
                return;
            }
            final AwS260S0300000_16 awS260S0300000_16 = new AwS260S0300000_16(context, interfaceC1052580dUu, num, 22);
            switch (C822470WOf.LIZ[((IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class)).LJIIIZ(num.toString()).ordinal()]) {
                case 1:
                case 2:
                    new C828330WeV(new ThirdPartyBizCert(num.intValue())).LIZIZ(context, interfaceC1052580dUu.getUrl(), new InterfaceC828360WeY() { // from class: X.0dUv
                        @Override // X.InterfaceC828360WeY
                        public final void LIZ(Context context2, String str) {
                            awS260S0300000_16.invoke();
                        }
                    }, null);
                    return;
                case 3:
                case 4:
                    SparkThirdContext sparkThirdContext = new SparkThirdContext();
                    sparkThirdContext.url = interfaceC1052580dUu.getUrl();
                    sparkThirdContext.bizCert = new ThirdPartyBizCert(num.intValue());
                    sparkThirdContext.redirect = new InterfaceC1052610dUx() { // from class: X.0dUr
                        @Override // X.InterfaceC1052610dUx
                        public final void LIZ(Context context2, String str) {
                            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                            SparkContext sparkContext = new SparkContext();
                            sparkContext.LJJLIIJ(str);
                            c1537900q7g.getClass();
                            new C1541950qED(context2, sparkContext).LIZIZ();
                        }
                    };
                    C1554300qY8.LIZIZ(context, sparkThirdContext);
                    return;
                case 5:
                case 6:
                case 7:
                    awS260S0300000_16.invoke();
                    return;
                default:
                    throw new C1954807lC();
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
