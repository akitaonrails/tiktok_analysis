package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.128s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197076128s {
    public final Map<String, Object> LIZ;
    public final Map<String, InterfaceC197061128d> LIZIZ = new LinkedHashMap();
    public final Map<String, InterfaceC332260D0u<Object>> LIZJ = new LinkedHashMap();
    public final Map<String, InterfaceC332260D0u<Object>> LIZLLL = new LinkedHashMap();
    public final C197075128r LJ = new InterfaceC197061128d() { // from class: X.128r
        @Override // X.InterfaceC197061128d
        public final Bundle saveState() {
            Pair[] pairArr;
            C197076128s c197076128s = this.LIZ;
            for (Map.Entry entry : C2097608Jq.LJIIZILJ(c197076128s.LIZLLL).entrySet()) {
                c197076128s.LIZIZ((String) entry.getKey(), ((InterfaceC332260D0u) entry.getValue()).getValue());
            }
            for (Map.Entry entry2 : C2097608Jq.LJIIZILJ(c197076128s.LIZIZ).entrySet()) {
                c197076128s.LIZIZ((String) entry2.getKey(), ((InterfaceC197061128d) entry2.getValue()).saveState());
            }
            Map<String, Object> map = c197076128s.LIZ;
            if (map.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry3 : ((LinkedHashMap) map).entrySet()) {
                    arrayList.add(new Pair(entry3.getKey(), entry3.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            return C799520VXy.LIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    };

    /* JADX WARN: Type inference failed for: r0v4, types: [X.128r] */
    public C197076128s(Map<String, ? extends Object> map) {
        this.LIZ = new LinkedHashMap(map);
    }

    public final <T> InterfaceC332260D0u<T> LIZ(String str, T t) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZLLL;
        Object objLIZ = linkedHashMap.get(str);
        if (objLIZ == null) {
            if (!this.LIZ.containsKey(str)) {
                this.LIZ.put(str, t);
            }
            objLIZ = C1BNE.LIZ(((LinkedHashMap) this.LIZ).get(str));
            linkedHashMap.put(str, objLIZ);
        }
        return (InterfaceC332260D0u) objLIZ;
    }

    public final <T> void LIZIZ(String str, T t) {
        this.LIZ.put(str, t);
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) ((LinkedHashMap) this.LIZJ).get(str);
        if (interfaceC332260D0u != null) {
            interfaceC332260D0u.setValue(t);
        }
        InterfaceC332260D0u interfaceC332260D0u2 = (InterfaceC332260D0u) ((LinkedHashMap) this.LIZLLL).get(str);
        if (interfaceC332260D0u2 != null) {
            interfaceC332260D0u2.setValue(t);
        }
    }
}
