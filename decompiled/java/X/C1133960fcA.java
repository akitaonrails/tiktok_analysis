package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: renamed from: X.0fcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.firstrecharge.FirstRechargeManager$syncFirstRechargeInfo$1", f = "FirstRechargeManager.kt", l = {89, 96, 97}, m = "invokeSuspend")
public final class C1133960fcA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function1<GetFirstRechargeInfoV2Resp.Data, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1133960fcA(int i, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1133960fcA(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.String r10 = "FirstRechargeManager@683c.syncFirstRechargeInfo$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r2 = X.C099R.LJFF()
            r3 = r19
            int r0 = r3.LL
            r15 = 0
            r9 = 2
            r8 = 3
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 == r4) goto L21
            if (r0 == r9) goto L6e
            if (r0 == r8) goto L21
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L21:
            X.C155000ia.LIZIZ(r20)
            goto L34
        L25:
            X.C155000ia.LIZIZ(r20)
            int r1 = r3.LLILLJJLI
            if (r1 == r4) goto L8a
            r0 = 7
            if (r1 == r0) goto L8a
            if (r1 == r8) goto L41
            r0 = 4
            if (r1 == r0) goto L8a
        L34:
            kotlin.jvm.functions.Function1<webcast.api.first_recharge.GetFirstRechargeInfoV2Resp$Data, kotlin.Unit> r0 = r3.LLILLL
            if (r0 == 0) goto L3b
            r0.invoke(r15)
        L3b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L41:
            com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2 r0 = com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2.LIZ
            r0.getClass()
            com.bytedance.android.livesdk.guide.model.TaskInfoResponse$Data r0 = com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2.LIZLLL
            if (r0 == 0) goto L71
            com.bytedance.android.livesdk.guide.model.TaskUtilExtra r0 = r0.taskUtilExtra
            if (r0 == 0) goto L71
            long r0 = r0.delayMillSeconds4Recharge
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            long r6 = r1.longValue()
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L71
            long r0 = r1.longValue()
            r3.LL = r9
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r3)
            if (r0 != r2) goto L71
            X.C1C7U.LIZIZ(r10)
            return r2
        L6e:
            X.C155000ia.LIZIZ(r20)
        L71:
            com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2 r11 = com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2.LIZ
            X.0fdB r12 = X.EnumC1134590fdB.RECHARGE_SUCCESS
            r3.LL = r8
            r13 = 22
            r14 = 0
            r16 = r15
            r17 = r14
            r18 = r3
            java.lang.Object r0 = r11.LIZ(r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r2) goto L34
            X.C1C7U.LIZIZ(r10)
            return r2
        L8a:
            com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2 r11 = com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2.LIZ
            X.0fdB r12 = X.EnumC1134590fdB.ENTER_ROOM
            r3.LL = r4
            r13 = 7
            r14 = 0
            r16 = r15
            r17 = r14
            r18 = r3
            java.lang.Object r0 = r11.LIZ(r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r2) goto L34
            X.C1C7U.LIZIZ(r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133960fcA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
