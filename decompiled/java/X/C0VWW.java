package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.scene.SceneData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VWW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VWW {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C583320MuI());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C799090VWh());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C799100VWi());

    public static final String LJ() {
        Object obj;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        String name = (abstractC1387200mCcLIZIZ == null || (obj = abstractC1387200mCcLIZIZ.LIZ) == null) ? "" : obj.getClass().getName();
        String str = C2187451AjH.LJIIIZ;
        if (str == null) {
            str = "";
        }
        List listLIZ = LIZ();
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        SceneData sceneData = new SceneData(name, str, listLIZ);
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(sceneData);
        return strLJI != null ? strLJI : "";
    }

    public static final List<String> LIZ() {
        if (C799020VWa.LIZIZ().isEmpty()) {
            return null;
        }
        ConcurrentHashMap concurrentHashMapLIZIZ = C799020VWa.LIZIZ();
        ArrayList arrayList = new ArrayList(concurrentHashMapLIZIZ.size());
        Iterator it2 = concurrentHashMapLIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getKey());
        }
        return arrayList;
    }

    public static final Map<String, Object> LIZJ() {
        try {
            if (!C799020VWa.LIZIZ().isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = C799020VWa.LIZIZ().values().iterator();
                while (it2.hasNext()) {
                    Function0<Map<String, Object>> function0LIZ = ((InterfaceC214000s6) it2.next()).LIZ();
                    if (function0LIZ != null) {
                        linkedHashMap.putAll(function0LIZ.invoke());
                    }
                }
                return linkedHashMap;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static final Map<String, Object> LIZLLL() {
        try {
            if (!C799020VWa.LIZIZ().isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = C799020VWa.LIZIZ().values().iterator();
                while (it2.hasNext()) {
                    Function0<Map<String, Object>> function0LIZIZ = ((InterfaceC214000s6) it2.next()).LIZIZ();
                    if (function0LIZIZ != null) {
                        linkedHashMap.putAll(function0LIZIZ.invoke());
                    }
                }
                return linkedHashMap;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static final void LIZIZ(String str) {
        LJFF(str, new C0VWU(str));
    }

    public static final void LJI(String str) {
        LJFF(str, new C0VWV(str));
    }

    public static void LJFF(String str, Function0 function0) {
        if (((Boolean) C799060VWe.LIZ.getValue()).booleanValue() && !((HashSet) LIZ.getValue()).contains(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SceneMonitor:");
            sbLIZ.append(str);
            C0VY3.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), new C799050VWd(function0));
        }
    }
}
