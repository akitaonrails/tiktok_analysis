package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.LiveSpeedTestAdapter$tryPreLoadAdaptiveStrategy$3", f = "LiveSpeedTestAdapter.kt", l = {}, m = "invokeSuspend")
public final class C463301rD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C463301rD(InterfaceC1364105Vn<? super C463301rD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C463301rD(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSpeedTestAdapter@58e5.tryPreLoadAdaptiveStrategy$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20441214yg.LIZIZ("LiveSpeedTestAdapter", "execute TTMCoreApiInit ->");
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).initTTMCore();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSpeedTestAdapter@58e5.tryPreLoadAdaptiveStrategy$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C463301rD(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
