package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226780i1s {
    public static final C1226780i1s LIZ = new C1226780i1s();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();

    public static void LIZ(String str, String str2, String str3, String str4, String str5, List list) {
        String str6;
        Integer numValueOf;
        Map<String, Boolean> map = LIZIZ;
        Object obj = ((LinkedHashMap) map).get(str);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool)) {
            return;
        }
        map.put(str, bool);
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics != null) {
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("enter_from", str2);
            pairArr[1] = new Pair("conversation_id", str3);
            pairArr[2] = new Pair("chat_type", str5);
            pairArr[3] = new Pair("group_type", C1229100i5c.LJI(str3));
            if (Intrinsics.LJFF(str, EnumC1226540i1U.TAB_KEY_LIVE_MOST_WATCH_TIME.getValue())) {
                str6 = "top_viewer";
            } else if (Intrinsics.LJFF(str, EnumC1226540i1U.TAB_KEY_LIVE_MOST_GIFT_COUNT.getValue())) {
                str6 = "top_gifter";
            } else if (Intrinsics.LJFF(str, EnumC1226540i1U.TAB_KEY_LIVE_SMB.getValue())) {
                str6 = "top_interester";
            } else if (Intrinsics.LJFF(str, EnumC1226540i1U.TAB_KEY_LIVE_TOP_GUEST.getValue())) {
                str6 = "top_guests";
            } else {
                str6 = "";
            }
            pairArr[4] = new Pair("tab_name", str6);
            pairArr[5] = new Pair("viewer_ranking_period", str4);
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            pairArr[6] = new Pair("invite_user_list", String.valueOf(numValueOf));
            iIMChatDetailAnalytics.LJFF("group_invite_page_show", pairArr, C0I0B.LJFF.LIZIZ());
        }
    }
}
