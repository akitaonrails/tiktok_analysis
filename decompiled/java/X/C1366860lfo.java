package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366860lfo {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final Map<String, Integer> LJIIIZ = new LinkedHashMap();

    public static void LIZJ(C1366860lfo c1366860lfo) {
        C0I0B.LJFF.LIZIZ();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("before_filter_total", String.valueOf(c1366860lfo.LIZ)), new Pair("after_filter_total", String.valueOf(c1366860lfo.LIZIZ)), new Pair("block_users", String.valueOf(c1366860lfo.LIZJ)), new Pair("personal_account", CardStruct.IStatusCode.DEFAULT), new Pair("contact_shareable", String.valueOf(c1366860lfo.LIZLLL)), new Pair("user_filter", String.valueOf(c1366860lfo.LJ)), new Pair("group_filter", String.valueOf(c1366860lfo.LJFF)), new Pair("biz_custom_reason", String.valueOf(c1366860lfo.LJI)), new Pair("after_truncate_count", String.valueOf(c1366860lfo.LJII)), new Pair("request_show_count", String.valueOf(c1366860lfo.LJIIIIZZ)));
        if (true ^ c1366860lfo.LJIIIZ.isEmpty()) {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, Integer> map = c1366860lfo.LJIIIZ;
            c1227904rF.getClass();
            mapLJIIJ.put("filter_sort_reason", C1227904rF.LJI(map));
        }
        C1720006oQ.LIZLLL(new C5182020e(mapLJIIJ, (Map<String, String>) 141), false);
        C20684815ws.LJIILLIIL("share_server_sort_filter", mapLJIIJ);
    }

    public final void LIZ(String str) {
        int iIntValue;
        this.LJFF++;
        if (str == null) {
            str = "unknown";
        }
        Map<String, Integer> map = this.LJIIIZ;
        Integer num = (Integer) ((LinkedHashMap) map).get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put(str, Integer.valueOf(iIntValue + 1));
    }

    public final void LIZIZ(String str) {
        int iIntValue;
        this.LJ++;
        if (str == null) {
            str = "unknown";
        }
        Map<String, Integer> map = this.LJIIIZ;
        Integer num = (Integer) ((LinkedHashMap) map).get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put(str, Integer.valueOf(iIntValue + 1));
    }
}
