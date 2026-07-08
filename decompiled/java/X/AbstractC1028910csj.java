package X;

import X.InterfaceC1029150ct7;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS225S0300000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0csj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1028910csj<T extends InterfaceC1029150ct7> extends AbstractC1029030csv implements InterfaceC1029090ct1 {
    public AbstractC1028910csj(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
    }

    public final void LJFF(InterfaceC1029150ct7 interfaceC1029150ct7, InterfaceC1028660csK interfaceC1028660csK, C1028850csd c1028850csd) {
        C1028710csP.LIZ(this, interfaceC1028660csK);
        C1028710csP.LIZ(this, interfaceC1029150ct7);
        getProvidedLogics().put("ad_extra_data", new AwS225S0300000_16((C1028850csd) this, (C1028850csd) interfaceC1028660csK, (InterfaceC1028660csK<C443120HZe<String, String, String>>) c1028850csd, (C1028850csd) 16));
        C1028760csU c1028760csU = new C1028760csU(this, c1028850csd);
        LJ().LIZ(new C1028760csU(this, c1028850csd), interfaceC1028660csK, LJI(c1028760csU, interfaceC1028660csK, C1028850csd.LIZLLL(interfaceC1028660csK.getKeys(), c1028760csU, new C1028990csr(this, c1028850csd), new C07LV(this, c1028850csd))));
    }

    public final Map LJI(C1028760csU c1028760csU, InterfaceC1028660csK interfaceC1028660csK, Map map) {
        C1028920csk c1028920csk;
        Map mapLJ;
        if ((interfaceC1028660csK instanceof C1028920csk) && (c1028920csk = (C1028920csk) interfaceC1028660csK) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            C588050N4p c588050N4p = new C588050N4p(linkedHashMap);
            Object obj = ((LinkedHashMap) map).get("ad_extra_data");
            if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLJ);
            InterfaceC1028790csX<C1029060csy> interfaceC1028790csXLIZIZ = LIZIZ();
            String first = c1028920csk.LIZJ.getFirst();
            c1028920csk.LIZJ.getSecond();
            interfaceC1028790csXLIZIZ.LIZIZ(new C1029060csy(first, c1028920csk.LIZJ.getThird(), c1028760csU, c588050N4p));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.put("ad_extra_data", C786410Ut5.J3(new JSONObject(linkedHashMap3)));
            return linkedHashMap;
        }
        return map;
    }

    public final void LJII(InterfaceC1028660csK interfaceC1028660csK, C1029040csw c1029040csw, Function1 function1) {
        C1028850csd c1028850csd = new C1028850csd(new Object[0]);
        if (function1 != null) {
            function1.invoke(c1028850csd);
        }
        LJFF(c1029040csw, interfaceC1028660csK, c1028850csd);
    }
}
