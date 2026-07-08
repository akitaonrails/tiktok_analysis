package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot$showFailView$4", f = "AITheaterSocialGeneratingMessageListProtocol.kt", l = {720, 722}, m = "invokeSuspend")
public final class C554860LpU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCSocialModel LLILLJJLI;
    public final /* synthetic */ AITheaterSocialGeneratingReusedUISlot LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554860LpU(AIGCSocialModel aIGCSocialModel, AITheaterSocialGeneratingReusedUISlot aITheaterSocialGeneratingReusedUISlot, String str, Long l, InterfaceC1364105Vn<? super C554860LpU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCSocialModel;
        this.LLILLL = aITheaterSocialGeneratingReusedUISlot;
        this.LLILZ = str;
        this.LLILZIL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C554860LpU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r9 = r14
            java.lang.String r5 = "AITheaterSocialGeneratingReusedUISlot@aa9e.showFailView$4"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r13.LL
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L3f
            if (r0 != r3) goto L62
            X.C155000ia.LIZIZ(r9)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel r0 = r13.LLILLJJLI
            if (r0 == 0) goto L3d
            java.lang.String r1 = r0.taskId
            if (r1 == 0) goto L3d
            X.0Lcd r0 = X.C546890Lcd.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.create.AICreateService r0 = X.C546890Lcd.LIZ()
            r13.LL = r4
            java.lang.Object r9 = r0.kw(r1, r13)
            if (r9 != r2) goto L42
            X.C1C7U.LIZIZ(r5)
            return r2
        L3d:
            r9 = 0
            goto L44
        L3f:
            X.C155000ia.LIZIZ(r9)
        L42:
            java.util.List r9 = (java.util.List) r9
        L44:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0MUU r6 = new X.0MUU
            com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot r7 = r13.LLILLL
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel r8 = r13.LLILLJJLI
            java.lang.String r10 = r13.LLILZ
            java.lang.Long r11 = r13.LLILZIL
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r13, r0, r6)
            if (r0 != r2) goto L17
            X.C1C7U.LIZIZ(r5)
            return r2
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554860LpU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
