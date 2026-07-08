package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0O0W, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O0W {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static int LIZLLL;
    public static long LJ;
    public static int LJFF;

    public static void LIZ(final int i, Aweme aweme, final String str) {
        final String authorUid;
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        final long jCurrentTimeMillis = System.currentTimeMillis() - LJ;
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0O0V
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
                c2344009Gk.LJIIIIZZ("previous_page", str);
                c2344009Gk.LJIIIIZZ("to_user_id", authorUid);
                c2344009Gk.LIZJ(i, "result");
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "request_cost");
                c2344009Gk.LIZJ(C0O0W.LJFF, "request_count");
                C20684815ws.LJIILLIIL("profile_load_latest", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("JustWatchTracker@f11e.reportLoadLatest$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("JustWatchTracker@f11e.reportLoadLatest$1");
            }
        });
    }

    public static void LIZIZ(final int i, final int i2, final Aweme aweme, final String str, final String str2) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - LIZJ;
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0O0U
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
                c2344009Gk.LJIIIIZZ("previous_page", str2);
                Aweme aweme2 = aweme;
                c2344009Gk.LJIIIIZZ("group_id", aweme2 != null ? aweme2.getAid() : null);
                Aweme aweme3 = aweme;
                c2344009Gk.LJIIIIZZ("author_id", aweme3 != null ? AwemeExtKt.getAuthorUid(aweme3) : null);
                c2344009Gk.LJIIIIZZ("locate", str);
                c2344009Gk.LIZJ(i, "result");
                c2344009Gk.LIZJ(i2, "error_code");
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "request_cost");
                c2344009Gk.LIZJ(C0O0W.LIZLLL, "request_count");
                C20684815ws.LJIILLIIL("just_watched_locate", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("JustWatchTracker@f11e.reportLocate$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("JustWatchTracker@f11e.reportLocate$1");
            }
        });
    }
}
