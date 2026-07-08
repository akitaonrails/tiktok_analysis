package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337310DKf {
    public static final C337310DKf LIZ = new C337310DKf();
    public static final Object LIZIZ = new Object();
    public static volatile String LIZJ;
    public static volatile C099F LIZLLL;

    public static String LIZIZ() {
        String str = LIZJ;
        if (str == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        return str;
    }

    public static void LIZ(C05XL c05xl) {
        synchronized (LIZIZ) {
            try {
                if (LIZLLL == c05xl) {
                    LIZLLL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LJ(Context context) {
        String string;
        String strF3 = C786410Ut5.F3(context);
        if (strF3 != null) {
            StringBuilder sb = new StringBuilder();
            int length = strF3.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = strF3.charAt(i);
                if (Intrinsics.LJI(cCharAt, 32) >= 0 && cCharAt != 127) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (string2 != null && (string = a0.LJLIIIL(string2).toString()) != null && (!a0.LJJJIL(string))) {
                return string;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r10, X.InterfaceC1364105Vn<? super java.lang.String> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C337320DKg
            if (r0 == 0) goto L86
            r7 = r11
            X.0DKg r7 = (X.C337320DKg) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r6 = 2
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L33
            if (r0 == r5) goto L76
            if (r0 != r6) goto L8d
            X.C155000ia.LIZIZ(r2)
        L26:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L8c
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L8c
            return r2
        L33:
            X.C155000ia.LIZIZ(r2)
            java.lang.String r0 = LIZIZ()
            if (r0 == 0) goto L3d
            return r0
        L3d:
            android.content.Context r0 = X.C786410Ut5.N3(r10)
            if (r0 == 0) goto L44
            r10 = r0
        L44:
            X.013C r3 = new X.013C
            r3.<init>()
            java.lang.Object r2 = X.C337310DKf.LIZIZ
            monitor-enter(r2)
            java.lang.String r0 = LIZIZ()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L5a
            X.099F r1 = X.C090F.LIZIZ()     // Catch: java.lang.Throwable -> L95
            r1.LJJLIIIJILLIZJL(r0)     // Catch: java.lang.Throwable -> L95
            goto L66
        L5a:
            X.099F r1 = X.C337310DKf.LIZLLL     // Catch: java.lang.Throwable -> L95
            if (r1 != 0) goto L66
            X.099F r1 = X.C090F.LIZIZ()     // Catch: java.lang.Throwable -> L95
            X.C337310DKf.LIZLLL = r1     // Catch: java.lang.Throwable -> L95
            r3.element = r5     // Catch: java.lang.Throwable -> L95
        L66:
            monitor-exit(r2)
            boolean r0 = r3.element
            if (r0 == 0) goto L7b
            r7.LL = r1
            r7.LLILZ = r5
            java.lang.Object r0 = r9.LIZLLL(r10, r1, r7)
            if (r0 != r8) goto L7b
            return r8
        L76:
            X.05XL r1 = r7.LL
            X.C155000ia.LIZIZ(r2)
        L7b:
            r7.LL = r4
            r7.LLILZ = r6
            java.lang.Object r2 = r1.LJLIIIL(r7)
            if (r2 != r8) goto L26
            return r8
        L86:
            X.0DKg r7 = new X.0DKg
            r7.<init>(r9, r11)
            goto L12
        L8c:
            return r4
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L95:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337310DKf.LIZJ(android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r7, X.C05XL<java.lang.String> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C337330DKh
            if (r0 == 0) goto L23
            r5 = r9
            X.0DKh r5 = (X.C337330DKh) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            X.05XL r8 = r5.LL
            goto L4c
        L23:
            X.0DKh r5 = new X.0DKh
            r5.<init>(r6, r9)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L59
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L59
            X.08pq r1 = r0.LLIILII()     // Catch: java.lang.Throwable -> L59
            X.0DKe r0 = new X.0DKe     // Catch: java.lang.Throwable -> L59
            r0.<init>(r7, r3)     // Catch: java.lang.Throwable -> L59
            r5.LL = r8     // Catch: java.lang.Throwable -> L59
            r5.LLILZ = r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)     // Catch: java.lang.Throwable -> L59
            if (r1 != r4) goto L4f
            return r4
        L4c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
        L4f:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L55
            X.C337310DKf.LIZJ = r1     // Catch: java.lang.Throwable -> L59
        L55:
            r8.LJIIZILJ(r1)     // Catch: java.lang.Throwable -> L59
            goto L65
        L59:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6b
            r8.LJIIZILJ(r3)     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L65
            throw r1     // Catch: java.lang.Throwable -> L6b
        L65:
            LIZ(r8)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6b
            LIZ(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337310DKf.LIZLLL(android.content.Context, X.05XL, X.05Vn):java.lang.Object");
    }
}
