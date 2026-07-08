package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07U0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07U0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    public static final void LIZ(String str, Map map, Map map2, Map map3) {
        map.put(str, 1);
        List<String> list = (List) map2.get(str);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (String str2 : list) {
            Integer num = (Integer) ((LinkedHashMap) map).get(str2);
            if (num != null) {
                if (num.intValue() == 0) {
                    map3.put(str2, str);
                    LIZ(str2, map, map2, map3);
                } else {
                    if (num.intValue() == 1) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str2);
                        while (true) {
                            arrayList.add(str);
                            str = ((LinkedHashMap) map3).get(str);
                            if (str != 0) {
                                if (Intrinsics.LJFF(str, str2)) {
                                    arrayList.add(str);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        C13EO c13eo = new C13EO(arrayList);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Cycle detected: ");
                        sbLIZ.append(C13LP.LJJLIIIJ(c13eo, " -> ", null, null, 0, null, null, 62));
                        throw new C1890807as(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    num.intValue();
                }
            }
        }
        map.put(str, 2);
    }
}
