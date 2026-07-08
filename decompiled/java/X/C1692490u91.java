package X;

/* JADX INFO: renamed from: X.0u91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692490u91 {
    public static final int LIZ(int i, CharSequence charSequence) {
        String str = (String) charSequence;
        int length = str.length();
        while (i < length) {
            if (str.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final int LIZIZ(int i, CharSequence charSequence) {
        while (i > 0) {
            int i2 = i - 1;
            if (((String) charSequence).charAt(i2) == '\n') {
                return i;
            }
            i = i2;
        }
        return 0;
    }
}
