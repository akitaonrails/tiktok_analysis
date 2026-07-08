package X;

import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ILR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget$tryInitEventContainer$1", f = "LiveEndCardWidget.kt", l = {401, 424}, m = "invokeSuspend")
public final class C0ILR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveEndCardWidget LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ILR(LiveEndCardWidget liveEndCardWidget, long j, InterfaceC1364105Vn<? super C0ILR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveEndCardWidget;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ILR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r11 = r14
            java.lang.String r6 = "LiveEndCardWidget@8614.tryInitEventContainer$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r13.LL
            r5 = 0
            r3 = 2
            r10 = 1
            if (r0 == 0) goto L1e
            if (r0 == r10) goto L3c
            if (r0 != r3) goto L80
            X.C155000ia.LIZIZ(r11)
        L18:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1e:
            X.C155000ia.LIZIZ(r11)
            com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget r0 = r13.LLILLJJLI
            X.0IZy r2 = r0.LLJLLIL
            if (r2 == 0) goto L39
            long r0 = r13.LLILLL
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.LL = r10
            java.lang.Object r11 = r2.LIZJ(r0, r13)
            if (r11 != r4) goto L3f
            X.C1C7U.LIZIZ(r6)
            return r4
        L39:
            r11 = r5
        L3a:
            r10 = 0
            goto L69
        L3c:
            X.C155000ia.LIZIZ(r11)
        L3f:
            com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule r11 = (com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule) r11
            if (r11 == 0) goto L3a
            com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget r0 = r13.LLILLJJLI
            X.0IZy r7 = r0.LLJLLIL
            if (r7 == 0) goto L69
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.String r8 = java.lang.String.valueOf(r0)
            long r0 = r13.LLILLL
            java.lang.String r9 = java.lang.String.valueOf(r0)
            X.0ILS r12 = new X.0ILS
            com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget r0 = r13.LLILLJJLI
            r12.<init>()
            r7.LJ(r8, r9, r10, r11, r12)
        L69:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0ILA r1 = new X.0ILA
            com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget r0 = r13.LLILLJJLI
            r1.<init>(r10, r0, r11, r5)
            r13.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r13, r2, r1)
            if (r0 != r4) goto L18
            X.C1C7U.LIZIZ(r6)
            return r4
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ILR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
