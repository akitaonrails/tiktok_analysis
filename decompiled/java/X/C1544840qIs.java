package X;

/* JADX INFO: renamed from: X.0qIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544840qIs {
    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" throwable: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" throwable: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" throwable: ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ(String str, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" throwable: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
