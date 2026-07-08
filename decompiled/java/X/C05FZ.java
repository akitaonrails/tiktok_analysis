package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.05FZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05FZ {
    public static final C05FZ LIZ = new C05FZ();
    public static final C05FV LIZIZ;
    public static final C05FV LIZJ;
    public static final C05FV LIZLLL;
    public static final C05FV LJ;

    static {
        List listLJIIJJI = C1697810uHb.LJIIJJI("playlist_click_entrance", "playlist_detail_create_start", "playlist_detail_created", "playlist_detail_first_frame");
        C05FX c05fx = C05FX.DURATION_FROM_START;
        LIZIZ = new C05FV("playlist_click_entrance_to_detail_first_frame", listLJIIJJI, c05fx);
        LIZJ = new C05FV("playlist_click_entrance_to_panel_show", C1697810uHb.LJIIJJI("playlist_click_entrance", "playlist_dialog_show", "playlist_dialog_create_start", "playlist_dialog_created", "playlist_dialog_ready"), c05fx);
        LIZLLL = new C05FV("playlist_click_entrance_to_first_frame", C1697810uHb.LJIIJJI("playlist_click_entrance", "playlist_video_first_frame"), c05fx);
        LJ = new C05FV("playlist_tap_cell_to_first_frame", C1697810uHb.LJIIJJI("playlist_click_panel_item", "playlist_video_first_frame"), c05fx);
    }

    public static void LIZ() {
        if (C1321305Fb.LIZ()) {
            C05FU c05fu = C05FU.LIZ;
            C05FV[] c05fvArr = {LIZIZ, LIZLLL};
            c05fu.getClass();
            Map<String, Set<C05FV>> map = C05FU.LIZJ;
            Set set = (Set) ((LinkedHashMap) map).get("playlist_launch_performance");
            if (set != null) {
                set.removeAll(C13LQ.LJLIIL(c05fvArr));
            }
            C05FV[] c05fvArr2 = {LIZJ};
            Set set2 = (Set) ((LinkedHashMap) map).get("playlist_launch_performance");
            if (set2 != null) {
                set2.removeAll(C13LQ.LJLIIL(c05fvArr2));
            }
        }
    }

    public static void LIZJ() {
        if (C1321305Fb.LIZ()) {
            C05FU c05fu = C05FU.LIZ;
            Long lValueOf = Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL);
            c05fu.getClass();
            C05FU.LIZLLL(lValueOf, "playlist_tap_performance");
            C05FU.LIZ(c05fu, "playlist_tap_performance", "playlist_click_panel_item");
        }
    }

    public static void LIZLLL(Map map) {
        C20684815ws.LJIILLIIL("playlist_detail_request", map);
    }

    public static void LJ(Map map) {
        C20684815ws.LJIILLIIL("playlist_video_request", map);
    }

    public static void LIZIZ(Map map, boolean z) {
        if (!C1321305Fb.LIZ()) {
            return;
        }
        C05FU c05fu = C05FU.LIZ;
        C05FV[] c05fvArr = {LIZIZ, LIZLLL};
        c05fu.getClass();
        C05FU.LIZJ("playlist_launch_performance", c05fvArr);
        if (z) {
            C05FU.LIZJ("playlist_launch_performance", LIZJ);
        }
        C05FU.LIZJ("playlist_tap_performance", LJ);
        C05FU.LIZLLL(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), "playlist_launch_performance");
        C05FY c05fy = new C05FY(System.currentTimeMillis(), "playlist_click_entrance", map);
        List list = (List) ((LinkedHashMap) C05FU.LIZIZ).get("playlist_launch_performance");
        if (list != null) {
            list.add(c05fy);
        }
    }
}
