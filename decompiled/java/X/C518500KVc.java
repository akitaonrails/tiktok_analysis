package X;

import com.bytedance.android.live.iap.service.IapService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518500KVc {
    public static String LIZ() {
        String billingCountryCode = ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).getBillingCountryCode();
        if (billingCountryCode.length() == 0) {
            billingCountryCode = InterfaceC1106030et7.n9.LIZIZ();
            if (billingCountryCode == null) {
                return "";
            }
        } else {
            C20337914i1<String> c20337914i1 = InterfaceC1106030et7.n9;
            String strLIZIZ = c20337914i1.LIZIZ();
            if (!Intrinsics.LJFF(strLIZIZ != null ? strLIZIZ : "", billingCountryCode)) {
                c20337914i1.LJFF(billingCountryCode);
                return billingCountryCode;
            }
        }
        return billingCountryCode;
    }
}
