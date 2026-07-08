package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qPI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548820qPI {
    public static long LIZ = 300000;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C398001gg());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1548830qPJ());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1548840qPK());
    public static boolean LJ;

    public static ConcurrentHashMap LIZJ() {
        return (ConcurrentHashMap) LIZJ.getValue();
    }

    public static void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet();
        for (C397901gf c397901gf : (CopyOnWriteArrayList) LIZIZ.getValue()) {
            if (Math.abs(jCurrentTimeMillis - c397901gf.LLILLJJLI) > LIZ) {
                concurrentSkipListSet.add(c397901gf);
            }
        }
        Iterator it2 = concurrentSkipListSet.iterator();
        while (it2.hasNext()) {
            ((CopyOnWriteArrayList) LIZIZ.getValue()).remove(it2.next());
        }
    }

    public static final void LIZIZ(C397901gf c397901gf) {
        if (c397901gf.LL == null) {
            return;
        }
        LIZ();
        if (c397901gf.LLILZ) {
            ((CopyOnWriteArrayList) LIZIZ.getValue()).add(c397901gf);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZJ().get(c397901gf.LL);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                InterfaceC1548390qOb interfaceC1548390qOb = ((C085L) it3.next()).LIZJ;
                if (interfaceC1548390qOb != null) {
                    interfaceC1548390qOb.H4(c397901gf.LLILLL, c397901gf.LL);
                }
            }
        }
    }

    public static final void LJII(String str) {
        for (Map.Entry entry : LIZJ().entrySet()) {
            for (C085L c085l : (Iterable) entry.getValue()) {
                if (Intrinsics.LJFF(c085l.LIZ, str)) {
                    ((CopyOnWriteArrayList) entry.getValue()).remove(c085l);
                }
            }
        }
    }

    public static final void LIZLLL(String str, InterfaceC1141530foN interfaceC1141530foN) {
        LJ(str, interfaceC1141530foN, System.currentTimeMillis(), UUID.randomUUID().toString());
    }

    public static final void LJI(C085L c085l, String str) throws JSONException {
        if (c085l == null || str == null) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZJ().get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            LIZJ().put(str, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c085l)) {
            return;
        }
        copyOnWriteArrayList.add(c085l);
        LIZJ().put(str, copyOnWriteArrayList);
        long j = 0;
        for (C397901gf c397901gf : (CopyOnWriteArrayList) LIZIZ.getValue()) {
            if (Intrinsics.LJFF(c397901gf.LL, str)) {
                long j2 = c085l.LIZIZ;
                long j3 = c397901gf.LLILLJJLI;
                if (j2 <= j3) {
                    j += j3 - j2;
                    C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                    C1520360pfO c1520360pfO = new C1520360pfO("jsb_sticky_event_subscribed");
                    c1520360pfO.LIZIZ = "tiktok_hybrid_default";
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_name", str);
                    jSONObject.put("time_diff", c397901gf.LLILLJJLI - c085l.LIZIZ);
                    jSONObject.put("all_time_diff", j);
                    c1520360pfO.LIZLLL = jSONObject;
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                    c1520380pfQ.getClass();
                    C1520380pfQ.LIZ(c1520350pfNLIZ);
                    InterfaceC1548390qOb interfaceC1548390qOb = c085l.LIZJ;
                    if (interfaceC1548390qOb != null) {
                        interfaceC1548390qOb.H4(c397901gf.LLILLL, str);
                    }
                }
            }
        }
        if (LJ) {
            LIZ();
        }
    }

    public static final void LJIIIIZZ(String str, InterfaceC1141530foN interfaceC1141530foN) {
        C01GW c01gw = LIZLLL;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) c01gw.getValue()).get(interfaceC1141530foN);
        if (concurrentHashMap != null) {
            C085L c085l = (C085L) concurrentHashMap.get(str);
            if (c085l != null) {
                LJIIIZ(c085l, str);
                concurrentHashMap.remove(str);
            }
            if (concurrentHashMap.isEmpty()) {
                ((ConcurrentHashMap) c01gw.getValue()).remove(interfaceC1141530foN);
            }
        }
    }

    public static final void LJIIIZ(C085L c085l, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (c085l != null && str != null && (copyOnWriteArrayList = (CopyOnWriteArrayList) LIZJ().get(str)) != null) {
            copyOnWriteArrayList.remove(c085l);
        }
    }

    public static final void LJFF(String str, InterfaceC1141530foN interfaceC1141530foN, String str2) throws JSONException {
        LJ(str, interfaceC1141530foN, System.currentTimeMillis(), str2);
    }

    public static final void LJ(String str, final InterfaceC1141530foN interfaceC1141530foN, long j, String str2) throws JSONException {
        C085L c085l = new C085L(str2, j, new InterfaceC1548390qOb() { // from class: X.0qPL
            @Override // X.InterfaceC1548390qOb
            public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str3) {
                interfaceC1141530foN.mh2(new C262100zr(interfaceC1107590evd, str3));
            }
        }, null);
        C01GW c01gw = LIZLLL;
        if (((ConcurrentHashMap) c01gw.getValue()).get(interfaceC1141530foN) == null) {
            ((ConcurrentHashMap) c01gw.getValue()).put(interfaceC1141530foN, new ConcurrentHashMap());
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) c01gw.getValue()).get(interfaceC1141530foN);
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, c085l);
        }
        LJI(c085l, str);
    }
}
