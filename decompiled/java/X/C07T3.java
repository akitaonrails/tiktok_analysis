package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07T3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07T3 {
    public static final boolean LIZJ(Map<String, String> map) {
        String str = map.get("met_parent_template_resource_id");
        if ((str != null && str.length() != 0) || Intrinsics.LJFF(map.get("is_self_created_ame_createtab"), "1")) {
            return false;
        }
        List<String> list = C1865407Si.LIZ;
        if (C13LP.LJJJJ(map.get("shoot_way"), C1865407Si.LIZ)) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(String str, Map<String, String> map) {
        String str2 = map.get("impr_position");
        if (str2 != null && str2.length() != 0) {
            try {
                if (CastIntegerProtector.parseInt(str2) <= 0) {
                    C01CY.LIZJ(str, map, Collections.singletonList("impr_position"), null, "impr_position should > 0");
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LIZ(String str, String str2, Map map, Map map2) {
        if (!C1866507St.LJI || C1866507St.LJFF || C1866507St.LIZ.LJ) {
            return;
        }
        if (Intrinsics.LJFF(map.get("shoot_way"), "story") && Intrinsics.LJFF(map.get("content_type"), "photo_canvas") && Intrinsics.LJFF(map.get("content_source"), "shoot")) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map.get(key);
            if (obj == null) {
                obj = "";
            }
            if (!Intrinsics.LJFF(obj, value)) {
                arrayList.add(key);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("It might be an exception of one of the following situations: 1. Report error  [");
        sbLIZ.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        sbLIZ.append("] parameter in event ");
        sbLIZ.append(str);
        sbLIZ.append(" 2. ");
        sbLIZ.append(str2);
        sbLIZ.append(" event is missing report");
        C01CY.LIZJ(str, map, arrayList, map2, C2188811AlT.LIZIZ(sbLIZ));
    }
}
