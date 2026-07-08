package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0PvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660300PvA {
    public static final C660300PvA LIZ = new C660300PvA();

    public static Map LIZIZ(User user, Product product, C653660PkS c653660PkS) {
        String uid;
        String string;
        String str;
        String str2;
        String strLIZIZ;
        String str3;
        String str4;
        String str5;
        String str6;
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
        if (product != null && product.bizType != null) {
            Integer num2 = product.bizType;
            if (num2 != null && (string2 = num2.toString()) != null) {
                str7 = string2;
            }
            mapLJIIJ.put("biz_type", str7);
        }
        return mapLJIIJ;
    }

    public static Map LIZ(Aweme aweme, Product product, C653660PkS c653660PkS, String str, String str2) {
        int i;
        Long lValueOf;
        String str3;
        Product.ExtraInfo extraInfo;
        Map mapLIZIZ = LIZIZ(aweme.getAuthor(), product, c653660PkS);
        Object objRemove = mapLIZIZ.remove("enter_from");
        if (objRemove == null) {
            objRemove = "";
        }
        if (product != null && (extraInfo = product.extra) != null) {
            i = extraInfo.isPinned;
        } else {
            i = 0;
        }
        mapLIZIZ.put("source_page_type", "live");
        User author = aweme.getAuthor();
        Long lValueOf2 = null;
        if (author != null) {
            lValueOf = Long.valueOf(C486180J4u.LIZ(author));
        } else {
            lValueOf = null;
        }
        mapLIZIZ.put("room_id", String.valueOf(lValueOf));
        mapLIZIZ.put("is_ad", CardStruct.IStatusCode.DEFAULT);
        if (c653660PkS == null || (str3 = c653660PkS.LJIIJJI) == null) {
            str3 = "";
        }
        mapLIZIZ.put("request_id", str3);
        mapLIZIZ.put("enter_method", "");
        mapLIZIZ.put("action_type", "");
        mapLIZIZ.put("page_name", objRemove);
        mapLIZIZ.put("enter_from_merge", objRemove);
        mapLIZIZ.put("entrance_form", str);
        mapLIZIZ.put("card_type", String.valueOf(i));
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            lValueOf2 = Long.valueOf(C486180J4u.LIZ(author2));
        }
        mapLIZIZ.put("list_item_id", String.valueOf(lValueOf2));
        if (str2 == null) {
            str2 = "";
        }
        mapLIZIZ.put("last_from_group_id", str2);
        return mapLIZIZ;
    }
}
