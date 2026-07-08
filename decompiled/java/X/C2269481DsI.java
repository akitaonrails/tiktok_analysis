package X;

import ayh.i5;
import com.ss.android.ugc.aweme.port.internal.IFluencyService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig;
import com.ss.android.ugc.aweme.utils.oh;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269481DsI extends C09AY implements Function0<C860510XpJ> {
    public C2269481DsI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0XpJ] */
    @Override // kotlin.jvm.functions.Function0
    public final C860510XpJ invoke() {
        return new IFluencyService() { // from class: X.0XpJ
            @Override // com.ss.android.ugc.aweme.port.internal.IFluencyService
            public final void endReport(String str) {
                oh.LJ(str);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IFluencyService
            public final void sceneReport(String str) {
                C860470XpF.LJIIIIZZ(C860340Xp2.LIZ, str, ((ToolsBaseInfoConfig) C861870XrV.LIZJ.getValue()).sceneCollectDuration, null, null, 12);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IFluencyService
            public final void getCurrentFluencyInfo(long j, final Function1<? super JSONObject, Unit> function1, final Function1<? super JSONObject, Unit> function12) {
                oh ohVar = oh.LIZ;
                int iLIZIZ = i5.LIZIZ();
                ohVar.getClass();
                oh.LIZ().startBlockMonitor("tool_global", iLIZIZ, j, new LagDataCallback() { // from class: X.0VVn
                    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
                    public final void onDataAvailable(JSONObject jSONObject) {
                        function1.invoke(jSONObject);
                    }
                });
                ICreativePerformanceMonitorService.DefaultImpls.startFpsMonitor$default(oh.LIZ(), "tool_global", j, new LagDataCallback() { // from class: X.0VVo
                    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
                    public final void onDataAvailable(JSONObject jSONObject) {
                        function12.invoke(jSONObject);
                    }
                }, null, 8, null);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IFluencyService
            public final void getSceneFluencyInfo(String str, long j, final Function1<? super JSONObject, Unit> function1, final Function1<? super JSONObject, Unit> function12) {
                oh.LIZ().startBlockMonitor(str, i5.LIZIZ(), j, new LagDataCallback() { // from class: X.0VVp
                    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
                    public final void onDataAvailable(JSONObject jSONObject) {
                        function1.invoke(jSONObject);
                    }
                });
                ICreativePerformanceMonitorService.DefaultImpls.startFpsMonitor$default(oh.LIZ(), str, j, new LagDataCallback() { // from class: X.0VVq
                    @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
                    public final void onDataAvailable(JSONObject jSONObject) {
                        function12.invoke(jSONObject);
                    }
                }, null, 8, null);
            }
        };
    }
}
