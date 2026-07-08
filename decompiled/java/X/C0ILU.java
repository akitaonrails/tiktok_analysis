package X;

import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ILU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget$doInitLiveEventLayout$5$1", f = "LiveEndCardWidget.kt", l = {698, 699}, m = "invokeSuspend")
public final class C0ILU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveEndCardWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ILU(LiveEndCardWidget liveEndCardWidget, InterfaceC1364105Vn<? super C0ILU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveEndCardWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ILU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "LiveEndCardWidget@8614.doInitLiveEventLayout$5$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L33
            if (r0 != r5) goto L54
            X.C155000ia.LIZIZ(r9)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r9)
            com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget r0 = r8.LLILLJJLI
            X.0IZy r0 = r0.LLJLLIL
            if (r0 == 0) goto L31
            r8.LL = r1
            java.lang.Object r9 = r0.LIZLLL(r8)
            if (r9 != r6) goto L36
            X.C1C7U.LIZIZ(r7)
            return r6
        L31:
            r4 = 0
            goto L3c
        L33:
            X.C155000ia.LIZIZ(r9)
        L36:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r4 = r9.booleanValue()
        L3c:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0ILT r2 = new X.0ILT
            com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget r1 = r8.LLILLJJLI
            r0 = 0
            r2.<init>(r4, r1, r0)
            r8.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r8, r3, r2)
            if (r0 != r6) goto L16
            X.C1C7U.LIZIZ(r7)
            return r6
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ILU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
