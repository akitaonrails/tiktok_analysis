package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpRequestParams;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DF2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DF2 {
    public static final C0DF2 LIZ = new C0DF2();

    public static String LIZ(ShopifyEcpCheckout shopifyEcpCheckout) {
        String str;
        if (shopifyEcpCheckout != null && (str = shopifyEcpCheckout.id) != null && (!a0.LJJJIL(str))) {
            return str;
        }
        return null;
    }

    public static ShopifyEcpCheckout LJ(C0DF6 c0df6) {
        ShopifyEcpRequestParams shopifyEcpRequestParamsLIZ = C334350D8v.LIZ(c0df6.LJFF);
        if (shopifyEcpRequestParamsLIZ != null) {
            return shopifyEcpRequestParamsLIZ.checkout;
        }
        return null;
    }

    public static String LJI(C0DF6 c0df6) {
        String str = c0df6.LIZIZ;
        boolean z = false;
        if (str != null && !a0.LJJJIL(str)) {
            String str2 = C0DF5.LIZ.get(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get: containerId=");
            sbLIZ.append(str);
            sbLIZ.append(", hit=");
            if (str2 != null) {
                z = true;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            return str2;
        }
        return null;
    }

    public static String LJII(ShopifyEcpCheckout shopifyEcpCheckout) {
        ShopifyEcpCheckout.Payment payment;
        List<ShopifyEcpCheckout.Payment.Instrument> list;
        ShopifyEcpCheckout.Payment.Instrument next;
        String str;
        if (shopifyEcpCheckout != null && (payment = shopifyEcpCheckout.payment) != null && (list = payment.instruments) != null) {
            Iterator<ShopifyEcpCheckout.Payment.Instrument> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.selected, Boolean.TRUE)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ShopifyEcpCheckout.Payment.Instrument instrument = next;
            if (instrument != null && (str = instrument.handlerId) != null && (!a0.LJJJIL(str))) {
                return str;
            }
        }
        return C334330D8t.LIZ(shopifyEcpCheckout);
    }

    public static C0DF3 LJFF(C0DF2 c0df2, C0DF6 c0df6) {
        List list;
        Object next;
        String str;
        String string;
        String str2;
        c0df2.getClass();
        ShopifyEcpCheckout shopifyEcpCheckoutLJ = LJ(c0df6);
        c0df2.getClass();
        if (shopifyEcpCheckoutLJ == null || (list = shopifyEcpCheckoutLJ.messages) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                ShopifyEcpCheckout.Message message = (ShopifyEcpCheckout.Message) next;
                if (Intrinsics.LJFF(message.type, "error") && (str2 = message.content) != null && !a0.LJJJIL(str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ShopifyEcpCheckout.Message message2 = (ShopifyEcpCheckout.Message) next;
        if (message2 == null || (str = message2.content) == null || (string = a0.LJLIIIL(str).toString()) == null || a0.LJJJIL(string)) {
            return null;
        }
        return new C0DF3(message2.code, string, message2.severity);
    }

    public static void LIZIZ(C0DF6 c0df6, C1023960ckk c1023960ckk, Function1 function1) {
        AwemeRawAd awemeRawAd;
        InterfaceC1009950cO9 interfaceC1009950cO9;
        C1035880d3y c1035880d3y = c0df6.LJII;
        if (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (interfaceC1009950cO9 = (InterfaceC1009950cO9) PluggableExtentionKt.pluggableSpi$default(IAdWebEventLogger.class, false, false, false, 14, null)) == null) {
            return;
        }
        interfaceC1009950cO9.withContext(c1035880d3y);
        interfaceC1009950cO9.logAd(c1023960ckk, awemeRawAd, function1);
    }

    public static void LIZLLL(C0DF2 c0df2, C0DF6 c0df6, String str, C0DF3 c0df3) {
        c0df2.getClass();
        ShopifyEcpCheckout shopifyEcpCheckoutLJ = LJ(c0df6);
        c0df2.getClass();
        if (C336040DFi.LIZ.LIZIZ(c0df6.LIZIZ)) {
            LIZIZ(c0df6, C2266611Dnf.LIZ, new C0DF4(c0df6, shopifyEcpCheckoutLJ, c0df3, str));
        }
    }

    public static void LIZJ(C0DF2 c0df2, C0DF6 c0df6, String str, String str2, ShopifyEcpCheckout shopifyEcpCheckout, String str3) {
        c0df2.getClass();
        LIZIZ(c0df6, C2266591Dnd.LIZ, new C336110DFp(c0df6, shopifyEcpCheckout, str3, str, str2, null));
    }
}
