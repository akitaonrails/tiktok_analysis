package X;

/* JADX INFO: renamed from: X.089n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20713089n {
    public static boolean LIZ(char c) {
        if (c < 'A') {
            return false;
        }
        if (c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean LIZIZ(char c) {
        return c >= '0' && c <= '9';
    }
}
