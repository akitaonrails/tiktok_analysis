package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS92S0110000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C335300DCm extends C2217421BqW implements Function1<AbstractC335420DCy, Unit> {
    public C335300DCm(Object obj) {
        super(1, obj, CheckoutFragment.class, "handleCashierInteraction", "handleCashierInteraction(Lcom/ss/android/ugc/aweme/commercialize/ucp/impl/ui/pages/checkout/payment/CheckoutCashierInteraction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC335420DCy abstractC335420DCy) {
        String str;
        Map<String, String> map;
        CheckoutFragment checkoutFragment = (CheckoutFragment) this.receiver;
        checkoutFragment.getClass();
        if (Intrinsics.LJFF(abstractC335420DCy, C335410DCx.LIZ)) {
            C335000DBi c335000DBi = checkoutFragment.LLIZ;
            if (c335000DBi != null && (map = c335000DBi.LIZ) != null) {
                str = map.get("ac_ad_type");
            } else {
                str = null;
            }
            boolean zLIZ = C0D0H.LIZ(str);
            C335000DBi c335000DBi2 = checkoutFragment.LLIZ;
            if (c335000DBi2 != null) {
                c335000DBi2.logAd(C335320DCo.LIZ, checkoutFragment.ee(), new AwS92S0110000_4(zLIZ, checkoutFragment, 4));
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
