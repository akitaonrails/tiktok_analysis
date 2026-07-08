package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qPN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548870qPN {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C1061730djf LIZ = new C1061730djf();
    public final ConcurrentHashMap<String, ConcurrentHashMap<C1488290opf<InterfaceC1548890qPP>, InterfaceC1141530foN>> LIZIZ = new ConcurrentHashMap<>();
    public final ReferenceQueue<InterfaceC1548890qPP> LIZJ = new ReferenceQueue<>();

    public final void LIZ() {
        Reference<? extends InterfaceC1548890qPP> referencePoll = this.LIZJ.poll();
        while (referencePoll instanceof C1488290opf) {
            String str = ((C1488290opf) referencePoll).LIZ;
            InterfaceC1141530foN interfaceC1141530foN = (InterfaceC1141530foN) C19719512Dh.LIZJ(LIZIZ(str)).remove(referencePoll);
            if (interfaceC1141530foN != null) {
                C1548820qPI.LJIIIIZZ(str, interfaceC1141530foN);
            }
            referencePoll = this.LIZJ.poll();
        }
    }

    public final ConcurrentHashMap<C1488290opf<InterfaceC1548890qPP>, InterfaceC1141530foN> LIZIZ(String str) {
        ConcurrentHashMap<C1488290opf<InterfaceC1548890qPP>, InterfaceC1141530foN> concurrentHashMap;
        ConcurrentHashMap<C1488290opf<InterfaceC1548890qPP>, InterfaceC1141530foN> concurrentHashMap2 = this.LIZIZ.get(str);
        if (concurrentHashMap2 == null) {
            synchronized (this) {
                try {
                    concurrentHashMap = this.LIZIZ.get(str);
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap<>();
                        this.LIZIZ.put(str, concurrentHashMap);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return concurrentHashMap;
        }
        return concurrentHashMap2;
    }

    public static void LIZJ(List list, JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.add(linkedHashMap);
                LIZLLL((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                list.add(arrayList);
                LIZJ(arrayList, (JSONArray) obj);
            } else {
                list.add(jSONArray.get(i));
            }
        }
        C13LP.LLIIII(list);
    }

    public static Map LIZLLL(JSONObject jSONObject, Map map) throws JSONException {
        if (map == null) {
            map = new LinkedHashMap();
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                map.put(next, linkedHashMap);
                LIZLLL((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                map.put(next, arrayList);
                LIZJ(arrayList, (JSONArray) obj);
            } else {
                map.put(next, obj);
            }
        }
        return C2097608Jq.LJIIZILJ(map);
    }

    public final void LJ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1061730djf c1061730djf = this.LIZ;
            Map mapLIZLLL = LIZLLL(jSONObject, null);
            c1061730djf.getClass();
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(mapLIZLLL), str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public final void LJFF(final String str, InterfaceC1548890qPP interfaceC1548890qPP) {
        final C1488290opf<InterfaceC1548890qPP> c1488290opf = new C1488290opf<>(str, interfaceC1548890qPP, this.LIZJ);
        InterfaceC1141530foN interfaceC1141530foN = new InterfaceC1141530foN() { // from class: X.0qPO
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                JSONObject jSONObject;
                InterfaceC1548890qPP interfaceC1548890qPP2 = c1488290opf.get();
                if (interfaceC1548890qPP2 != null) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null) {
                        C1872780ypo.LIZ.getClass();
                        jSONObject = C1872780ypo.LIZIZ(interfaceC1107590evd);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    interfaceC1548890qPP2.onEvent(c262100zr.LIZ, C786410Ut5.J3(jSONObject));
                    return;
                }
                C1548820qPI.LJIIIIZZ(str, this);
            }
        };
        LIZIZ(str).put(c1488290opf, interfaceC1141530foN);
        C1548820qPI.LIZLLL(str, interfaceC1141530foN);
        LIZ();
    }

    public final void LJI(String str, InterfaceC1548890qPP interfaceC1548890qPP) {
        ConcurrentHashMap<C1488290opf<InterfaceC1548890qPP>, InterfaceC1141530foN> concurrentHashMapLIZIZ = LIZIZ(str);
        for (Reference reference : Collections.list(concurrentHashMapLIZIZ.keys())) {
            if (Intrinsics.LJFF(reference.get(), interfaceC1548890qPP)) {
                InterfaceC1141530foN interfaceC1141530foN = concurrentHashMapLIZIZ.get(reference);
                if (interfaceC1141530foN != null) {
                    C1548820qPI.LJIIIIZZ(str, interfaceC1141530foN);
                }
                concurrentHashMapLIZIZ.remove(reference);
            }
        }
        LIZ();
    }
}
