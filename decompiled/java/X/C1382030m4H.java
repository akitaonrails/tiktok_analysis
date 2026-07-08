package X;

/* JADX INFO: renamed from: X.0m4H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382030m4H {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0VQU c0vqu = C0VQU.COLUMN_FOLLOW_STATUS;
        sbLIZ.append(c0vqu.key);
        sbLIZ.append(" == 2");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c0vqu.key);
        sbLIZ2.append(" == 2 and ");
        C0VQU c0vqu2 = C0VQU.COLUMN_USER_SHARE_STATUS;
        sbLIZ2.append(c0vqu2.key);
        sbLIZ2.append(" != 2");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(c0vqu.key);
        sbLIZ3.append(" == 1 and ");
        sbLIZ3.append(c0vqu2.key);
        sbLIZ3.append(" != 2");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(c0vqu.key);
        sbLIZ4.append(" != 0");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(c0vqu.key);
        sbLIZ5.append(" != 0 and ");
        sbLIZ5.append(c0vqu2.key);
        sbLIZ5.append(" != 2");
        LJ = C2188811AlT.LIZIZ(sbLIZ5);
    }
}
