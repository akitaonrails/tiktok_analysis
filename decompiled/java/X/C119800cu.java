package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C119800cu {
    public static volatile boolean LIZIZ;
    public static volatile boolean LJ;
    public static volatile JSONObject LIZ = new JSONObject();
    public static final Object LIZJ = new Object();
    public static volatile Map<String, ? extends Set<String>> LIZLLL = new LinkedHashMap();
    public static volatile Set<String> LJFF = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public static void LIZIZ() {
        ?? arrayList;
        JSONObject jSONObject = LIZ;
        LJ = jSONObject.optBoolean("block_only_when_cpu_stressful", LJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(jSONObject.optString("block_event_config"), new String[]{";"}, 0, 6);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a0.LJLIIIL((String) it2.next()).toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{":"}, 2, 2);
            String string = a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJILLIZJL2, 0)).toString();
            if (string.length() > 0) {
                String string2 = listLJJLIIIJILLIZJL2.size() == 2 ? a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJILLIZJL2, 1)).toString() : "";
                if (string2.length() > 0) {
                    List listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL(string2, new String[]{","}, 0, 6);
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL3, 10));
                    Iterator it4 = listLJJLIIIJILLIZJL3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(a0.LJLIIIL((String) it4.next()).toString());
                    }
                    arrayList = new ArrayList();
                    for (Object obj2 : arrayList4) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                Object linkedHashSet = linkedHashMap.get(string);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    linkedHashMap.put(string, linkedHashSet);
                }
                ((Set) linkedHashSet).addAll(arrayList);
            }
        }
        LIZLLL = linkedHashMap;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        List listLJJLIIIJILLIZJL4 = a0.LJJLIIIJILLIZJL(jSONObject.optString("deny_event_names"), new String[]{","}, 0, 6);
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL4, 10));
        Iterator it5 = listLJJLIIIJILLIZJL4.iterator();
        while (it5.hasNext()) {
            arrayList5.add(a0.LJLIIIL((String) it5.next()).toString());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList5) {
            if (((String) obj3).length() > 0) {
                arrayList6.add(obj3);
            }
        }
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            linkedHashSet2.add(it6.next());
        }
        LJFF = linkedHashSet2;
    }

    public static void LIZJ() {
        if (LIZIZ) {
            return;
        }
        synchronized (LIZJ) {
            try {
                if (!LIZIZ) {
                    LIZIZ();
                    LIZIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ(JSONObject jSONObject) {
        LIZ = jSONObject;
        LIZIZ = false;
    }
}
