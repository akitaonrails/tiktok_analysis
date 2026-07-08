package X;

/* JADX INFO: renamed from: X.1AnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2189921AnG {
    public static void LIZ(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append('\"');
            sb.append(strArr[i]);
            sb.append('\"');
            if (i < length - 1) {
                sb.append(',');
            }
        }
    }

    public static void LIZIZ(StringBuilder sb, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            sb.append(str);
            sb.append(".\"");
            sb.append(str2);
            sb.append('\"');
            sb.append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
    }
}
