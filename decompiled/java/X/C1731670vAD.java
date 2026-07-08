package X;

import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0vAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731670vAD {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static final /* synthetic */ int LIZLLL = 0;

    public static void LIZ(long j, String str, String str2) throws JSONException {
        C1729570v6p.LIZIZ(j, "template_product_list", "notice_board_edit", str, str2);
    }

    public static void LIZIZ(long j, Integer num, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        C1421105hJ.LIZLLL("rd_ec_live_request_result", new Pair("page_name", "template_product_list"), new Pair("previous_page", "notice_board_edit"), new Pair("start_click_to_now", Long.valueOf(System.currentTimeMillis() - LIZ)), new Pair("api_path", "/aweme/v1/oec/affiliate/live/product/list"), new Pair("request_method", "get"), new Pair("request_type", 1), new Pair("is_retry", Boolean.valueOf(z)), new Pair("api_duration", Long.valueOf(j)), new Pair("is_success", Boolean.valueOf(z2)), new Pair("is_empty", Boolean.valueOf(z3)), new Pair("error_code", num), new Pair("error_msg", str));
        if (z2) {
            if (!z) {
                LIZ(System.currentTimeMillis() - LIZIZ, "did_load", "load_success");
                return;
            } else {
                LIZ(System.currentTimeMillis() - LIZJ, "load_error", "load_success");
                return;
            }
        }
        if (!z) {
            LIZ(System.currentTimeMillis() - LIZIZ, "did_load", "load_error");
        } else {
            LIZ(System.currentTimeMillis() - LIZJ, "load_error", "load_error");
        }
        LIZJ = System.currentTimeMillis();
    }
}
