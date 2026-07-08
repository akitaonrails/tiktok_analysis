package X;

import com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ifi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService$updateSwitchState$1", f = "AIReplyAnchorManagerService.kt", l = {68}, m = "invokeSuspend")
public final class C472360Ifi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIReplyAnchorManagerService LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472360Ifi(AIReplyAnchorManagerService aIReplyAnchorManagerService, DataChannel dataChannel, boolean z, InterfaceC1364105Vn<? super C472360Ifi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIReplyAnchorManagerService;
        this.LLILLL = dataChannel;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472360Ifi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "AIReplyAnchorManagerService@da98.updateSwitchState$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L11
            goto L3f
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r7)
            com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService r0 = r6.LLILLJJLI
            X.1DDq r1 = r0.LLILZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.setValue(r0)
            java.lang.Class<com.bytedance.android.live.function.IRoomFunctionService> r0 = com.bytedance.android.live.function.IRoomFunctionService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Throwable -> L54
            com.bytedance.android.live.function.IRoomFunctionService r2 = (com.bytedance.android.live.function.IRoomFunctionService) r2     // Catch: java.lang.Throwable -> L54
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LLILLL     // Catch: java.lang.Throwable -> L54
            boolean r0 = r6.LLILZ     // Catch: java.lang.Throwable -> L54
            r6.LL = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r2.nA(r1, r6, r0)     // Catch: java.lang.Throwable -> L54
            if (r0 != r4) goto L42
            X.C1C7U.LIZIZ(r5)
            return r4
        L3f:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L54
        L42:
            com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService r0 = r6.LLILLJJLI     // Catch: java.lang.Throwable -> L54
            X.1DDq r1 = r0.LLILLL     // Catch: java.lang.Throwable -> L54
            boolean r0 = r6.LLILZ     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L54
            r1.setValue(r0)     // Catch: java.lang.Throwable -> L54
            com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService r0 = r6.LLILLJJLI     // Catch: java.lang.Throwable -> L54
            r0.LL = r3     // Catch: java.lang.Throwable -> L54
            goto L86
        L54:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService r1 = r6.LLILLJJLI
            r0 = 2
            r1.LL = r0
            com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService r0 = r6.LLILLJJLI
            X.1DDq r1 = r0.LLILLL
            boolean r0 = r6.LLILZ
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
            boolean r0 = r2 instanceof X.C501470JlZ
            if (r0 == 0) goto L98
            X.0JlZ r2 = (X.C501470JlZ) r2
            java.lang.String r0 = r2.getPrompt()
            int r0 = r0.length()
            if (r0 > 0) goto L7d
            r3 = 0
        L7d:
            if (r3 == 0) goto L98
            java.lang.String r0 = r2.getPrompt()
            X.C766270U4b.LJIIJJI(r0)
        L86:
            com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService r0 = r6.LLILLJJLI
            X.1DDq r1 = r0.LLILZ
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L98:
            r0 = 2131854910(0x7f11863e, float:1.9343508E38)
            X.C766270U4b.LIZLLL(r0)
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472360Ifi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
