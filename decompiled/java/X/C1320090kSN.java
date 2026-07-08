package X;

/* JADX INFO: renamed from: X.0kSN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320090kSN {
    public static C1320100kSO LIZIZ(Object obj) {
        String strReplaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int iLastIndexOf = strReplaceAll.lastIndexOf(36);
        if (iLastIndexOf == -1) {
            iLastIndexOf = strReplaceAll.lastIndexOf(46);
        }
        return new C1320100kSO(strReplaceAll.substring(iLastIndexOf + 1));
    }

    public static boolean LIZ(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
