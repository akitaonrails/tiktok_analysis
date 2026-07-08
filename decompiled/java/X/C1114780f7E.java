package X;

/* JADX INFO: renamed from: X.0f7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114780f7E {
    public static boolean LIZ(String str) {
        C1115360f8A.LIZJ().LIZIZ.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0 && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && (cCharAt < ' ' || (cCharAt > 55295 && (cCharAt < 57344 || (cCharAt > 65533 && (cCharAt < 0 || cCharAt > 65535)))))) {
                return true;
            }
        }
        return false;
    }
}
