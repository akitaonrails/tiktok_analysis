package X;

/* JADX INFO: renamed from: X.0NUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594730NUh {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        if (i == 0) {
            return "Blocking";
        }
        if (i == 1) {
            return "Optional";
        }
        if (i == 2) {
            return "Async";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid(value=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
