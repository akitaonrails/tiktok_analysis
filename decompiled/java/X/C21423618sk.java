package X;

/* JADX INFO: renamed from: X.18sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21423618sk {
    public static String LIZ(AbstractC21434718uX abstractC21434718uX) {
        String str = abstractC21434718uX.LIZ;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = abstractC21434718uX.LIZLLL().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }
}
