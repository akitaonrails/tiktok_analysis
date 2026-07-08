package X;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0MMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567250MMp extends C1D7S<C567230MMn, C567180MMi> {
    public static final /* synthetic */ int LIZIZ = 0;

    static {
        new C567120MMc();
    }

    public static CancellationException LIZJ(int i, String str) {
        C0XIR c0xir = new C0XIR(i);
        c0xir.setErrorMsg(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download failed with code: ");
        sbLIZ.append(i);
        sbLIZ.append(", message: ");
        sbLIZ.append(str);
        CancellationException cancellationException = new CancellationException(C2188811AlT.LIZIZ(sbLIZ));
        cancellationException.initCause(c0xir);
        return cancellationException;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    @Override // X.C1D7S
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C567230MMn r13, X.InterfaceC1364105Vn<? super X.C567180MMi> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C567270MMr
            if (r0 == 0) goto L83
            r4 = r14
            X.0MMr r4 = (X.C567270MMr) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r6 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            java.lang.String r2 = "DownloadVideoTask"
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L89
            X.C155000ia.LIZIZ(r6)
        L24:
            X.0Kxs r1 = X.C534580Kxs.LIZIZ
            java.lang.String r0 = "Download operation completed successfully"
            X.C201955140j.LIZLLL(r1, r2, r0)
            return r6
        L2c:
            X.C155000ia.LIZIZ(r6)
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r6 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0
            r9 = 0
            if (r0 == 0) goto L91
            X.0MLm r0 = r0.getStoryService()
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader r8 = r0.LIZJ()
            if (r8 == 0) goto L91
            X.0Kxs r10 = X.C534580Kxs.LIZIZ
            java.lang.String r0 = "Starting video download task"
            X.C201955140j.LIZLLL(r10, r2, r0)
            java.lang.StringBuilder r11 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AB test status for high priority thread optimization: "
            r11.append(r0)
            X.0C64 r7 = X.C0C64.LJIILLIIL()
            r6 = 31744(0x7c00, float:4.4483E-41)
            r1 = 0
            java.lang.String r0 = "download_high_priority_thread_optimization"
            boolean r0 = r7.LJIIIZ(r6, r0, r3, r1)
            r11.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r11)
            X.C201955140j.LIZLLL(r10, r2, r0)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0MMq r0 = new X.0MMq
            r0.<init>(r12, r13, r8, r9)
            r4.LLILLL = r3
            java.lang.Object r6 = X.C23250099c.LJI(r4, r1, r0)
            if (r6 != r5) goto L24
            return r5
        L83:
            X.0MMr r4 = new X.0MMr
            r4.<init>(r12, r14)
            goto L12
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L91:
            X.0MMi r2 = new X.0MMi
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            r1 = -1
            java.lang.String r0 = "downloader is null"
            java.util.concurrent.CancellationException r1 = LIZJ(r1, r0)
            java.lang.String r0 = ""
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567250MMp.LIZIZ(X.0MMn, X.05Vn):java.lang.Object");
    }
}
