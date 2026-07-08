package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$initTakoAgent$1$1$1", f = "TakoServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C604550NnR extends C09AX implements Function2<AgentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv>, Object> {
    public /* synthetic */ Object LL;

    public C604550NnR(InterfaceC1364105Vn<? super C604550NnR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C604550NnR c604550NnR = new C604550NnR(interfaceC1364105Vn);
        c604550NnR.LL = obj;
        return c604550NnR;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[PHI: r9
      0x005c: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:12:0x005a, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[PHI: r9
      0x0062: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:12:0x005a, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            java.lang.String r7 = "TakoServiceImpl@d56d.initTakoAgent$1$1$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r21)
            r0 = r20
            java.lang.Object r8 = r0.LL
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r8 = (com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv) r8
            java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r0 = com.ss.android.ugc.aweme.IAccountService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.IAccountService r0 = (com.ss.android.ugc.aweme.IAccountService) r0
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.profile.model.User r6 = r0.getCurUser()
        L2b:
            java.util.Locale r5 = X.C838600Wv4.LIZ()
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r3 = X.C844470XAv.LIZ()
            X.12Lp r0 = X.C19741112Lp.LIZ
            r0.getClass()
            boolean r2 = X.C19741112Lp.LJFF(r3)
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = X.C19741112Lp.LIZLLL(r3, r0)
            boolean r3 = X.C19741112Lp.LJ(r3)
            java.lang.String r0 = ""
            if (r6 == 0) goto L59
            java.lang.String r9 = r6.getSecUid()
            if (r9 != 0) goto L5c
        L59:
            r9 = r0
            if (r6 == 0) goto L62
        L5c:
            java.lang.String r10 = r6.getNickname()
            if (r10 != 0) goto L63
        L62:
            r10 = r0
        L63:
            java.lang.String r11 = r5.toLanguageTag()
            java.lang.String r12 = r4.getID()
            X.09GR r0 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.Companion
            r0.getClass()
            if (r2 == 0) goto L99
            com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r2 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.GRANTED
        L74:
            if (r1 == 0) goto L96
            com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.GRANTED
        L78:
            if (r3 == 0) goto L93
            com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r0 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.GRANTED
        L7c:
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientPermission r13 = new com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientPermission
            r13.<init>(r1, r2, r0)
            r16 = 0
            r14 = 0
            r19 = 480(0x1e0, float:6.73E-43)
            r17 = r16
            r18 = r16
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r0 = com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv.LIZ(r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            X.C1C7U.LIZIZ(r7)
            return r0
        L93:
            com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r0 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.DENIED
            goto L7c
        L96:
            com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.DENIED
            goto L78
        L99:
            com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState r2 = com.ss.android.ugc.aweme.tako.ccl.model.api.PermissionState.DENIED
            goto L74
        L9c:
            r6 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C604550NnR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AgentClientEnv agentClientEnv, InterfaceC1364105Vn<? super AgentClientEnv> interfaceC1364105Vn) {
        return ((a) create(agentClientEnv, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
