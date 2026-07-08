package X;

/* JADX INFO: renamed from: X.19vL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21694519vL {
    public static final C21694519vL LIZ = new C21694519vL();

    public static C21694619vM LIZ(int i, int i2, int i3, int i4, EnumC1338240kve enumC1338240kve) {
        String str;
        int iMax;
        int iMax2;
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            if (enumC1338240kve != EnumC1338240kve.FIT_CENTER) {
                return new C21694619vM(0.0f, i, i2, "none", true);
            }
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            float f4 = i3 / i4;
            if (f4 > f3) {
                iMax2 = Math.max(1, (int) (f / f4));
                str = "top_bottom";
                iMax = i;
            } else {
                if (f4 < f3) {
                    iMax = Math.max(1, (int) (f2 * f4));
                    str = "left_right";
                } else {
                    str = "none";
                    iMax = i;
                }
                iMax2 = i2;
            }
            long j = ((long) i) * ((long) i2);
            long j2 = ((long) iMax) * ((long) iMax2);
            long j3 = 0;
            if (j <= 0) {
                return new C21694619vM(-1.0f, iMax, iMax2, "unknown", false);
            }
            long j4 = j - j2;
            if (j4 >= 0) {
                j3 = j4;
            }
            return new C21694619vM(j3 / j, iMax, iMax2, str, true);
        }
        return new C21694619vM(-1.0f, 0, 0, "unknown", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, X.EnumC1338240kve r18, com.ss.android.ugc.aweme.base.model.UrlModel r19, int r20, int r21, X.EnumC1781440wSU r22, X.EnumC671230QUn r23, java.lang.String r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21694519vL.LIZIZ(java.lang.String, java.lang.String, java.lang.String, int, X.0kve, com.ss.android.ugc.aweme.base.model.UrlModel, int, int, X.0wSU, X.0QUn, java.lang.String):java.lang.String");
    }
}
