package X;

import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207460hWi extends C09AY implements Function0<C1207210hWJ> {
    public C1207460hWi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1207210hWJ invoke() {
        List<PopupSceneV2> list;
        C1208440hYI.LIZ.getClass();
        C1208130hXn c1208130hXn = C1208440hYI.LIZIZ;
        C1207340hWW.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Config[] configArrLIZJ = C1207340hWW.LIZJ();
        if (configArrLIZJ != null) {
            for (Config config : configArrLIZJ) {
                if (config.business != null && (list = config.popupSceneV2) != null) {
                    Iterator<PopupSceneV2> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().scene;
                        if (str != null) {
                            String str2 = config.business;
                            Object arrayList = linkedHashMap.get(str2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(str2, arrayList);
                            }
                            ((List) arrayList).add(str);
                        }
                    }
                }
            }
        }
        c1208130hXn.getClass();
        C185100nR c185100nR = C185100nR.LIZ;
        Map<String, ? extends List<String>> map = C1208130hXn.LJ;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportBizScenes: ");
        sbLIZ.append(linkedHashMap);
        sbLIZ.append(' ');
        sbLIZ.append(map);
        C1798620wuC.LIZLLL("SdkMonitorWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (C185100nR.LIZ()) {
            C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new RunnableC514501zT(linkedHashMap, map, 38));
            return c1208130hXn;
        }
        C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportBizScenes: not initialized");
        return c1208130hXn;
    }
}
