package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoRTCDataParserKt$fetchClientEnv$2", f = "TakoRTCDataParser.kt", l = {158}, m = "invokeSuspend")
public final class C596540NaW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AgentClientEnv>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C596540NaW(InterfaceC1364105Vn<? super C596540NaW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C596540NaW c596540NaW = new C596540NaW(interfaceC1364105Vn);
        c596540NaW.LLILLJJLI = obj;
        return c596540NaW;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r18
            java.lang.String r3 = "TakoRTCDataParserKt@5a78.fetchClientEnv$2"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            r4 = r17
            int r0 = r4.LL
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L16
            goto L3f
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r5)
            java.lang.Class<com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService> r7 = com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            r12 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L5a
            com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService r0 = (com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService) r0     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L3d
            r4.LL = r1     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r5 = r0.LIZIZ(r4)     // Catch: java.lang.Throwable -> L5a
            if (r5 != r2) goto L42
            X.C1C7U.LIZIZ(r3)
            return r2
        L3d:
            r1 = r6
            goto L56
        L3f:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L5a
        L42:
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r5 = (com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv) r5     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L3d
            r11 = 0
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition r14 = com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPosition.FEED_VOICE     // Catch: java.lang.Throwable -> L5a
            r16 = 383(0x17f, float:5.37E-43)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r13 = r6
            r15 = r6
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv.LIZ(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L5a
        L56:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L5a
            goto L66
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L66:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L6d
            r6 = r1
        L6d:
            X.C1C7U.LIZIZ(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C596540NaW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AgentClientEnv> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
