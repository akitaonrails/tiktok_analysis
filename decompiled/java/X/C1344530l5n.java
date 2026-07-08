package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0l5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344530l5n {
    public static final C1344530l5n LIZ = new C1344530l5n();
    public static Pair<String, Long> LIZIZ = new Pair<>("", 0L);
    public static String LIZJ = "";
    public static boolean LIZLLL;

    public static void LIZ(int i, String str, Throwable th) {
        String message;
        String name = th.getClass().getName();
        Throwable cause = th.getCause();
        if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
            message = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("api_name", str);
        c2344009Gk.LIZJ(i, "error_code");
        c2344009Gk.LJIIIIZZ("error_type", name);
        c2344009Gk.LJIIIIZZ("error_desc", message);
        C20684815ws.LJIILLIIL("fail_reason", c2344009Gk.LIZ);
    }
}
