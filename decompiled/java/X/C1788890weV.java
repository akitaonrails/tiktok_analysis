package X;

import java.util.List;

/* JADX INFO: renamed from: X.0weV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788890weV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str, List list, String str2, EnumC1791830wjF enumC1791830wjF, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_iap_get_product_information_start");
        c474500IjALIZ.LJJII(str, "merchant_id");
        c474500IjALIZ.LJJII(C1792910wkz.LIZIZ, "channel_sdk_version");
        c474500IjALIZ.LJJII(enumC1791830wjF, "payment_method");
        c474500IjALIZ.LJJII(list, "product_ids");
        c474500IjALIZ.LJJII(str2, "request_id");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_common_sku");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(String str, long j, List list, List list2, Integer num, String str2, String str3, EnumC1791830wjF enumC1791830wjF, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_iap_get_product_information_result");
        c474500IjALIZ.LJJII(str, "merchant_id");
        c474500IjALIZ.LJJII(C1792910wkz.LIZIZ, "channel_sdk_version");
        c474500IjALIZ.LJJII(Long.valueOf(j), "time_consuming");
        c474500IjALIZ.LJJII(list, "requested_product_ids");
        c474500IjALIZ.LJJII(enumC1791830wjF, "payment_method");
        c474500IjALIZ.LJJII(str3, "request_id");
        if (list2 != null) {
            c474500IjALIZ.LJJII(list2, "result_product_ids");
        }
        if (num != null) {
            c474500IjALIZ.LJJII(num, "iap_error_code");
            if (str2 == null) {
                str2 = "";
            }
            c474500IjALIZ.LJJII(str2, "iap_error_message");
        }
        if (num == null) {
            c474500IjALIZ.LJJII(Boolean.TRUE, "is_success");
        } else {
            c474500IjALIZ.LJJII(Boolean.FALSE, "is_success");
        }
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_common_sku");
        c474500IjALIZ.LIZ();
    }
}
