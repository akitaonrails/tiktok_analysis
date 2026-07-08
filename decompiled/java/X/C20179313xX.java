package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.13xX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20179313xX implements InterfaceC20175613ww {
    @Override // X.InterfaceC20175613ww
    public final String getStrategyName() {
        return "SmartCover";
    }

    @Override // X.InterfaceC20175613ww
    public final long getTimeout() {
        return 30000L;
    }

    @Override // X.InterfaceC20175613ww
    public final boolean LIZIZ(C1457070o1J c1457070o1J) {
        if (c1457070o1J.LJIIIZ && c1457070o1J.LJIIJ != null && c1457070o1J.LJIIJJI != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20175613ww
    public final Object LIZ(C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C20179213xW(this, c1457070o1J, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005f -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<X.C20180613xk> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C20180013xe
            if (r0 == 0) goto L26
            r6 = r11
            X.13xe r6 = (X.C20180013xe) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 1
            if (r0 == 0) goto L38
            if (r0 != r5) goto L30
            X.13xk r8 = r6.LLILLJJLI
            java.lang.Object r4 = r6.LL
            java.util.Iterator r4 = (java.util.Iterator) r4
            goto L2c
        L26:
            X.13xe r6 = new X.13xe
            r6.<init>(r9, r11)
            goto L12
        L2c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5e
            goto L3f
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r1)
            java.util.Iterator r4 = r10.iterator()
        L3f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r8 = r4.next()
            X.13xk r8 = (X.C20180613xk) r8
            X.13xl r1 = X.C20180713xl.LIZ     // Catch: java.lang.Exception -> L5e
            X.13xd r0 = r8.LIZ     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Exception -> L5e
            r6.LL = r4     // Catch: java.lang.Exception -> L5e
            r6.LLILLJJLI = r8     // Catch: java.lang.Exception -> L5e
            r6.LLILZIL = r5     // Catch: java.lang.Exception -> L5e
            java.lang.Object r0 = r1.LIZIZ(r0, r6)     // Catch: java.lang.Exception -> L5e
            if (r0 != r7) goto L3f
            goto L7e
        L5e:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0MHB r2 = X.C0MHB.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Failed to cleanup bitmap candidate: "
            r1.append(r0)
            X.13xd r0 = r8.LIZ
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "SmartCoverStrategy"
            X.C201955140j.LJIIIZ(r2, r0, r1, r3)
            goto L3f
        L7e:
            return r7
        L7f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179313xX.LIZJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<X.C20180613xk> r10, android.graphics.Bitmap r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C20179813xc
            if (r0 == 0) goto L28
            r6 = r12
            X.13xc r6 = (X.C20179813xc) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r1 = r6.LLILZ
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r5 = 1
            if (r0 == 0) goto L3a
            if (r0 != r5) goto L32
            X.13xk r8 = r6.LLILLL
            java.lang.Object r4 = r6.LLILLJJLI
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r11 = r6.LL
            goto L2e
        L28:
            X.13xc r6 = new X.13xc
            r6.<init>(r9, r12)
            goto L12
        L2e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6c
            goto L41
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.C155000ia.LIZIZ(r1)
            java.util.Iterator r4 = r10.iterator()
        L41:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r8 = r4.next()
            X.13xk r8 = (X.C20180613xk) r8
            X.13xd r0 = r8.LIZ
            android.graphics.Bitmap r0 = r0.LIZ()
            if (r0 == r11) goto L41
            X.13xl r1 = X.C20180713xl.LIZ     // Catch: java.lang.Exception -> L6a
            X.13xd r0 = r8.LIZ     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Exception -> L6a
            r6.LL = r11     // Catch: java.lang.Exception -> L6a
            r6.LLILLJJLI = r4     // Catch: java.lang.Exception -> L6a
            r6.LLILLL = r8     // Catch: java.lang.Exception -> L6a
            r6.LLILZLL = r5     // Catch: java.lang.Exception -> L6a
            java.lang.Object r0 = r1.LIZIZ(r0, r6)     // Catch: java.lang.Exception -> L6a
            if (r0 != r7) goto L41
            goto L8c
        L6a:
            r3 = move-exception
            goto L6d
        L6c:
            r3 = move-exception
        L6d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0MHB r2 = X.C0MHB.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Failed to cleanup non-best bitmap candidate: "
            r1.append(r0)
            X.13xd r0 = r8.LIZ
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "SmartCoverStrategy"
            X.C201955140j.LJIIIZ(r2, r0, r1, r3)
            goto L41
        L8c:
            return r7
        L8d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179313xX.LIZLLL(java.util.List, android.graphics.Bitmap, X.05Vn):java.lang.Object");
    }
}
