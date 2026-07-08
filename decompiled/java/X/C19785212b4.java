package X;

/* JADX INFO: renamed from: X.12b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19785212b4 {
    public static String LIZ(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if (str == null) {
                if (str2 == null) {
                    return strArr2[i];
                }
            } else {
                if (str.equals(str2)) {
                    return strArr2[i];
                }
            }
        }
        return null;
    }
}
