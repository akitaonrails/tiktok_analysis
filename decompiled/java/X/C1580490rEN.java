package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sidebar.SidebarLegoTask$run$1", f = "SidebarLegoTask.kt", l = {42}, m = "invokeSuspend")
public final class C1580490rEN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1580490rEN(InterfaceC1364105Vn<? super C1580490rEN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1580490rEN(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #0 {Exception -> 0x007a, blocks: (B:19:0x005a, B:20:0x005d, B:21:0x005f, B:23:0x0076, B:9:0x001c, B:11:0x0028, B:13:0x002e, B:15:0x0043), top: B:28:0x000c }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r5 = "SidebarLegoTask@fe23.run$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LL
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L11
            goto L5a
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r13)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()     // Catch: java.lang.Exception -> L7a
            X.0XPy r0 = (X.AbstractC848400XPy) r0     // Catch: java.lang.Exception -> L7a
            boolean r0 = r0.isLogin()     // Catch: java.lang.Exception -> L7a
            if (r0 != 0) goto L2e
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L7a
            X.C1C7U.LIZIZ(r5)     // Catch: java.lang.Exception -> L7a
            return r0
        L2e:
            X.0rEI r0 = X.C1580440rEI.LIZ     // Catch: java.lang.Exception -> L7a
            r0.LIZ()     // Catch: java.lang.Exception -> L7a
            X.0rER r0 = com.ss.android.ugc.aweme.sidebar.data.SidebarApi.LIZ     // Catch: java.lang.Exception -> L7a
            r0.getClass()     // Catch: java.lang.Exception -> L7a
            X.01GW<com.ss.android.ugc.aweme.sidebar.data.SidebarApi> r0 = X.C1580530rER.LIZIZ     // Catch: java.lang.Exception -> L7a
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L7a
            com.ss.android.ugc.aweme.sidebar.data.SidebarApi r2 = (com.ss.android.ugc.aweme.sidebar.data.SidebarApi) r2     // Catch: java.lang.Exception -> L7a
            r13 = 0
            if (r2 == 0) goto L5f
            com.ss.android.ugc.aweme.sidebar.data.SidebarApi$SidebarConfigRequestBody r1 = new com.ss.android.ugc.aweme.sidebar.data.SidebarApi$SidebarConfigRequestBody     // Catch: java.lang.Exception -> L7a
            X.0rEO r0 = X.EnumC1580500rEO.COLD_START     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = r0.getType()     // Catch: java.lang.Exception -> L7a
            r1.<init>(r0, r13)     // Catch: java.lang.Exception -> L7a
            r12.LL = r3     // Catch: java.lang.Exception -> L7a
            java.lang.Object r13 = r2.getSidebarConfig(r1, r12)     // Catch: java.lang.Exception -> L7a
            if (r13 != r4) goto L5d
            X.C1C7U.LIZIZ(r5)
            return r4
        L5a:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Exception -> L7a
        L5d:
            com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig r13 = (com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig) r13     // Catch: java.lang.Exception -> L7a
        L5f:
            X.0rEI r1 = X.C1580440rEI.LIZ     // Catch: java.lang.Exception -> L7a
            X.0rEO r0 = X.EnumC1580500rEO.COLD_START     // Catch: java.lang.Exception -> L7a
            r1.LIZLLL(r0, r13)     // Catch: java.lang.Exception -> L7a
            java.lang.Class<com.ss.android.ugc.aweme.minis.api.preload.IMinisFeedSidebarPreloadService> r6 = com.ss.android.ugc.aweme.minis.api.preload.IMinisFeedSidebarPreloadService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7a
            com.ss.android.ugc.aweme.minis.api.preload.IMinisFeedSidebarPreloadService r0 = (com.ss.android.ugc.aweme.minis.api.preload.IMinisFeedSidebarPreloadService) r0     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L7e
            r0.LIZ(r13)     // Catch: java.lang.Exception -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1580490rEN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1580490rEN(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
