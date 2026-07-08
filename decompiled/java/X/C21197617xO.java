package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.17xO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21197617xO {
    public static int LIZ;
    public static String LIZIZ;
    public static final boolean LIZJ;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZJ = SettingsManager.LIZ("ecom_live_exception_switch", false);
    }

    public static final void LIZ(String str, String str2) {
        if (!LIZJ) {
            return;
        }
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.SHOP_BAG_ICON;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("room_id", str);
        C05D4.LIZIZ("rd_tiktokec_shop_bag_icon_exception", enumC1778650wNz, 1009, str2, linkedHashMap);
    }

    public static final void LIZLLL(String str, String str2) {
        if (!LIZJ) {
            return;
        }
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.PIN_CARD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("image_url", str);
        C05D4.LIZIZ("rd_tiktokec_pop_product_exception", enumC1778650wNz, 1002, str2, linkedHashMap);
    }

    public static void LJ(String str, String str2, boolean z) {
        if (!LIZJ) {
            return;
        }
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.SHOP_BAG_LIST;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("room_id", str);
        linkedHashMap.put("is_data_empty", Integer.valueOf(z ? 1 : 0));
        C05D4.LIZIZ("rd_tiktokec_shop_bag_list_exception", enumC1778650wNz, 1020, str2, linkedHashMap);
    }

    public static final void LIZIZ(String str, String str2, String str3, boolean z) {
        int i;
        if (!LIZJ) {
            return;
        }
        if (z) {
            i = 1002;
        } else {
            i = 1001;
        }
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.SHOP_BAG_ICON;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("room_id", str);
        linkedHashMap.put("live_role", str2);
        C05D4.LIZIZ("rd_tiktokec_shop_bag_icon_exception", enumC1778650wNz, numValueOf, str3, linkedHashMap);
    }

    public static final void LIZJ(String str, String str2, boolean z, boolean z2) {
        if (!LIZJ) {
            return;
        }
        EnumC1778650wNz enumC1778650wNz = EnumC1778650wNz.PIN_CARD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("room_id", str);
        linkedHashMap.put("is_prefetch", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_data_empty", Integer.valueOf(z2 ? 1 : 0));
        C05D4.LIZIZ("rd_tiktokec_pop_product_exception", enumC1778650wNz, 1001, str2, linkedHashMap);
    }
}
