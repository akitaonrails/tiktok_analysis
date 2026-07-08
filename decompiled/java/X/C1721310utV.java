package X;

/* JADX INFO: renamed from: X.0utV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721310utV {
    public static final C1721310utV LIZ = new C1721310utV();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.String r3) {
        /*
            if (r3 == 0) goto L32
            int r1 = r3.hashCode()
            r0 = -1423402267(0xffffffffab289ae5, float:-5.990055E-13)
            if (r1 == r0) goto L21
            r0 = -1014578042(0xffffffffc386c486, float:-269.53534)
            if (r1 == r0) goto L2a
            r0 = -694342150(0xffffffffd69d2dfa, float:-8.64104E13)
            if (r1 != r0) goto L32
            java.lang.String r0 = "IllustrationMActivationResultIdentityError"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L32
            r0 = 2130968823(0x7f0400f7, float:1.754631E38)
            return r0
        L21:
            java.lang.String r0 = "IllustrationMNotEligibileToApply"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Laf
            goto L32
        L2a:
            java.lang.String r0 = "IllustrationLNotEligibileToApply"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Laf
        L32:
            java.lang.String r1 = "IllustrationXS"
            r2 = 1
            if (r3 == 0) goto L38
            goto L6b
        L38:
            java.lang.String r1 = "IllustrationS"
            if (r3 == 0) goto L49
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r2)     // Catch: java.lang.Throwable -> La1
            if (r0 != r2) goto L49
            java.lang.String r0 = "illustration_s_"
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> La1
            goto L77
        L49:
            java.lang.String r1 = "IllustrationM"
            if (r3 == 0) goto L5a
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r2)     // Catch: java.lang.Throwable -> La1
            if (r0 != r2) goto L5a
            java.lang.String r0 = "illustration_m_"
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> La1
            goto L77
        L5a:
            java.lang.String r1 = "IllustrationL"
            if (r3 == 0) goto L77
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r2)     // Catch: java.lang.Throwable -> La1
            if (r0 != r2) goto L77
            java.lang.String r0 = "illustration_l_"
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> La1
            goto L77
        L6b:
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r1, r2)     // Catch: java.lang.Throwable -> La1
            if (r0 != r2) goto L38
            java.lang.String r0 = "illustration_xs_"
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> La1
        L77:
            kotlin.text.Regex r1 = new kotlin.text.Regex     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = "([a-z])([A-Z]+)"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = "$1_$2"
            if (r3 == 0) goto L9f
            java.lang.String r1 = r1.replace(r3, r0)     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L9f
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r1.toLowerCase(r0)     // Catch: java.lang.Throwable -> La1
        L90:
            android.content.res.Resources r2 = X.C20642515q3.LJFF()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "drawable"
            java.lang.String r0 = X.C792400V6o.LIZLLL()     // Catch: java.lang.Throwable -> La1
            int r0 = X.C786410Ut5.n3(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> La1
            return r0
        L9f:
            r3 = 0
            goto L90
        La1:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            r0 = -1
            return r0
        Laf:
            r0 = 2130968736(0x7f0400a0, float:1.7546134E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721310utV.LIZ(java.lang.String):int");
    }
}
