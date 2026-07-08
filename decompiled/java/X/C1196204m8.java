package X;

import com.ss.android.ugc.aweme.ml.feature.flash.FlashApplogConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04m8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1196204m8 extends C09AY implements Function0<Map<String, List<FlashApplogConfig>>> {
    public C1196204m8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, List<FlashApplogConfig>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<FlashApplogConfig> list = (List) C1196504mB.LIZIZ.getValue();
        if (list != null) {
            for (FlashApplogConfig flashApplogConfig : list) {
                List list2 = (List) linkedHashMap.get(flashApplogConfig.event);
                if (list2 != null) {
                    list2.add(flashApplogConfig);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(flashApplogConfig);
                    linkedHashMap.put(flashApplogConfig.event, arrayList);
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashApplogConfigAB:");
        sbLIZ.append(linkedHashMap);
        C2188811AlT.LIZIZ(sbLIZ);
        return linkedHashMap;
    }
}
