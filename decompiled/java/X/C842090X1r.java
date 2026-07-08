package X;

/* JADX INFO: renamed from: X.0X1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842090X1r {
    public static final String LIZ(String str) {
        char[] charArray = str.toCharArray();
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j = ((long) charArray[i]) + (((long) 31) * j);
        }
        return String.valueOf(j);
    }
}
