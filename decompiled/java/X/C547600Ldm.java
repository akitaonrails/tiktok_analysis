package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ldm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.quota.AIGCQuotaManager$getRemainQuotaFromServer$2", f = "AIGCQuotaManager.kt", l = {99}, m = "invokeSuspend")
public final class C547600Ldm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public QuotaRequestParam LL;
    public int LLILLJJLI;
    public final /* synthetic */ Source LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C547600Ldm(Source source, InterfaceC1364105Vn<? super C547600Ldm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = source;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C547600Ldm(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r10 = r15
            java.lang.String r7 = "AIGCQuotaManager@7d8a.getRemainQuotaFromServer$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L1c
            if (r0 != r5) goto L14
            com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam r11 = r14.LL
            goto L5a
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r10)
            java.util.Map<com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam> r1 = X.C547610Ldn.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = r14.LLILLL
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r11 = r1.get(r0)
            com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam r11 = (com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam) r11
            if (r11 != 0) goto L36
            r0 = -1
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.C1C7U.LIZIZ(r7)
            return r0
        L36:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r4 = X.C09BV.LIZ()     // Catch: java.lang.Exception -> L97
            if (r4 == 0) goto L58
            java.util.List<java.lang.Long> r3 = r11.aigcIds     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = r11.jobType     // Catch: java.lang.Exception -> L97
            java.lang.String r1 = ""
            if (r2 != 0) goto L45
            r2 = r1
        L45:
            java.lang.String r0 = r11.businessScene     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L4a
            r1 = r0
        L4a:
            r14.LL = r11     // Catch: java.lang.Exception -> L97
            r14.LLILLJJLI = r5     // Catch: java.lang.Exception -> L97
            java.lang.Object r10 = r4.LJIIZILJ(r3, r2, r1, r14)     // Catch: java.lang.Exception -> L97
            if (r10 != r6) goto L5d
            X.C1C7U.LIZIZ(r7)
            return r6
        L58:
            r10 = 0
            goto L5f
        L5a:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L95
        L5d:
            com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult r10 = (com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult) r10     // Catch: java.lang.Exception -> L95
        L5f:
            com.ss.android.ugc.aweme.aikit.api.create.QuotaCache r8 = new com.ss.android.ugc.aweme.aikit.api.create.QuotaCache     // Catch: java.lang.Exception -> L95
            X.0Ldn r0 = X.C547610Ldn.LIZ     // Catch: java.lang.Exception -> L95
            r0.getClass()     // Catch: java.lang.Exception -> L95
            java.lang.String r9 = X.C547610Ldn.LIZ()     // Catch: java.lang.Exception -> L95
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = r14.LLILLL     // Catch: java.lang.Exception -> L95
            java.lang.String r12 = r0.getSource()     // Catch: java.lang.Exception -> L95
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L95
            java.lang.Long r13 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L95
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L95
            java.util.Map<com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aikit.api.create.QuotaCache> r1 = X.C547610Ldn.LJ     // Catch: java.lang.Exception -> L95
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = r14.LLILLL     // Catch: java.lang.Exception -> L95
            r1.put(r0, r8)     // Catch: java.lang.Exception -> L95
            X.C547610Ldn.LIZLLL()     // Catch: java.lang.Exception -> L95
            if (r10 == 0) goto L8c
            java.lang.Integer r0 = r10.quotaRemain     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L8c
            goto L90
        L8c:
            java.lang.Integer r0 = r11.expireDefaultValue     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto Lab
        L90:
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L95
            goto La3
        L95:
            r0 = move-exception
            goto L98
        L97:
            r0 = move-exception
        L98:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Integer r0 = r11.expireDefaultValue
            if (r0 == 0) goto Lab
            int r0 = r0.intValue()
        La3:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.C1C7U.LIZIZ(r7)
            return r0
        Lab:
            r0 = 5
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C547600Ldm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
