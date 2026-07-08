package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS408S0200000_7;
import njp.a;
import webcast.api.room.StrategyCheckData;

/* JADX INFO: renamed from: X.0Ihr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.skylight.SkylightContainerManager$realShowGoLiveTooltip$2", f = "SkylightContainerManager.kt", l = {}, m = "invokeSuspend")
public final class C473690Ihr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC476820Imu LL;
    public final /* synthetic */ StrategyCheckData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C473690Ihr(AbstractC476820Imu abstractC476820Imu, StrategyCheckData strategyCheckData, InterfaceC1364105Vn<? super C473690Ihr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC476820Imu;
        this.LLILLJJLI = strategyCheckData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C473690Ihr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightContainerManager@b223.realShowGoLiveTooltip$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC476820Imu abstractC476820Imu = this.LL;
        abstractC476820Imu.LJJIFFI(new AwS408S0200000_7(abstractC476820Imu, this.LLILLJJLI, 43), true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightContainerManager@b223.realShowGoLiveTooltip$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
