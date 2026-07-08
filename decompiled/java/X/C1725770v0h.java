package X;

/* JADX INFO: renamed from: X.0v0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725770v0h {
    public static final C1725770v0h LIZ = new C1725770v0h();
    public static float LIZIZ;
    public static long LIZJ;

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:20))(0)|7|(1:(1:10)(2:21|22))(4:12|(1:14)|15|(2:17|(1:19))(6:23|45|24|(1:37)(2:28|(1:30)(2:31|(1:33)(2:34|(1:36))))|38|(2:42|43)(1:44)))|11|45|24|(3:26|37|38)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r10, X.InterfaceC1364105Vn<? super X.C1548220qOK> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1725760v0g
            if (r0 == 0) goto L61
            r4 = r11
            X.0v0g r4 = (X.C1725760v0g) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r6 = 0
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L67
            java.lang.Object r10 = r4.LL
            android.content.Context r10 = (android.content.Context) r10
            X.C155000ia.LIZIZ(r1)
        L28:
            java.lang.Number r1 = (java.lang.Number) r1
            float r4 = r1.floatValue()
            goto L70
        L2f:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.ies.abmock.SettingsManager r8 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.pipo.settings.PipoContainerAddAppMemory$PipoContainerAddAppMemoryConfig> r2 = com.ss.android.ugc.aweme.pipo.settings.PipoContainerAddAppMemory.PipoContainerAddAppMemoryConfig.class
            com.ss.android.ugc.aweme.pipo.settings.PipoContainerAddAppMemory$PipoContainerAddAppMemoryConfig r1 = com.ss.android.ugc.aweme.pipo.settings.PipoContainerAddAppMemory.LIZ
            java.lang.String r0 = "pipo_container_add_app_memory"
            java.lang.Object r0 = r8.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.pipo.settings.PipoContainerAddAppMemory$PipoContainerAddAppMemoryConfig r0 = (com.ss.android.ugc.aweme.pipo.settings.PipoContainerAddAppMemory.PipoContainerAddAppMemoryConfig) r0
            if (r0 == 0) goto L45
            r1 = r0
        L45:
            java.lang.Boolean r1 = r1.enable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6f
            r4.LL = r10
            r4.LLILZ = r3
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0v0i r0 = new X.0v0i
            r0.<init>(r5)
            java.lang.Object r1 = X.C23250099c.LJI(r4, r1, r0)
            if (r1 != r7) goto L28
            return r7
        L61:
            X.0v0g r4 = new X.0v0g
            r4.<init>(r9, r11)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6f:
            r4 = 0
        L70:
            long r0 = X.C2188571Al5.LIZIZ(r10)     // Catch: java.lang.Throwable -> Lb2
            float r2 = (float) r0     // Catch: java.lang.Throwable -> Lb2
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r7
            float r2 = r2 / r7
            long r0 = X.C2188571Al5.LIZ(r10)     // Catch: java.lang.Throwable -> Lb2
            float r8 = (float) r0     // Catch: java.lang.Throwable -> Lb2
            float r8 = r8 / r7
            float r8 = r8 / r7
            float r1 = r8 / r2
            X.0qOK r7 = new X.0qOK     // Catch: java.lang.Throwable -> Lb2
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto Lac
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto Lac
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9b
            r3 = 8
            goto Lae
        L9b:
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto La4
            r3 = 4
            goto Lae
        La4:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lae
            r3 = 2
            goto Lae
        Lac:
            r3 = 16
        Lae:
            r7.<init>(r6, r1, r2, r3)     // Catch: java.lang.Throwable -> Lb2
            goto Lb7
        Lb2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r7 = r5
        Lb7:
            if (r7 == 0) goto Lc5
            X.0qOK r3 = new X.0qOK
            float r2 = r7.LIZIZ
            float r1 = r7.LIZJ
            int r0 = r7.LIZLLL
            r3.<init>(r4, r2, r1, r0)
            return r3
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725770v0h.LIZ(android.content.Context, X.05Vn):java.lang.Object");
    }
}
