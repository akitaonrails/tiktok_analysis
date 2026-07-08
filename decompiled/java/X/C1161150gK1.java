package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.data.PageInfo;
import com.bytedance.hybrid.spark.raven.data.RavenPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0gK1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161150gK1 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LJFF(RavenPage ravenPage) {
        Integer num;
        PageInfo pageInfo = ravenPage.getPageInfo();
        if (pageInfo == null || (num = pageInfo.protocolVersion) == null || num.intValue() < 2) {
            return false;
        }
        return true;
    }

    public static List LIZ(C1161060gJs c1161060gJs, List list) {
        EnumC1161160gK2 enumC1161160gK2;
        EnumC1160590gJ7 enumC1160590gJ7;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C1161140gK0 c1161140gK0;
        ArrayList arrayList = new ArrayList();
        if (c1161060gJs.LIZ.LIZJ == EnumC1161160gK2.COMPONENT) {
            C1161060gJs c1161060gJs2 = c1161060gJs.LIZJ;
            if (c1161060gJs2 != null && (c1161140gK0 = c1161060gJs2.LIZ) != null) {
                enumC1161160gK2 = c1161140gK0.LIZJ;
            } else {
                enumC1161160gK2 = null;
            }
            if (enumC1161160gK2 == EnumC1161160gK2.GROUP) {
                BaseComponentData baseComponentData = c1161060gJs2.LIZ.LIZLLL;
                ArrayList arrayList2 = (ArrayList) list;
                int size = arrayList2.size();
                int i8 = 1;
                int size2 = arrayList2.size() + 1;
                if (baseComponentData == null || (enumC1160590gJ7 = baseComponentData.groupLayoutType) == null) {
                    enumC1160590gJ7 = EnumC1160590gJ7.LIST;
                }
                String str = c1161060gJs.LIZIZ;
                BaseComponentData baseComponentData2 = c1161060gJs.LIZ.LIZLLL;
                if (baseComponentData2 != null) {
                    i8 = baseComponentData2.column;
                }
                if (baseComponentData2 != null) {
                    i = baseComponentData2.gap;
                } else {
                    i = 0;
                }
                if (baseComponentData != null) {
                    i2 = baseComponentData.paddingLeft;
                    i3 = baseComponentData.paddingRight;
                    i4 = baseComponentData.paddingTop;
                    i5 = baseComponentData.paddingBottom;
                    i6 = baseComponentData.backgroundColor;
                    i7 = baseComponentData.backgroundColorDark;
                } else {
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                }
                int i9 = i3;
                int i10 = i2;
                int i11 = i;
                int i12 = i8;
                EnumC1160590gJ7 enumC1160590gJ72 = enumC1160590gJ7;
                arrayList2.add(new C1161100gJw(size, size2, enumC1160590gJ72, str, i12, i11, i10, i9, i4, i5, i6, i7));
            }
            arrayList.add(c1161060gJs.LIZ);
        }
        Iterator<C1161060gJs> it2 = c1161060gJs.LIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(LIZ(it2.next(), list));
        }
        return arrayList;
    }

    public static C1161090gJv LIZLLL(RavenPage ravenPage, String str, Map map) {
        List<C1161060gJs> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && ravenPage.getLayout() != null && (map.get("page") != null || ravenPage.getLayout().get("page") != null)) {
            C1161060gJs c1161060gJsLIZJ = LIZJ(ravenPage, str, "page", null, map);
            linkedHashMap.put("page", c1161060gJsLIZJ);
            LJ(ravenPage, str, map, c1161060gJsLIZJ, linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        C1161060gJs c1161060gJs = (C1161060gJs) linkedHashMap.get("page");
        if (c1161060gJs != null && (list = c1161060gJs.LIZLLL) != null) {
            for (C1161060gJs c1161060gJs2 : list) {
                linkedHashMap2.put(c1161060gJs2.LIZIZ, LIZ(c1161060gJs2, arrayList));
            }
        }
        return new C1161090gJv(linkedHashMap, linkedHashMap2, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014d A[PHI: r6
      0x014d: PHI (r6v13 java.lang.Integer) = (r6v12 java.lang.Integer), (r6v15 java.lang.Integer), (r6v15 java.lang.Integer) binds: [B:99:0x014a, B:94:0x0130, B:96:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01de A[PHI: r6
      0x01de: PHI (r6v10 java.lang.Integer) = (r6v7 java.lang.Integer), (r6v11 java.lang.Integer) binds: [B:153:0x01fc, B:146:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ff A[PHI: r6
      0x01ff: PHI (r6v8 java.lang.Integer) = (r6v7 java.lang.Integer), (r6v10 java.lang.Integer), (r6v10 java.lang.Integer) binds: [B:153:0x01fc, B:148:0x01e0, B:150:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022d A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012e A[PHI: r6
      0x012e: PHI (r6v15 java.lang.Integer) = (r6v12 java.lang.Integer), (r6v16 java.lang.Integer) binds: [B:99:0x014a, B:92:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [com.bytedance.hybrid.spark.raven.component.builtin.myna.RavenMynaModule] */
    /* JADX WARN: Type inference failed for: r12v14, types: [com.bytedance.hybrid.spark.raven.component.builtin.myna.RavenMynaModule] */
    /* JADX WARN: Type inference failed for: r12v15, types: [com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenSparkModule] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenSparkModule] */
    /* JADX WARN: Type inference failed for: r12v20, types: [com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenSparkModule] */
    /* JADX WARN: Type inference failed for: r12v21, types: [com.bytedance.hybrid.spark.raven.component.BaseComponentData] */
    /* JADX WARN: Type inference failed for: r12v22, types: [X.0gK8] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.bytedance.hybrid.spark.raven.component.BaseComponentData] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.bytedance.hybrid.spark.raven.component.builtin.myna.RavenMynaModule] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1161140gK0 LIZIZ(com.bytedance.hybrid.spark.raven.data.RavenPage r18, java.lang.String r19, java.lang.String r20, X.EnumC1161160gK2 r21, X.C1161060gJs r22) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1161150gK1.LIZIZ(com.bytedance.hybrid.spark.raven.data.RavenPage, java.lang.String, java.lang.String, X.0gK2, X.0gJs):X.0gK0");
    }

    public static C1161060gJs LIZJ(RavenPage ravenPage, String str, String str2, C1161060gJs c1161060gJs, Map map) {
        EnumC1161160gK2 enumC1161160gK2;
        if (c1161060gJs == null) {
            enumC1161160gK2 = EnumC1161160gK2.PAGE;
        } else if (c1161060gJs.LIZ.LIZJ == EnumC1161160gK2.PAGE) {
            enumC1161160gK2 = EnumC1161160gK2.SECTION;
        } else if (map.get(str2) != null) {
            enumC1161160gK2 = EnumC1161160gK2.GROUP;
        } else if (map.get(str2) == null) {
            enumC1161160gK2 = EnumC1161160gK2.COMPONENT;
        } else {
            enumC1161160gK2 = EnumC1161160gK2.UNKNOWN;
        }
        return new C1161060gJs(LIZIZ(ravenPage, str, str2, enumC1161160gK2, c1161060gJs), str2, c1161060gJs);
    }

    public static void LJ(RavenPage ravenPage, String str, Map map, C1161060gJs c1161060gJs, Map map2) {
        List<String> list = (List) map.get(c1161060gJs.LIZIZ);
        if (list != null) {
            for (String str2 : list) {
                C1161060gJs c1161060gJsLIZJ = LIZJ(ravenPage, str, str2, c1161060gJs, map);
                map2.put(str2, c1161060gJsLIZJ);
                LJ(ravenPage, str, map, c1161060gJsLIZJ, map2);
                c1161060gJs.LIZLLL.add(c1161060gJsLIZJ);
            }
        }
    }
}
