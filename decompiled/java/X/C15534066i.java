package X;

/* JADX INFO: renamed from: X.066i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15534066i {
    public static final C15534066i LIZ = new C15534066i();
    public static long LIZIZ = -1;

    public static void LIZ(String str) {
        if (LIZIZ < 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("operation", str);
        c2344009Gk.LIZLLL(System.currentTimeMillis() - LIZIZ, "duration");
        C20684815ws.LJIILLIIL("passkey_operation_runtime", c2344009Gk.LIZ);
        LIZIZ = System.currentTimeMillis();
    }
}
