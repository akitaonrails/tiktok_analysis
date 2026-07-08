package X;

import com.ss.android.ugc.aweme.pipfeed.PipFeedManager;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19392510tv {
    public static final C19392510tv LIZ = new C19392510tv();
    public static final C01GW LIZIZ = C587650N3b.LIZ("PanelSwitch");
    public static final Map<String, List<String>> LIZJ = C2097908Jt.LIZJ(new Pair("For You", Collections.singletonList("homepage_hot")));
    public static final List<String> LIZLLL = Collections.singletonList("homepage_hot");

    public static void LIZIZ(C19EG c19eg, String str, Map map) {
        if (C299060Bns.LIZ()) {
            C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
            c1389880mGw.LJIIIZ(c19eg.getString(2131840065));
            c1389880mGw.LIZLLL(3000L);
            c1389880mGw.LJIIJ();
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(c19eg.getString(2131840065));
            c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
            c1389890mGx.LJII(R.attr.a0i);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("enter_from", str);
        C109300bD.LIZ("show_open_floating_window_toast", linkedHashMap);
    }

    public static void LIZ(C19EG c19eg, String str, Map map, boolean z) {
        PipFeedManager.Companion.getClass();
        PipFeedManager pipFeedManager = C1620120sGI.LIZ;
        if (C0BVS.LIZ()) {
            if (z) {
                LIZIZ(c19eg, str, map);
                pipFeedManager.startPipByEnterBackground$pipfeed_release(3000L);
                return;
            } else {
                pipFeedManager.startPipByEnterBackground$pipfeed_release(0L);
                return;
            }
        }
        LIZIZ(c19eg, str, map);
        pipFeedManager.setPipEnabled$pipfeed_release(true);
    }
}
