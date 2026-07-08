package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01an, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.utils.VerifyLynxResourceDownload$isFilesPresent$2", f = "VerifyLynxResourceDownload.kt", l = {}, m = "invokeSuspend")
public final class C361501an extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361501an(String str, InterfaceC1364105Vn<? super C361501an> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361501an(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[ADDED_TO_REGION] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "VerifyLynxResourceDownload@2144.isFilesPresent$2"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostResource> r0 = com.bytedance.android.livesdkapi.host.IHostResource.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Exception -> L63
            com.bytedance.android.livesdkapi.host.IHostResource r1 = (com.bytedance.android.livesdkapi.host.IHostResource) r1     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = r5.LL     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = r1.Dd1(r0)     // Catch: java.lang.Exception -> L63
            r3 = 1
            if (r1 == 0) goto L24
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L24
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            if (r0 != 0) goto L5a
            X.0VSJ r2 = new X.0VSJ     // Catch: java.lang.Exception -> L63
            r2.<init>(r1)     // Catch: java.lang.Exception -> L63
            boolean r0 = r2.isDirectory()     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L49
            java.io.File[] r0 = r2.listFiles()     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L3d
            int r0 = r0.length     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L3f
            r0 = 1
            goto L40
        L3d:
            r0 = 0
            goto L45
        L3f:
            r0 = 0
        L40:
            r0 = r0 ^ 1
            if (r0 != r3) goto L3d
            r0 = 1
        L45:
            if (r0 == 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            boolean r0 = r2.exists()     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L5a
            if (r1 == 0) goto L5a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L63
            X.C1C7U.LIZIZ(r4)     // Catch: java.lang.Exception -> L63
            return r0
        L5a:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L63
            X.C1C7U.LIZIZ(r4)     // Catch: java.lang.Exception -> L63
            return r0
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1C7U.LIZIZ(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361501an.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
