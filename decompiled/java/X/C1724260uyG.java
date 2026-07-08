package X;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724260uyG extends AbstractC1724310uyL {
    @Override // X.AbstractC1724310uyL
    public final String LJI() {
        return "pipo.fetch";
    }

    public static void LJII(InterfaceC1063920dnC interfaceC1063920dnC, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("response", str);
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        C1723950uxl.LIZJ("pipo.fetch", jSONObject, interfaceC1063920dnC);
    }

    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
    public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, final InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
        final Map<String, Object> mapLIZ;
        final Map<String, Object> mapLIZ2;
        final String strAsString;
        Map<String, Object> mapLIZ3;
        super.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, enumC1059790dgX);
        try {
            final String string = interfaceC1107590evd.getString("method");
            final String string2 = interfaceC1107590evd.getString("url");
            final Map<String, Object> map = null;
            if (interfaceC1107590evd.hasKey("headers")) {
                mapLIZ = interfaceC1107590evd.getMap("headers").LIZ();
            } else {
                mapLIZ = null;
            }
            if (interfaceC1107590evd.hasKey("params")) {
                mapLIZ2 = interfaceC1107590evd.getMap("params").LIZ();
            } else {
                mapLIZ2 = null;
            }
            InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get("body");
            if (interfaceC1871820yoG.getType() == EnumC1323480kXq.Map) {
                InterfaceC1107590evd interfaceC1107590evdAsMap = interfaceC1871820yoG.asMap();
                if (interfaceC1107590evdAsMap != null) {
                    mapLIZ3 = interfaceC1107590evdAsMap.LIZ();
                } else {
                    mapLIZ3 = null;
                }
                strAsString = null;
                map = mapLIZ3;
            } else if (interfaceC1871820yoG.getType() == EnumC1323480kXq.String) {
                strAsString = interfaceC1871820yoG.asString();
            } else {
                strAsString = null;
            }
            if (!TextUtils.equals(string, "GET") && !TextUtils.equals(string, "POST")) {
                C1723950uxl.LIZLLL("pipo.fetch", "invalid request_method!", interfaceC1063920dnC);
                return;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new Runnable() { // from class: X.0uyH
                    public final void LIZ() {
                        if (TextUtils.equals(string, "GET")) {
                            C1724260uyG c1724260uyG = this.LLIZLLLIL;
                            String str = string2;
                            Map map2 = mapLIZ;
                            Map map3 = mapLIZ2;
                            InterfaceC1063920dnC interfaceC1063920dnC2 = interfaceC1063920dnC;
                            c1724260uyG.getClass();
                            C1724260uyG.LJIIIIZZ(str, map2, map3, interfaceC1063920dnC2);
                            return;
                        }
                        if (TextUtils.equals(string, "POST")) {
                            Map map4 = map;
                            if (map4 != null) {
                                C1724260uyG c1724260uyG2 = this.LLIZLLLIL;
                                String str2 = string2;
                                Map map5 = mapLIZ;
                                InterfaceC1063920dnC interfaceC1063920dnC3 = interfaceC1063920dnC;
                                c1724260uyG2.getClass();
                                C1724260uyG.LJIIJ(str2, map5, map4, interfaceC1063920dnC3);
                                return;
                            }
                            C1724260uyG c1724260uyG3 = this.LLIZLLLIL;
                            String str3 = string2;
                            Map map6 = mapLIZ;
                            String str4 = strAsString;
                            InterfaceC1063920dnC interfaceC1063920dnC4 = interfaceC1063920dnC;
                            c1724260uyG3.getClass();
                            C1724260uyG.LJIIIZ(str3, map6, str4, interfaceC1063920dnC4);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FetchMethod@7a19.handle$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FetchMethod@7a19.handle$1");
                    }
                });
                return;
            }
            if (TextUtils.equals(string, "GET")) {
                LJIIIIZZ(string2, mapLIZ, mapLIZ2, interfaceC1063920dnC);
                return;
            }
            if (TextUtils.equals(string, "POST")) {
                LJIIJ(string2, mapLIZ, map, interfaceC1063920dnC);
                if (map != null) {
                    LJIIJ(string2, mapLIZ, map, interfaceC1063920dnC);
                } else {
                    LJIIIZ(string2, mapLIZ, strAsString, interfaceC1063920dnC);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1723950uxl.LIZLLL("pipo.fetch", th.getMessage(), interfaceC1063920dnC);
        }
    }

    public static void LJIIIIZZ(String str, Map map, Map map2, InterfaceC1063920dnC interfaceC1063920dnC) {
        try {
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    Object obj = map2.get(str2);
                    if (obj != null) {
                        arrayList.add(new Pair(str2, obj.toString()));
                    }
                }
            }
            if (arrayList.size() > 0) {
                str = C08GY.LIZ(str, arrayList);
            }
            HashMap map3 = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    map3.put(str3, map.get(str3).toString());
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start get request:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            LJII(interfaceC1063920dnC, C1724150uy5.LJIIL.LIZ.LJIILIIL.LIZIZ(str, map3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get error:");
            sbLIZ2.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("get failed:");
            sbLIZ3.append(th.getMessage());
            C1723950uxl.LIZLLL("pipo.fetch", C2188811AlT.LIZIZ(sbLIZ3), interfaceC1063920dnC);
        }
    }

    public static void LJIIIZ(String str, Map map, String str2, InterfaceC1063920dnC interfaceC1063920dnC) {
        byte[] bytes;
        try {
            HashMap map2 = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    map2.put(str3, map.get(str3).toString());
                }
            }
            if (str2 == null) {
                bytes = null;
            } else {
                bytes = str2.getBytes();
            }
            LJII(interfaceC1063920dnC, C1724150uy5.LJIIL.LIZ.LJIILIIL.LJ(str, bytes, map2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post error:");
            sbLIZ.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("post failed:");
            sbLIZ2.append(th.getMessage());
            C1723950uxl.LIZLLL("pipo.fetch", C2188811AlT.LIZIZ(sbLIZ2), interfaceC1063920dnC);
        }
    }

    public static void LJIIJ(String str, Map map, Map map2, InterfaceC1063920dnC interfaceC1063920dnC) {
        try {
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    arrayList.add(new Pair(str2, map2.get(str2).toString()));
                }
            }
            HashMap map3 = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    map3.put(str3, map.get(str3).toString());
                }
            }
            LJII(interfaceC1063920dnC, C1724150uy5.LJIIL.LIZ.LJIILIIL.LIZLLL(str, arrayList, map3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post error:");
            sbLIZ.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("post failed:");
            sbLIZ2.append(th.getMessage());
            C1723950uxl.LIZLLL("pipo.fetch", C2188811AlT.LIZIZ(sbLIZ2), interfaceC1063920dnC);
        }
    }
}
