package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0C5L, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C5L {
    public static final C0C5L LIZ = new C0C5L();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static volatile Map<String, k> LIZJ = new LinkedHashMap();
    public static Keva LIZLLL;

    public final synchronized void LIZ() {
        if (LIZLLL == null) {
            LIZLLL = KevaImpl.getRepo("creative_tool_reversal", 1);
        }
    }

    public static Map LIZIZ() {
        h hVar;
        n nVarLIZ;
        Set<Map.Entry<String, k>> setEntrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C307730C4l c307730C4l = C307730C4l.LIZLLL;
        if ((!c307730C4l.contains("enable_big_reversal_android") || c307730C4l.LIZJ("enable_big_reversal_android", false)) && C0C57.LIZIZ("enable_big_reversal_android")) {
            k kVarLIZ = C0C54.LIZJ.LIZ("studio_container_groups");
            if (kVarLIZ == null || (kVarLIZ instanceof m)) {
                hVar = new h();
            } else {
                try {
                    hVar = kVarLIZ instanceof n ? ((n) kVarLIZ).LJJIIZI("val") : (h) kVarLIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    hVar = new h();
                }
            }
            for (k kVar : hVar) {
                try {
                    String strLIZIZ = C1925307gR.LIZIZ((n) kVar, "switch");
                    String strLIZIZ2 = C1925307gR.LIZIZ((n) kVar, "config");
                    if (C0C57.LIZIZ(strLIZIZ) && (nVarLIZ = C0C57.LIZ(strLIZIZ2)) != null && (setEntrySet = nVarLIZ.entrySet()) != null) {
                        Iterator<T> it2 = setEntrySet.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            String str = (String) entry.getKey();
                            k kVar2 = (k) entry.getValue();
                            if (kVar2 != null) {
                                Keva keva = LIZLLL;
                                if (keva != null) {
                                    keva.storeString(str, kVar2.toString());
                                }
                                linkedHashMap.put(str, kVar2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return linkedHashMap;
    }
}
