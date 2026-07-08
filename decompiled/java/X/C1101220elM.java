package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.performance.BroadcastPerfScoreSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0elM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.LiveSpeedTestAdapter$updateAdaptiveGearPerfInfo$1", f = "LiveSpeedTestAdapter.kt", l = {}, m = "invokeSuspend")
public final class C1101220elM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2250021D4u LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1101220elM(C2250021D4u c2250021D4u, InterfaceC1364105Vn<? super C1101220elM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2250021D4u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1101220elM(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [T, X.0ekg] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1101230elN c1101230elNLIZ;
        C1101180elI c1101180elI;
        C1101180elI c1101180elI2;
        Map<String, C491530JPj> map;
        C491530JPj c491530JPj;
        float fFloatValue;
        C1101180elI c1101180elI3;
        Map<String, C491530JPj> map2;
        C491530JPj c491530JPj2;
        C1101180elI c1101180elI4;
        C1C7U.LIZ("LiveSpeedTestAdapter@58e5.updateAdaptiveGearPerfInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU c259800zU = new C259800zU();
        DataChannel dataChannel = this.LL.LIZLLL;
        if (dataChannel != null) {
            c259800zU.element = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).mc1(dataChannel);
        }
        InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) c259800zU.element;
        if (interfaceC1100800ekg != null) {
            C2250021D4u c2250021D4u = this.LL;
            interfaceC1100800ekg.start();
            interfaceC1100800ekg.LJIIIZ();
            if (((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).xC1() != null && (c1101230elNLIZ = C1100770ekd.LIZ(interfaceC1100800ekg)) != null) {
                try {
                    C1101240elO c1101240elO = new C1101240elO();
                    c1101240elO.LIZLLL = c1101230elNLIZ.LIZIZ / C1305320k4Y.LJ(C497740JfY.LJII());
                    int i = 0;
                    if (BroadcastPerfScoreSetting.enableSpeedTestOverallScore()) {
                        C1100750ekb c1100750ekb = c1101230elNLIZ.LIZ;
                        if (c1100750ekb != null && (c1101180elI4 = c1100750ekb.LIZLLL) != null) {
                            i = (int) c1101180elI4.LIZIZ;
                        }
                        c1101240elO.LIZ = i;
                    } else {
                        C1100750ekb c1100750ekb2 = c1101230elNLIZ.LIZ;
                        if (c1100750ekb2 != null && (c1101180elI = c1100750ekb2.LIZ) != null) {
                            i = (int) c1101180elI.LIZIZ;
                        }
                        c1101240elO.LIZ = i;
                    }
                    float f = 0.0f;
                    if (!BroadcastPerfScoreSetting.enableSpeedTestThermalScore()) {
                        C1100750ekb c1100750ekb3 = c1101230elNLIZ.LIZ;
                        if (c1100750ekb3 != null && (c1101180elI3 = c1100750ekb3.LIZ) != null && (map2 = c1101180elI3.LIZJ) != null && (c491530JPj2 = map2.get("battery_temp")) != null) {
                            f = c491530JPj2.LIZIZ;
                        }
                        c1101240elO.LIZJ = f;
                    } else {
                        C1100750ekb c1100750ekb4 = c1101230elNLIZ.LIZ;
                        if (c1100750ekb4 != null && (c1101180elI2 = c1100750ekb4.LIZLLL) != null && (map = c1101180elI2.LIZJ) != null && (c491530JPj = map.get("battery_temp")) != null) {
                            f = c491530JPj.LIZIZ;
                        }
                        c1101240elO.LIZJ = f;
                    }
                    Float f2 = c1101230elNLIZ.LIZJ;
                    float fFloatValue2 = -1.0f;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    } else {
                        fFloatValue = -1.0f;
                    }
                    c1101240elO.LJ = fFloatValue;
                    Float f3 = c1101230elNLIZ.LIZLLL;
                    if (f3 != null) {
                        fFloatValue2 = f3.floatValue();
                    }
                    c1101240elO.LJFF = fFloatValue2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateAdaptiveGearPerfInfo dispatchPerfData: ");
                    sbLIZ.append(c1101240elO);
                    C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
                    C1D4C c1d4c = c2250021D4u.LJIIIIZZ;
                    if (c1d4c != null) {
                        c1d4c.LJIIL(c1101240elO);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSpeedTestAdapter@58e5.updateAdaptiveGearPerfInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
