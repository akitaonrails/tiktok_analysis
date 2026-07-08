package X;

/* JADX INFO: renamed from: X.0q0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533270q0D {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2, String str3) {
        if (str != null && C1533950q1J.LJ(str) && str2 != null && C1533950q1J.LJ(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynxview://");
            sbLIZ.append(str);
            sbLIZ.append('/');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str3 == null) {
            return "";
        }
        return str3;
    }
}
