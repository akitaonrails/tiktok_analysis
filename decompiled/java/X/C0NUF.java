package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NUF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NUF {
    public final C603820NmG<C0NUE, C1899007cC> LIZ = new C603820NmG<>(16);
    public final C19991913Kb<C0NUE, C1899007cC> LIZIZ = C19992013Kc.LIZIZ();
    public final C0NUG LIZJ = new C0NUG();

    public final C1899007cC LIZ(C0NUU c0nuu, C0NU9 c0nu9) {
        C1899007cC c1899007cCLIZJ;
        c0nu9.getCacheKey();
        C0NUE c0nue = new C0NUE(c0nuu, null);
        synchronized (this.LIZJ) {
            try {
                c1899007cCLIZJ = this.LIZ.LIZJ(c0nue);
                if (c1899007cCLIZJ == null) {
                    c1899007cCLIZJ = this.LIZIZ.LIZLLL(c0nue);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1899007cCLIZJ;
    }

    public static void LIZIZ(C0NUF c0nuf, C0NUU c0nuu, C0NU9 c0nu9, Object obj) {
        c0nu9.getCacheKey();
        C0NUE c0nue = new C0NUE(c0nuu, null);
        synchronized (c0nuf.LIZJ) {
            try {
                if (obj == null) {
                    c0nuf.LIZIZ.LJIIJJI(c0nue, new C1899007cC(null));
                } else {
                    c0nuf.LIZ.LIZLLL(c0nue, new C1899007cC(obj));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C0NUU r9, X.C0NU9 r10, X.C0NU7 r11, X.InterfaceC1364105Vn r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C0NUD
            if (r0 == 0) goto L65
            r7 = r12
            X.0NUD r7 = (X.C0NUD) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L12:
            java.lang.Object r2 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L95
            boolean r1 = r7.LLILLL
            X.0NUE r3 = r7.LLILLJJLI
            X.0NUF r0 = r7.LL
            X.C155000ia.LIZIZ(r2)
        L29:
            X.0NUG r4 = r0.LIZJ
            monitor-enter(r4)
            if (r2 != 0) goto L76
            goto L6b
        L2f:
            X.C155000ia.LIZIZ(r2)
            X.0NUE r3 = new X.0NUE
            r10.getCacheKey()
            r3.<init>(r9, r5)
            X.0NUG r1 = r8.LIZJ
            monitor-enter(r1)
            X.0NmG<X.0NUE, X.07cC> r0 = r8.LIZ     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r0.LIZJ(r3)     // Catch: java.lang.Throwable -> La1
            X.07cC r0 = (X.C1899007cC) r0     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L4f
            X.13Kb<X.0NUE, X.07cC> r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r0.LIZLLL(r3)     // Catch: java.lang.Throwable -> La1
            X.07cC r0 = (X.C1899007cC) r0     // Catch: java.lang.Throwable -> La1
        L4f:
            if (r0 == 0) goto L52
            goto L9d
        L52:
            monitor-exit(r1)
            r7.LL = r8
            r7.LLILLJJLI = r3
            r1 = 0
            r7.LLILLL = r1
            r7.LLILZLL = r4
            java.lang.Object r2 = r11.invoke(r7)
            if (r2 != r6) goto L63
            return r6
        L63:
            r0 = r8
            goto L29
        L65:
            X.0NUD r7 = new X.0NUD
            r7.<init>(r8, r12)
            goto L12
        L6b:
            X.13Kb<X.0NUE, X.07cC> r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L8f
            X.07cC r0 = new X.07cC     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L8f
            r1.LJIIJJI(r3, r0)     // Catch: java.lang.Throwable -> L8f
            goto L8d
        L76:
            if (r1 == 0) goto L83
            X.13Kb<X.0NUE, X.07cC> r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L8f
            X.07cC r0 = new X.07cC     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8f
            r1.LJIIJJI(r3, r0)     // Catch: java.lang.Throwable -> L8f
            goto L8d
        L83:
            X.0NmG<X.0NUE, X.07cC> r1 = r0.LIZ     // Catch: java.lang.Throwable -> L8f
            X.07cC r0 = new X.07cC     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8f
            r1.LIZLLL(r3, r0)     // Catch: java.lang.Throwable -> L8f
        L8d:
            monitor-exit(r4)
            return r2
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r4)
            throw r0
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9d:
            java.lang.Object r0 = r0.LIZ     // Catch: java.lang.Throwable -> La1
            monitor-exit(r1)
            return r0
        La1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NUF.LIZJ(X.0NUU, X.0NU9, X.0NU7, X.05Vn):java.lang.Object");
    }
}
