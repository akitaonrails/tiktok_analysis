package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0zRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896290zRj extends C1896050zRL {
    public static long LIZIZ;
    public static C1896070zRN LIZJ;
    public static final C1896290zRj LIZ = new C1896290zRj();
    public static final String LIZLLL = "_manual";

    @Override // X.C1896050zRL
    public final C1896070zRN LIZIZ(Integer num) {
        if (num != null && 16 == num.intValue()) {
            return LIZJ;
        }
        Pair pairLIZJ = C20554315bp.LIZIZ.LIZJ(EnumC20654715s1.FEED_WIDGET);
        if (((C20554115bn) pairLIZJ.getFirst()).LIZ == 0) {
            C20484080s.LIZJ(pairLIZJ.getSecond());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feed_widget");
            sbLIZ.append(LIZLLL);
            return new C1896070zRN(C2188811AlT.LIZIZ(sbLIZ), C20484080s.LIZJ(pairLIZJ.getSecond()));
        }
        return new C1896070zRN(null, null);
    }
}
