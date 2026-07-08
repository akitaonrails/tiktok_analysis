package X;

/* JADX INFO: renamed from: X.0Ir7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479430Ir7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C479420Ir6 c479420Ir6) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hangout_toplive_pull_stream_result");
        c474500IjALIZ.LJJII(Long.valueOf(c479420Ir6.LIZ), "duration");
        c474500IjALIZ.LJJII(c479420Ir6.LIZIZ, "result");
        c474500IjALIZ.LJJII(String.valueOf(c479420Ir6.LIZJ), "room_id");
        c474500IjALIZ.LJJII("ao", "media_type");
        Integer num = c479420Ir6.LIZLLL;
        if (num != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num.intValue()), "error_code");
        }
        String str = c479420Ir6.LJ;
        if (str != null) {
            c474500IjALIZ.LJJII(str, "error_msg");
        }
        c474500IjALIZ.LIZ();
    }
}
