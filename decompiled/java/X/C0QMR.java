package X;

import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.ai.SearchSmartDynamicTabConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QMR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QMR extends C09AY implements Function0<AbstractC1511510pR7> {
    public C0QMR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1511510pR7 invoke() {
        C01GW c01gw = C0PH7.LIZIZ;
        if (!(!Intrinsics.LJFF(c01gw.getValue(), C0PH7.LIZ))) {
            return null;
        }
        SmartSceneConfig smartSceneConfig = ((SearchSmartDynamicTabConfig) c01gw.getValue()).modelConfig;
        if (smartSceneConfig == null) {
            smartSceneConfig = new SmartSceneConfig();
        }
        String scene = smartSceneConfig.getScene();
        if (scene == null) {
            scene = "";
        }
        C1510230pP3 c1510230pP3 = new C1510230pP3(scene);
        c1510230pP3.LIZIZ = smartSceneConfig;
        c1510230pP3.LIZJ = new InterfaceC1488230opZ() { // from class: X.0QMS
            @Override // X.InterfaceC1488230opZ
            public final boolean LIZ(JSONObject jSONObject, C1509310pNZ c1509310pNZ) {
                return false;
            }
        };
        smartSceneConfig.toString();
        return C1511420pQy.LIZ().LIZ(scene, c1510230pP3);
    }
}
