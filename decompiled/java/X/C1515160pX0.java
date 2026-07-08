package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import java.util.Map;

/* JADX INFO: renamed from: X.0pX0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515160pX0 implements IHostNetworkDepend {
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final Map<String, Object> getAPIParams() {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final boolean usePiperData(C1059860dge c1059860dge) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0pX4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.bytedance.retrofit2.Retrofit] */
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit createRetrofit(java.lang.String r9, boolean r10) throws java.lang.Throwable {
        /*
            r8 = this;
            X.0pX7 r4 = new X.0pX7
            X.0pX4 r3 = new X.0pX4
            r3.<init>()
            r3.LIZLLL(r9)
            X.09Dj r0 = X.C2336109Dj.LJI()
            r3.LIZIZ(r0)
            X.09aE r0 = X.C2396409aE.LIZIZ()
            r3.LIZ(r0)
            X.0otQ r0 = new X.0otQ
            r0.<init>()
            r3.LJI = r0
            com.bytedance.ttnet.retrofit.SsInterceptor r0 = new com.bytedance.ttnet.retrofit.SsInterceptor
            r0.<init>()
            r3.LIZJ(r0)
            if (r10 == 0) goto L3d
            X.0oyT r0 = new X.0oyT
            r0.<init>()
        L2e:
            r3.LIZIZ = r0
            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.C0X15.LIZ()
            boolean r0 = r0.enable
            r7 = 0
            java.lang.String r6 = "dzBzEgAjS8/YVFkiQFyNY/5YvWla6T/3ebr9FfsTWPSytLIGQqvopaavmHhK6U2ck7331merwQBhsk+E45c="
            r5 = 0
            if (r0 == 0) goto L7c
            goto L43
        L3d:
            X.0pXI r0 = new X.0pXI
            r0.<init>()
            goto L2e
        L43:
            com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.on(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "clientProvider"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L78
            com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L78
            X.0p0G r0 = (X.InterfaceC1494860p0G) r0     // Catch: java.lang.Throwable -> L78
            X.0oyU r2 = r0.get()     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "com.ss.android.ugc.aweme.app.api.OkClient"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L6e
            boolean r0 = r2 instanceof X.C1493780oyW     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L6e
            goto L7c
        L6e:
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L78
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L78
            com.bytedance.retrofit2.Retrofit r3 = X.C2204961BRm.LLLLIIIILLL(r3, r0)     // Catch: java.lang.Throwable -> L78
            goto Lad
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7c:
            X.0WZX r0 = new X.0WZX
            r0.<init>(r6, r7)
            com.bytedance.retrofit2.Retrofit r3 = X.C2204961BRm.LLLLIIIILLL(r3, r0)
            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
            if (r1 == 0) goto Lad
            com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor
            r0.<init>()
            r1.add(r0)
            java.util.List<X.07d9> r0 = r3.LJIIIIZZ
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            X.07d9 r2 = (X.InterfaceC1904907d9) r2
            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
            com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor r0 = new com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor
            r0.<init>(r2)
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r5, r0)
            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
            com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor r0 = new com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor
            r0.<init>()
            r1.add(r0)
        Lad:
            r4.<init>(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1515160pX0.createRetrofit(java.lang.String, boolean):com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit");
    }
}
