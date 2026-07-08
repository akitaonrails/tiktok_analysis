package X;

/* JADX INFO: renamed from: X.0IIO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIO {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static int LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static String LJI = "";
    public static boolean LJII;
    public static boolean LJIIIIZZ;

    public static final void LIZ(Long l, String str, boolean z) {
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        LJFF = jLongValue;
        LJI = str;
        LJ = System.currentTimeMillis() - LIZJ;
        LJII = z;
    }

    public static final void LIZIZ(float f, String str, int i) {
        String str2;
        if (!LIZ) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_landscape_slide_intercept");
        c474500IjALIZ.LJJII(str, "reason");
        c474500IjALIZ.LJJII(LJI, "live_type");
        c474500IjALIZ.LJJII(Boolean.valueOf(LIZIZ), "start_landscape_inner_feed");
        c474500IjALIZ.LJJIFFI(Float.valueOf(f), "distance");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "start_index");
        if (C497740JfY.LJIL()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        c474500IjALIZ.LJJII(str2, "orientation");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(Integer num, boolean z, Long l, int i, String str, long j) {
        if (!C497740JfY.LJIL() && LJIIIIZZ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("landscape_feed_pull_stream_result");
            c474500IjALIZ.LJJII(num, "landscape_pull_stream_status");
            c474500IjALIZ.LJJII(Long.valueOf(j - LIZJ), "landscape_pull_stream_duration");
            c474500IjALIZ.LJJII(str, "landscape_pull_stream_failed_msg");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "landscape_pull_stream_failed_code");
            c474500IjALIZ.LJJII(Boolean.valueOf(z), "landscape_is_pre_pull_stream");
            c474500IjALIZ.LJJII(l, "room_id");
            c474500IjALIZ.LIZ();
        }
    }
}
