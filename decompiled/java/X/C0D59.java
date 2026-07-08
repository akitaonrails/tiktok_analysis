package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutLineItemContext;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.payment.CheckoutPipoRefreshParamsConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D59, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D59 {
    public static C0D5B LIZ(CheckoutIntent checkoutIntent) {
        Map<String, String> mapLJ;
        String strLIZIZ;
        List<CheckoutLineItemContext> list;
        CheckoutLineItemContext checkoutLineItemContext;
        String str;
        InterfaceC332180D0m.LIZ.getClass();
        boolean zLJFF = Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.checkout_use_mock_product", "false"), "true");
        if (checkoutIntent == null || (mapLJ = checkoutIntent.passThrough) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String string = "";
        if (zLJFF) {
            strLIZIZ = C332230D0r.LIZ().getString("ucp_demo.checkout_mock_merchant_domain", "");
            string = C332230D0r.LIZ().getString("ucp_demo.checkout_mock_variant_id", "");
        } else {
            strLIZIZ = mapLJ.get("shop_domain");
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            if (checkoutIntent != null && (list = checkoutIntent.items) != null && (checkoutLineItemContext = (CheckoutLineItemContext) C13LP.LJJJLL(list)) != null && (str = checkoutLineItemContext.variantId) != null) {
                string = str;
            }
        }
        String str2 = ((CheckoutPipoRefreshParamsConfig) C0D5A.LIZIZ.getValue()).currency;
        String str3 = C0D48.LIZIZ().agentProfileUrl;
        Map<String, String> map = C004A.LIZ;
        if (strLIZIZ.length() != 0 && !u.LJJIIJZLJL(strLIZIZ, "https://", false) && !u.LJJIIJZLJL(strLIZIZ, "http://", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return new C0D5B(strLIZIZ, string, str2, str3, map);
    }
}
