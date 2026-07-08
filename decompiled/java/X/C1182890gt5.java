package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182890gt5 {
    public static final C1182890gt5 LIZ = new C1182890gt5();
    public static int LIZIZ = 1;

    public static Map LIZ() {
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        c19741112Lp.getClass();
        boolean zLIZLLL = C19741112Lp.LIZLLL(contextLIZ, "android.permission.ACCESS_FINE_LOCATION");
        boolean zLIZ = C1194170hBH.LIZ(C844470XAv.LIZ());
        boolean zLIZJ = C1194170hBH.LIZJ(C844470XAv.LIZ());
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        boolean zLJJIJ = iLocationBaseServiceForMT != null ? iLocationBaseServiceForMT.LJJIJ() : false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(zLJJIJ));
        if (strLIZLLL == null) {
            strLIZLLL = "-1";
        }
        linkedHashMap.put("inapp_is_precise", strLIZLLL);
        linkedHashMap.put("system_is_precise", zLIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        String strLIZLLL2 = C1200530hLX.LIZLLL(Boolean.valueOf(zLIZ));
        if (strLIZLLL2 == null) {
            strLIZLLL2 = "-1";
        }
        linkedHashMap.put("is_location_app_permission", strLIZLLL2);
        String strLIZLLL3 = C1200530hLX.LIZLLL(Boolean.valueOf(zLIZJ));
        linkedHashMap.put("is_location_system_permission", strLIZLLL3 != null ? strLIZLLL3 : "-1");
        return linkedHashMap;
    }

    public static void LIZIZ(EnumC1182880gt4 enumC1182880gt4, boolean z) {
        String strValueOf;
        String str;
        if (z) {
            int i = LIZIZ;
            LIZIZ = i + 1;
            strValueOf = String.valueOf(i);
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("click_index", strValueOf);
        if (enumC1182880gt4 == EnumC1182880gt4.MAP) {
            str = "map";
        } else {
            str = "card";
        }
        linkedHashMap.put("click_area", str);
        LIZ.getClass();
        linkedHashMap.putAll(LIZ());
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LIZIZ("ttls_ttpro_poi_map_poi_click", linkedHashMap, null);
    }

    public static void LIZJ(String str, EnumC994380bz2 enumC994380bz2, String str2) {
        String str3;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.LJFF(str, EnumC993720bxy.ALL_FINISH.getValue())) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("task_status", str3);
        if (enumC994380bz2 == EnumC994380bz2.SHOW) {
            str4 = "show";
        } else {
            str4 = "click";
        }
        linkedHashMap.put("action_type", str4);
        LIZ.getClass();
        linkedHashMap.putAll(LIZ());
        if (str2 != null && C123100dR.LIZ(str2)) {
            linkedHashMap.put("enter_from", str2);
        }
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LIZIZ("ttls_ttpro_location_task_popup_action", linkedHashMap, null);
    }
}
