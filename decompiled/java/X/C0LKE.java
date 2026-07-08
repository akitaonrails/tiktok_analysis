package X;

import com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput;

/* JADX INFO: renamed from: X.0LKE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LKE extends C0LTN<FrameUploadTaskInput, FrameUploadTaskOutput> {
    public final C0LKL LJIIIIZZ;
    public final C05XL<FrameUploadTaskOutput> LJIIIZ;
    public final String LJIIJ;

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIJ;
    }

    public C0LKE(C0LKL c0lkl, C099F c099f) {
        this.LJIIIIZZ = c0lkl;
        this.LJIIIZ = c099f;
        this.LJIIJ = c0lkl.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /* JADX INFO: renamed from: LJJJJJL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskInput r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0LKF
            if (r0 == 0) goto L20
            r3 = r7
            X.0LKF r3 = (X.C0LKF) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3c
        L20:
            X.0LKF r3 = new X.0LKF
            r3.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.0LKL r0 = r5.LJIIIIZZ     // Catch: java.lang.Exception -> L47
            r3.LLILLL = r1     // Catch: java.lang.Exception -> L47
            java.lang.Object r4 = r0.LJFF(r6, r3)     // Catch: java.lang.Exception -> L47
            if (r4 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L47
        L3f:
            com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput r4 = (com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput) r4     // Catch: java.lang.Exception -> L47
            X.05XL<com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput> r0 = r5.LJIIIZ     // Catch: java.lang.Exception -> L47
            r0.LJIIZILJ(r4)     // Catch: java.lang.Exception -> L47
            return r4
        L47:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Frame upload task failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "SafeFrameUploadWrapper"
            X.C201955140j.LJFF(r0, r1)
            com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput r4 = new com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Frame upload failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = ""
            java.lang.String r1 = "FAILED"
            r0 = 7105(0x1bc1, float:9.956E-42)
            r4.<init>(r1, r0, r3, r2)
            X.05XL<com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput> r0 = r5.LJIIIZ
            r0.LJIIZILJ(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKE.LJFF(com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskInput, X.05Vn):java.lang.Object");
    }
}
