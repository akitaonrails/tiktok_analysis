package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Ygz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880830Ygz {
    public static final Map<EnumC881060YhM, Long> LIZ = new LinkedHashMap();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(389));

    public static void LIZJ(C880840Yh0 c880840Yh0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("update_type", c880840Yh0.LIZ);
        linkedHashMap.put("update_size", String.valueOf(c880840Yh0.LIZIZ));
        linkedHashMap.put("count_cost", String.valueOf(c880840Yh0.LIZJ));
        linkedHashMap.put("construct_info_cost", String.valueOf(c880840Yh0.LIZLLL));
        linkedHashMap.put("update_kv_cost", String.valueOf(c880840Yh0.LJ));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("message_request_update_kv_info_perf", linkedHashMap);
    }

    public static void LIZLLL(EnumC881060YhM enumC881060YhM) {
        Map<EnumC881060YhM, Long> map = LIZ;
        if (map.containsKey(enumC881060YhM)) {
            return;
        }
        map.put(enumC881060YhM, Long.valueOf(System.currentTimeMillis()));
    }

    public static void LIZIZ(String str, List list) {
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((List) it2.next()).size() != 3) {
                        return;
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList(3);
            int i = 0;
            do {
                arrayList.add(Double.valueOf(Double.POSITIVE_INFINITY));
                i++;
            } while (i < 3);
            ArrayList arrayList2 = new ArrayList(3);
            int i2 = 0;
            do {
                arrayList2.add(0);
                i2++;
            } while (i2 < 3);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                int i3 = 0;
                for (Object obj : (List) it3.next()) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        double dDoubleValue = ((Number) obj).doubleValue();
                        if (dDoubleValue < ((Number) ListProtector.get(arrayList, i3)).doubleValue()) {
                            ListProtector.set(arrayList, i3, Double.valueOf(dDoubleValue));
                        }
                        if (dDoubleValue > ((Number) ListProtector.get((List) LIZIZ.getValue(), i3)).doubleValue()) {
                            ListProtector.set(arrayList2, i3, Integer.valueOf(((Number) ListProtector.get(arrayList2, i3)).intValue() + 1));
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            linkedHashMap.put("total_cnt", String.valueOf(list.size()));
            linkedHashMap.put("priority_cnt", String.valueOf(((Number) ListProtector.get(arrayList2, 0)).intValue()));
            linkedHashMap.put("potential_paid_cnt", String.valueOf(((Number) ListProtector.get(arrayList2, 1)).intValue()));
            linkedHashMap.put("collaboration_invites_cnt", String.valueOf(((Number) ListProtector.get(arrayList2, 2)).intValue()));
            linkedHashMap.put("priority_lowest_score", String.valueOf(((Number) ListProtector.get(arrayList, 0)).doubleValue()));
            linkedHashMap.put("potential_paid_lowest_score", String.valueOf(((Number) ListProtector.get(arrayList, 1)).doubleValue()));
            linkedHashMap.put("collaboration_invites_lowest_score", String.valueOf(((Number) ListProtector.get(arrayList, 2)).doubleValue()));
            linkedHashMap.put("score_source", str);
            linkedHashMap.put("model_scene", C877780Yc4.LIZ().priorityModelScene);
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("message_request_on_device_score", linkedHashMap);
        }
    }

    public static void LIZ(EnumC881060YhM enumC881060YhM, boolean z, String str) {
        long jLongValue;
        EnumC881070YhN errorResult;
        Map<EnumC881060YhM, Long> map = LIZ;
        if (!map.containsKey(enumC881060YhM)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((LinkedHashMap) map).get(enumC881060YhM);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jCurrentTimeMillis - jLongValue;
        if (z) {
            errorResult = enumC881060YhM.getSuccessResult();
        } else {
            errorResult = enumC881060YhM.getErrorResult();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, C877780Yc4.LIZ().priorityModelScene);
        linkedHashMap.put("result", errorResult.getMobValue());
        linkedHashMap.put("duration", String.valueOf(j));
        if (str != null && str.length() > 0) {
            linkedHashMap.put("error_desc", str);
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("message_request_on_device_inference", linkedHashMap);
    }
}
