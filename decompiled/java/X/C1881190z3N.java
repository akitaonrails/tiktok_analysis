package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0z3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.commonhost.CommonMixPageHost$onRequestDSL$1", f = "CommonMixPageHost.kt", l = {}, m = "invokeSuspend")
public final class C1881190z3N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1881200z3O LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881190z3N(C1881200z3O c1881200z3O, InterfaceC1364105Vn<? super C1881190z3N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1881200z3O;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1881190z3N(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:3:0x0013, B:6:0x0024, B:8:0x002a, B:11:0x0040, B:13:0x0046, B:20:0x0073, B:14:0x0055, B:17:0x0064, B:19:0x006a, B:21:0x0079), top: B:32:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:3:0x0013, B:6:0x0024, B:8:0x002a, B:11:0x0040, B:13:0x0046, B:20:0x0073, B:14:0x0055, B:17:0x0064, B:19:0x006a, B:21:0x0079), top: B:32:0x0013 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r6 = "CommonMixPageHost"
            java.lang.String r4 = ""
            java.lang.String r7 = "CommonMixPageHost@95e8.onRequestDSL$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            X.0z3O r5 = r8.LL
            r3 = -1
            r2 = 0
            X.01GW r0 = r5.LLJILLL     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L9b
            X.0KYM r1 = (X.C0KYM) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "dsl_data"
            java.lang.String r0 = r1.LIZIZ(r0)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L24
            r0 = r4
        L24:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L64
            java.lang.String r0 = "dsl_data is empty"
            X.C20441214yg.LIZIZ(r6, r0)     // Catch: java.lang.Throwable -> L9b
            X.01GW r0 = r5.LLJILLL     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L9b
            X.0KYM r1 = (X.C0KYM) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "dsl_data_id"
            java.lang.String r1 = r1.LIZIZ(r0)     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L40
            r1 = r4
        L40:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L55
            java.lang.String r0 = "dsl_data_id is empty"
            X.C20441214yg.LIZIZ(r6, r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "both dsl_data and dsl_data_id empty"
            X.0z4F r0 = X.C1881030z37.LIZ(r3, r0)     // Catch: java.lang.Throwable -> L9b
            r5.LJIJ(r0, r2)     // Catch: java.lang.Throwable -> L9b
            goto L73
        L55:
            com.bytedance.android.livesdk.livesetting.game.partnership.GameLiveCommonMixHostDSLBundle r0 = com.bytedance.android.livesdk.livesetting.game.partnership.GameLiveCommonMixHostDSLBundle.INSTANCE     // Catch: java.lang.Throwable -> L9b
            java.util.Map r0 = r0.getDSLBundle()     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L64
            r0 = r4
        L64:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L79
            java.lang.String r0 = "dsl is empty"
            X.0z4F r0 = X.C1881030z37.LIZ(r3, r0)     // Catch: java.lang.Throwable -> L9b
            r5.LJIJ(r0, r2)     // Catch: java.lang.Throwable -> L9b
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L9b
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L9b
            goto La7
        L79:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "dsl"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r5.LJIL(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L9b
            X.0z4O r0 = new X.0z4O     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L9b
            X.0z4F r0 = X.C1881030z37.LIZIZ(r0)     // Catch: java.lang.Throwable -> L9b
            r5.LJIJ(r0, r2)     // Catch: java.lang.Throwable -> L9b
            goto L73
        L9b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        La7:
            X.0z3O r1 = r8.LL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto Lbd
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto Lb6
            r4 = r0
        Lb6:
            X.0z4F r0 = X.C1881030z37.LIZ(r3, r4)
            r1.LJIJ(r0, r2)
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1881190z3N.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
