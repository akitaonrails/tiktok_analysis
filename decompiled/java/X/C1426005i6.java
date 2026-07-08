package X;

/* JADX INFO: renamed from: X.05i6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426005i6 {
    public static final C1426005i6 LIZ = new C1426005i6();

    public static String LIZIZ(String str, String str2) {
        boolean z;
        if ("".length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LyricsRuleProbe [");
            sbLIZ.append(str);
            sbLIZ.append("] ");
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LyricsRuleProbe [");
        sbLIZ2.append(str);
        sbLIZ2.append("] ");
        sbLIZ2.append(str2);
        sbLIZ2.append(' ');
        sbLIZ2.append("");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final void LIZ(AbstractC201949140d abstractC201949140d, String str, String str2) {
        LIZ.getClass();
        C201955140j.LIZLLL(abstractC201949140d, "LyricsRule", LIZIZ(str, str2));
    }

    public static final void LIZJ(AbstractC201949140d abstractC201949140d, String str, String str2) {
        LIZ.getClass();
        C201955140j.LJIJJ(abstractC201949140d, "LyricsRule", LIZIZ(str, str2));
    }
}
