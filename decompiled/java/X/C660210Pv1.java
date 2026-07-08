package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Pv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660210Pv1 {
    public static final C660210Pv1 LIZ = new C660210Pv1();

    public static Map LJ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        Object objRemove = linkedHashMap.remove("enter_from");
        if (objRemove == null) {
            objRemove = "";
        }
        linkedHashMap.put("enter_from_info", objRemove);
        linkedHashMap.remove("page_name");
        linkedHashMap.put("source_page_type", "video");
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r7, com.ss.android.ugc.aweme.feed.model.EnhancedProduct r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C660210Pv1.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.EnhancedProduct):java.util.Map");
    }

    public static Map LIZ(User user, Product product, C653660PkS c653660PkS) {
        String uid;
        String string;
        String str;
        String str2;
        String strLIZIZ;
        String str3;
        String str4;
        String str5;
        String str6;
        Map<String, String> map;
        String string2;
        int followStatus;
        Integer num;
        String str7 = "";
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("author_id", uid);
        if (product == null || (num = product.platform) == null || (string = num.toString()) == null) {
            string = "";
        }
        pairArr[1] = new Pair("product_source", string);
        if (product == null || (str = product.sourceFrom) == null) {
            str = "";
        }
        pairArr[2] = new Pair("source_from", str);
        if (product == null || (str2 = product.source) == null) {
            str2 = "";
        }
        pairArr[3] = new Pair("source", str2);
        if (product == null || (strLIZIZ = product.LIZIZ()) == null) {
            strLIZIZ = "";
        }
        pairArr[4] = new Pair("product_id", strLIZIZ);
        if (Intrinsics.LJFF(uid, curUserId)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("is_self", str3);
        if (c653660PkS == null || (str4 = c653660PkS.LJIIJ) == null) {
            str4 = "";
        }
        pairArr[6] = new Pair("search_id", str4);
        if (c653660PkS == null || (str5 = c653660PkS.LJIJI) == null) {
            str5 = "";
        }
        pairArr[7] = new Pair("search_result_id", str5);
        if (c653660PkS == null || (str6 = c653660PkS.LJIIIIZZ) == null) {
            str6 = "";
        }
        pairArr[8] = new Pair("enter_from", str6);
        pairArr[9] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (u.LJIJI((String) ((LinkedHashMap) mapLJIIJ).get("is_self"), CardStruct.IStatusCode.DEFAULT, false)) {
            if (user != null) {
                followStatus = user.getFollowStatus();
            } else {
                followStatus = -1;
            }
            mapLJIIJ.put("follow_status", String.valueOf(followStatus));
        }
        if (product != null) {
            if (product.bizType != null) {
                Integer num2 = product.bizType;
                if (num2 != null && (string2 = num2.toString()) != null) {
                    str7 = string2;
                }
                mapLJIIJ.put("biz_type", str7);
            } else if (product != null) {
            }
            BcmStandardTrackEvent bcmStandardTrackEvent = product.bcmStandardTrackEvent;
            if (bcmStandardTrackEvent != null && (map = bcmStandardTrackEvent.trackParamMap) != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    mapLJIIJ.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return mapLJIIJ;
    }

    public static Map LIZJ(User user, Product product, C653660PkS c653660PkS) {
        Map mapLIZ = LIZ(user, product, c653660PkS);
        Object obj = ((LinkedHashMap) mapLIZ).get("enter_from");
        if (obj == null) {
            obj = "";
        }
        mapLIZ.put("page_name", obj);
        mapLIZ.put("entrance_form", "user_showcase_card");
        return mapLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[LOOP:0: B:32:0x0088->B:34:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r11, com.ss.android.ugc.aweme.search.ecom.data.Product r12, X.C653660PkS r13) {
        /*
            if (r11 == 0) goto Lb5
            com.ss.android.ugc.aweme.profile.model.User r0 = r11.getAuthor()
        L6:
            java.util.Map r4 = LIZ(r0, r12, r13)
            r3 = r4
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.String r2 = "enter_from"
            java.lang.Object r1 = r3.get(r2)
            java.lang.String r0 = "search_result"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lb1
            java.lang.String r1 = "video_search"
        L1d:
            r4.put(r2, r1)
        L20:
            java.lang.String r1 = "source_page_type"
            java.lang.String r0 = "video"
            r4.put(r1, r0)
            java.lang.Object r1 = r3.get(r2)
            java.lang.String r3 = ""
            if (r1 != 0) goto L30
            r1 = r3
        L30:
            java.lang.String r0 = "page_name"
            r4.put(r0, r1)
            java.lang.String r1 = X.C659360Pte.LIZ(r11)
            java.lang.String r0 = "entrance_form"
            r4.put(r0, r1)
            if (r11 == 0) goto L46
            java.lang.String r1 = r11.getAid()
            if (r1 != 0) goto L47
        L46:
            r1 = r3
        L47:
            java.lang.String r0 = "group_id"
            r4.put(r0, r1)
            if (r11 == 0) goto Laf
            int r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getTotalProductAnchors(r11)
        L52:
            r2 = 1
            if (r0 > 0) goto La7
            r1 = r3
        L56:
            java.lang.String r0 = "is_single_anchor"
            r4.put(r0, r1)
            if (r11 == 0) goto La4
            boolean r0 = r11.isAd()
            if (r0 != r2) goto La4
            java.lang.String r1 = "1"
        L65:
            java.lang.String r0 = "is_ad"
            r4.put(r0, r1)
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.service.TTKECCommerceTracker> r5 = com.ss.android.ugc.aweme.commercialize.service.TTKECCommerceTracker.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.service.TTKECCommerceTracker r0 = (com.ss.android.ugc.aweme.commercialize.service.TTKECCommerceTracker) r0
            if (r0 == 0) goto Lb8
            java.util.Map r0 = r0.LIZ(r11)
            if (r0 == 0) goto Lb8
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L88:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r1, r0)
            goto L88
        La4:
            java.lang.String r1 = "0"
            goto L65
        La7:
            if (r0 != r2) goto Lac
            java.lang.String r1 = "yes"
            goto L56
        Lac:
            java.lang.String r1 = "no"
            goto L56
        Laf:
            r0 = 0
            goto L52
        Lb1:
            if (r1 == 0) goto L20
            goto L1d
        Lb5:
            r0 = 0
            goto L6
        Lb8:
            java.lang.String r0 = "anchor_tag"
            r4.put(r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C660210Pv1.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.search.ecom.data.Product, X.0PkS):java.util.Map");
    }
}
