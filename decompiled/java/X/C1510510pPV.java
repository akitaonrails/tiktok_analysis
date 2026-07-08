package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510510pPV extends C09AY implements Function0<AbstractC1511510pR7> {
    public C1510510pPV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1511510pR7 invoke() {
        if (C0BBW.LIZ() != 2) {
            return null;
        }
        C153I c153i = C153I.LIZ;
        c153i.getClass();
        C01GW c01gw = C153I.LIZJ;
        final String scene = ((SmartSceneConfig) c01gw.getValue()).getScene();
        if (scene == null) {
            return null;
        }
        C1510230pP3 c1510230pP3 = new C1510230pP3(scene);
        c153i.getClass();
        c1510230pP3.LIZIZ = (SmartSceneConfig) c01gw.getValue();
        c1510230pP3.LIZJ = new InterfaceC1488230opZ() { // from class: X.0pPO
            @Override // X.InterfaceC1488230opZ
            public final boolean LIZ(JSONObject jSONObject, C1509310pNZ c1509310pNZ) throws JSONException {
                String aid;
                String aid2;
                ArrayList arrayList;
                Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
                Object feature$default = null;
                if (awemeLIZ != null) {
                    aid = awemeLIZ.getAid();
                } else {
                    aid = null;
                }
                int iIntValue = 0;
                if (aid != null) {
                    C1514090pVH.LIZ.getClass();
                    Integer num = (Integer) ((LruCache) C1514090pVH.LIZJ.getValue()).get(aid);
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        Aweme awemeLIZ2 = C1511360pQs.LIZ(c1509310pNZ);
                        String str = scene;
                        if (awemeLIZ2 != null) {
                            aid2 = awemeLIZ2.getAid();
                        } else {
                            aid2 = null;
                        }
                        JSONObject jSONObjectLIZ = C1509400pNi.LIZ(iIntValue2, aid2, true, true, true);
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
                        if (producer$default != null) {
                            feature$default = FeatureProducer.getFeature$default(producer$default, "play_time", jSONObjectLIZ, str, (ReturnCode) null, 8, (Object) null);
                        }
                        if ((feature$default instanceof ArrayList) && (arrayList = (ArrayList) feature$default) != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                iIntValue += ((Number) it2.next()).intValue();
                            }
                        }
                        C1514090pVH c1514090pVH = C1514090pVH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("injectTruth: time ");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(", count ");
                        sbLIZ.append(iIntValue2);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1514090pVH.getClass();
                        C1514090pVH.LJFF(strLIZIZ);
                        jSONObject.put("ff_result", Float.valueOf(iIntValue / 1000.0f));
                        return true;
                    }
                }
                return false;
            }
        };
        return C1511420pQy.LIZ().LIZ(scene, c1510230pP3);
    }
}
