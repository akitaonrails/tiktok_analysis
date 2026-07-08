package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository$fetchDraftCard$result$1", f = "EffectProfileListRepository.kt", l = {131, 137}, m = "invokeSuspend")
public final class C317940CdE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C317950CdF>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C318050CdP LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317940CdE(C318050CdP c318050CdP, InterfaceC1364105Vn<? super C317940CdE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c318050CdP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317940CdE(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(7:6|7|(1:9)|10|(1:14)|15|16)(2:42|43))(1:21))(2:17|(2:19|20))|22|44|23|(3:30|(1:32)(1:40)|(2:36|(2:38|39)(3:41|7|(0))))|10|(2:12|14)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r4 = "EffectProfileListRepository@4ea9.fetchDraftCard$result$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LLILLJJLI
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L4e
            if (r0 == r1) goto L5f
            if (r0 != r3) goto Lb5
            java.lang.Object r2 = r11.LL
            java.util.List r2 = (java.util.List) r2
            X.C155000ia.LIZIZ(r12)
        L1a:
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L1f
            r12 = r2
        L1f:
            X.0CdF r3 = new X.0CdF
            int r2 = r12.size()
            X.0CdP r0 = r11.LLILLL
            r0.getClass()
            java.lang.Object r0 = X.C13LP.LJJJLL(r12)
            com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r0 = (com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo) r0
            if (r0 == 0) goto L38
            java.lang.String r1 = X.C1736660vIG.LIZ(r0, r1)
            if (r1 != 0) goto L3a
        L38:
            java.lang.String r1 = ""
        L3a:
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r1)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r2, r0)
            X.C1C7U.LIZIZ(r4)
            return r3
        L4e:
            X.C155000ia.LIZIZ(r12)
            X.0CdP r0 = r11.LLILLL
            r11.LLILLJJLI = r1
            java.lang.Object r12 = r0.LIZIZ(r11)
            if (r12 != r2) goto L62
            X.C1C7U.LIZIZ(r4)
            return r2
        L5f:
            X.C155000ia.LIZIZ(r12)
        L62:
            java.util.List r12 = (java.util.List) r12
            X.0CdP r0 = r11.LLILLL
            X.0CdU r0 = r0.LIZ
            r0.context()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L72
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L72
            goto L77
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L77:
            if (r0 != 0) goto L80
            boolean r0 = X.C306690C0l.LIZ()
            if (r0 == 0) goto L80
            goto L1f
        L80:
            X.0CdP r0 = r11.LLILLL
            r0.getClass()
            java.lang.Class<com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService> r5 = com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService r0 = (com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService) r0
            if (r0 == 0) goto Laf
            X.0Cdk r0 = r0.draftService()
        L99:
            if (r0 == 0) goto L1f
            X.0CdY r0 = r0.LJIIJ()
            if (r0 == 0) goto L1f
            r11.LL = r12
            r11.LLILLJJLI = r3
            java.lang.Object r0 = r0.LIZIZ(r12, r11)
            if (r0 != r2) goto Lb1
            X.C1C7U.LIZIZ(r4)
            return r2
        Laf:
            r0 = 0
            goto L99
        Lb1:
            r2 = r12
            r12 = r0
            goto L1a
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317940CdE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C317950CdF> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
