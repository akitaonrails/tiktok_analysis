package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.recording.js.RecordingJsApi;

/* JADX INFO: renamed from: X.01wW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C496201wW {
    public final RecordingJsApi LIZ;

    public C496201wW() {
        RecordingJsApi.LIZ.getClass();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LIZJ(C2336109Dj.LJI());
        this.LIZ = (RecordingJsApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(RecordingJsApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Object>>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C496301wX
            if (r0 == 0) goto L20
            r3 = r8
            X.01wX r3 = (X.C496301wX) r3
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
            X.01wX r3 = new X.01wX
            r3.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.recording.js.RecordingJsApi r0 = r5.LIZ     // Catch: java.lang.Throwable -> L74
            r3.LLILLL = r1     // Catch: java.lang.Throwable -> L74
            java.lang.Object r4 = r0.fetchJsRules(r6, r7, r3)     // Catch: java.lang.Throwable -> L74
            if (r4 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L74
        L3f:
            com.ss.android.ugc.aweme.recording.js.IABRecordingJsUrlFeatureResponse r4 = (com.ss.android.ugc.aweme.recording.js.IABRecordingJsUrlFeatureResponse) r4     // Catch: java.lang.Throwable -> L74
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L79
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = r4.features     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L79
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L74
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L74
        L54:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L79
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L74
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L74
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L74
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L54
            if (r0 == 0) goto L54
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L74
            goto L54
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = 0
        L79:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496201wW.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
