package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1903407cu extends AbstractC1903507cv {
    public final ECPreloadApiData LIZIZ;
    public Map<String, List<String>> LIZJ;

    public C1903407cu(ECPreloadApiData eCPreloadApiData) {
        this.LIZIZ = eCPreloadApiData;
    }

    @Override // X.AbstractC1903507cv
    public final void LIZ(Map<String, ? extends Object> map) {
        if (map != null) {
            this.LIZ = true;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ECPreloadApiData eCPreloadApiData = this.LIZIZ;
            Map<String, Object> map2 = eCPreloadApiData.dataPathV2;
            if (map2 != null) {
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    Object value = entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    if (value instanceof String) {
                        EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((CharSequence) value, new String[]{"/"}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        ecomResourceBystander.getClass();
                        EcomResourceBystander.LJIJI(map, 0, listLJJLIIIJILLIZJL, arrayList2);
                        arrayList.addAll(arrayList2);
                    } else if (value instanceof List) {
                        for (Object obj : (Iterable) value) {
                            if (obj instanceof String) {
                                EcomResourceBystander ecomResourceBystander2 = EcomResourceBystander.LIZ;
                                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((CharSequence) obj, new String[]{"/"}, 0, 6);
                                ArrayList arrayList3 = new ArrayList();
                                ecomResourceBystander2.getClass();
                                EcomResourceBystander.LJIJI(map, 0, listLJJLIIIJILLIZJL2, arrayList3);
                                arrayList.addAll(arrayList3);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("APICondition.parseAPIData() path=");
                                sbLIZ.append((String) obj);
                                sbLIZ.append(", valueSize=");
                                sbLIZ.append(arrayList3.size());
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        }
                    }
                    linkedHashMap.put(entry.getKey(), arrayList);
                }
            } else {
                Map<String, String> map3 = eCPreloadApiData.dataPath;
                if (map3 != null) {
                    for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                        String value2 = entry2.getValue();
                        EcomResourceBystander ecomResourceBystander3 = EcomResourceBystander.LIZ;
                        List listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL(value2, new String[]{"/"}, 0, 6);
                        ArrayList arrayList4 = new ArrayList();
                        ecomResourceBystander3.getClass();
                        EcomResourceBystander.LJIJI(map, 0, listLJJLIIIJILLIZJL3, arrayList4);
                        linkedHashMap.put(entry2.getKey(), arrayList4);
                    }
                }
            }
            this.LIZJ = linkedHashMap;
        }
    }
}
