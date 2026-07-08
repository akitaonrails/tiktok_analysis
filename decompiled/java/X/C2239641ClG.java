package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ClG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239641ClG {
    public static final C2239641ClG LIZ = new C2239641ClG();
    public static final LinkedHashMap<Integer, C2239671ClJ> LIZIZ = new LinkedHashMap<>();
    public static C2239671ClJ LIZJ;
    public static Integer LIZLLL;
    public static boolean LJ;

    public static C2239671ClJ LIZ() {
        Integer num = LIZLLL;
        if (num != null) {
            C2239671ClJ c2239671ClJ = LIZIZ.get(Integer.valueOf(num.intValue()));
            if (c2239671ClJ != null) {
                return c2239671ClJ;
            }
        }
        return LIZJ;
    }

    public static void LJII() {
        Integer num;
        if (LIZIZ.size() + (LIZJ != null ? 1 : 0) <= 4) {
            return;
        }
        while (true) {
            LinkedHashMap<Integer, C2239671ClJ> linkedHashMap = LIZIZ;
            if (linkedHashMap.size() + (LIZJ != null ? 1 : 0) <= 4 || (num = (Integer) C13LP.LJJJLIIL(linkedHashMap.keySet())) == null) {
                return;
            }
            int iIntValue = num.intValue();
            linkedHashMap.remove(Integer.valueOf(iIntValue));
            Integer num2 = LIZLLL;
            if (num2 != null && num2.intValue() == iIntValue) {
                LIZLLL = (Integer) C13LP.LJJLIIIJJIZ(linkedHashMap.keySet());
            }
        }
    }

    public static JSONObject LIZIZ(C2239671ClJ c2239671ClJ) throws JSONException {
        boolean zLJFF = Intrinsics.LJFF(c2239671ClJ.LIZ.LIZIZ, EnumC1783070wV7.KEYBOARD.getValue());
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : c2239671ClJ.LIZ.LIZ.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Object> entry2 : c2239671ClJ.LIZIZ.LIZ.entrySet()) {
            String key = entry2.getKey();
            Object value = entry2.getValue();
            if (!zLJFF || !C2239661ClI.LJIILL.contains(key)) {
                jSONObject.put(key, value);
            }
        }
        for (Map.Entry<String, Object> entry3 : c2239671ClJ.LIZJ.LIZ.entrySet()) {
            jSONObject.put(entry3.getKey(), entry3.getValue());
        }
        return jSONObject;
    }

    public static void LJ(int i) {
        C2239671ClJ c2239671ClJLJI = LJI(i);
        if (c2239671ClJLJI == null || c2239671ClJLJI.LIZLLL) {
            return;
        }
        C2239661ClI c2239661ClI = c2239671ClJLJI.LIZIZ;
        if (c2239661ClI.LIZLLL <= 0) {
            c2239661ClI.LIZLLL = System.currentTimeMillis();
            c2239661ClI.LIZJ();
        }
    }

    public static void LJFF(Integer num) {
        int iIntValue;
        C2239671ClJ c2239671ClJLJI;
        if ((num != null || (num = LIZLLL) != null) && (c2239671ClJLJI = LJI((iIntValue = num.intValue()))) != null && !c2239671ClJLJI.LIZLLL && c2239671ClJLJI.LJ) {
            if (!c2239671ClJLJI.LJI ? c2239671ClJLJI.LIZJ.LIZIZ != null : c2239671ClJLJI.LIZIZ.LJIIJJI != null) {
                c2239671ClJLJI.LJFF = false;
                try {
                    try {
                        c2239671ClJLJI.LIZIZ.LIZIZ();
                        AppLogNewUtils.onEventV3("tikbot_video_e2e_tracker", LIZIZ(c2239671ClJLJI));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    LIZJ(iIntValue, c2239671ClJLJI);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZJ(iIntValue, c2239671ClJLJI);
                    throw th;
                }
            }
            c2239671ClJLJI.LJFF = true;
        }
    }

    public static C2239671ClJ LJI(int i) {
        if (i <= 0) {
            return LIZ();
        }
        return LIZIZ.get(Integer.valueOf(i));
    }

    public static void LIZJ(int i, C2239671ClJ c2239671ClJ) {
        boolean z = true;
        c2239671ClJ.LIZLLL = true;
        LinkedHashMap<Integer, C2239671ClJ> linkedHashMap = LIZIZ;
        linkedHashMap.remove(Integer.valueOf(i));
        Integer num = LIZLLL;
        if (num != null && num.intValue() == i) {
            LIZLLL = (Integer) C13LP.LJJLIIIJJIZ(linkedHashMap.keySet());
        }
        C2239671ClJ c2239671ClJLIZ = LIZ();
        if (c2239671ClJLIZ == null || !c2239671ClJLIZ.LJ) {
            z = false;
        }
        LJ = z;
    }

    public static void LIZLLL(C2239641ClG c2239641ClG, int i, String str, int i2) {
        C2239671ClJ c2239671ClJLJI;
        Integer num;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object obj = null;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (i > 0) {
            c2239641ClG.getClass();
            c2239671ClJLJI = LJI(i);
            if (c2239671ClJLJI == null || (num = c2239671ClJLJI.LIZ.LIZJ) == null || num.intValue() != i) {
                return;
            }
        } else {
            c2239641ClG.getClass();
            if (str == null || str.length() <= 0) {
                return;
            }
            c2239671ClJLJI = LIZJ;
            if (c2239671ClJLJI == null || !c2239671ClJLJI.LJ || !Intrinsics.LJFF(c2239671ClJLJI.LIZ.LIZLLL, str)) {
                Iterator<T> it2 = LIZIZ.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    C2239671ClJ c2239671ClJ = (C2239671ClJ) next;
                    if (c2239671ClJ.LJ && Intrinsics.LJFF(c2239671ClJ.LIZ.LIZLLL, str)) {
                        obj = next;
                        break;
                    }
                }
                c2239671ClJLJI = (C2239671ClJ) obj;
                if (c2239671ClJLJI == null) {
                    return;
                }
            }
        }
        if (c2239671ClJLJI.LIZLLL) {
            return;
        }
        C2239661ClI c2239661ClI = c2239671ClJLJI.LIZIZ;
        if (c2239661ClI.LJIIIIZZ > 0) {
            return;
        }
        c2239661ClI.LJIIIIZZ = System.currentTimeMillis();
        c2239661ClI.LIZJ();
    }
}
