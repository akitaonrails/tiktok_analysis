package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733950vDt {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r4]
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "EVENT_ORIGIN_FEATURE"
            java.lang.String r0 = "TEMAI"
            r2.<init>(r1, r0)
            r0 = 0
            r3[r0] = r2
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "live_status"
            java.lang.String r0 = "during_live"
            r2.<init>(r1, r0)
            r0 = 1
            r3[r0] = r2
            java.util.Map r2 = X.C2097608Jq.LJIIJ(r3)
            if (r5 == 0) goto L5f
            int r0 = r5.intValue()
            if (r0 != r4) goto L55
            java.lang.String r1 = "on_screen_pin_list"
        L29:
            java.lang.String r0 = "module_name"
            r2.put(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "live"
            r2.put(r1, r0)
            if (r6 == 0) goto L3c
            java.lang.String r0 = "room_id"
            r2.put(r0, r6)
        L3c:
            if (r7 == 0) goto L43
            java.lang.String r0 = "author_id"
            r2.put(r0, r7)
        L43:
            if (r8 == 0) goto L54
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L54
            java.lang.String r0 = "product_id"
            r2.put(r0, r8)
        L54:
            return r2
        L55:
            int r1 = r5.intValue()
            r0 = 3
            if (r1 != r0) goto L5f
            java.lang.String r1 = "on_screen_live_coupon"
            goto L29
        L5f:
            java.lang.String r1 = "on_screen_pin_product"
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1733950vDt.LIZ(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):java.util.Map");
    }

    public static void LIZIZ(Integer num, String str, String str2, String str3, String str4) {
        Map mapLIZ = LIZ(num, str, str2, str3);
        String str5 = "close";
        if (!Intrinsics.LJFF(str4, "close")) {
            if (Intrinsics.LJFF(str4, "button")) {
                str5 = "unpin";
            } else {
                str5 = "product";
            }
        }
        mapLIZ.put("click_for", str5);
        C1421105hJ.LIZJ("livesdk_tiktokec_module_click", mapLIZ);
    }

    public static void LIZJ(String str, Integer num, String str2, String str3, String str4, String str5) {
        String str6;
        Map mapLIZ = LIZ(num, str, str2, str3);
        mapLIZ.put("user_type", "author");
        if (str5 == null) {
            str5 = "unpin";
        }
        mapLIZ.put("edit_type", str5);
        mapLIZ.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (num != null && num.intValue() == 2) {
            str6 = "shopping_list";
        } else {
            str6 = "product";
        }
        mapLIZ.put("pin_type", str6);
        if (str4 != null) {
            mapLIZ.put("item_order", str4);
        }
        C1421105hJ.LIZJ("livesdk_tiktokec_pin_product", mapLIZ);
    }
}
