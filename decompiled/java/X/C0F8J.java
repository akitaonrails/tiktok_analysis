package X;

/* JADX INFO: renamed from: X.0F8J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8J {
    public static void LIZ(String str, String str2) {
        if (str.length() == 0 || str2 == null || str2.length() == 0 || str2.length() <= 3072) {
            return;
        }
        while (str2.length() > 3072) {
            str2 = str2.replace(str2.substring(0, 3072), "");
        }
    }
}
