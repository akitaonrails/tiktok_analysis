package X;

import android.content.Context;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0h42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189680h42 {
    public static final C1189680h42 LIZ = new C1189680h42();

    public static void LIZIZ(C1189680h42 c1189680h42, boolean z, String str, String str2, Integer num, String str3, String str4) {
        String str5;
        c1189680h42.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        if (z) {
            str5 = "campaign_banner_slide_left";
        } else {
            str5 = "campaign_banner_slide_right";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("challenge_id", str2);
        if (num != null) {
            num.intValue();
            linkedHashMap.put("banner_index", num.toString());
        }
        if (str3 != null) {
            linkedHashMap.put("poi_id", str3);
        }
        C1189060h32.LIZ(str4, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(null);
        c1185040gwY.getClass();
        C1185040gwY.LJFF(str5, linkedHashMap, c1185050gwZ);
    }

    public static void LIZ(C1189680h42 c1189680h42, boolean z, String str, String str2, Integer num, String str3, String str4, Integer num2, InterfaceC665370Q7z interfaceC665370Q7z, String str5, PageFinder pageFinder, int i) {
        String str6;
        String str7;
        String str8 = str3;
        String str9 = str4;
        InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
        String str10 = str5;
        Boolean boolValueOf = null;
        if ((i & 16) != 0) {
            str8 = null;
        }
        if ((i & 32) != 0) {
            str9 = null;
        }
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) != 0) {
            interfaceC665370Q7z2 = null;
        }
        if ((i & 256) != 0) {
            str10 = null;
        }
        c1189680h42.getClass();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null) {
            boolValueOf = Boolean.valueOf(iLocationBaseServiceForMT.LJ(contextLIZ));
        }
        String strLJJIIZI = C1189060h32.LJJIIZI(boolValueOf);
        if (strLJJIIZI == null) {
            strLJJIIZI = "";
        }
        if (iLocationBaseServiceForMT != null && iLocationBaseServiceForMT.LJJIJ()) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        if (z) {
            str7 = "campaign_banner_show";
        } else {
            str7 = "campaign_banner_hotzone_click";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("challenge_id", str2);
        linkedHashMap.put("system_is_precise", strLJJIIZI);
        linkedHashMap.put("inapp_is_precise", str6);
        if (num != null) {
            num.intValue();
            linkedHashMap.put("banner_index", num.toString());
        }
        if (str8 != null) {
            linkedHashMap.put("poi_id", str8);
        }
        if (num2 != null) {
            linkedHashMap.put("display_order", String.valueOf(num2.intValue()));
        }
        if (str10 != null) {
            linkedHashMap.put("bcm_chain", str10);
        }
        C1189060h32.LIZ(str9, linkedHashMap);
        if (interfaceC665370Q7z2 != null) {
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z2);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF(str7, linkedHashMap, c1185050gwZ);
    }
}
