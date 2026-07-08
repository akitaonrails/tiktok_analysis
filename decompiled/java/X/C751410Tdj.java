package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment$onViewCreated$7", f = "TryModeBroadcastInteractionFragment.kt", l = {466, 467}, m = "invokeSuspend")
public final class C751410Tdj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public TryModeBroadcastInteractionFragment LL;
    public IRoomFunctionService LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ TryModeBroadcastInteractionFragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751410Tdj(TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment, InterfaceC1364105Vn<? super C751410Tdj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = tryModeBroadcastInteractionFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751410Tdj(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "TryModeBroadcastInteractionFragment@6563.onViewCreated$7"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L44
            if (r0 == r4) goto L68
            if (r0 != r5) goto L84
            com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment r1 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L19:
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r9 = (com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings) r9
            if (r9 == 0) goto L3e
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r1.LLJJIJIL
            if (r0 == 0) goto L22
            r3 = r0
        L22:
            com.bytedance.android.livesdk.model.RoomAuthStatus r2 = r3.getRoomAuthStatus()
            int r0 = r9.chat
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC1106030et7.E4
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = X.C750850Tcp.LIZ(r0, r1)
            r2.enableChat = r0
        L3e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L44:
            X.C155000ia.LIZIZ(r9)
            java.lang.Class<com.bytedance.android.live.function.IRoomFunctionService> r0 = com.bytedance.android.live.function.IRoomFunctionService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.function.IRoomFunctionService r2 = (com.bytedance.android.live.function.IRoomFunctionService) r2
            if (r2 == 0) goto L3e
            com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment r1 = r8.LLILZ
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r1.LLJJIJI
            if (r0 != 0) goto L58
            r0 = r3
        L58:
            r8.LL = r1
            r8.LLILLJJLI = r2
            r8.LLILLL = r4
            java.lang.Object r0 = r2.Gd2(r0, r8)
            if (r0 != r6) goto L6f
            X.C1C7U.LIZIZ(r7)
            return r6
        L68:
            com.bytedance.android.live.function.IRoomFunctionService r2 = r8.LLILLJJLI
            com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment r1 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L6f:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r1.LLJJIJI
            if (r0 != 0) goto L74
            r0 = r3
        L74:
            r8.LL = r1
            r8.LLILLJJLI = r3
            r8.LLILLL = r5
            java.lang.Object r9 = r2.Z32(r0, r8)
            if (r9 != r6) goto L19
            X.C1C7U.LIZIZ(r7)
            return r6
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751410Tdj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
