package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.INetworkApi;

/* JADX INFO: renamed from: X.0O2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612900O2e {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public volatile C0X9S<TypedInput> LIZLLL;
    public final INetworkApi LJ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C592570NLz
            if (r0 == 0) goto L22
            r8 = r10
            X.0NLz r8 = (X.C592570NLz) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r7 = r8.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r4 = 0
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            goto L51
        L22:
            X.0NLz r8 = new X.0NLz
            r8.<init>(r9, r10)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r7)
            com.bytedance.ttnet.INetworkApi r2 = r9.LJ     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            java.lang.String r1 = r9.LIZJ     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            r0 = -1
            X.0X9S r0 = r2.downloadFile(r5, r0, r1, r4)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            r9.LIZLLL = r0     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            X.0X9S<com.bytedance.retrofit2.mime.TypedInput> r1 = r9.LIZLLL     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            if (r1 == 0) goto L78
            r0 = 721(0x2d1, float:1.01E-42)
            kotlin.jvm.internal.AFwS240S0000000_9 r0 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            r8.LLILLL = r3     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            java.lang.Object r7 = X.C2374109Rz.LIZIZ(r1, r0, r8)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            if (r7 != r6) goto L54
            return r6
        L51:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
        L54:
            com.bytedance.retrofit2.mime.TypedInput r7 = (com.bytedance.retrofit2.mime.TypedInput) r7     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            if (r7 == 0) goto L78
            X.0psx r3 = X.C1528770psx.LIZ     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            java.lang.String r2 = r9.LIZ     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            java.lang.String r1 = r9.LIZIZ     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            java.lang.String r0 = r9.LIZJ     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            r3.LIZJ(r7, r2, r1, r0)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            X.08S3 r2 = X.C08S3.LIZ     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            r1.<init>()     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            java.lang.String r0 = "resource_req"
            r1.put(r0, r5)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            java.lang.String r0 = "tm_preload_perf"
            r2.getClass()     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            X.C08S3.LIZ(r0, r4, r1, r4)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            goto L7f
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L82
            return r0
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L82:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0X9S<com.bytedance.retrofit2.mime.TypedInput> r0 = r9.LIZLLL
            if (r0 == 0) goto L8d
            r0.cancel()
        L8d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C612900O2e.LIZ(X.05Vn):java.lang.Object");
    }

    public C612900O2e(String str, String str2, String str3, String str4) {
        this.LIZ = str2;
        this.LIZIZ = str3;
        this.LIZJ = str4;
        synchronized (C1339000kws.LIZ()) {
        }
        this.LJ = (INetworkApi) C1515120pWw.LJIIIZ(INetworkApi.class, str);
    }
}
