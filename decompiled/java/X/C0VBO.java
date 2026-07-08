package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBO {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static final List<String> LIZIZ = Arrays.asList("tracing");
    public static final List<C0VBU> LIZJ;
    public static final C0VBT LIZLLL;
    public static final C0VBQ LJ;
    public static final C0VBR LJFF;
    public static final C0VBS LJI;
    public static final C792930V8p LJII;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0V8p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0VBS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0VBQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0VBT, java.lang.Object] */
    static {
        ?? r5 = new AbstractC793690VBn() { // from class: X.0VBT
            @Override // X.C0VBU
            public final String LIZ() {
                return "/monitor/collect/c/exception";
            }

            @Override // X.C0VBU
            public final String getName() {
                return "exception";
            }

            @Override // X.C0VBU
            public final List<String> getUrls() {
                C0V7Z c0v7z = C792520V7a.LIZ;
                C792880V8k c792880V8k = c0v7z.LJFF;
                return (c792880V8k == null || C08GN.LIZIZ(c792880V8k.LJ)) ? c0v7z.LJ : c0v7z.LJFF.LJ;
            }

            @Override // X.C0VBU
            public final C793730VBr LIZIZ(HashMap<Long, JSONArray> map) {
                JSONArray jSONArray;
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    long jLIZ = C793610VBf.LIZ();
                    String str = C793600VBe.LIZIZ().LIZ(String.valueOf(jLIZ)).LIZLLL;
                    for (Long l : map.keySet()) {
                        if (Objects.equals(C793600VBe.LIZIZ().LIZ(String.valueOf(l)).LIZLLL, str) && (jSONArray = map.get(l)) != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                jSONArray2.put(jSONArray.get(i));
                            }
                        }
                    }
                    jSONObject.put("header", C793610VBf.LIZIZ(C793600VBe.LIZIZ().LIZ(String.valueOf(jLIZ))));
                    jSONObject.put("data", jSONArray2);
                    return LIZJ(jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        };
        LIZLLL = r5;
        ?? r4 = new AbstractC793690VBn() { // from class: X.0VBQ
            @Override // X.C0VBU
            public final String LIZ() {
                return "/monitor/collect/c/trace_collect";
            }

            @Override // X.C0VBU
            public final String getName() {
                return "trace";
            }

            @Override // X.C0VBU
            public final List<String> getUrls() {
                C0V7Z c0v7z = C792520V7a.LIZ;
                C792880V8k c792880V8k = c0v7z.LJFF;
                return (c792880V8k == null || C08GN.LIZIZ(c792880V8k.LJFF)) ? c0v7z.LIZLLL : c0v7z.LJFF.LJFF;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
            @Override // X.C0VBU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C793730VBr LIZIZ(java.util.HashMap<java.lang.Long, org.json.JSONArray> r12) {
                /*
                    Method dump skipped, instruction units count: 232
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0VBQ.LIZIZ(java.util.HashMap):X.0VBr");
            }
        };
        LJ = r4;
        C0VBR c0vbr = new C0VBR();
        LJFF = c0vbr;
        ?? r2 = new AbstractC793690VBn() { // from class: X.0VBS
            @Override // X.C0VBU
            public final String LIZ() {
                return "double_send";
            }

            @Override // X.C0VBU
            public final String getName() {
                return "double_send";
            }

            @Override // X.C0VBU
            public final List<String> getUrls() {
                C0V7Z c0v7z = C792520V7a.LIZ;
                C792880V8k c792880V8k = c0v7z.LJFF;
                return (c792880V8k == null || C08GN.LIZIZ(c792880V8k.LIZLLL)) ? c0v7z.LIZJ : c0v7z.LJFF.LIZLLL;
            }

            @Override // X.C0VBU
            public final C793730VBr LIZIZ(HashMap<Long, JSONArray> map) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Long l : map.keySet()) {
                        C793620VBg c793620VBgLIZ = C793600VBe.LIZIZ().LIZ(String.valueOf(l));
                        if (c793620VBgLIZ == null) {
                            if (C792190V5t.LIZ()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("HeaderInfo null for key ");
                                sbLIZ.append(l);
                                C2188811AlT.LIZIZ(sbLIZ);
                                InterfaceC792920V8o interfaceC792920V8o = C792910V8n.LIZ;
                                if (interfaceC792920V8o != null) {
                                    interfaceC792920V8o.w();
                                }
                            }
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("data", map.get(l));
                            jSONObject.put("header", C793610VBf.LIZIZ(c793620VBgLIZ));
                            jSONArray.put(jSONObject);
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("list", jSONArray);
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("request:");
                        sbLIZ2.append(jSONObject2);
                        C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    InterfaceC793570VBb interfaceC793570VBb = (InterfaceC793570VBb) C792590V7h.LIZ(InterfaceC793570VBb.class);
                    if (interfaceC793570VBb != null) {
                        jSONObject2 = interfaceC793570VBb.LIZ();
                    }
                    return LIZJ(jSONObject2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        };
        LJI = r2;
        ?? r1 = new C0VBR() { // from class: X.0V8p
            @Override // X.C0VBR, X.C0VBU
            public final String LIZ() {
                return "/monitor/collect/batch/high_priority/";
            }

            @Override // X.C0VBR, X.C0VBU
            public final String getName() {
                return "high_priority_log";
            }

            @Override // X.C0VBR, X.C0VBU
            public final List<String> getUrls() {
                C0V7Z c0v7z = C792520V7a.LIZ;
                C792880V8k c792880V8k = c0v7z.LJFF;
                return (c792880V8k == null || C08GN.LIZIZ(c792880V8k.LIZIZ)) ? c0v7z.LIZIZ : c0v7z.LJFF.LIZIZ;
            }
        };
        LJII = r1;
        ArrayList arrayList = new ArrayList();
        LIZJ = arrayList;
        arrayList.add(r5);
        arrayList.add(r4);
        arrayList.add(c0vbr);
        arrayList.add(r2);
        arrayList.add(r1);
    }

    public static void LIZ(Map<Long, List<C0VBW>> map) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendLog: input sendList merged into ");
            HashMap map2 = (HashMap) map;
            sbLIZ.append(map2.size());
            sbLIZ.append(" group(s)");
            C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                C792910V8n.LIZ("APM-Slardar", "----------------");
                C793620VBg c793620VBgLIZ = C793600VBe.LIZIZ().LIZ(String.valueOf(key));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("group ");
                int i2 = i + 1;
                sbLIZ2.append(i);
                sbLIZ2.append(" header:");
                sbLIZ2.append(c793620VBgLIZ);
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
                for (int i3 = 0; i3 < list.size(); i3++) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("  log[");
                    sbLIZ3.append(i3);
                    sbLIZ3.append("]=");
                    sbLIZ3.append(((C0VBW) ListProtector.get(list, i3)).toString());
                    C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ3));
                }
                C792910V8n.LIZ("APM-Slardar", "----------------");
                i = i2;
            }
        }
    }

    public static AbstractC793690VBn LIZIZ(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("log_type");
        if (C791180V1w.LIZ.contains(strOptString)) {
            return LIZLLL;
        }
        if (LIZIZ.contains(strOptString)) {
            return LJ;
        }
        if (jSONObject.optBoolean("api_double_send")) {
            return LJI;
        }
        InterfaceC792280V6c interfaceC792280V6c = (InterfaceC792280V6c) C792590V7h.LIZ(InterfaceC792280V6c.class);
        if (interfaceC792280V6c != null && interfaceC792280V6c.LIZIZ(jSONObject)) {
            return LJII;
        }
        return LJFF;
    }

    public static Map LIZJ(List list, List list2, int i) {
        int length;
        JSONObject jSONObjectOptJSONObject;
        String[] list3;
        try {
            HashMap map = new HashMap();
            ArrayList<C0VBZ> arrayList = (ArrayList) list;
            long size = arrayList.size();
            long j = 0;
            long j2 = 0;
            for (C0VBZ c0vbz : arrayList) {
                long j3 = c0vbz.LIZ;
                List arrayList2 = (List) map.get(Long.valueOf(j3));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Long.valueOf(j3), arrayList2);
                }
                j += (long) c0vbz.LIZJ;
                j2 += (long) c0vbz.LIZIZ;
                arrayList2.addAll(c0vbz.LJ);
            }
            LIZ(map);
            C0VBP c0vbp = C793560VBa.LIZ;
            c0vbp.LIZJ();
            C0VSJ c0vsj = c0vbp.LIZLLL;
            if (c0vsj != null && (list3 = c0vsj.list()) != null) {
                length = list3.length;
            } else {
                length = 0;
            }
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            long j4 = 0;
            long length2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                Long l = (Long) entry.getKey();
                List list4 = (List) entry.getValue();
                if (list4 != null) {
                    for (int i2 = 0; i2 < list4.size(); i2++) {
                        C0VBW c0vbw = (C0VBW) list4.get(i2);
                        try {
                            try {
                            } catch (Exception e) {
                                e = e;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(new String(c0vbw.LIZ));
                                if (!C793520VAw.LIZ.LIZJ(C792420V6q.LIZIZ(), jSONObject)) {
                                    if (C792190V5t.LIZ()) {
                                        C792910V8n.LIZ("APM-Downgrade", C786410Ut5.J3(jSONObject));
                                    }
                                } else {
                                    AbstractC793690VBn abstractC793690VBnLIZIZ = LIZIZ(jSONObject);
                                    if (((ArrayList) list2).contains(abstractC793690VBnLIZIZ.LIZ())) {
                                        j4++;
                                        length2 += (long) c0vbw.LIZ.length;
                                    } else {
                                        if (abstractC793690VBnLIZIZ instanceof C0VBR) {
                                            try {
                                                jSONObjectOptJSONObject = jSONObject.optJSONObject("_debug_self");
                                                if (jSONObjectOptJSONObject == null) {
                                                    jSONObjectOptJSONObject = new JSONObject();
                                                    jSONObject.put("_debug_self", jSONObjectOptJSONObject);
                                                }
                                                jSONObjectOptJSONObject.put("debug_sender_number", LIZ.getAndIncrement());
                                                try {
                                                    jSONObjectOptJSONObject.put("debug_sender_sid", C792420V6q.LJIIIZ());
                                                    jSONObjectOptJSONObject.put("debug_total_bytes", j);
                                                    jSONObjectOptJSONObject.put("debug_total_count", j2);
                                                    jSONObjectOptJSONObject.put("debug_merge_file_count", size);
                                                    jSONObjectOptJSONObject.put("debug_second_file_count", length);
                                                } catch (Exception e2) {
                                                    e = e2;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                            }
                                            try {
                                                jSONObjectOptJSONObject.put("debug_left_file_count", i);
                                            } catch (Exception e4) {
                                                e = e4;
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                            if (jSONObject.has("seq_no")) {
                                                arrayList3.add(String.valueOf(jSONObject.get("seq_no")));
                                            }
                                        }
                                        Map map4 = (Map) map2.get(abstractC793690VBnLIZIZ);
                                        if (map4 == null) {
                                            map4 = new HashMap();
                                            map2.put(abstractC793690VBnLIZIZ, map4);
                                        }
                                        if (!map4.containsKey(l)) {
                                            map4.put(l, new JSONArray());
                                        }
                                        ((JSONArray) map4.get(l)).put(jSONObject);
                                        String strOptString = jSONObject.optString("store_region");
                                        List arrayList4 = (List) map3.get(abstractC793690VBnLIZIZ);
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                            map3.put(abstractC793690VBnLIZIZ, arrayList4);
                                        }
                                        if (!TextUtils.isEmpty(strOptString) && !arrayList4.contains(strOptString)) {
                                            arrayList4.add(strOptString);
                                        }
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Exception e6) {
                            e = e6;
                        }
                    }
                }
            }
            HashMap map5 = new HashMap();
            for (C0VBU c0vbu : map2.keySet()) {
                map5.put(c0vbu, new Pair((List) map3.get(c0vbu), c0vbu.LIZIZ((HashMap) map2.get(c0vbu))));
            }
            if (j4 > 0) {
                C793500VAu.LIZ.LIZJ(j4, length2, System.currentTimeMillis());
            }
            return map5;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-Slardar", "LogSender serialize failed.", th);
            return null;
        }
    }
}
