package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTemperatureTipSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ub0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.notification.HighTemperatureManager$startPoll$2", f = "HighTemperatureManager.kt", l = {121, 128}, m = "invokeSuspend")
public final class C775200Ub0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C775180Uay LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775200Ub0(C775180Uay c775180Uay, InterfaceC1364105Vn<? super C775200Ub0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c775180Uay;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C775200Ub0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighTemperatureManager@60b4.startPoll$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        while (this.LLILLJJLI.LJ) {
            float f = C476230Ilx.LIZ.LJFF;
            LiveBroadcastTemperatureTipSetting liveBroadcastTemperatureTipSetting = LiveBroadcastTemperatureTipSetting.INSTANCE;
            if (f < liveBroadcastTemperatureTipSetting.thermalThreshold()) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(30000L, this) == objLJFF) {
                    C1C7U.LIZIZ("HighTemperatureManager@60b4.startPoll$2");
                    return objLJFF;
                }
            } else {
                this.LLILLJJLI.getClass();
                if (C775180Uay.LIZJ() >= liveBroadcastTemperatureTipSetting.batteryThreshold()) {
                    this.LLILLJJLI.LJFF();
                    this.LLILLJJLI.LJI();
                }
                this.LL = 2;
                if (AnonymousClass0958.LIZIZ(30000L, this) == objLJFF) {
                    C1C7U.LIZIZ("HighTemperatureManager@60b4.startPoll$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighTemperatureManager@60b4.startPoll$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
