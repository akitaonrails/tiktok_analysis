package X;

import Y.ARunnableS98S0000000_23;
import android.os.Handler;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pWM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514760pWM {
    public static final C1514760pWM LIZ = new C1514760pWM();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicLong LIZJ = new AtomicLong(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, long[]] */
    public static void LIZ() throws JSONException {
        Map mapLJIIZILJ;
        Object c098200Yq;
        ArrayList<Pair> arrayList;
        Map mapLJIIZILJ2;
        Object c098200Yq2;
        long andIncrement = LIZJ.getAndIncrement();
        ConcurrentHashMap<String, AtomicLong> concurrentHashMap = C1520730pfz.LIZJ;
        if (concurrentHashMap.isEmpty()) {
            mapLJIIZILJ = C2097608Jq.LJ();
        } else {
            HashMap map = new HashMap(concurrentHashMap.size());
            for (Map.Entry<String, AtomicLong> entry : concurrentHashMap.entrySet()) {
                map.put(entry.getKey(), Long.valueOf(entry.getValue().get()));
            }
            mapLJIIZILJ = C2097608Jq.LJIIZILJ(map);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : mapLJIIZILJ.entrySet()) {
            if (true ^ u.LJIIZILJ((String) entry2.getKey(), "bd_hybrid_monitor_container_status", false)) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        try {
            c098200Yq = new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("sum", Long.valueOf(C13LP.LJZL(linkedHashMap.values()))), new Pair("detail", linkedHashMap)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new JSONObject();
        }
        String strJ3 = C786410Ut5.J3((JSONObject) c098200Yq);
        C1514800pWQ c1514800pWQ = C1514790pWP.LIZIZ;
        synchronized (c1514800pWQ.LIZIZ) {
            try {
                Set<Map.Entry<View, C1514770pWN>> setEntrySet = c1514800pWQ.LIZIZ.entrySet();
                arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
                Iterator it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it2.next();
                    String str = ((C1514770pWN) entry3.getValue()).LIZJ;
                    C1520380pfQ.LIZ.getClass();
                    InterfaceC1514780pWO interfaceC1514780pWO = C1520380pfQ.LJIIIZ;
                    arrayList.add(new Pair(str, Boolean.valueOf(interfaceC1514780pWO != null ? interfaceC1514780pWO.LIZJ((View) entry3.getKey()) : false)));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (arrayList.isEmpty()) {
            mapLJIIZILJ2 = C2097608Jq.LJ();
        } else {
            HashMap map2 = new HashMap(arrayList.size());
            for (Pair pair : arrayList) {
                Object first = pair.getFirst();
                boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
                Object obj = map2.get(first);
                Object obj2 = obj;
                if (obj == null) {
                    long[] jArr = {0, 0};
                    map2.put(first, jArr);
                    obj2 = jArr;
                }
                long[] jArr2 = (long[]) obj2;
                if (zBooleanValue) {
                    jArr2[1] = jArr2[1] + 1;
                } else {
                    jArr2[0] = jArr2[0] + 1;
                }
            }
            mapLJIIZILJ2 = C2097608Jq.LJIIZILJ(map2);
        }
        Set<Map.Entry> setEntrySet2 = mapLJIIZILJ2.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry4 : setEntrySet2) {
            String str2 = (String) entry4.getKey();
            long[] jArr3 = (long[]) entry4.getValue();
            String strLIZIZ = C08HX.LIZIZ(str2);
            ?? r2 = linkedHashMap2.get(strLIZIZ);
            if (r2 == 0) {
                r2 = new long[]{0, 0};
                linkedHashMap2.put(strLIZIZ, r2);
            }
            long[] jArr4 = (long[]) r2;
            jArr4[0] = jArr4[0] + jArr3[0];
            jArr4[1] = jArr4[1] + jArr3[1];
            linkedHashMap2.put(strLIZIZ, jArr4);
        }
        Pair[] pairArr = new Pair[2];
        long j = 0;
        for (long[] jArr5 : linkedHashMap2.values()) {
            long j2 = 0;
            for (long j3 : jArr5) {
                j2 += j3;
            }
            j += j2;
        }
        pairArr[0] = new Pair("sum", Long.valueOf(j));
        pairArr[1] = new Pair("detailV2", linkedHashMap2);
        try {
            c098200Yq2 = new JSONObject(C2097608Jq.LJIIIIZZ(pairArr));
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            c098200Yq2 = new JSONObject();
        }
        String strJ32 = C786410Ut5.J3((JSONObject) c098200Yq2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventCounter", strJ3);
        jSONObject.put("alivePageKey", strJ32);
        jSONObject.put("inc", andIncrement);
        C1520360pfO c1520360pfO = new C1520360pfO("bd_hybrid_monitor_container_status");
        c1520360pfO.LIZIZ = "hybridkit_default_bid";
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LIZIZ(0);
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        C1520380pfQ.LIZ.getClass();
        C1520380pfQ.LIZ(c1520350pfNLIZ);
    }

    public static void LIZIZ() {
        if (LIZIZ.compareAndSet(false, true)) {
            LIZJ();
        }
    }

    public static void LIZJ() {
        EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.HYBRID_STATUS_JOBBER_ENABLE;
        if (enumC1520990pgP.isEnabled()) {
            long jOptLong = enumC1520990pgP.getOptions().optLong("hybrid_status_jobber_interval", 300000L);
            if (jOptLong < 60000) {
                jOptLong = 60000;
            }
            C786410Ut5.LJLIIL(jOptLong, (Handler) C824310WVh.LIZIZ.getValue(), new C0W89(new ARunnableS98S0000000_23(enumC1520990pgP, 20)));
        }
    }
}
