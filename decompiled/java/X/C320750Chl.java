package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Chl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageOperatorHandler$handleSug$2", f = "MessageOperatorHandler.kt", l = {356, 366}, m = "invokeSuspend")
public final class C320750Chl extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C321020CiC LLILLJJLI;
    public final /* synthetic */ CommerceAgentSug LLILLL;
    public final /* synthetic */ C320830Cht LLILZ;
    public final /* synthetic */ C321240CiY LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320750Chl(C321020CiC c321020CiC, CommerceAgentSug commerceAgentSug, C320830Cht c320830Cht, C321240CiY c321240CiY, int i, InterfaceC1364105Vn<? super C320750Chl> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c321020CiC;
        this.LLILLL = commerceAgentSug;
        this.LLILZ = c320830Cht;
        this.LLILZIL = c321240CiY;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320750Chl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r26
            java.lang.String r11 = "MessageOperatorHandler@3dad.handleSug$2"
            X.C1C7U.LIZ(r11)
            java.lang.Object r3 = X.C099R.LJFF()
            r4 = r25
            int r0 = r4.LL
            r2 = 2
            r9 = 1
            if (r0 == 0) goto L20
            if (r0 == r9) goto L92
            if (r0 != r2) goto L9c
            X.C155000ia.LIZIZ(r1)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L20:
            X.C155000ia.LIZIZ(r1)
            X.0CiC r10 = r4.LLILLJJLI
            int r1 = r10.LIZ
            r0 = 4
            if (r1 != r0) goto L82
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug r0 = r4.LLILLL
            long r7 = r0.botId
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L82
            r5 = 1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L82
            r18 = 0
        L3c:
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug r12 = r4.LLILLL
            r13 = 0
            r14 = 0
            r15 = 0
            X.0CiY r1 = r4.LLILZIL
            int r0 = r4.LLILZLL
            r24 = 1059061759(0x3f1fffff, float:0.62499994)
            r17 = r14
            r19 = r1
            r20 = r0
            r21 = r15
            r23 = r14
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug r6 = com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug.LIZ(r12, r13, r14, r15, r17, r18, r19, r20, r21, r23, r24)
            X.0Chm r5 = X.C320760Chm.LIZ
            X.0Cht r0 = r4.LLILZ
            long r0 = r0.LIZ
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            X.0Cht r0 = r4.LLILZ
            int r0 = r0.LIZIZ
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r5.getClass()
            X.0Cha r0 = X.C320760Chm.LIZ(r0, r1)
            if (r0 == 0) goto L1a
            X.1DDr r0 = r0.LJII
            if (r0 == 0) goto L1a
            r4.LL = r2
            java.lang.Object r0 = r0.emit(r6, r4)
            if (r0 != r3) goto L1a
            X.C1C7U.LIZIZ(r11)
            return r3
        L82:
            X.0Cht r1 = r4.LLILZ
            X.0Cha r0 = r10.LJIIIIZZ
            r4.LL = r9
            java.lang.Object r1 = r1.LJIIZILJ(r0, r4)
            if (r1 != r3) goto L95
            X.C1C7U.LIZIZ(r11)
            return r3
        L92:
            X.C155000ia.LIZIZ(r1)
        L95:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r18 = r1.booleanValue()
            goto L3c
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320750Chl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
