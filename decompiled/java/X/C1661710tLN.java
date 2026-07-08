package X;

/* JADX INFO: renamed from: X.0tLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661710tLN {
    public static final boolean LIZ(String str) {
        String strRealFindResourceUri = C20005113Pd.LIZ().LIZLLL().realFindResourceUri(0, null, str);
        if (strRealFindResourceUri == null) {
            strRealFindResourceUri = "";
        }
        if (strRealFindResourceUri.length() == 0) {
            return false;
        }
        return new C0VSJ(strRealFindResourceUri).exists();
    }
}
