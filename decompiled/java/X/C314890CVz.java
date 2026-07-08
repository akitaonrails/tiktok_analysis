package X;

import com.bytedance.android.livesdk.signaling.model.downlink.StarshipDownlinkData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.starship.base.signal.StarshipLiveSignalWrapper$signalingCallback$1$handleSignal$1", f = "StarshipLiveSignalWrapper.kt", l = {}, m = "invokeSuspend")
public final class C314890CVz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StarshipDownlinkData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314890CVz(StarshipDownlinkData starshipDownlinkData, InterfaceC1364105Vn<? super C314890CVz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = starshipDownlinkData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314890CVz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function1<? super String, Unit> function1;
        C1C7U.LIZ("StarshipLiveSignalWrapper@2b2b.signalingCallback$1$handleSignal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String data = this.LL.getData();
            if (data != null && (function1 = C0CW0.LIZIZ) != null) {
                function1.invoke(data);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StarshipLiveSignalWrapper@2b2b.signalingCallback$1$handleSignal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
