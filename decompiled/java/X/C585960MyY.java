package X;

/* JADX INFO: renamed from: X.0MyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585960MyY {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static final void LIZ(final String str, final String str2, final String str3) {
        final long j;
        if (LIZ <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = LIZ;
        if (jCurrentTimeMillis <= j2) {
            j = 0;
        } else {
            j = jCurrentTimeMillis - j2;
            if (j > 86400000) {
                j = 1000;
            }
        }
        LIZ = 0L;
        if (j <= 0) {
            return;
        }
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0MyX
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("from_page", str3);
                c2344009Gk.LJIIIIZZ("quit_method", str2);
                c2344009Gk.LIZLLL(j, "duration");
                C20684815ws.LJIILLIIL("ttinter_zoom_stay", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ZoomStayMobHelper@22b4.exitZoomFix$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ZoomStayMobHelper@22b4.exitZoomFix$1");
            }
        });
    }
}
