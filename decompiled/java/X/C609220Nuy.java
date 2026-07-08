package X;

import X.C0NAG;
import X.C609910Nw5;
import X.C786410Ut5;
import X.C799570VYd;
import Y.ARunnableS109S0100000_9;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609220Nuy extends C09AY implements Function0<C0NA7> {
    public C609220Nuy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0NA7 invoke() {
        int i = C609920Nw6.LIZ().engineType;
        return i != 1 ? i != 2 ? new C0NA7() { // from class: X.0Nuw
            @Override // X.C0NA7
            public final boolean isReady() {
                return true;
            }

            @Override // X.C0NA7
            public final void LIZ(Map map, C0NA2 c0na2) {
                C609910Nw5 c609910Nw5 = C609910Nw5.LIZ;
                JSONObject jSONObject = new JSONObject(map);
                c609910Nw5.getClass();
                C609910Nw5.LIZIZ(0, jSONObject, null);
            }
        } : new C0NA7() { // from class: X.0NAN
            @Override // X.C0NA7
            public final void LIZ(Map map, C0NA2 c0na2) {
            }

            @Override // X.C0NA7
            public final boolean isReady() {
                return true;
            }
        } : new C0NA7() { // from class: X.0Nux
            @Override // X.C0NA7
            public final boolean isReady() {
                return ((IPitayaCore) C148D.LIZ.getValue()).isReady();
            }

            @Override // X.C0NA7
            public final void LIZ(Map map, final C0NA2 c0na2) {
                isReady();
                final JSONObject jSONObject = new JSONObject(map);
                ((IPitayaCore) C148D.LIZ.getValue()).runTask("dynamic_performance_score", new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.feature.pythia.engine.PitayaEngine$predict$1
                    @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                    public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                        JSONObject params;
                        Object objOpt;
                        Double d;
                        if (z) {
                            if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null && (objOpt = params.opt("score")) != null) {
                                Function1<C0NAG, Unit> function1 = c0na2;
                                JSONObject jSONObject2 = jSONObject;
                                if ((objOpt instanceof Double) && (d = (Double) objOpt) != null) {
                                    function1.invoke(new C0NAG((float) d.doubleValue()));
                                    C786410Ut5.LJLIIL(500L, C799570VYd.LIZIZ(), new ARunnableS109S0100000_9(jSONObject2, 99));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C609910Nw5 c609910Nw5 = C609910Nw5.LIZ;
                        JSONObject jSONObject3 = jSONObject;
                        c609910Nw5.getClass();
                        C609910Nw5.LIZIZ(-1, jSONObject3, null);
                    }
                });
            }
        };
    }
}
