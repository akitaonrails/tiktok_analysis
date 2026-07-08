package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0mAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385710mAD implements InterfaceC1367540lgu {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;
    public final Map<String, Object> LIZLLL;

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> LIZIZ() {
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("matcher_type", "psp"), new Pair("scene_key", this.LIZ), new Pair("strategy_key", this.LIZIZ), new Pair("extra_params", this.LIZJ));
        Map<String, Object> map = this.LIZLLL;
        if (map != null) {
            mapLJIIJ.put("event_tracking", map);
        }
        return mapLJIIJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("psp+");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> getEventTracking() {
        return this.LIZLLL;
    }

    public static C1369340ljo LIZJ(Object obj, Map map) {
        List list;
        Map map2;
        Double d;
        List<List> list2;
        Object obj2 = ((LinkedHashMap) map).get("source");
        if (obj2 instanceof List) {
            list = (List) obj2;
        } else {
            list = null;
        }
        if (list == null) {
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(list, "", null, null, 0, null, null, 62);
        if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
            Object obj3 = map2.get("score");
            if (obj3 instanceof Double) {
                d = (Double) obj3;
            } else {
                d = null;
            }
            Object obj4 = map2.get("ranges");
            if (obj4 instanceof List) {
                list2 = (List) obj4;
            } else {
                list2 = null;
            }
            if (d != null && list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (List list3 : list2) {
                    if (list3.size() == 2) {
                        int iIntValue = ((Number) ListProtector.get(list3, 0)).intValue();
                        int iIntValue2 = ((Number) ListProtector.get(list3, 1)).intValue();
                        if (iIntValue >= 0 && iIntValue2 > iIntValue && iIntValue2 <= list.size()) {
                            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(list.subList(0, iIntValue), "", null, null, 0, null, null, 62);
                            Charset charset = Charsets.UTF_8;
                            int length = strLJJLIIIJ2.getBytes(charset).length;
                            int length2 = C13LP.LJJLIIIJ(list.subList(0, iIntValue2), "", null, null, 0, null, null, 62).getBytes(charset).length;
                            C23094093c c23094093c = C23094093c.LIZ;
                            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(length, length2);
                            c23094093c.getClass();
                            byte[] bytes = strLJJLIIIJ.getBytes(charset);
                            int i = intRangeLJIILJJIL.LL;
                            if (i >= 0 && intRangeLJIILJJIL.LLILLJJLI < bytes.length) {
                                try {
                                    IntRange intRangeLJIILJJIL2 = C13LZ.LJIILJJIL(new String(C13LP.LLFF(C13LQ.LJJJZ(bytes, C13LZ.LJIILJJIL(0, i))), charset).length(), new String(C13LP.LLFF(C13LQ.LJJJZ(bytes, C13LZ.LJIILJJIL(0, intRangeLJIILJJIL.LLILLJJLI + 1))), charset).length());
                                    if (intRangeLJIILJJIL2 != null) {
                                        arrayList.add(new IntRange(intRangeLJIILJJIL2.LL, intRangeLJIILJJIL2.LLILLJJLI));
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                }
                return new C1369340ljo(d.doubleValue(), arrayList);
            }
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        }
        return new C1369340ljo(0.0d, C13BV.INSTANCE);
    }

    @Override // X.InterfaceC1367540lgu
    public final C1369340ljo LIZ(String str, String str2) {
        Pair[] pairArr = new Pair[3];
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(String.valueOf(str.charAt(i)));
        }
        pairArr[0] = new Pair("query", arrayList);
        ArrayList arrayList2 = new ArrayList(str2.length());
        for (int i2 = 0; i2 < str2.length(); i2++) {
            arrayList2.add(String.valueOf(str2.charAt(i2)));
        }
        pairArr[1] = new Pair("source", arrayList2);
        pairArr[2] = new Pair("extra_params", this.LIZJ);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C23094093c.LIZ.getClass();
        if (!C23094093c.LIZ(mapLJIIJ)) {
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        }
        InterfaceC830890Wid interfaceC830890WidLIZ = C1386050mAl.LIZJ.LIZ().LIZ(this.LIZ);
        if (interfaceC830890WidLIZ == null) {
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        }
        try {
            InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890WidLIZ, this.LIZIZ, new TTMParamData((Map<String, Object>) mapLJIIJ));
            if (interfaceC805220ViKRunScene != null) {
                Object objLIZJ = interfaceC805220ViKRunScene.LIZJ();
                if (objLIZJ != null) {
                    return LIZJ(objLIZJ, mapLJIIJ);
                }
                return new C1369340ljo(0.0d, C13BV.INSTANCE);
            }
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        }
    }

    public C1385710mAD(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = map2;
    }
}
