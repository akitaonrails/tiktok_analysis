package X;

import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgRemoveShopTabOverlayExpendConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740280vO6 {
    public static final EcUgRemoveShopTabOverlayExpendConfig LIZ;

    static {
        EcUgRemoveShopTabOverlayExpendConfig ecUgRemoveShopTabOverlayExpendConfig = new EcUgRemoveShopTabOverlayExpendConfig(null, null, false, false, false, C1697810uHb.LJIIJJI("webcast_webview_popup", "webcast_lynxview_popup", "webview_popup", "lynxview_popup"));
        EcUgRemoveShopTabOverlayExpendConfig ecUgRemoveShopTabOverlayExpendConfig2 = (EcUgRemoveShopTabOverlayExpendConfig) C0C64.LJIILLIIL().LJJII(EcUgRemoveShopTabOverlayExpendConfig.class, ecUgRemoveShopTabOverlayExpendConfig, "ec_ug_remove_shop_tab_overlay_expend", true);
        if (ecUgRemoveShopTabOverlayExpendConfig2 != null) {
            ecUgRemoveShopTabOverlayExpendConfig = ecUgRemoveShopTabOverlayExpendConfig2;
        }
        LIZ = ecUgRemoveShopTabOverlayExpendConfig;
    }

    public static boolean LIZ(String str) {
        boolean z;
        if (str == null) {
            return false;
        }
        EcUgRemoveShopTabOverlayExpendConfig ecUgRemoveShopTabOverlayExpendConfig = LIZ;
        List<String> list = ecUgRemoveShopTabOverlayExpendConfig.disableScenes;
        if (list != null && !list.isEmpty()) {
            z = !C824850WXj.LIZ(str);
        } else {
            List<String> list2 = ecUgRemoveShopTabOverlayExpendConfig.enableScenes;
            if (list2 != null && !list2.isEmpty()) {
                List<String> list3 = ecUgRemoveShopTabOverlayExpendConfig.enableScenes;
                if (list3 != null) {
                    Iterator<String> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (a0.LJJIIZI(str, it2.next(), false)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            } else {
                z = true;
                break;
            }
        }
        if (!LIZ.enableSaf || !z) {
            return false;
        }
        return true;
    }
}
