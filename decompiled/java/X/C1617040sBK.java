package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Map;

/* JADX INFO: renamed from: X.0sBK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617040sBK {
    public static final C1617040sBK LIZ = new C1617040sBK();
    public static final Gson LIZIZ = new Gson();

    public static final void LIZ(C1617170sBX c1617170sBX) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("merchant_id", c1617170sBX.LIZ);
        c2344009Gk.LJIIIIZZ("product_id_list", GsonProtectorUtils.toJson(LIZIZ, c1617170sBX.LIZIZ));
        c2344009Gk.LJIIIIZZ("product_type", c1617170sBX.LIZJ);
        c2344009Gk.LJFF("biz_line", "shortDrama");
        c2344009Gk.LJFF("option_type", "oneTime");
        C20684815ws.LJIILLIIL("pgc_iap_get_product_details_request", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(C518080KTm c518080KTm) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, "success");
        c2344009Gk.LIZJ(c518080KTm.LIZIZ, "error_code");
        c2344009Gk.LJFF("biz_line", "shortDrama");
        c2344009Gk.LJFF("option_type", "oneTime");
        if (c518080KTm.LJFF.length() > 0) {
            c2344009Gk.LJFF("error_message", c518080KTm.LJFF);
        }
        C20684815ws.LJIILLIIL("pgc_iap_get_product_details_result", c2344009Gk.LIZ);
    }

    public static final void LIZJ(C518160KTu c518160KTu) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "success");
        c2344009Gk.LJFF("biz_line", "shortDrama");
        c2344009Gk.LJFF("option_type", "oneTime");
        Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
        if (map != null) {
            c2344009Gk.LJFF("data", GsonProtectorUtils.toJson(LIZIZ, map));
        }
        C20684815ws.LJIILLIIL("pgc_iap_get_product_details_result", c2344009Gk.LIZ);
    }
}
