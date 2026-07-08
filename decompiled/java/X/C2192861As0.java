package X;

/* JADX INFO: renamed from: X.1As0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192861As0 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(char c) {
        return c >= 'a' ? c <= 'z' : c >= 'A' && c <= 'Z';
    }

    public static boolean LIZIZ(int i, int i2, CharSequence charSequence, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            if (!LIZ(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean LIZJ(int i, int i2, CharSequence charSequence, int i3, int i4) {
        int i5;
        if (i2 >= charSequence.length() || (i5 = (i2 - i) + 1) < i3 || i5 > i4) {
            return false;
        }
        while (i <= i2) {
            char cCharAt = charSequence.charAt(i);
            if (!LIZ(cCharAt) && (cCharAt < '0' || cCharAt > '9')) {
                return false;
            }
            i++;
        }
        return true;
    }
}
