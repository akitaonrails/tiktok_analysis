package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01VW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01VW {
    public static final C01VW LIZ = new C01VW();
    public static final long LIZIZ = TimeUnit.DAYS.toMillis(7);
    public static final Type LIZJ = new TypeToken<Map<String, ? extends String>>() { // from class: X.01VX
    }.getType();

    public static long LIZJ() {
        C01B5.LIZ.getClass();
        Iterator it2 = C01B5.LIZ().iterator();
        if (it2.hasNext()) {
            Long lValueOf = Long.valueOf(((C01B6) it2.next()).LIZ);
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(((C01B6) it2.next()).LIZ);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
        }
        return LIZIZ;
    }

    public static Keva LIZIZ() {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skylight_fold_strategy_");
            sbLIZ.append(str);
            c098200Yq2 = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        return (Keva) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
    }

    public static List LIZLLL() {
        String[] stringArray;
        Object obj;
        Keva kevaLIZIZ = LIZIZ();
        if (kevaLIZIZ == null || (stringArray = kevaLIZIZ.getStringArray("active_use_records", new String[0])) == null) {
            stringArray = new String[0];
        }
        if (stringArray.length == 0) {
            return C13BV.INSTANCE;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : stringArray) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                if (lLJIILIIL != null) {
                    arrayList.add(lLJIILIIL);
                }
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        C13BV c13bv = C13BV.INSTANCE;
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = c13bv;
        }
        return (List) obj2;
    }

    public static void LIZ(C01VW c01vw) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        c01vw.getClass();
        long jLIZJ = LIZJ();
        List listLIZLLL = LIZLLL();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZLLL) {
            if (jCurrentTimeMillis - ((Number) obj).longValue() < jLIZJ) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(Long.valueOf(jCurrentTimeMillis));
        int size = arrayList2.size();
        List listLLIIII = arrayList2;
        if (size > 1024) {
            listLLIIII = C13LP.LLIIII(arrayList2.subList(arrayList2.size() - 1024, arrayList2.size()));
        }
        Keva kevaLIZIZ = LIZIZ();
        if (kevaLIZIZ != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                arrayList3.add(String.valueOf(((Number) it2.next()).longValue()));
            }
            kevaLIZIZ.storeStringArray("active_use_records", (String[]) arrayList3.toArray(new String[0]));
        }
    }

    public static void LJ(Map map) {
        Object c098200Yq;
        Keva kevaLIZIZ = LIZIZ();
        if (kevaLIZIZ == null) {
            return;
        }
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        String str = "";
        if (map.isEmpty()) {
            kevaLIZIZ.storeString("pending_tracking_fields", "");
            return;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LJI(map);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 != null) {
            str = str2;
        }
        kevaLIZIZ.storeString("pending_tracking_fields", str);
    }
}
