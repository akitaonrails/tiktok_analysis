package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.13xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20180713xl {
    public static final C20180713xl LIZ = new C20180713xl();
    public static final C1DEV LIZIZ = C2191201ApK.LIZ();
    public static final ConcurrentHashMap<String, C20179913xd> LIZJ = new ConcurrentHashMap<>();

    static {
        new AtomicBoolean(false);
        C2296808zG.LIZ(C0PEM.LIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C20180913xn
            if (r0 == 0) goto L28
            r6 = r9
            X.13xn r6 = (X.C20180913xn) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L2e
            X.1DEV r2 = r6.LLILLJJLI
            java.lang.Object r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
            goto L48
        L28:
            X.13xn r6 = new X.13xn
            r6.<init>(r7, r9)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r2 = X.C20180713xl.LIZIZ
            r6.LL = r8
            r6.LLILLJJLI = r2
            r6.LLILZIL = r3
            java.lang.Object r0 = r2.LIZLLL(r4, r6)
            if (r0 != r1) goto L48
            return r1
        L48:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.13xd> r1 = X.C20180713xl.LIZJ     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r1.get(r8)     // Catch: java.lang.Throwable -> L63
            X.13xd r0 = (X.C20179913xd) r0     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5d
            r0.LIZIZ()     // Catch: java.lang.Throwable -> L63
            r1.remove(r8)     // Catch: java.lang.Throwable -> L63
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L63
            goto L5f
        L5d:
            r3 = 0
            goto L58
        L5f:
            r2.LIZIZ(r4)
            return r0
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L63
            r2.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20180713xl.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.graphics.Bitmap r8, java.lang.String r9, X.InterfaceC1364105Vn r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C20180813xm
            if (r0 == 0) goto L2e
            r6 = r10
            X.13xm r6 = (X.C20180813xm) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r2 = r6.LLILZ
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L3c
            if (r0 != r4) goto L34
            X.1DEV r3 = r6.LLILLL
            java.lang.Object r8 = r6.LLILLJJLI
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            java.lang.Object r9 = r6.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r2)
            goto L50
        L2e:
            X.13xm r6 = new X.13xm
            r6.<init>(r7, r10)
            goto L12
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            X.C155000ia.LIZIZ(r2)
            X.1DEV r3 = X.C20180713xl.LIZIZ
            r6.LL = r9
            r6.LLILLJJLI = r8
            r6.LLILLL = r3
            r6.LLILZLL = r4
            java.lang.Object r0 = r3.LIZLLL(r5, r6)
            if (r0 != r1) goto L50
            return r1
        L50:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.13xd> r2 = X.C20180713xl.LIZJ     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r1 = r2.get(r9)     // Catch: java.lang.Throwable -> L7c
            X.13xd r1 = (X.C20179913xd) r1     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L70
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.LIZJ     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L6b
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L6b
            r4 = 0
        L6b:
            if (r4 != 0) goto L70
            r1.LIZIZ()     // Catch: java.lang.Throwable -> L7c
        L70:
            X.13xd r0 = new X.13xd     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r9, r8)     // Catch: java.lang.Throwable -> L7c
            r2.put(r9, r0)     // Catch: java.lang.Throwable -> L7c
            r3.LIZIZ(r5)
            return r0
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7c
            r3.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20180713xl.LIZ(android.graphics.Bitmap, java.lang.String, X.05Vn):java.lang.Object");
    }
}
