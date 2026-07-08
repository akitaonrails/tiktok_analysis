package X;

/* JADX INFO: renamed from: X.0tv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683850tv5 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1683860tv6 LIZJ(X.InterfaceC1680500tpg r5) {
        /*
            X.13DR r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LJFF
            java.lang.Object r4 = r5.LJJIL(r0)
            android.view.View r4 = (android.view.View) r4
            java.util.WeakHashMap<android.view.View, X.0tv6> r1 = X.C1683860tv6.LJIJJ
            monitor-enter(r1)
            java.lang.Object r3 = r1.get(r4)     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L19
            X.0tv6 r3 = new X.0tv6     // Catch: java.lang.Throwable -> L44
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L44
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L44
        L19:
            X.0tv6 r3 = (X.C1683860tv6) r3     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)
            boolean r2 = r5.LJII(r3)
            boolean r0 = r5.LJII(r4)
            r2 = r2 | r0
            java.lang.Object r1 = r5.LJJ()
            if (r2 != 0) goto L34
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L3e
        L34:
            kotlin.jvm.internal.AwS391S0200000_25 r1 = new kotlin.jvm.internal.AwS391S0200000_25
            r0 = 223(0xdf, float:3.12E-43)
            r1.<init>(r3, r4, r0)
            r5.LJJIJIIJI(r1)
        L3e:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.C1680540tpk.LIZIZ(r3, r1, r5)
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683850tv5.LIZJ(X.0tpg):X.0tv6");
    }

    public static final C1683830tv3 LIZ(int i, String str) {
        return new C1683830tv3(i, str);
    }

    public static final C1683870tv7 LIZIZ(int i, String str) {
        return new C1683870tv7(C1683840tv4.LIZJ(C20244914Jj.LJ), str);
    }
}
