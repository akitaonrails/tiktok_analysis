package X;

import android.util.Log;

/* JADX INFO: renamed from: X.08MI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MI {
    public static final void LIZ(String str, Throwable th) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event", str);
        c2344009Gk.LJIIIIZZ("msg", th.getMessage());
        c2344009Gk.LJIIIIZZ("diff_ex_msg", Log.getStackTraceString(th));
        C20684815ws.LJIILLIIL("feed_event_optimize_exception", c2344009Gk.LIZ);
        C1AF0.LJFF(th, "feed_event_optimize_exception");
    }
}
