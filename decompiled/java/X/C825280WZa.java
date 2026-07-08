package X;

/* JADX INFO: renamed from: X.0WZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825280WZa {
    public static String LIZ(String str) {
        char[] charArray = str.toCharArray();
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j = (j * 31) + ((long) charArray[i]);
        }
        return String.valueOf(j);
    }
}
