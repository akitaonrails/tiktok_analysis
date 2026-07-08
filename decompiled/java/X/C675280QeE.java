package X;

import com.bytedance.scene.Scene;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675280QeE {
    public static final ConcurrentHashMap<Integer, C675290QeF> LIZ = new ConcurrentHashMap<>();
    public static C675290QeF LIZIZ;
    public static long LIZJ;

    public static C675290QeF LIZIZ(int i) {
        C675290QeF c675290QeF = LIZ.get(Integer.valueOf(i));
        if (c675290QeF == null) {
            return LIZIZ;
        }
        return c675290QeF;
    }

    public static void LIZ(int i, Boolean bool) {
        long jLongValue;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixPerfLoadMoreMonitor end key=");
        sbLIZ.append(i);
        sbLIZ.append(", isFailed: ");
        sbLIZ.append(bool);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LIZ.remove(Integer.valueOf(i));
            return;
        }
        C675290QeF c675290QeFRemove = LIZ.remove(Integer.valueOf(i));
        if (c675290QeFRemove != null) {
            C2341109Fh.LIZ("MixPerfLoadMoreMonitor end report");
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Long lValueOf = Long.valueOf(LIZJ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, c675290QeFRemove.LIZ);
            jSONObject.put("page_name", c675290QeFRemove.LIZIZ);
            jSONObject.put("root_enter_from_type", c675290QeFRemove.LIZLLL);
            jSONObject.put("meaningful_chunk_total_time", c675290QeFRemove.LJ - c675290QeFRemove.LIZJ);
            if (c675290QeFRemove.LJFF <= 0) {
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 0;
                }
                c675290QeFRemove.LJFF = jLongValue;
            }
            long j = c675290QeFRemove.LJFF;
            if (j > 0) {
                long j2 = c675290QeFRemove.LJI;
                if (j2 > 0) {
                    c675290QeFRemove.LJII = j2 - j;
                }
            }
            jSONObject.put("loading_cost", c675290QeFRemove.LJII);
            jSONObject.put("cursor", c675290QeFRemove.LJIIIIZZ);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_search_trace", jSONObject);
        }
    }
}
