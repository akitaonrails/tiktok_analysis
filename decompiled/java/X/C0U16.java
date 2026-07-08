package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.vcloud.strategy.StrategyCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U16, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$sendAction$1", f = "KaraokeViewModel.kt", l = {806, StrategyCenter.ENABLE_SMART_SERVICE, 813, 816}, m = "invokeSuspend")
public final class C0U16 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0U0N LLILLJJLI;
    public final /* synthetic */ KaraokeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U16(KaraokeViewModel karaokeViewModel, C0U0N c0u0n, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0u0n;
        this.LLILLL = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U16(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "KaraokeViewModel@e9e0.sendAction$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 4
            r4 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto L65
            if (r0 == r5) goto L8c
            if (r0 == r4) goto L8c
            if (r0 == r6) goto L8c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L21:
            X.C155000ia.LIZIZ(r9)
            X.0U0N r1 = r8.LLILLJJLI
            boolean r0 = r1 instanceof X.C765450U0x
            if (r0 != 0) goto L57
            boolean r0 = r1 instanceof X.C0U0V
            if (r0 != 0) goto L57
            boolean r0 = r1 instanceof X.C765310U0j
            if (r0 == 0) goto L49
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.live.effect.api.KaraokeYouSingRequestMessageEvent> r0 = com.bytedance.android.live.effect.api.KaraokeYouSingRequestMessageEvent.class
            r1.GQ2(r0)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r1 = r8.LLILLL
            X.0U0N r0 = r8.LLILLJJLI
            r8.LL = r4
            java.lang.Object r0 = r1.dR2(r0, r8)
            if (r0 != r3) goto L8f
            X.C1C7U.LIZIZ(r7)
            return r3
        L49:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r8.LLILLL
            r8.LL = r6
            java.lang.Object r0 = r0.dR2(r1, r8)
            if (r0 != r3) goto L8f
            X.C1C7U.LIZIZ(r7)
            return r3
        L57:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = r8.LLILLL
            r8.LL = r2
            java.lang.Object r9 = r0.gR2(r1, r8)
            if (r9 != r3) goto L68
            X.C1C7U.LIZIZ(r7)
            return r3
        L65:
            X.C155000ia.LIZIZ(r9)
        L68:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 != 0) goto L8f
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r4 = r8.LLILLL
            X.0TzC r2 = new X.0TzC
            r0 = 2131840688(0x7f114eb0, float:1.9314663E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
            java.lang.String r0 = "pm_mt_LIVEKaraoke_tooFastToast"
            r2.<init>(r1, r0)
            r8.LL = r5
            java.lang.Object r0 = r4.zQ2(r2, r8)
            if (r0 != r3) goto L8f
            X.C1C7U.LIZIZ(r7)
            return r3
        L8c:
            X.C155000ia.LIZIZ(r9)
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U16.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
