package X;

/* JADX INFO: renamed from: X.0pSN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512290pSN {
    public static C1512470pSf LIZ;

    public static void LIZ(String str, String str2, Throwable th) {
        if (LIZ != null) {
            if (th == null) {
                C2344809Gs.LJFF(str, str2);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" erMsg:");
            sbLIZ.append(th.getMessage());
            C2344809Gs.LJFF(str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
