package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS92S0110000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C335310DCn extends C2217421BqW implements Function1<AbstractC335420DCy, Unit> {
    public C335310DCn(Object obj) {
        super(1, obj, OnestepCheckoutFragment.class, "handleCashierInteraction", "handleCashierInteraction(Lcom/ss/android/ugc/aweme/commercialize/ucp/impl/ui/pages/checkout/payment/CheckoutCashierInteraction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC335420DCy abstractC335420DCy) {
        String str;
        OnestepCheckoutFragment onestepCheckoutFragment = (OnestepCheckoutFragment) this.receiver;
        onestepCheckoutFragment.getClass();
        if (Intrinsics.LJFF(abstractC335420DCy, C335410DCx.LIZ)) {
            C335000DBi c335000DBi = onestepCheckoutFragment.LLJILLL;
            if (c335000DBi != null) {
                Map<String, String> map = c335000DBi.LIZ;
                if (map != null) {
                    str = map.get("ac_ad_type");
                } else {
                    str = null;
                }
                c335000DBi.logAd(C335320DCo.LIZ, onestepCheckoutFragment.ee(), new AwS92S0110000_4(C0D0H.LIZ(str), c335000DBi, 0));
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
