package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.07hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1933707hn extends C2217421BqW implements Function2<List<? extends C1240300iNg>, String, List<? extends C1240340iNk>> {
    public C1933707hn(InterfaceC1240690iOJ interfaceC1240690iOJ) {
        super(2, interfaceC1240690iOJ, C1240730iON.class, "groupByBusinessInfo", "groupByBusinessInfo(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends C1240340iNk> invoke(List<? extends C1240300iNg> list, String str) {
        String str2 = str;
        this.receiver.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1240300iNg c1240300iNg : list) {
            C1240300iNg c1240300iNg2 = c1240300iNg;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1240300iNg2.LJ);
            sbLIZ.append('_');
            sbLIZ.append(c1240300iNg2.LJFF);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Object arrayList = linkedHashMap.get(strLIZIZ);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strLIZIZ, arrayList);
            }
            ((List) arrayList).add(c1240300iNg);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list2 = (List) ((Map.Entry) it2.next()).getValue();
            if (!list2.isEmpty()) {
                C1240300iNg c1240300iNg3 = (C1240300iNg) C13LP.LJJJJZI(list2);
                arrayList2.add(new C1240340iNk(new ArrayList(list2), c1240300iNg3.LJ, c1240300iNg3.LJFF, str2));
            }
        }
        return arrayList2;
    }
}
