package X;

/* JADX INFO: renamed from: X.0lSW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358620lSW {
    public static boolean LIZ(String str, String str2) {
        if (str == null || str2 == null || !C1355260lN6.LIZ()) {
            return false;
        }
        C1358720lSg.LIZ.getClass();
        C08I7 c08i7LIZJ = C1358720lSg.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return c08i7LIZJ.LIZJ().containsKey(C2188811AlT.LIZIZ(sbLIZ));
    }
}
