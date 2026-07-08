package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.CollabInfoColdStartCache$getAsync$1", f = "CollabInfoColdStartCache.kt", l = {92}, m = "invokeSuspend")
public final class C314990CWj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC315010CWl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314990CWj(String str, InterfaceC315010CWl interfaceC315010CWl, InterfaceC1364105Vn<? super C314990CWj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC315010CWl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314990CWj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "CollabInfoColdStartCache@32b1.getAsync$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 1
            if (r0 == 0) goto L19
            if (r0 != r6) goto L68
            X.C155000ia.LIZIZ(r9)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L19:
            X.C155000ia.LIZIZ(r9)
            java.lang.String r1 = r8.LLILLJJLI
            if (r1 == 0) goto L2b
            int r0 = r1.length()
            if (r0 == 0) goto L2b
            r0 = 0
        L27:
            r4 = 0
            if (r0 != 0) goto L50
            goto L2d
        L2b:
            r0 = 1
            goto L27
        L2d:
            X.01GW r0 = X.C319380CfY.LIZ     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L4c
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r0.getString(r1, r4)     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L50
            X.01GW r0 = X.C319380CfY.LIZIZ     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L4c
            com.google.gson.Gson r1 = (com.google.gson.Gson) r1     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.CollabInfo> r0 = com.ss.android.ugc.aweme.feed.model.CollabInfo.class
            java.lang.Object r0 = r1.LJII(r2, r0)     // Catch: java.lang.Throwable -> L4c
            com.ss.android.ugc.aweme.feed.model.CollabInfo r0 = (com.ss.android.ugc.aweme.feed.model.CollabInfo) r0     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L50:
            r0 = r4
        L51:
            X.1DFH r1 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0CWk r2 = new X.0CWk
            X.0CWl r1 = r8.LLILLL
            r2.<init>(r1, r0, r4)
            r8.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r8, r3, r2)
            if (r0 != r5) goto L13
            X.C1C7U.LIZIZ(r7)
            return r5
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314990CWj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
