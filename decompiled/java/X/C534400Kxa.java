package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.social.util.AITheaterDMNavigateUtil$jumpFromActionBar$2", f = "AITheaterDMNavigateUtil.kt", l = {140}, m = "invokeSuspend")
public final class C534400Kxa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCSocialModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534400Kxa(AIGCSocialModel aIGCSocialModel, Context context, InterfaceC1364105Vn<? super C534400Kxa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCSocialModel;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534400Kxa(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r25
            java.lang.String r6 = "AITheaterDMNavigateUtil@cd10.jumpFromActionBar$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            r4 = r24
            int r0 = r4.LL
            r9 = 0
            r3 = 1
            if (r0 == 0) goto L75
            if (r0 != r3) goto Laf
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L1e:
            X.C189200o6.m1boximpl(r0)
        L21:
            android.content.Context r0 = r4.LLILLL
            android.app.Activity r3 = X.C1388190mED.LIZ(r0)
            if (r3 == 0) goto L6f
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel r2 = r4.LLILLJJLI
            X.0LgH r0 = X.C549150LgH.LIZ
            r0.getClass()
            X.0M7j r0 = com.ss.android.ugc.aweme.theater.service.AITheaterProfileService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.theater.service.AITheaterProfileService r1 = X.C563290M7j.LIZ()
            if (r1 == 0) goto L6f
            com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel r7 = new com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel
            X.0LQY r8 = X.C0LQY.AI_THEATER
            r19 = 0
            r20 = 4094(0xffe, float:5.737E-42)
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.0KsE r12 = new X.0KsE
            r13 = 1
            r0 = 10001(0x2711, float:1.4014E-41)
            java.lang.Integer r16 = X.C2286608xc.LJ(r0)
            r23 = 838(0x346, float:1.174E-42)
            r14 = r9
            r15 = r9
            r17 = r2
            r18 = r7
            r20 = r13
            r21 = r19
            r22 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.Y8(r3, r12, r9)
        L6f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L75:
            X.C155000ia.LIZIZ(r1)
            X.0LgH r0 = X.C549150LgH.LIZ
            r0.getClass()
            X.0M7j r0 = com.ss.android.ugc.aweme.theater.service.AITheaterProfileService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.theater.service.AITheaterProfileService r0 = X.C563290M7j.LIZ()
            if (r0 == 0) goto L21
            X.0Lir r2 = r0.g9()
            if (r2 == 0) goto L21
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel r0 = r4.LLILLJJLI
            java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r0 = r0.selfCameoInfo
            if (r0 == 0) goto La0
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r0
            if (r0 == 0) goto La0
            java.lang.String r1 = r0.uid
            if (r1 != 0) goto La2
        La0:
            java.lang.String r1 = ""
        La2:
            r4.LL = r3
            r0 = 0
            java.lang.Object r0 = r2.LJIILIIL(r1, r0, r9, r4)
            if (r0 != r5) goto L1e
            X.C1C7U.LIZIZ(r6)
            return r5
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C534400Kxa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
