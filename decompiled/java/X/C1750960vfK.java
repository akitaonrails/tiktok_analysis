package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0vfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750960vfK {
    public static C099G LIZIZ;
    public static C2252611DEt LIZLLL;
    public static final C1750960vfK LIZ = new C1750960vfK();
    public static long LIZJ = -1;

    public static void LIZ() {
        C2252611DEt c2252611DEt;
        C2252611DEt c2252611DEt2 = LIZLLL;
        if (c2252611DEt2 != null) {
            if (c2252611DEt2.isActive() && (c2252611DEt = LIZLLL) != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                c2252611DEt.resumeWith(unit);
            }
            LIZLLL = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.InterfaceC497601wk r7) {
        /*
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = X.C1750960vfK.LIZJ
            long r3 = r5 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lf
            return
        Lf:
            X.C1750960vfK.LIZJ = r5
            X.099G r0 = X.C1750960vfK.LIZIZ
            if (r0 == 0) goto L3d
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L3d
        L1c:
            r2 = 0
            if (r0 == 0) goto L28
            X.099G r0 = X.C1750960vfK.LIZIZ
            if (r0 == 0) goto L26
            r0.LIZIZ(r2)
        L26:
            X.C1750960vfK.LIZIZ = r2
        L28:
            if (r7 != 0) goto L30
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r7 = X.C2296808zG.LIZ(r0)
        L30:
            X.0NfT r1 = new X.0NfT
            r1.<init>(r2)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r7, r2, r2, r1, r0)
            X.C1750960vfK.LIZIZ = r0
            return
        L3d:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750960vfK.LJ(X.01wk):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1750990vfN
            if (r0 == 0) goto L39
            r4 = r6
            X.0vfN r4 = (X.C1750990vfN) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3f
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginResponse r3 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginResponse) r3
            if (r3 == 0) goto L47
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData r0 = r3.data
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.099G r0 = X.C1750960vfK.LIZIZ
            if (r0 == 0) goto L47
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJLIIIL(r4)
            if (r3 != r2) goto L22
            return r2
        L39:
            X.0vfN r4 = new X.0vfN
            r4.<init>(r5, r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L47:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750960vfK.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1751000vfO
            if (r0 == 0) goto L35
            r4 = r6
            X.0vfO r4 = (X.C1751000vfO) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L3d
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData r3 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData) r3
            if (r3 == 0) goto L3b
            java.lang.String r0 = r3.gecToken
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LIZIZ(r4)
            if (r3 != r2) goto L22
            return r2
        L35:
            X.0vfO r4 = new X.0vfO
            r4.<init>(r5, r6)
            goto L12
        L3b:
            r0 = 0
            return r0
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750960vfK.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1751010vfP
            if (r0 == 0) goto L43
            r4 = r6
            X.0vfP r4 = (X.C1751010vfP) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L49
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData r3 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData) r3
            if (r3 == 0) goto L35
            java.lang.Boolean r1 = r3.isNewUser
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L35:
            r0 = 0
            goto L30
        L37:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LIZIZ(r4)
            if (r3 != r2) goto L22
            return r2
        L43:
            X.0vfP r4 = new X.0vfP
            r4.<init>(r5, r6)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750960vfK.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(android.content.Context r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            r9 = r12
            boolean r0 = r13 instanceof X.C1750970vfL
            if (r0 == 0) goto L24
            r4 = r13
            X.0vfL r4 = (X.C1750970vfL) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZ = r2
        L13:
            java.lang.Object r5 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L32
            if (r2 == r0) goto L40
            if (r2 != r1) goto L2a
            goto L70
        L24:
            X.0vfL r4 = new X.0vfL
            r4.<init>(r11, r13)
            goto L13
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r5)
            r4.LL = r9
            r4.LLILZ = r0
            java.lang.Object r5 = r11.LIZIZ(r4)
            if (r5 != r3) goto L47
            return r3
        L40:
            java.lang.Object r9 = r4.LL
            android.content.Context r9 = (android.content.Context) r9
            X.C155000ia.LIZIZ(r5)
        L47:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData r5 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData) r5
            if (r5 == 0) goto L80
            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r0 = r5.exceptionUX
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent r6 = r0.toastContent
            if (r6 == 0) goto L80
            java.lang.Integer r0 = r6.duration
            if (r0 == 0) goto L5d
            int r0 = r0.intValue()
            long r7 = (long) r0
            goto L5f
        L5d:
            r7 = 3000(0xbb8, double:1.482E-320)
        L5f:
            X.0vV7 r5 = new X.0vV7     // Catch: java.lang.Exception -> L76
            r10 = 0
            r5.<init>(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L76
            r4.LL = r10     // Catch: java.lang.Exception -> L76
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L76
            java.lang.Object r5 = X.C099A.LIZJ(r7, r5, r4)     // Catch: java.lang.Exception -> L76
            if (r5 != r3) goto L73
            return r3
        L70:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L76
        L73:
            kotlin.Unit r5 = (kotlin.Unit) r5     // Catch: java.lang.Exception -> L76
            goto L7d
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            LIZ()
        L7d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750960vfK.LJFF(android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(androidx.constraintlayout.widget.ConstraintLayout r12, X.InterfaceC1364105Vn r13) {
        /*
            r11 = this;
            r9 = r12
            boolean r0 = r13 instanceof X.C1750980vfM
            if (r0 == 0) goto L24
            r4 = r13
            X.0vfM r4 = (X.C1750980vfM) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZ = r2
        L13:
            java.lang.Object r5 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L32
            if (r2 == r0) goto L40
            if (r2 != r1) goto L2a
            goto L70
        L24:
            X.0vfM r4 = new X.0vfM
            r4.<init>(r11, r13)
            goto L13
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r5)
            r4.LL = r9
            r4.LLILZ = r0
            java.lang.Object r5 = r11.LIZIZ(r4)
            if (r5 != r3) goto L47
            return r3
        L40:
            java.lang.Object r9 = r4.LL
            android.view.View r9 = (android.view.View) r9
            X.C155000ia.LIZIZ(r5)
        L47:
            com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData r5 = (com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginData) r5
            if (r5 == 0) goto L80
            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r0 = r5.exceptionUX
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent r6 = r0.toastContent
            if (r6 == 0) goto L80
            java.lang.Integer r0 = r6.duration
            if (r0 == 0) goto L5d
            int r0 = r0.intValue()
            long r7 = (long) r0
            goto L5f
        L5d:
            r7 = 3000(0xbb8, double:1.482E-320)
        L5f:
            X.0vV6 r5 = new X.0vV6     // Catch: java.lang.Exception -> L76
            r10 = 0
            r5.<init>(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L76
            r4.LL = r10     // Catch: java.lang.Exception -> L76
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L76
            java.lang.Object r5 = X.C099A.LIZJ(r7, r5, r4)     // Catch: java.lang.Exception -> L76
            if (r5 != r3) goto L73
            return r3
        L70:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L76
        L73:
            kotlin.Unit r5 = (kotlin.Unit) r5     // Catch: java.lang.Exception -> L76
            goto L7d
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            LIZ()
        L7d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1750960vfK.LJI(androidx.constraintlayout.widget.ConstraintLayout, X.05Vn):java.lang.Object");
    }
}
