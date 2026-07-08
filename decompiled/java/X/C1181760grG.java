package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0grG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.slash.plugin.SlashSerialLoadPlugin$onFinalChunk$2", f = "SlashSerialLoadPlugin.kt", l = {119, 121}, m = "invokeSuspend")
public final class C1181760grG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1181730grD LLILLJJLI;
    public final /* synthetic */ C1180620gpQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181760grG(C1181730grD c1181730grD, C1180620gpQ c1180620gpQ, InterfaceC1364105Vn<? super C1181760grG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1181730grD;
        this.LLILLL = c1180620gpQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1181760grG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "SlashSerialLoadPlugin@753b.onFinalChunk$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LL
            r5 = 0
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L1d
            if (r0 == r6) goto L8a
            if (r0 != r3) goto La4
            X.C155000ia.LIZIZ(r10)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r10)
            X.0grD r1 = r9.LLILLJJLI
            X.0gpQ r0 = r9.LLILLL
            com.ss.android.ugc.aweme.slash.data.PageInfo r0 = r0.LLILLL
            r1.getClass()
            if (r0 == 0) goto L4a
            com.google.gson.k r1 = r0.data
        L2d:
            X.0grO r7 = new X.0grO
            r7.<init>()
            if (r1 == 0) goto L48
            boolean r0 = r1 instanceof com.google.gson.n
            if (r0 != r6) goto L48
            r0 = 1
        L39:
            if (r0 == 0) goto L6d
            com.google.gson.n r1 = r1.LJIILIIL()
            java.lang.String r0 = "serial_load_components_time_out_ms"
            com.google.gson.k r2 = r1.LJJIIZ(r0)
            if (r2 == 0) goto L6d
            goto L4c
        L48:
            r0 = 0
            goto L39
        L4a:
            r1 = r5
            goto L2d
        L4c:
            java.lang.reflect.Type r1 = r7.getType()     // Catch: java.lang.Exception -> L69
            if (r1 != 0) goto L5b
            X.0grN r0 = new X.0grN     // Catch: java.lang.Exception -> L69
            r0.<init>()     // Catch: java.lang.Exception -> L69
            java.lang.reflect.Type r1 = r0.getType()     // Catch: java.lang.Exception -> L69
        L5b:
            X.04rF r0 = X.C1227904rF.LIZ     // Catch: java.lang.Exception -> L69
            r0.getClass()     // Catch: java.lang.Exception -> L69
            com.google.gson.Gson r0 = X.C1227904rF.LIZLLL()     // Catch: java.lang.Exception -> L69
            java.lang.Object r0 = r0.LIZLLL(r2, r1)     // Catch: java.lang.Exception -> L69
            goto L6e
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6d:
            r0 = r5
        L6e:
            com.ss.android.ugc.aweme.slash.data.SlashLoadTimeMs r0 = (com.ss.android.ugc.aweme.slash.data.SlashLoadTimeMs) r0
            if (r0 == 0) goto L87
            java.lang.Integer r0 = r0.androidTimeMs
            if (r0 == 0) goto L87
            int r0 = r0.intValue()
        L7a:
            long r0 = (long) r0
            r9.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r4) goto L8d
            X.C1C7U.LIZIZ(r8)
            return r4
        L87:
            r0 = 6000(0x1770, float:8.408E-42)
            goto L7a
        L8a:
            X.C155000ia.LIZIZ(r10)
        L8d:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0grF r1 = new X.0grF
            X.0grD r0 = r9.LLILLJJLI
            r1.<init>(r0, r5)
            r9.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r4) goto L17
            X.C1C7U.LIZIZ(r8)
            return r4
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1181760grG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
