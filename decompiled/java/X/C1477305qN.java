package X;

/* JADX INFO: renamed from: X.05qN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1477305qN {
    public static final String LIZ;
    public static String LIZIZ;
    public static final String LIZJ;

    static {
        String strLIZLLL = ((C1566106Bf) C0I0B.LJFF.LIZLLL()).LIZLLL();
        if (strLIZLLL == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LIZ = strLIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append("/aweme/v1/");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZLLL);
        sbLIZ2.append("/tiktok/v1/");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
    }
}
