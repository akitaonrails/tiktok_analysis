package X;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: X.063f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15453063f {
    public static final C15453063f LIZ = new C15453063f();

    public static Object LIZIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C15466063s(str, null));
    }

    public static void LIZJ(Context context, Uri uri) {
        if (context == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15452063e(context, uri, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C15454063g
            if (r0 == 0) goto L4f
            r6 = r10
            X.063g r6 = (X.C15454063g) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L55
            X.C155000ia.LIZIZ(r1)
        L23:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L2b
            boolean r4 = r1.booleanValue()
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L30:
            X.C155000ia.LIZIZ(r1)
            X.1Bky r0 = X.C2213981Bky.LIZIZ
            android.content.Context r2 = r0.getApplicationContext()
            boolean r0 = X.C0BJ5.LIZ()
            if (r0 != 0) goto L40
            goto L5d
        L40:
            X.063h r1 = new X.063h
            r0 = 0
            r1.<init>(r2, r0)
            r6.LLILLL = r3
            java.lang.Object r1 = X.C099A.LIZJ(r8, r1, r6)
            if (r1 != r5) goto L23
            return r5
        L4f:
            X.063g r6 = new X.063g
            r6.<init>(r7, r10)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5d:
            X.140D r0 = X.C140D.LIZ     // Catch: java.lang.Throwable -> L6a
            r0.LJJIIJ(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L6a
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6a
            goto L76
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L76:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L80
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15453063f.LIZ(long, X.05Vn):java.lang.Object");
    }
}
