package X;

import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NQC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem$startAvgReporter$1$1$1", f = "MinisFpsMonitorAssem.kt", l = {}, m = "invokeSuspend")
public final class C0NQC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0NQD>, Object> {
    public final /* synthetic */ MinisFpsMonitorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQC(MinisFpsMonitorAssem minisFpsMonitorAssem, InterfaceC1364105Vn<? super C0NQC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = minisFpsMonitorAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String andResetPerformanceStatistics;
        C1C7U.LIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMiniGameRuntimeAPI iMiniGameRuntimeAPIGb = this.LL.m268do().gb();
        if (iMiniGameRuntimeAPIGb != null && (andResetPerformanceStatistics = iMiniGameRuntimeAPIGb.getAndResetPerformanceStatistics()) != null) {
            if (andResetPerformanceStatistics.length() == 0) {
                C0NQD c0nqd = new C0NQD(0);
                C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$1$1");
                return c0nqd;
            }
            JSONObject jSONObject = new JSONObject(andResetPerformanceStatistics);
            String strOptString = jSONObject.optString("fps");
            String str = "";
            if (strOptString == null) {
                strOptString = "";
            }
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(strOptString);
            if (fLJIIIIZZ != null) {
                float fFloatValue = fLJIIIIZZ.floatValue();
                String strOptString2 = jSONObject.optString("game_stutter");
                if (strOptString2 != null) {
                    str = strOptString2;
                }
                Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(str);
                if (fLJIIIIZZ2 != null) {
                    C0NQD c0nqd2 = new C0NQD(fFloatValue, fLJIIIIZZ2.floatValue(), true);
                    C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$1$1");
                    return c0nqd2;
                }
                C0NQD c0nqd3 = new C0NQD(0);
                C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$1$1");
                return c0nqd3;
            }
            C0NQD c0nqd4 = new C0NQD(0);
            C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$1$1");
            return c0nqd4;
        }
        C0NQD c0nqd5 = new C0NQD(0);
        C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$1$1");
        return c0nqd5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0NQD> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
