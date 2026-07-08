package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671950QXh {
    public static final C671950QXh LIZ = new C671950QXh();

    public static final boolean LIZ() {
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMall2TabOrTopTab();
    }

    public static final boolean LIZJ(Uri uri) {
        String strLIZIZ = C1942307jB.LIZIZ(uri, "deeplink_from_scene");
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        return Intrinsics.LJFF(strLIZIZ, "mall_ug_search");
    }

    public static final boolean LIZIZ(Uri uri, String str) {
        if (C703302op.LIZ(C1942307jB.LIZIZ(uri, str))) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(Uri uri, String str) {
        int i;
        if (!LIZJ(uri)) {
            return;
        }
        String strLIZIZ = C1942307jB.LIZIZ(uri, "previous_page");
        String str2 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String strLIZIZ2 = C1942307jB.LIZIZ(uri, "deeplink_type");
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        String strLIZIZ3 = C1942307jB.LIZIZ(uri, "top_product_ids");
        if (strLIZIZ3 == null) {
            strLIZIZ3 = "";
        }
        String strLIZIZ4 = C1942307jB.LIZIZ(uri, "creative_id");
        if (strLIZIZ4 == null) {
            strLIZIZ4 = "";
        }
        String strLIZIZ5 = C1942307jB.LIZIZ(uri, "campaign_id");
        if (strLIZIZ5 == null) {
            strLIZIZ5 = "";
        }
        String string = uri.toString();
        String strLIZIZ6 = C1942307jB.LIZIZ(uri, "deeplink_from_scene");
        if (strLIZIZ6 != null) {
            str2 = strLIZIZ6;
        }
        if (str != null && str.length() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        C1018703yb.LIZLLL("rd_tiktokec_deeplink_start", new C0QY5(strLIZIZ, strLIZIZ2, strLIZIZ3, strLIZIZ4, strLIZIZ5, string, i, str, str2));
    }
}
