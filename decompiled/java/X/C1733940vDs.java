package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733940vDs {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(Integer num, Long l, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("live_status", "during_live"));
        if (z) {
            str5 = "on_screen_pin_suggest";
        } else if (num != null && num.intValue() == 2) {
            str5 = "on_screen_pin_list";
        } else {
            str5 = "on_screen_pin_product";
        }
        mapLJIIJ.put("module_name", str5);
        mapLJIIJ.put("page_name", "live");
        if (str != null) {
            mapLJIIJ.put("room_id", str);
        }
        if (str2 != null) {
            mapLJIIJ.put("author_id", str2);
        }
        if (str3 != null && (!Intrinsics.LJFF(str3, CardStruct.IStatusCode.DEFAULT))) {
            mapLJIIJ.put("product_id", str3);
        }
        if (l != null) {
            mapLJIIJ.put("product_index", Long.valueOf(l.longValue()));
        }
        if (str4 != null) {
            mapLJIIJ.put("suggest_type", str4);
        }
        return mapLJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, java.lang.Long r12, java.lang.Integer r13) {
        /*
            java.lang.String r5 = "smart_pin"
            r0 = r13
            r6 = r11
            r4 = r9
            r3 = r8
            r1 = r12
            r2 = r7
            java.util.Map r2 = LIZ(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r10.hashCode()
            r0 = -1377687758(0xffffffffade22732, float:-2.5710632E-11)
            if (r1 == r0) goto L3d
            r0 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r1 == r0) goto L34
            r0 = 1564045218(0x5d396fa2, float:8.351298E17)
            if (r1 != r0) goto L48
            java.lang.String r0 = "flip_card"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r1 = "try"
        L29:
            java.lang.String r0 = "click_for"
            r2.put(r0, r1)
            java.lang.String r0 = "livesdk_tiktokec_module_click"
            X.C1421105hJ.LIZJ(r0, r2)
            return
        L34:
            java.lang.String r1 = "close"
            boolean r0 = r10.equals(r1)
            if (r0 == 0) goto L48
            goto L29
        L3d:
            java.lang.String r0 = "button"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r1 = "unpin"
            goto L29
        L48:
            java.lang.String r1 = "product"
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1733940vDs.LIZJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Long, java.lang.Integer):void");
    }
}
