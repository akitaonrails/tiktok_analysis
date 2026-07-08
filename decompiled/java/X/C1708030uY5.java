package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uY5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708030uY5 {
    public static final C1708030uY5 LIZ = new C1708030uY5();
    public static final ConcurrentHashMap<C1708050uY7, InterfaceC1708000uY2> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0uY6] */
    public final InterfaceC1708000uY2 LIZ(final C1708050uY7 c1708050uY7) {
        ConcurrentHashMap<C1708050uY7, InterfaceC1708000uY2> concurrentHashMap = LIZIZ;
        InterfaceC1708000uY2 interfaceC1708000uY2 = concurrentHashMap.get(c1708050uY7);
        if (interfaceC1708000uY2 == null) {
            synchronized (this) {
                try {
                    InterfaceC1708000uY2 interfaceC1708000uY22 = concurrentHashMap.get(c1708050uY7);
                    if (interfaceC1708000uY22 == null) {
                        final ?? r1 = new InterfaceC1708000uY2(c1708050uY7) { // from class: X.0uY6
                            public final C1708050uY7 LIZ;
                            public long LIZIZ;
                            public volatile Map<String, String> LIZJ;
                            public final ConcurrentHashMap<String, C1708060uY8> LIZLLL = new ConcurrentHashMap<>();
                            public final ConcurrentHashMap<String, Integer> LJ = new ConcurrentHashMap<>();
                            public final ConcurrentHashMap<String, String> LJFF = new ConcurrentHashMap<>();

                            {
                                this.LIZ = c1708050uY7;
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final synchronized void LIZ(String str) {
                                if ("web_router_info".length() != 0 && str != null && str.length() != 0) {
                                    this.LJFF.put("web_router_info", str);
                                }
                            }

                            public final void LJFF(Map<String, String> map) throws JSONException {
                                JSONObject jSONObject = new JSONObject();
                                for (Map.Entry<String, C1708060uY8> entry : this.LIZLLL.entrySet()) {
                                    String key = entry.getKey();
                                    C1708060uY8 value = entry.getValue();
                                    if (value.LIZIZ != -1) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("duration_");
                                        sbLIZ.append(key);
                                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), value.LIZIZ - value.LIZ);
                                    }
                                }
                                map.put("metrics", C786410Ut5.J3(jSONObject));
                            }

                            public final void LJI(Map<String, String> map) throws JSONException {
                                JSONObject jSONObject = new JSONObject();
                                for (Map.Entry<String, C1708060uY8> entry : this.LIZLLL.entrySet()) {
                                    String key = entry.getKey();
                                    C1708060uY8 value = entry.getValue();
                                    long j = value.LIZIZ;
                                    String str = value.LIZLLL;
                                    if (j != -1) {
                                        if (str == null) {
                                            str = "";
                                        }
                                        jSONObject.put(key, str);
                                    }
                                }
                                map.put("stage_error_code", C786410Ut5.J3(jSONObject));
                            }

                            public final void LJII(Map<String, String> map) throws JSONException {
                                JSONObject jSONObject = new JSONObject();
                                for (Map.Entry<String, C1708060uY8> entry : this.LIZLLL.entrySet()) {
                                    String key = entry.getKey();
                                    C1708060uY8 value = entry.getValue();
                                    long j = value.LIZIZ;
                                    Integer num = value.LIZJ;
                                    if (j != -1 && num != null) {
                                        jSONObject.put(key, num.intValue());
                                    }
                                }
                                map.put("stage_result", C786410Ut5.J3(jSONObject));
                            }

                            public final void LJIIIIZZ(Map<String, String> map) throws JSONException {
                                JSONObject jSONObject = new JSONObject();
                                for (Map.Entry<String, C1708060uY8> entry : this.LIZLLL.entrySet()) {
                                    String key = entry.getKey();
                                    C1708060uY8 value = entry.getValue();
                                    long j = value.LIZ;
                                    long j2 = value.LIZIZ;
                                    if (j2 != -1) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("start_");
                                        sbLIZ.append(key);
                                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), j - this.LIZIZ);
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("end_");
                                        sbLIZ2.append(key);
                                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), j2 - this.LIZIZ);
                                    }
                                }
                                map.put("timing", C786410Ut5.J3(jSONObject));
                            }

                            public final void LJIIL(long j) {
                                long j2;
                                Iterator<Map.Entry<String, C1708060uY8>> it2 = this.LIZLLL.entrySet().iterator();
                                C1708060uY8 c1708060uY8 = null;
                                C1708060uY8 c1708060uY82 = null;
                                while (true) {
                                    long j3 = 0;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    C1708060uY8 value = it2.next().getValue();
                                    long j4 = value.LIZ;
                                    if (value.LIZIZ == -1) {
                                        if (c1708060uY82 != null) {
                                            j3 = c1708060uY82.LIZ;
                                        }
                                        if (j4 > j3) {
                                            c1708060uY82 = value;
                                        }
                                    }
                                }
                                if (c1708060uY82 != null) {
                                    c1708060uY82.LIZIZ = j;
                                }
                                String str = null;
                                for (Map.Entry<String, C1708060uY8> entry : this.LIZLLL.entrySet()) {
                                    String key = entry.getKey();
                                    C1708060uY8 value2 = entry.getValue();
                                    long j5 = value2.LIZIZ;
                                    if (j5 != -1) {
                                        if (c1708060uY8 != null) {
                                            j2 = c1708060uY8.LIZIZ;
                                        } else {
                                            j2 = 0;
                                        }
                                        if (j5 > j2) {
                                            c1708060uY8 = value2;
                                            str = key;
                                        }
                                    }
                                }
                                if (c1708060uY8 != null && j - c1708060uY8.LIZIZ > 10) {
                                    ConcurrentHashMap<String, C1708060uY8> concurrentHashMap2 = this.LIZLLL;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("after_");
                                    sbLIZ.append(str);
                                    concurrentHashMap2.put(C2188811AlT.LIZIZ(sbLIZ), new C1708060uY8(c1708060uY8.LIZIZ, j, 12));
                                }
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final synchronized void LIZJ(String str, JSONObject jSONObject) {
                                LJIIJJI(System.currentTimeMillis(), str);
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final synchronized void LIZLLL(Map<String, String> map, Function1<? super Map<String, String>, Unit> function1) {
                                this.LIZIZ = System.currentTimeMillis();
                                this.LIZJ = map;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                if (map != null) {
                                    linkedHashMap.putAll(map);
                                }
                                C1708700uZA c1708700uZALIZ = C1708090uYB.LIZ(this.LIZ.LIZ);
                                c1708700uZALIZ.LIZLLL(this.LIZ.LIZIZ, "start");
                                c1708700uZALIZ.LIZJ(linkedHashMap);
                                C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ(this.LIZ.LIZ);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("-> trace start: ");
                                sbLIZ.append(this.LIZ.LIZIZ);
                                sbLIZ.append(", ");
                                sbLIZ.append(this.LIZ.LIZJ);
                                sbLIZ.append('=');
                                sbLIZ.append(this.LIZ.LIZLLL);
                                c1708720uZCLIZ.LIZ(2, C2188811AlT.LIZIZ(sbLIZ));
                                function1.invoke(linkedHashMap);
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final synchronized void LJ(Map<String, String> map, Function1<? super Map<String, String>, Unit> function1) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = jCurrentTimeMillis - this.LIZIZ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Map<String, String> map2 = this.LIZJ;
                                if (map2 != null) {
                                    linkedHashMap.putAll(map2);
                                }
                                if (map != null) {
                                    linkedHashMap.putAll(map);
                                }
                                linkedHashMap.put("duration", String.valueOf(j));
                                LJIIL(jCurrentTimeMillis);
                                LJIIIIZZ(linkedHashMap);
                                LJFF(linkedHashMap);
                                LJII(linkedHashMap);
                                LJI(linkedHashMap);
                                for (Map.Entry<String, String> entry : this.LJFF.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                                C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ(this.LIZ.LIZ);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("<- trace end: ");
                                sbLIZ.append(this.LIZ.LIZIZ);
                                sbLIZ.append(", ");
                                sbLIZ.append(this.LIZ.LIZJ);
                                sbLIZ.append('=');
                                sbLIZ.append(this.LIZ.LIZLLL);
                                sbLIZ.append(", duration=");
                                sbLIZ.append(j);
                                c1708720uZCLIZ.LIZ(2, C2188811AlT.LIZIZ(sbLIZ));
                                C1708700uZA c1708700uZALIZ = C1708090uYB.LIZ(this.LIZ.LIZ);
                                c1708700uZALIZ.LIZLLL(this.LIZ.LIZIZ, "complete");
                                c1708700uZALIZ.LIZJ(linkedHashMap);
                                function1.invoke(linkedHashMap);
                                C1708030uY5.LIZIZ.remove(this.LIZ);
                            }

                            public final String LJIIIZ(String str, boolean z) {
                                int iIntValue;
                                Integer num = this.LJ.get(str);
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 1;
                                }
                                if (z) {
                                    this.LJ.put(str, Integer.valueOf(iIntValue + 1));
                                }
                                if (iIntValue != 1) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str);
                                    sbLIZ.append('_');
                                    sbLIZ.append(iIntValue);
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }
                                return str;
                            }

                            public final void LJIIJJI(long j, String str) {
                                String strLJIIIZ = LJIIIZ(str, false);
                                this.LIZLLL.put(strLJIIIZ, new C1708060uY8(j, 0L, 14));
                                C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ(this.LIZ.LIZ);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("  -> start_");
                                sbLIZ.append(strLJIIIZ);
                                sbLIZ.append(": ");
                                sbLIZ.append(this.LIZ.LIZIZ);
                                sbLIZ.append(", ");
                                sbLIZ.append(this.LIZ.LIZJ);
                                sbLIZ.append('=');
                                sbLIZ.append(this.LIZ.LIZLLL);
                                sbLIZ.append(", timing=");
                                sbLIZ.append(j);
                                c1708720uZCLIZ.LIZ(2, C2188811AlT.LIZIZ(sbLIZ));
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final synchronized void LIZIZ(String str, JSONObject jSONObject, String str2, int i) {
                                LJIIJ(i, str, System.currentTimeMillis(), str2);
                            }

                            public final void LJIIJ(int i, String str, long j, String str2) {
                                String strLJIIIZ = LJIIIZ(str, true);
                                C1708060uY8 c1708060uY8 = this.LIZLLL.get(strLJIIIZ);
                                if (c1708060uY8 != null) {
                                    c1708060uY8.LIZIZ = j;
                                    c1708060uY8.LIZJ = Integer.valueOf(i);
                                    c1708060uY8.LIZLLL = str2;
                                    long j2 = j - c1708060uY8.LIZ;
                                    C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ(this.LIZ.LIZ);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("  <- end_");
                                    sbLIZ.append(strLJIIIZ);
                                    sbLIZ.append(": ");
                                    sbLIZ.append(this.LIZ.LIZIZ);
                                    sbLIZ.append(", ");
                                    sbLIZ.append(this.LIZ.LIZJ);
                                    sbLIZ.append('=');
                                    sbLIZ.append(this.LIZ.LIZLLL);
                                    sbLIZ.append(", duration=");
                                    sbLIZ.append(j2);
                                    sbLIZ.append(", timing=");
                                    sbLIZ.append(j);
                                    c1708720uZCLIZ.LIZ(2, C2188811AlT.LIZIZ(sbLIZ));
                                    return;
                                }
                                C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ(this.LIZ.LIZ);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("  <- error! end_");
                                sbLIZ2.append(strLJIIIZ);
                                sbLIZ2.append(" doesn't have a start, pls check: ");
                                sbLIZ2.append(this.LIZ.LIZIZ);
                                sbLIZ2.append(", ");
                                sbLIZ2.append(this.LIZ.LIZJ);
                                sbLIZ2.append('=');
                                sbLIZ2.append(this.LIZ.LIZLLL);
                                c1708720uZCLIZ2.LIZ(5, C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        };
                        InterfaceC1708000uY2 interfaceC1708000uY23 = new InterfaceC1708000uY2(r1) { // from class: X.0uY4
                            public final InterfaceC1708000uY2 LIZ;

                            {
                                this.LIZ = r1;
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final void LIZ(String str) {
                                try {
                                    this.LIZ.LIZ(str);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final void LIZJ(String str, JSONObject jSONObject) {
                                try {
                                    this.LIZ.LIZJ(str, jSONObject);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final void LIZLLL(Map<String, String> map, Function1<? super Map<String, String>, Unit> function1) {
                                try {
                                    this.LIZ.LIZLLL(map, function1);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final void LJ(Map<String, String> map, Function1<? super Map<String, String>, Unit> function1) {
                                try {
                                    this.LIZ.LJ(map, function1);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1708000uY2
                            public final void LIZIZ(String str, JSONObject jSONObject, String str2, int i) {
                                try {
                                    this.LIZ.LIZIZ(str, jSONObject, str2, i);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }
                        };
                        concurrentHashMap.put(c1708050uY7, interfaceC1708000uY23);
                        return interfaceC1708000uY23;
                    }
                    return interfaceC1708000uY22;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return interfaceC1708000uY2;
    }
}
