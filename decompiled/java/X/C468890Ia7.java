package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ia7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.stablemode.IMDowngradeTask$subscribe$2", f = "IMDowngradeTask.kt", l = {39}, m = "invokeSuspend")
public final class C468890Ia7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C468890Ia7(InterfaceC1364105Vn<? super C468890Ia7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C468890Ia7(interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:10:0x004b, B:8:0x0047], limit reached: 19 */
    /* JADX WARN: Path cross not found for [B:8:0x0047, B:10:0x004b], limit reached: 19 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0061 -> B:6:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "IMDowngradeTask@1c19.subscribe$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r3 = 1
            if (r0 == 0) goto L67
            if (r0 != r3) goto L6b
            X.C155000ia.LIZIZ(r8)
        L13:
            java.lang.Class<com.bytedance.android.live.livedecision.ILiveDecisionService> r0 = com.bytedance.android.live.livedecision.ILiveDecisionService.class
            X.006A r5 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.livedecision.ILiveDecisionService r5 = (com.bytedance.android.live.livedecision.ILiveDecisionService) r5
            X.0eaj r2 = X.EnumC1094630eaj.DEFAULT
            X.0ITs r0 = X.EnumC467180ITs.EPI
            java.lang.String r1 = r0.getGroupName()
            java.lang.String r0 = "user_count_level"
            X.0eTG r5 = r5.O3(r2, r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "userCountLevel: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "IMDowngradeTask"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0jKc r0 = X.C1276840jKc.LIZ
            r0.getClass()
            java.util.Map<java.lang.String, java.lang.String> r2 = X.C1276840jKc.LJIIL
            if (r5 == 0) goto L4b
            java.lang.Object r0 = r5.LIZJ
            if (r0 != 0) goto L50
        L4b:
            r0 = 0
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L50:
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "acu_num_level"
            r2.put(r0, r1)
        L59:
            r7.LL = r3
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r4) goto L13
            X.C1C7U.LIZIZ(r6)
            return r4
        L67:
            X.C155000ia.LIZIZ(r8)
            goto L59
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C468890Ia7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C468890Ia7(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
