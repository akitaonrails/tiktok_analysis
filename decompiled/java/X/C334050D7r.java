package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.ShopifyUCPTokenApi;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.ShopifyUCPTokenResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.TokenGenerator$performProxyFetch$2", f = "TokenGenerator.kt", l = {131}, m = "invokeSuspend")
public final class C334050D7r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C334060D7s>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C334070D7t LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334050D7r(C334070D7t c334070D7t, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c334070D7t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C334050D7r(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C0D77 {
        boolean z;
        boolean z2;
        C1C7U.LIZ("TokenGenerator@937f.performProxyFetch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z3 = false;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLJJLI;
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C0D83 c0d83LIZIZ = C0D8X.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Server token api ignores scopeParam=");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(" and uses server-side defaults");
                    C2188811AlT.LIZIZ(sbLIZ);
                    c0d83LIZIZ.d();
                }
                C0D8X.LIZIZ().d();
                ShopifyUCPTokenApi shopifyUCPTokenApi = (ShopifyUCPTokenApi) this.LLILLL.LIZLLL.getValue();
                this.LL = 1;
                obj = shopifyUCPTokenApi.getAccessToken(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TokenGenerator@937f.performProxyFetch$2");
                    return objLJFF;
                }
            }
            ShopifyUCPTokenResponse shopifyUCPTokenResponse = (ShopifyUCPTokenResponse) obj;
            if (shopifyUCPTokenResponse != null) {
                Integer statusCode = shopifyUCPTokenResponse.getStatusCode();
                if (statusCode != null && statusCode.intValue() == 0) {
                    String str2 = shopifyUCPTokenResponse.accessToken;
                    if (str2 != null && str2.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        C334060D7s c334060D7s = new C334060D7s(shopifyUCPTokenResponse.accessToken, shopifyUCPTokenResponse.clientIp);
                        C334070D7t c334070D7t = this.LLILLL;
                        c334070D7t.LIZ = c334060D7s;
                        c334070D7t.LIZIZ = System.currentTimeMillis();
                        C0D83 c0d83LIZIZ2 = C0D8X.LIZIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Token fetch success via server proxy, hasClientIp=");
                        String str3 = shopifyUCPTokenResponse.clientIp;
                        if (str3 == null || str3.length() == 0) {
                            z3 = true;
                        }
                        sbLIZ2.append(!z3);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c0d83LIZIZ2.d();
                        C1C7U.LIZIZ("TokenGenerator@937f.performProxyFetch$2");
                        return c334060D7s;
                    }
                }
                EnumC334020D7o enumC334020D7o = EnumC334020D7o.TOKEN;
                String message = shopifyUCPTokenResponse.getMessage();
                if (message == null) {
                    message = "Failed to get access token from server proxy";
                }
                throw new C0D77(enumC334020D7o, null, null, message, null, null);
            }
            throw new C0D77(EnumC334020D7o.TOKEN, null, null, "Empty token response from server proxy", null, null);
        } catch (C0D77 e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C0D77(EnumC334020D7o.TOKEN, null, null, "Network error while fetching token from server proxy", null, e2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C334060D7s> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
