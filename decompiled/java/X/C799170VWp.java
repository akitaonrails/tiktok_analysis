package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS92S0000000_13;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sliver.Sliver;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799170VWp {
    public static ThreadGroup LIZLLL;
    public static BPEAHandler LJ;
    public static HandlerThread LJFF;
    public static volatile boolean LJII;
    public static final C799170VWp LIZ = new C799170VWp();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static boolean LJI = true;
    public static volatile String LJIIIIZZ = "";
    public static volatile C799190VWr LJIIIZ = new C799270VWz(0).LIZ();
    public static final ARunnableS92S0000000_13 LJIIJ = new ARunnableS92S0000000_13(34);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static void LIZJ() throws JSONException, InterruptedException {
        int iActiveCount;
        int iLIZ;
        Integer num;
        System.currentTimeMillis();
        ThreadGroup threadGroup = LIZLLL;
        if (threadGroup != null && (iActiveCount = threadGroup.activeCount() * 2) > 0) {
            Thread[] threadArr = new Thread[iActiveCount];
            threadGroup.enumerate(threadArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < iActiveCount; i++) {
                Thread thread = threadArr[i];
                if (thread != null && (iLIZ = C20507081p.LIZ(thread)) > 0) {
                    if (LJI) {
                        C2179008gG c2179008gG = C2179008gG.LIZ;
                        String name = thread.getName();
                        c2179008gG.getClass();
                        if (name.length() != 0 && C2179008gG.LIZ(name, true)) {
                            C2179008gG.LIZIZ.add(Integer.valueOf(iLIZ));
                        }
                    }
                    String name2 = thread.getName();
                    if (name2.length() == 0 || (num = (Integer) ((LinkedHashMap) C0VU9.LIZJ).get(name2)) == null || num.intValue() <= 10) {
                        C2179008gG.LIZ.getClass();
                        if (!C2179008gG.LIZIZ.contains(Integer.valueOf(iLIZ))) {
                            linkedHashMap.put(Integer.valueOf(iLIZ), new C799240VWw(thread.getName(), thread));
                        }
                    }
                }
            }
            LJI = false;
            ?? LIZ2 = LIZ(linkedHashMap, C13LP.LLII(linkedHashMap.keySet()), LJIIIZ.LIZLLL, LJIIIZ.LJ, LJIIIZ.LIZIZ);
            if (LIZ2.isEmpty()) {
                return;
            }
            if (LJIIIZ.LJIIIZ > 0) {
                List<Map.Entry> listLL = C13LP.LL(C13LP.LJLLLL(new C512401z8(28), LIZ2.entrySet()), LJIIIZ.LJIIIZ);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLL, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LIZ2 = new LinkedHashMap(iLIZIZ);
                for (Map.Entry entry : listLL) {
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    LIZ2.put(pair.getFirst(), pair.getSecond());
                }
            }
            AtomicBoolean atomicBoolean = C799200VWs.LIZ;
            if (C799200VWs.LIZ.compareAndSet(false, true)) {
                Sliver.registerSamplingListener(C799200VWs.LIZLLL);
            }
            String strInvoke = C07KH.LIZLLL.invoke();
            Map<String, ? extends Object> mapInvoke = C07KH.LJ.invoke();
            for (Map.Entry entry2 : LIZ2.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                ((Number) entry2.getValue()).longValue();
                C799240VWw c799240VWw = (C799240VWw) linkedHashMap.get(Integer.valueOf(iIntValue));
                if (c799240VWw != null) {
                    c799240VWw.LIZJ = System.currentTimeMillis();
                    Sliver.start(c799240VWw.LIZIZ, LJIIIZ.LJI, 100000, EnumC795650VJb.RING);
                }
            }
            Map mapLIZ = LIZ(linkedHashMap, C13LP.LLII(LIZ2.keySet()), LJIIIZ.LJII, LJIIIZ.LJIIIIZZ, 1);
            AtomicBoolean atomicBoolean2 = C799200VWs.LIZ;
            if (C799200VWs.LIZ.compareAndSet(true, false)) {
                Sliver.unRegisterSamplingListener(C799200VWs.LIZLLL);
            }
            Iterator it2 = LIZ2.keySet().iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Number) it2.next()).intValue();
                C799240VWw c799240VWw2 = (C799240VWw) linkedHashMap.get(Integer.valueOf(iIntValue2));
                if (c799240VWw2 != null) {
                    Sliver.stop(c799240VWw2.LIZIZ);
                    if (mapLIZ.containsKey(Integer.valueOf(iIntValue2))) {
                        String str = c799240VWw2.LIZ;
                        mapLIZ.get(Integer.valueOf(iIntValue2));
                        C0VU9.LIZ++;
                        Object obj = 0;
                        if (iIntValue2 > 0) {
                            Map<Integer, Integer> map = C0VU9.LIZIZ;
                            Integer numValueOf = Integer.valueOf(iIntValue2);
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
                            Object obj2 = linkedHashMap2.get(numValueOf);
                            if (obj2 == null) {
                                linkedHashMap2.put(numValueOf, obj);
                                obj2 = obj;
                            }
                            int iIntValue3 = ((Number) obj2).intValue() + 1;
                            map.put(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3));
                            if (iIntValue3 > 10) {
                                C2179008gG.LIZ.getClass();
                                C2179008gG.LIZIZ.add(Integer.valueOf(iIntValue2));
                            }
                        }
                        if (str.length() > 0) {
                            Map<String, Integer> map2 = C0VU9.LIZJ;
                            LinkedHashMap linkedHashMap3 = (LinkedHashMap) map2;
                            Object obj3 = linkedHashMap3.get(str);
                            if (obj3 == null) {
                                linkedHashMap3.put(str, obj);
                            } else {
                                obj = obj3;
                            }
                            map2.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
                        }
                        AtomicBoolean atomicBoolean3 = C799200VWs.LIZ;
                        List listLIZ = C799200VWs.LIZ(c799240VWw2.LIZIZ);
                        if (listLIZ != null) {
                            C799220VWu c799220VWu = new C799220VWu();
                            c799220VWu.LIZIZ = str;
                            c799220VWu.LJFF = strInvoke;
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry<String, ? extends Object> entry3 : mapInvoke.entrySet()) {
                                jSONObject.put(entry3.getKey(), entry3.getValue());
                            }
                            for (Map.Entry<String, ? extends Object> entry4 : C07KH.LJFF.invoke().entrySet()) {
                                jSONObject.put(entry4.getKey(), entry4.getValue());
                            }
                            c799220VWu.LJ = C786410Ut5.J3(jSONObject);
                            c799220VWu.LIZJ = c799240VWw2.LIZJ;
                            c799220VWu.LIZLLL = System.currentTimeMillis();
                            ((ArrayList) c799220VWu.LIZ).addAll(listLIZ);
                            BPEAHandler bPEAHandler = LJ;
                            if (bPEAHandler != null) {
                                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS113S0100000_13(c799220VWu, 179));
                            }
                        }
                    }
                }
            }
            AtomicBoolean atomicBoolean4 = C799200VWs.LIZ;
            ((LinkedHashMap) C799200VWs.LIZJ).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:39:0x0077, B:41:0x007f, B:43:0x0085, B:45:0x008b, B:47:0x0093, B:48:0x0098, B:50:0x009e, B:55:0x00bb, B:57:0x00c1, B:61:0x00ca, B:63:0x00d0, B:65:0x00f0, B:66:0x00f9, B:52:0x00a4, B:54:0x00ae), top: B:74:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00c1 -> B:58:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r10, X.C799190VWr r11) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C799170VWp.LIZIZ(java.lang.String, X.0VWr):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static Map LIZ(Map map, int[] iArr, long j, long j2, int i) throws InterruptedException {
        ?? LJ2;
        Thread.State state;
        Thread thread;
        Map<Integer, Long> map2;
        String str;
        boolean z;
        if (!map.isEmpty() && iArr.length != 0 && i > 0) {
            C798360VTm c798360VTm = new C798360VTm(false, iArr, 22);
            c798360VTm.LIZ();
            C2097608Jq.LJ();
            int i2 = 0;
            while (true) {
                if (C07KH.LIZ) {
                    SystemClock.currentThreadTimeMillis();
                }
                Thread.sleep(j);
                c798360VTm.LIZ();
                if (C07KH.LIZ) {
                    SystemClock.currentThreadTimeMillis();
                }
                if (C07KH.LIZ && (map2 = c798360VTm.LJI.LJIIIIZZ) != null) {
                    for (Map.Entry entry : C2097608Jq.LJIILLIIL(C13LP.LJLLLL(new C512401z8(27), C2097808Js.LJIL(map2))).entrySet()) {
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        long jLongValue = ((Number) entry.getValue()).longValue();
                        C799240VWw c799240VWw = (C799240VWw) ((LinkedHashMap) map).get(Integer.valueOf(iIntValue));
                        if (c799240VWw != null) {
                            str = c799240VWw.LIZ;
                        } else {
                            str = null;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("o:");
                        if (jLongValue > j2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sbLIZ.append(z);
                        sbLIZ.append(" tid:");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(" cpu:");
                        sbLIZ.append(jLongValue);
                        sbLIZ.append(" name:");
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                Map<Integer, Long> map3 = c798360VTm.LJI.LJIIIIZZ;
                if (map3 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Integer, Long> entry2 : map3.entrySet()) {
                        C799240VWw c799240VWw2 = (C799240VWw) ((LinkedHashMap) map).get(Integer.valueOf(entry2.getKey().intValue()));
                        if (c799240VWw2 != null && (thread = c799240VWw2.LIZIZ) != null) {
                            state = thread.getState();
                        } else {
                            state = null;
                        }
                        if (state != Thread.State.TERMINATED) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    LJ2 = new LinkedHashMap();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        long jLongValue2 = ((Number) entry3.getValue()).longValue();
                        if (j2 <= jLongValue2 && jLongValue2 <= j) {
                            LJ2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                } else {
                    LJ2 = C2097608Jq.LJ();
                }
                if (LJ2.isEmpty()) {
                    return C2097608Jq.LJ();
                }
                int[] iArrLLII = C13LP.LLII(LJ2.keySet());
                if (C07KH.LIZ) {
                    C13LQ.LJJIL(iArrLLII, ",", null, 62);
                }
                i2++;
                if (i2 < i) {
                    if (iArrLLII != null) {
                        c798360VTm.LIZLLL = iArrLLII;
                    }
                } else {
                    return LJ2;
                }
            }
        } else {
            return C2097608Jq.LJ();
        }
    }
}
