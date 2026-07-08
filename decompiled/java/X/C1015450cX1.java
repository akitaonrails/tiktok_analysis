package X;

import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.settings.AnoleImagePreloadModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015450cX1 {
    public static final C1015450cX1 LIZ = new C1015450cX1();

    public static int LIZIZ() {
        int i = C1016750cZ7.LIZ[((EnumC1016770cZ9) C1BCA.LJI().LJII.getValue()).ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 6 : 5;
        }
        return 4;
    }

    public static Integer LIZJ(AnoleComponentModel anoleComponentModel) {
        String str;
        IAnoleService iAnoleService;
        C1015460cX2 c1015460cX2LJ;
        Map<String, Integer> map;
        Integer num;
        C1014250cV5.LIZ.getClass();
        C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
        if (c1014490cVTLIZ != null && (str = c1014490cVTLIZ.LIZ) != null && (iAnoleService = (IAnoleService) PluggableExtentionKt.pluggableSpi$default(IAnoleService.class, false, false, false, 14, null)) != null && (c1015460cX2LJ = iAnoleService.LJ()) != null && (map = c1015460cX2LJ.LIZ) != null && (num = map.get(str)) != null) {
            int iIntValue = num.intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getGeckoPreloadStatus() stauts = ");
            sbLIZ.append(iIntValue);
            C2188811AlT.LIZIZ(sbLIZ);
            return num;
        }
        return null;
    }

    public static Long LIZLLL(AnoleComponentModel anoleComponentModel) {
        String str;
        IAnoleService iAnoleService;
        C1015460cX2 c1015460cX2LJ;
        Map<String, Integer> map;
        Integer num;
        IAnoleService iAnoleService2;
        C1015460cX2 c1015460cX2LJ2;
        Map<String, Long> map2;
        Long l;
        C1014250cV5.LIZ.getClass();
        C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
        if (c1014490cVTLIZ == null || (str = c1014490cVTLIZ.LIZ) == null || (iAnoleService = (IAnoleService) PluggableExtentionKt.pluggableSpi$default(IAnoleService.class, false, false, false, 14, null)) == null || (c1015460cX2LJ = iAnoleService.LJ()) == null || (map = c1015460cX2LJ.LIZ) == null || (num = map.get(str)) == null || ((num.intValue() != 1 && num.intValue() != 0) || (iAnoleService2 = (IAnoleService) PluggableExtentionKt.pluggableSpi$default(IAnoleService.class, false, false, false, 14, null)) == null || (c1015460cX2LJ2 = iAnoleService2.LJ()) == null || (map2 = c1015460cX2LJ2.LIZIZ) == null || (l = map2.get(str)) == null)) {
            return null;
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - l.longValue());
        long jLongValue = lValueOf.longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getGeckoPreloadToShowDuration() getGeckoPreloadToShowDuration = ");
        sbLIZ.append(jLongValue);
        C2188811AlT.LIZIZ(sbLIZ);
        return lValueOf;
    }

    public static Integer LJ(AnoleComponentModel anoleComponentModel) {
        String imageUrl;
        if (!((AnoleImagePreloadModel) C1015490cX5.LIZIZ.getValue()).enable || (imageUrl = anoleComponentModel.getImageUrl()) == null) {
            return null;
        }
        Integer num = C1015480cX4.LIZ.get(Integer.valueOf(imageUrl.hashCode()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getImagePreloadParams() paramMap = ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        return num;
    }

    public static Long LJFF(AnoleComponentModel anoleComponentModel) {
        String imageUrl;
        Long l;
        if (!((AnoleImagePreloadModel) C1015490cX5.LIZIZ.getValue()).enable || (imageUrl = anoleComponentModel.getImageUrl()) == null) {
            return null;
        }
        int iHashCode = imageUrl.hashCode();
        Integer num = C1015480cX4.LIZ.get(Integer.valueOf(iHashCode));
        if (num == null) {
            return null;
        }
        if ((num.intValue() != 1 && num.intValue() != 0 && num.intValue() != 3) || (l = C1015480cX4.LIZIZ.get(Integer.valueOf(iHashCode))) == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getImagePreloadParams() duration = ");
        sbLIZ.append(jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        return Long.valueOf(jCurrentTimeMillis);
    }

    public static String LJI(AnoleComponentModel anoleComponentModel) {
        String imageUrl;
        if (!((AnoleImagePreloadModel) C1015490cX5.LIZIZ.getValue()).enable || (imageUrl = anoleComponentModel.getImageUrl()) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getImagePreloadParams() url = ");
        sbLIZ.append(imageUrl);
        C2188811AlT.LIZIZ(sbLIZ);
        return imageUrl;
    }

    public static Map LJIIIIZZ(C1050000dQk c1050000dQk) {
        Map<String, Object> map;
        Map mapLJIILLIIL = null;
        if (c1050000dQk != null && (map = c1050000dQk.LJ) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "label") && !Intrinsics.LJFF(entry.getKey(), "refer") && !Intrinsics.LJFF(entry.getKey(), "tag")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                if (value == null) {
                    value = null;
                }
                arrayList.add(new Pair(key, value));
            }
            mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleTrackUtil getUgenTrackExtraData(), trackMap = ");
        sbLIZ.append(mapLJIILLIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        return mapLJIILLIIL;
    }

    public static Integer LJIIIZ(AnoleComponentModel anoleComponentModel) {
        String str;
        Integer numLIZJ;
        C1014250cV5.LIZ.getClass();
        C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
        if (c1014490cVTLIZ != null && (str = c1014490cVTLIZ.LIZ) != null) {
            String strLIZ = C1014230cV3.LIZ("scene_anole_format");
            IAnoleService iAnoleService = (IAnoleService) PluggableExtentionKt.pluggableSpi$default(IAnoleService.class, false, false, false, 14, null);
            if (iAnoleService != null && (numLIZJ = iAnoleService.LIZJ(strLIZ, str)) != null) {
                int iIntValue = numLIZJ.intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isGeckoExist() geckoExist = ");
                sbLIZ.append(iIntValue);
                C2188811AlT.LIZIZ(sbLIZ);
                return numLIZJ;
            }
            return null;
        }
        return null;
    }

    public static Map LIZ(C1009340cNA c1009340cNA, AnoleComponentModel anoleComponentModel) {
        Long lValueOf;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("component_id", Long.valueOf(anoleComponentModel.getID()));
        AnoleModel anoleModel = c1009340cNA.LIZLLL.getAnoleModel();
        if (anoleModel != null) {
            lValueOf = Long.valueOf(anoleModel.templateID);
        } else {
            lValueOf = null;
        }
        pairArr[1] = new Pair("template_id", lValueOf);
        pairArr[2] = new Pair("component_type", anoleComponentModel.type);
        pairArr[3] = new Pair("render_strategy", anoleComponentModel.getRenderStrategy());
        pairArr[4] = new Pair("prerender_failed_strategy", anoleComponentModel.prerenderFailedStrategy);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static Map LJII(AnoleComponentModel anoleComponentModel, String str) {
        Object obj;
        Map<String, Object> eventInfos = anoleComponentModel.getEventInfos();
        Map map = null;
        if (eventInfos != null) {
            obj = eventInfos.get(str);
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map = (Map) obj;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleTrackUtil getPackTrackExtraData(), trackMap = ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        return map;
    }

    public static void LJIIJ(String str, String str2, String str3, AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, Map map) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str2, str, c1009340cNA.LIZLLL);
        c1022820ciuLIZLLL.LIZJ(str3, "refer");
        LIZ.getClass();
        map.putAll(LIZ(c1009340cNA, anoleComponentModel));
        c1022820ciuLIZLLL.LIZ(map);
        c1022820ciuLIZLLL.LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleTrackUtil onTrack(), label = ");
        sbLIZ.append(str);
        sbLIZ.append(",tag = ");
        sbLIZ.append(str2);
        sbLIZ.append(",refer = ");
        sbLIZ.append(str3);
        sbLIZ.append(", trackMap = ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
