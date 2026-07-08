package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeUploadResponse;
import com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeUploadResponseData;

/* JADX INFO: renamed from: X.067C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C067C {
    public static final C067C LIZ = new C067C();

    public static C12826050e LIZ(ProbeUploadResponse probeUploadResponse, boolean z) {
        ProbeUploadResponseData probeUploadResponseData;
        if (z && probeUploadResponse != null) {
            if (!TextUtils.equals("success", probeUploadResponse.resultCode)) {
                return new C12826050e("signal_unavailable", null, false, null, 12);
            }
            Number number = probeUploadResponse.factor;
            if (number == null && ((probeUploadResponseData = probeUploadResponse.data) == null || (number = probeUploadResponseData.factor) == null)) {
                return new C12826050e("signal_unavailable", null, false, null, 12);
            }
            return new C12826050e("success", number, true, null, 8);
        }
        return new C12826050e("network_error", null, false, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: all -> 0x0067, CancellationException -> 0x0081, TryCatch #2 {CancellationException -> 0x0081, all -> 0x0067, blocks: (B:20:0x004a, B:21:0x004d, B:24:0x0053, B:28:0x005c, B:30:0x0062, B:15:0x0032, B:17:0x003d), top: B:42:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.AnonymousClass1489 r9, java.lang.String r10, X.InterfaceC1364105Vn<? super X.C12826050e> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C067E
            if (r0 == 0) goto L21
            r5 = r11
            X.067E r5 = (X.C067E) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L4a
        L21:
            X.067E r5 = new X.067E
            r5.<init>(r8, r11)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r2)
            X.067G r0 = com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeApi.LIZ     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            r0.getClass()     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeApi r2 = X.C067G.LIZ(r10)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            if (r2 == 0) goto L50
            com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeUploadRequest r0 = X.C148F.LIZ(r9)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            java.lang.Object r2 = r2.riskAssessment(r0, r5)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            if (r2 != r4) goto L4d
            return r4
        L4a:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
        L4d:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            goto L51
        L50:
            r2 = r1
        L51:
            if (r2 == 0) goto L57
            T r1 = r2.LIZIZ     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeUploadResponse r1 = (com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeUploadResponse) r1     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
        L57:
            if (r2 == 0) goto L5a
            goto L5c
        L5a:
            r3 = 0
            goto L62
        L5c:
            boolean r0 = r2.LIZJ()     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            if (r0 != r3) goto L5a
        L62:
            X.050e r2 = LIZ(r1, r3)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L81
            return r2
        L67:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 == 0) goto L7e
            java.lang.String r3 = "network_error"
        L71:
            X.050e r2 = new X.050e
            r4 = 0
            r5 = 0
            java.lang.String r6 = r1.getMessage()
            r7 = 4
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L7e:
            java.lang.String r3 = "unknown_error"
            goto L71
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C067C.LIZJ(X.1489, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c5 -> B:12:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00cd -> B:12:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f6 -> B:12:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.AnonymousClass1489 r19, java.lang.String r20, java.lang.String r21, X.C067F r22, X.InterfaceC1364105Vn<? super X.C1165204h8> r23) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C067C.LIZIZ(X.1489, java.lang.String, java.lang.String, X.067F, X.05Vn):java.lang.Object");
    }
}
