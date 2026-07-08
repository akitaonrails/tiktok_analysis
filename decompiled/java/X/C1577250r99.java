package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0r99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577250r99 implements InterfaceC1572860r24 {
    public static final C1577250r99 LIZ = new C1577250r99();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";

    @Override // X.InterfaceC1572860r24
    public final void LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "homepage_series");
        jSONObject.put("previous_page", LIZIZ);
        LIZ.getClass();
        jSONObject.put("series_tab_location", LJ());
        C20684815ws.LJIJ("view_more_capsule_show", jSONObject);
    }

    @Override // X.InterfaceC1572860r24
    public final void LIZJ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "homepage_series");
        jSONObject.put("previous_page", LIZIZ);
        LIZ.getClass();
        jSONObject.put("series_tab_location", LJ());
        C20684815ws.LJIJ("view_more_capsule_click", jSONObject);
    }

    public static String LJ() {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        String strLJIILJJIL;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        return (iSeriesFeedServiceLIZIZ == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null || (strLJIILJJIL = interfaceC1577520r9aLIZIZ.LJIILJJIL()) == null) ? "" : strLJIILJJIL;
    }

    public static String LIZLLL() {
        return LIZIZ;
    }

    public static void LJFF(String str, String str2) {
        Pair<Boolean, String> pairLIZLLL;
        String str3;
        String second;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        LIZIZ = str;
        LIZJ = str2;
        String string = UUID.randomUUID().toString();
        C1577260r9A.LIZ = string;
        C1577260r9A.LIZIZ = string;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
            pairLIZLLL = interfaceC1577520r9aLIZIZ.LIZLLL();
        } else {
            pairLIZLLL = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        LIZ.getClass();
        jSONObject.put("series_tab_location", LJ());
        if (pairLIZLLL != null && pairLIZLLL.getFirst().booleanValue()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("force_insert_last_watch", str3);
        if (pairLIZLLL == null || (second = pairLIZLLL.getSecond()) == null) {
            second = "";
        }
        jSONObject.put("force_insert_id", second);
        jSONObject.put("source_series_card_id", LIZLLL);
        jSONObject.put("series_session_id", C1577260r9A.LIZ);
        C20684815ws.LJIJ("enter_homepage_series", jSONObject);
    }

    public static final void LJIIIIZZ(String str, List<? extends EnumC1579420rCe> list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "homepage_series");
        jSONObject.put("previous_page", LIZIZ);
        jSONObject.put("show_method", str);
        LIZ.getClass();
        jSONObject.put("series_tab_location", LJ());
        if (list != null) {
            jSONObject.put("show_series_card_cnt", list.size());
            jSONObject.put("show_series_card_name", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS264S0000000_24.get$arr$(781), 30));
        }
        C20684815ws.LJIJ("series_tab_card_module_show", jSONObject);
    }

    public static final void LJI(int i, Long l, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "homepage_series");
        jSONObject.put("previous_page", LIZIZ);
        LIZ.getClass();
        jSONObject.put("series_tab_location", LJ());
        jSONObject.put("card_name", str);
        jSONObject.put("rank_num", i);
        if (l != null) {
            str2 = "collection";
        } else {
            str2 = "button";
        }
        jSONObject.put("click_content", str2);
        if (l != null) {
            jSONObject.put("click_collection_id", l.longValue());
        }
        C20684815ws.LJIJ("series_tab_card_click", jSONObject);
    }

    public static final void LJII(int i, String str, List list) {
        String strLJJLIIIJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "homepage_series");
        jSONObject.put("previous_page", LIZIZ);
        LIZ.getClass();
        jSONObject.put("series_tab_location", LJ());
        jSONObject.put("card_name", str);
        jSONObject.put("rank_num", i);
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        jSONObject.put("show_collection_list", strLJJLIIIJ);
        C20684815ws.LJIJ("series_tab_card_show", jSONObject);
    }

    @Override // X.InterfaceC1572860r24
    public final void LIZIZ(String str, String str2, String str3) {
        if (str == null) {
            str = "prefetch";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "homepage_series");
        jSONObject.put("refresh_method", str);
        jSONObject.put("group_id", str2);
        jSONObject.put("author_id", str3);
        C20684815ws.LJIJ("refresh_homepage", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_from", "homepage_series");
        jSONObject2.put("refresh_method", str);
        LIZ.getClass();
        jSONObject2.put("series_tab_location", LJ());
        C20684815ws.LJIJ("refresh_homepage_series", jSONObject2);
    }
}
