package X;

import com.bytedance.android.livesdk.livesetting.slot.LiveOutsideBizRegisterPrioritySetting;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756800TmQ {
    public static final Map<EnumC756810TmR, Map<String, Integer>> LIZ;
    public static final Map<EnumC1124020fM8, Map<String, Integer>> LIZIZ;
    public static final Map<String, Integer> LIZJ;
    public static final int LIZLLL;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        HashMap map2 = new HashMap();
        LIZIZ = map2;
        HashMap map3 = new HashMap();
        LIZJ = map3;
        LIZLLL = 999;
        map.put(EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR, LIZ());
        map.put(EnumC756810TmR.SLOT_LIVE_WATCHER_L2_TOOLBAR, LIZ());
        EnumC756810TmR enumC756810TmR = EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
        HashMap map4 = new HashMap();
        map4.put("business_links", 0);
        map4.put("ec_shop", 0);
        map.put(enumC756810TmR, map4);
        EnumC756810TmR enumC756810TmR2 = EnumC756810TmR.SLOT_BROADCAST_PREVIEW_EC_INDEPENDENT;
        HashMap map5 = new HashMap();
        map5.put("ec_shop_independent", 0);
        map.put(enumC756810TmR2, map5);
        EnumC756810TmR enumC756810TmR3 = EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR;
        HashMap map6 = new HashMap();
        if (2 == LiveOutsideBizRegisterPrioritySetting.INSTANCE.getValue()) {
            map6.put("ec_shop", 2);
            map6.put("business_links", 1);
        } else {
            map6.put("ec_shop", 1);
            map6.put("business_links", 2);
        }
        map.put(enumC756810TmR3, map6);
        EnumC1124020fM8 enumC1124020fM8 = EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP;
        HashMap map7 = new HashMap();
        map7.put("business_links", 0);
        map7.put("ec_shop", 0);
        map2.put(enumC1124020fM8, map7);
        map3.put("game_partnership", 0);
        map3.put("ec_shop", 1);
        map3.put("local_service", 2);
        map3.put("business_links", 3);
        map3.put("ba_leads_gen", 4);
        map3.put("live_paid_series", 5);
    }

    public static Map<String, Integer> LIZ() {
        HashMap map = new HashMap();
        if (2 == LiveOutsideBizRegisterPrioritySetting.INSTANCE.getValue()) {
            map.put("ec_shop", 2);
            map.put("business_links", 1);
        } else {
            map.put("ec_shop", 1);
            map.put("business_links", 2);
        }
        map.put("live_paid_series", 3);
        map.put("subscription_upsell_biz_type", 4);
        return map;
    }

    public static int LIZIZ(String str) {
        Integer num = (Integer) ((HashMap) LIZJ).get(str);
        if (num == null) {
            return LIZLLL;
        }
        return num.intValue();
    }

    public static int LIZJ(EnumC756810TmR enumC756810TmR, String str) {
        Integer num;
        Map map = (Map) ((HashMap) LIZ).get(enumC756810TmR);
        if (map != null && (num = (Integer) map.get(str)) != null) {
            return num.intValue();
        }
        return LIZLLL;
    }
}
