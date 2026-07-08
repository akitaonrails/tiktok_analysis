package X;

/* JADX INFO: renamed from: X.0kBV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309630kBV {
    public static final /* synthetic */ int LIZ = 0;

    public static C0VSJ LIZJ() {
        C844470XAv.LIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(C844470XAv.LIZ()), "ecommerce_lottie");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj;
    }

    public static boolean LIZ(String str) {
        String absolutePath = LIZJ().getAbsolutePath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".zip");
        return new C0VSJ(absolutePath, C2188811AlT.LIZIZ(sbLIZ)).exists();
    }

    public static String LIZLLL(String str) {
        String absolutePath = LIZJ().getAbsolutePath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".zip");
        return new C0VSJ(absolutePath, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
    }

    public static void LIZIZ(String str, String str2) {
        if (!LIZ(str)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1309640kBW(str, str2, null), 3);
        }
    }
}
