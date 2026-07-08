package X;

import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794580wng {
    public static final String LIZ(C1794480wnW c1794480wnW) {
        if (c1794480wnW == null || c1794480wnW.LJJ != EnumC1791830wjF.GOOGLE) {
            return "";
        }
        return PaymentServiceManager.get().getGoogleIapExternalService().getBillingCountryCode();
    }

    public static final Map<String, String> LIZIZ(C1794480wnW c1794480wnW) {
        if (c1794480wnW == null) {
            return C2097608Jq.LJ();
        }
        return C2097608Jq.LJIIIIZZ(new Pair("billing_country_code", PaymentServiceManager.get().getGoogleIapExternalService().getBillingCountryCode()), new Pair("channel_sdk_version", C1792910wkz.LIZIZ));
    }
}
