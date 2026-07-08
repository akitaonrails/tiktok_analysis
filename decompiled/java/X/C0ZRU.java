package X;

/* JADX INFO: renamed from: X.0ZRU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRU {
    public static char[] LIZ(C869590Y9l c869590Y9l) {
        char[] charArray;
        String str = c869590Y9l.getExt().get("text_view_click_status");
        if (str == null || (charArray = str.toCharArray()) == null) {
            String str2 = c869590Y9l.getLocalExt().get("text_view_click_status");
            if (str2 != null) {
                return str2.toCharArray();
            }
            return null;
        }
        return charArray;
    }
}
