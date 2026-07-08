package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.RechargeTaskPanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.RechargeTaskPanel$tryStartTaskCountdown$1", f = "RechargeTaskPanel.kt", l = {189, 197}, m = "invokeSuspend")
public final class C1143010fql extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RechargeTaskPanel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143010fql(RechargeTaskPanel rechargeTaskPanel, InterfaceC1364105Vn<? super C1143010fql> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargeTaskPanel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1143010fql(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.String r10 = "RechargeTaskPanel@913a.tryStartTaskCountdown$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r5 = X.C099R.LJFF()
            r6 = r19
            int r0 = r6.LL
            r4 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L90
            if (r0 != r4) goto Laa
            X.C155000ia.LIZIZ(r20)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r20)
            com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2 r0 = com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2.LIZ
            X.0fct r8 = r0.LJ()
            if (r8 != 0) goto L30
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L30:
            java.util.List<S extends X.0fcu<T, S>> r0 = r8.LJ
            java.util.Iterator r9 = r0.iterator()
        L36:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r7 = r9.next()
            r0 = r7
            X.0fcu r0 = (X.AbstractC1134420fcu) r0
            T r0 = r0.LIZ
            com.bytedance.android.livesdk.guide.model.TaskInfo r0 = (com.bytedance.android.livesdk.guide.model.TaskInfo) r0
            int r1 = r0.taskType
            r0 = 100
            if (r1 != r0) goto L36
        L4d:
            X.0fcu r7 = (X.AbstractC1134420fcu) r7
            if (r7 != 0) goto L59
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L57:
            r7 = r3
            goto L4d
        L59:
            X.0fcy r1 = r7.LIZJ()
            X.0fcy r0 = X.EnumC1134460fcy.TASK_IN_PROGRESS
            boolean r0 = r1.beforeStatus(r0)
            if (r0 == 0) goto L19
            com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2 r11 = com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2.LIZ
            X.0fdB r12 = X.EnumC1134590fdB.TASK_START
            T r0 = r8.LIZ
            com.bytedance.android.livesdk.guide.model.TaskInfo r0 = (com.bytedance.android.livesdk.guide.model.TaskInfo) r0
            int r14 = r0.taskType
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.RechargeTaskPanel r0 = r6.LLILLJJLI
            com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams r0 = r0.LLL
            if (r0 == 0) goto L8d
            java.lang.String r15 = r0.giftEnterFrom
            java.lang.String r0 = r0.requestPage
        L79:
            r6.LL = r2
            r13 = 16
            r17 = 0
            r18 = r6
            r16 = r0
            java.lang.Object r0 = r11.LIZ(r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r5) goto L93
            X.C1C7U.LIZIZ(r10)
            return r5
        L8d:
            r15 = r3
            r0 = r3
            goto L79
        L90:
            X.C155000ia.LIZIZ(r20)
        L93:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0fqm r1 = new X.0fqm
            com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.RechargeTaskPanel r0 = r6.LLILLJJLI
            r1.<init>(r0, r3)
            r6.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r6, r2, r1)
            if (r0 != r5) goto L19
            X.C1C7U.LIZIZ(r10)
            return r5
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143010fql.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
