package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS69S1000000_18;

/* JADX INFO: renamed from: X.0gL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161850gL9 {
    public static final Map<String, C1161860gLA> LIZ = new LinkedHashMap();

    public static void LIZLLL(Map map) {
        C1421105hJ.LIZJ("rd_tiktokec_mix_tab_monitor", map);
    }

    public static void LIZJ(String str, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("page_name", "shop"), new Pair("subpage_name", "store_v2"), new Pair("module_name", str), new Pair("stage", "1"));
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        C1421105hJ.LIZJ("rd_tiktokec_init_module_start", mapLJIIJ);
    }

    public static void LIZ(String str, EnumC1161690gKt enumC1161690gKt, Long l, Map map) {
        long jCurrentTimeMillis;
        if (str == null) {
            return;
        }
        EnumC1161690gKt enumC1161690gKt2 = EnumC1161690gKt.PAGE_CLICK_START;
        if (enumC1161690gKt == enumC1161690gKt2) {
            LIZ.put(str, new C1161860gLA());
        }
        C1161860gLA c1161860gLA = (C1161860gLA) ((LinkedHashMap) LIZ).get(str);
        if (c1161860gLA != null) {
            AwS69S1000000_18 awS69S1000000_18 = new AwS69S1000000_18(str, 10);
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (map != null) {
                c1161860gLA.LJ.putAll(map);
            }
            if (enumC1161690gKt == enumC1161690gKt2) {
                c1161860gLA.LIZLLL = jCurrentTimeMillis;
            } else {
                EnumC1161690gKt enumC1161690gKt3 = c1161860gLA.LIZIZ;
                if (enumC1161690gKt3 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC1161690gKt3.getValue());
                    sbLIZ.append("_to_");
                    sbLIZ.append(enumC1161690gKt.getValue());
                    Pair<String, Long> pair = new Pair<>(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jCurrentTimeMillis - c1161860gLA.LIZJ));
                    c1161860gLA.LIZ.add(pair);
                    if (C1163360gNa.LIZIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(pair.getFirst());
                        sbLIZ2.append('=');
                        sbLIZ2.append(pair.getSecond().longValue());
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
            }
            if (enumC1161690gKt == EnumC1161690gKt.PAGE_END) {
                c1161860gLA.LIZ.add(new Pair<>("pageRecordStart_to_pageRecordEnd", Long.valueOf(jCurrentTimeMillis - c1161860gLA.LIZLLL)));
                ArrayList<Pair<String, Long>> arrayList = c1161860gLA.LIZ;
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Pair<String, Long> pair2 : arrayList) {
                    Pair pair3 = new Pair(pair2.getFirst(), pair2.getSecond());
                    linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
                }
                C1421105hJ.LIZJ("rd_tiktokec_mix_page_duration", C2097608Jq.LJIIL(linkedHashMap, c1161860gLA.LJ));
                c1161860gLA.LIZ.clear();
                ((LinkedHashMap) c1161860gLA.LJ).clear();
                awS69S1000000_18.invoke(c1161860gLA);
            }
            c1161860gLA.LIZIZ = enumC1161690gKt;
            c1161860gLA.LIZJ = jCurrentTimeMillis;
        }
    }
}
