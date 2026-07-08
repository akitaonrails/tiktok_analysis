package X;

/* JADX INFO: renamed from: X.0zfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904940zfg {
    public static final C1904940zfg LIZ = new C1904940zfg();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r3 < 7) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC1904890zfb LIZ(X.EnumC1904890zfb r12) {
        /*
            int[] r1 = X.C1904930zff.LIZ
            int r0 = r12.ordinal()
            r0 = r1[r0]
            r8 = 0
            r5 = 2
            r9 = 1
            if (r0 == r9) goto L29
            if (r0 != r5) goto L7d
            boolean r0 = com.ss.android.ugc.aweme.account.experiment.ProfileTabDoubleTapSwitchConfig.LIZIZ()
            if (r0 == 0) goto L39
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "switch_account_double_click_tooltip"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r9)
            if (r0 == 0) goto L39
        L24:
            r0 = 1
        L25:
            r9 = 0
            if (r0 != 0) goto L3b
            return r9
        L29:
            X.0C64 r6 = X.C0C64.LJIILLIIL()
            java.lang.String r10 = "switch_account_gesture"
            r7 = 31744(0x7c00, float:4.4483E-41)
            r11 = r9
            int r0 = r6.LJIIZILJ(r7, r8, r9, r10, r11)
            if (r0 != r5) goto L39
            goto L24
        L39:
            r0 = 0
            goto L25
        L3b:
            boolean r0 = X.C1904920zfe.LIZIZ(r12)
            if (r0 != 0) goto L6d
            com.bytedance.keva.Keva r1 = X.C1904920zfe.LIZ()
            java.lang.String r0 = "show_count"
            int r8 = r1.getInt(r0, r8)
            r0 = 3
            if (r8 >= r0) goto L6d
            com.bytedance.keva.Keva r3 = X.C1904920zfe.LIZ()
            java.lang.String r0 = "last_show_time"
            r1 = 0
            long r6 = r3.getLong(r0, r1)
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6e
            long r3 = r3 - r6
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 / r0
            r1 = 7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L73
        L6d:
            return r9
        L6e:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L73:
            if (r8 < r5) goto L7c
            r1 = 30
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7c
            return r9
        L7c:
            return r12
        L7d:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904940zfg.LIZ(X.0zfb):X.0zfb");
    }
}
