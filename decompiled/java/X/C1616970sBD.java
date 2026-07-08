package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Map;

/* JADX INFO: renamed from: X.0sBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616970sBD {
    public static final C1616970sBD LIZ = new C1616970sBD();
    public static final Gson LIZIZ = new Gson();

    public static final void LIZ(C1617170sBX c1617170sBX, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("merchant_id", c1617170sBX.LIZ);
        c2344009Gk.LJIIIIZZ("product_id_list", GsonProtectorUtils.toJson(LIZIZ, c1617170sBX.LIZIZ));
        c2344009Gk.LJIIIIZZ("product_type", c1617170sBX.LIZJ);
        if (str != null) {
            c2344009Gk.LJFF("biz_line", str);
        }
        c2344009Gk.LJFF("option_type", str2);
        C20684815ws.LJIILLIIL("pgc_iap_get_product_details_request", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(C518150KTt c518150KTt, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(c518150KTt.LIZ ? 1 : 0, "success");
        if (str != null) {
            c2344009Gk.LJFF("biz_line", str);
        }
        c2344009Gk.LJFF("option_type", str2);
        Map<String, IapProductDetail> map = c518150KTt.LIZIZ;
        if (map != null) {
            c2344009Gk.LJFF("data", GsonProtectorUtils.toJson(LIZIZ, map));
        }
        C0KQW c0kqw = c518150KTt.LIZJ;
        if (c0kqw != null) {
            c2344009Gk.LIZJ(c0kqw.LIZ.getValue(), "error_code");
            c2344009Gk.LJFF("error_message", c0kqw.LIZIZ);
        }
        C20684815ws.LJIILLIIL("pgc_iap_get_product_details_result", c2344009Gk.LIZ);
    }
}
