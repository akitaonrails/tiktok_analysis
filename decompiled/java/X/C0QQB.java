package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QQB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQB extends C09AY implements Function0<AbstractC1511510pR7> {
    public C0QQB() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1511510pR7 invoke() {
        final String scene;
        C666360QBu.LIZ.getClass();
        SmartSceneConfig smartSceneConfigLIZ = null;
        if (!C666360QBu.LIZ().enableSmartAheadPrefetch || (scene = C666360QBu.LIZ().getScene()) == null) {
            return null;
        }
        C1510230pP3 c1510230pP3 = new C1510230pP3(scene);
        if (C666360QBu.LIZ().enablePlatform) {
            ClientAIConfigCenter.LIZ.getClass();
            ClientAIConfigCenter value = C0QQG.LIZIZ.getValue();
            if (value != null) {
                smartSceneConfigLIZ = value.LIZ(scene);
            }
        } else {
            smartSceneConfigLIZ = C666360QBu.LIZ();
        }
        c1510230pP3.LIZIZ = smartSceneConfigLIZ;
        c1510230pP3.LIZJ = new InterfaceC1488230opZ() { // from class: X.0pNT
            @Override // X.InterfaceC1488230opZ
            public final boolean LIZ(JSONObject jSONObject, C1509310pNZ c1509310pNZ) {
                int iIntValue;
                int i;
                Number numericFeature$default;
                try {
                    Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
                    if (awemeLIZ == null) {
                        return false;
                    }
                    FeatureServiceManager.Companion.getClass();
                    FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_comment", 0, 2, null);
                    if (producer$default != null && (numericFeature$default = FeatureProducer.getNumericFeature$default(producer$default, "comment_trending_words_click", new JSONObject().put("aweme", awemeLIZ), scene, (ReturnCode) null, 8, (Object) null)) != null) {
                        iIntValue = numericFeature$default.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("ss_result", i);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    return false;
                }
            }
        };
        return C1511420pQy.LIZ().LIZ(scene, c1510230pP3);
    }
}
