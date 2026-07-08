package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0rhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598730rhn {
    public boolean LIZIZ;
    public long LIZ = System.currentTimeMillis();
    public long LIZJ = System.currentTimeMillis();
    public long LIZLLL = System.currentTimeMillis();
    public long LJ = System.currentTimeMillis();
    public long LJFF = System.currentTimeMillis();
    public String LJI = "from_request";

    public final void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("state", "preload");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("inbox_skylight_lifecycle", c2344009Gk.LIZ);
    }

    public final void LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("state", "show");
        c2344009Gk.LJIIIIZZ("state_from", this.LJI);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("inbox_skylight_lifecycle", c2344009Gk.LIZ);
    }

    public static void LIZJ(C1598730rhn c1598730rhn, int i) {
        int i2;
        String str;
        if ((i & 4) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            str = "";
        } else {
            str = null;
        }
        c1598730rhn.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - c1598730rhn.LIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("state", "request");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LIZJ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(0, "live_num_diff");
        c2344009Gk.LJ(false, "live_sort_diff");
        c2344009Gk.LJIIIIZZ("janus_skylight_log", str);
        C20684815ws.LJIILLIIL("inbox_skylight_lifecycle", c2344009Gk.LIZ);
    }

    public final void LIZ(int i, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("state", "handle");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LIZJ(z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(i, "data_size");
        C20684815ws.LJIILLIIL("inbox_skylight_lifecycle", c2344009Gk.LIZ);
    }
}
