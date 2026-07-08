package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Nne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604680Nne {
    public static final /* synthetic */ int LJ = 0;
    public final Map<String, Object> LIZ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", "auto_post_highlight_introduction"), new Pair("live_status", "before_live"));
    public long LIZIZ;
    public TuxSheet LIZJ;
    public boolean LIZLLL;

    public final void LIZ(String str) {
        String str2;
        String str3;
        Object obj = ((LinkedHashMap) this.LIZ).get("room_id");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        Object obj2 = ((LinkedHashMap) this.LIZ).get("author_id");
        if ((obj2 instanceof String) && (str3 = (String) obj2) != null) {
            str4 = str3;
        }
        C608170NtH.LJI(str, str2, str4, null, null, null, 64);
    }
}
