package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0IIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464220IIi {
    public static final C464220IIi LIZ = new C464220IIi();
    public static final ConcurrentHashMap<String, C463180IEi> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, long j, C464230IIj c464230IIj) {
        ConcurrentHashMap<String, C463180IEi> concurrentHashMap;
        C463180IEi c463180IEi;
        if (str == null || (c463180IEi = (concurrentHashMap = LIZIZ).get(str)) == null) {
            return;
        }
        concurrentHashMap.remove(str);
        if (!c463180IEi.LIZIZ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_preview_card_slide");
            c474500IjALIZ.LJJII(Long.valueOf(j), "live_preview_watch_duration_total");
            c474500IjALIZ.LJJII(Integer.valueOf(c463180IEi.LIZJ ? 1 : 0), "inner_room_play_failed");
            c474500IjALIZ.LJJII(c464230IIj.LIZLLL, "enter_from_merge");
            c474500IjALIZ.LJJII(c464230IIj.LJFF, "action_type");
            c474500IjALIZ.LJJII(c464230IIj.LIZIZ, "anchor_id");
            c474500IjALIZ.LJJII(c464230IIj.LJI, "room_id");
            c474500IjALIZ.LJJII(c464230IIj.LIZJ, "request_id");
            c474500IjALIZ.LJJII(c464230IIj.LJ, "enter_method");
            c474500IjALIZ.LJJII(c464230IIj.LJII, "live_session_id");
            c474500IjALIZ.LJJII(c464230IIj.LIZ, "user_id");
            c474500IjALIZ.LJJIIZI(c464230IIj.LJIIIIZZ);
            c474500IjALIZ.LIZ();
        }
    }
}
