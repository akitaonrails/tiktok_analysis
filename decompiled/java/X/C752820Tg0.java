package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewShowLocationWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.PreviewShowLocationWidget$readLocationWithDelay$1", f = "PreviewShowLocationWidget.kt", l = {124, 127, 129}, m = "invokeSuspend")
public final class C752820Tg0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ PreviewShowLocationWidget LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752820Tg0(boolean z, PreviewShowLocationWidget previewShowLocationWidget, InterfaceC1364105Vn<? super C752820Tg0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = previewShowLocationWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752820Tg0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "PreviewShowLocationWidget@d654.readLocationWithDelay$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L38
            if (r0 == r3) goto L4f
            if (r0 != r5) goto L76
            X.C155000ia.LIZIZ(r8)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r8)
            boolean r0 = r7.LLILLJJLI
            if (r0 == 0) goto L3b
            com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationReadDelaySetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationReadDelaySetting.INSTANCE
            long r0 = r0.value()
            r7.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r4) goto L3b
            X.C1C7U.LIZIZ(r6)
            return r4
        L38:
            X.C155000ia.LIZIZ(r8)
        L3b:
            java.lang.Class<com.bytedance.android.live.function.IRoomFunctionService> r0 = com.bytedance.android.live.function.IRoomFunctionService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.function.IRoomFunctionService r0 = (com.bytedance.android.live.function.IRoomFunctionService) r0
            r7.LL = r3
            java.lang.Object r8 = r0.Jx0(r7)
            if (r8 != r4) goto L52
            X.C1C7U.LIZIZ(r6)
            return r4
        L4f:
            X.C155000ia.LIZIZ(r8)
        L52:
            tikcast.api.anchor.AnchorLocationSettingsReadResponse$ResponseData r8 = (tikcast.api.anchor.AnchorLocationSettingsReadResponse.ResponseData) r8
            if (r8 == 0) goto L19
            java.lang.String r0 = r8.location
            int r0 = r0.length()
            if (r0 <= 0) goto L19
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0Tg1 r2 = new X.0Tg1
            com.bytedance.android.livesdk.broadcast.preview.widget.PreviewShowLocationWidget r1 = r7.LLILLL
            r0 = 0
            r2.<init>(r1, r8, r0)
            r7.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r7, r3, r2)
            if (r0 != r4) goto L19
            X.C1C7U.LIZIZ(r6)
            return r4
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C752820Tg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
