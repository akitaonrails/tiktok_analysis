package X;

/* JADX INFO: renamed from: X.07dL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1906107dL extends C13EC {
    public static final void LIZIZ(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected '-' (hyphen) at index ");
        sbLIZ.append(i);
        sbLIZ.append(", but was '");
        sbLIZ.append(str.charAt(i));
        sbLIZ.append('\'');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
