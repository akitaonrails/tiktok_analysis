package X;

/* JADX INFO: renamed from: X.09b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2401309b1 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            X.0C64 r3 = X.C0C64.LJIILLIIL()
            r2 = 31744(0x7c00, float:4.4483E-41)
            r11 = 0
            java.lang.String r1 = "tt_samsung_media_choose_enable_heics"
            r0 = 1
            int r5 = r3.LJIJ(r2, r11, r1, r0)
            if (r5 == 0) goto L76
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r2 <= r1) goto L76
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "samsung"
            boolean r1 = kotlin.text.u.LJIJI(r1, r2, r0)
            if (r1 != 0) goto L28
            java.lang.String r1 = android.os.Build.BRAND
            boolean r1 = kotlin.text.u.LJIJI(r1, r2, r0)
            if (r1 == 0) goto L76
        L28:
            r1 = 3
            if (r5 == r1) goto L70
            java.lang.String r1 = android.os.Build.MODEL
            if (r1 != 0) goto L31
            java.lang.String r1 = ""
        L31:
            java.lang.String r2 = ")[A-Z0-9]*$"
            java.lang.String r3 = "^("
            r4 = 2
            if (r5 != r4) goto L72
            java.lang.String r6 = "SM-S936"
            java.lang.String r5 = "SM-S938"
            java.lang.String r4 = "SM-S931"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6, r5}
            java.util.List r7 = X.C1697810uHb.LJIIJJI(r4)
            kotlin.text.Regex r6 = new kotlin.text.Regex
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            r5.append(r3)
            java.lang.String r8 = "|"
            r9 = 0
            r14 = 62
            r10 = r9
            r12 = r9
            r13 = r9
            java.lang.String r4 = X.C13LP.LJJLIIIJ(r7, r8, r9, r10, r11, r12, r13, r14)
            r5.append(r4)
            r5.append(r2)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r5)
            X.0Qzy r4 = X.EnumC688760Qzy.IGNORE_CASE
            r6.<init>(r5, r4)
            boolean r4 = r6.matches(r1)
            if (r4 == 0) goto L85
        L70:
            r11 = 1
        L71:
            return r11
        L72:
            if (r5 == r0) goto L85
            if (r5 == r4) goto L85
        L76:
            X.0C64 r3 = X.C0C64.LJIILLIIL()
            java.lang.String r2 = "tt_media_choose_enable_heics"
            r1 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = r3.LJIIIZ(r1, r2, r0, r11)
            if (r0 == 0) goto L71
            goto L70
        L85:
            java.lang.String r4 = "SM-S942"
            java.lang.String r5 = "SM-S947"
            java.lang.String r6 = "SM-S948"
            java.lang.String r7 = "SM-K772"
            java.lang.String r8 = "SM-K777"
            java.lang.String r9 = "SM-K778"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.util.List r7 = X.C1697810uHb.LJIIJJI(r4)
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            r4.append(r3)
            java.lang.String r8 = "|"
            r9 = 0
            r14 = 62
            r10 = r9
            r12 = r9
            r13 = r9
            java.lang.String r3 = X.C13LP.LJJLIIIJ(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r4)
            X.0Qzy r2 = X.EnumC688760Qzy.IGNORE_CASE
            r5.<init>(r3, r2)
            boolean r1 = r5.matches(r1)
            if (r1 == 0) goto L76
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2401309b1.LIZ():boolean");
    }
}
