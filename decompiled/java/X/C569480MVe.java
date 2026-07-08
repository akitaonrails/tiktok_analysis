package X;

import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569480MVe {
    public static final C569480MVe LIZ = new C569480MVe();

    public static boolean LIZ(String str) {
        if (a0.LJJJIL(str) || !u.LJJIIJZLJL(str, "editor://", false)) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(String str) {
        if (LIZ(str)) {
            return a0.LJJLJLI(str, "/", str);
        }
        return "";
    }
}
