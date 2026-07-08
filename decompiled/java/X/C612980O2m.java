package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.api.PromotionHighLightApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0O2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612980O2m {
    public static final /* synthetic */ C612980O2m LIZ = new C612980O2m();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com").build();

    public static Object LIZ(C612980O2m c612980O2m, String str, String str2, String str3, int i, AbstractC23140094w abstractC23140094w, int i2) {
        boolean z;
        if ((i2 & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        c612980O2m.getClass();
        return ((PromotionHighLightApi) LIZIZ.create(PromotionHighLightApi.class)).getPromotionHighlightData(str, str2, str3, false, z, C2286608xc.LJ(i), abstractC23140094w);
    }
}
