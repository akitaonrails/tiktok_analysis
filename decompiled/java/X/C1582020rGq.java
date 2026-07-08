package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0rGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582020rGq {
    public static final List<C0DMT> LIZ = new ArrayList();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZLLL = new ConcurrentHashMap<>();
    public static final List<String> LJ = C1697810uHb.LJIIJJI("scene_get_top_tab", "scene_get_bottom_tab", "scene_get_top_icon", "scene_top_tab_attach", "scene_top_bottom_attach", "scene_top_icon_attach", "scene_tab_fragment_on_create", "scene_tab_fragment_on_view_created", "scene_tab_top_fragment_page_selected");

    static {
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
        c0cm3.LJI = new C0DMS();
        C312240CLu.LIZ(c0cm3);
    }

    public static void LIZ(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LIZJ.put(str, Long.valueOf(jElapsedRealtime));
        Long l = LIZIZ.get(str);
        if (l != null) {
            LIZLLL.put(str, Long.valueOf(jElapsedRealtime - l.longValue()));
        }
    }

    public static final void LIZIZ(String str) {
        long j;
        List<C0DMT> list = LIZ;
        C0DMT c0dmt = (C0DMT) C13LP.LJJLIIIJL(list);
        if (c0dmt != null) {
            j = c0dmt.LIZIZ;
        } else {
            j = 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII;
        ((ArrayList) list).add(new C0DMT(str, jElapsedRealtime, jElapsedRealtime - j));
    }

    public static void LIZJ(String str) {
        LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LIZLLL(String str) {
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            tabSwitchMetricServiceLIZ.LJFF(System.currentTimeMillis(), str);
        }
        LIZ(str);
    }

    public static void LJ(String str) {
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            tabSwitchMetricServiceLIZ.LIZ(System.currentTimeMillis(), str);
        }
        LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
