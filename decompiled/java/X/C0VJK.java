package X;

/* JADX INFO: renamed from: X.0VJK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VJK {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;

    public static long LIZ(int i, String str) {
        char cCharAt;
        int i2 = 0;
        while (i < str.length() && (cCharAt = str.charAt(i)) >= '0' && cCharAt <= '9') {
            i2 = (i2 * 10) + (cCharAt - '0');
            i++;
        }
        return i2 * 1024 * 1024;
    }
}
