package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.PreloadConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0wIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775230wIT {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(Map map, InterfaceC1771670wCj interfaceC1771670wCj) {
        boolean z;
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            try {
                Object objLIZJ = LIZJ(str2, interfaceC1771670wCj);
                if (objLIZJ != null) {
                    linkedHashMap.put(str, objLIZJ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VideoDetailParamsBuilder buildDynamicExtraParams key=");
                sbLIZ.append(str);
                sbLIZ.append(" path=");
                sbLIZ.append(str2);
                sbLIZ.append(" error=");
                sbLIZ.append(e);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZJ(strLIZIZ);
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            return null;
        }
        return linkedHashMap;
    }

    public static Object LIZJ(String str, InterfaceC1771670wCj interfaceC1771670wCj) throws Exception {
        List listLJJLIIIJILLIZJL;
        Object objLJ;
        Integer numLJIIJJI;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Object obj2 = ListProtector.get(arrayList, 0);
                if (Intrinsics.LJFF(obj2, "data")) {
                    objLJ = interfaceC1771670wCj.LJFF();
                } else {
                    if (Intrinsics.LJFF(obj2, "item_data")) {
                        objLJ = interfaceC1771670wCj.LJ();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parseRequestParams root=");
                    sbLIZ.append((String) ListProtector.get(arrayList, 0));
                    sbLIZ.append(" is invalid");
                    throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (objLJ != null) {
                    int size = arrayList.size();
                    for (int i = 1; i < size; i++) {
                        String str2 = (String) ListProtector.get(arrayList, i);
                        if (objLJ instanceof Map) {
                            objLJ = ((Map) objLJ).get(str2);
                        } else if ((objLJ instanceof List) && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
                            objLJ = C13LP.LJJJLZIJ(numLJIIJJI.intValue(), (List) objLJ);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("parseRequestParams path=");
                            sbLIZ2.append(str);
                            sbLIZ2.append(" not found");
                            throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        if (objLJ == null) {
                            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                            sbLIZ22.append("parseRequestParams path=");
                            sbLIZ22.append(str);
                            sbLIZ22.append(" not found");
                            throw new Exception(C2188811AlT.LIZIZ(sbLIZ22));
                        }
                    }
                    if (objLJ instanceof Double) {
                        return Integer.valueOf((int) ((Number) objLJ).doubleValue());
                    }
                    return objLJ;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("parseRequestParams root=");
                sbLIZ3.append((String) ListProtector.get(arrayList, 0));
                sbLIZ3.append(" is invalid");
                throw new Exception(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        throw new Exception("parseRequestParams path is empty");
    }

    public static VideoDetailRequestParams.Item LIZIZ(EnumC1155140gAK enumC1155140gAK, EnumC1775210wIR enumC1775210wIR, InterfaceC1771670wCj interfaceC1771670wCj) {
        List<PreloadConfig> list;
        PreloadConfig next;
        List<String> list2;
        String str;
        List<Integer> list3;
        String str2;
        String str3;
        Map<String, String> map;
        if (interfaceC1771670wCj != null) {
            try {
                ECMixMallItemInfoDTO eCMixMallItemInfoDTOLIZ = interfaceC1771670wCj.LIZ();
                if (eCMixMallItemInfoDTOLIZ != null && (list = eCMixMallItemInfoDTOLIZ.preloadConfig) != null) {
                    Iterator<PreloadConfig> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.action, enumC1155140gAK.getValue())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    PreloadConfig preloadConfig = next;
                    if (preloadConfig == null || (list2 = preloadConfig.trigger) == null || !list2.contains(enumC1775210wIR.getValue())) {
                        return null;
                    }
                    PreloadConfig.ItemDataParams itemDataParams = preloadConfig.itemDataParams;
                    if (itemDataParams != null) {
                        str = itemDataParams.subFeedType;
                    } else {
                        str = null;
                    }
                    int iIntValue = ((Number) LIZJ(str, interfaceC1771670wCj)).intValue();
                    PreloadConfig.EnableFilter enableFilter = preloadConfig.enableFilter;
                    if (enableFilter == null || (list3 = enableFilter.subFeedType) == null || !list3.contains(Integer.valueOf(iIntValue))) {
                        return null;
                    }
                    PreloadConfig.ItemDataParams itemDataParams2 = preloadConfig.itemDataParams;
                    if (itemDataParams2 != null) {
                        str2 = itemDataParams2.id;
                    } else {
                        str2 = null;
                    }
                    String str4 = (String) LIZJ(str2, interfaceC1771670wCj);
                    PreloadConfig.ItemDataParams itemDataParams3 = preloadConfig.itemDataParams;
                    if (itemDataParams3 != null) {
                        str3 = itemDataParams3.feedType;
                    } else {
                        str3 = null;
                    }
                    Integer num = (Integer) LIZJ(str3, interfaceC1771670wCj);
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    PreloadConfig.ItemDataParams itemDataParams4 = preloadConfig.itemDataParams;
                    if (itemDataParams4 != null) {
                        map = itemDataParams4.extra;
                    } else {
                        map = null;
                    }
                    return new VideoDetailRequestParams.Item(str4, num, numValueOf, LIZ(map, interfaceC1771670wCj));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1768370w7P.LIZ(e, EnumC1771210wBz.BUILD_VIDEO_REQUEST_PARAMS_ERROR, e.toString(), null);
            }
        }
        return null;
    }
}
