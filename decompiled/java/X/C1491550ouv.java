package X;

import Y.ARunnableS15S0500000_23;
import com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNative;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ouv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491550ouv implements InterfaceC1491580ouy {
    public boolean LIZ;
    public SparkTracingNative LIZIZ;
    public long LJ;
    public boolean LJFF;
    public boolean LJII;
    public final HashSet<String> LIZJ = new HashSet<>();
    public final ConcurrentLinkedQueue<Pair<String, Map<Object, Object>>> LIZLLL = new ConcurrentLinkedQueue<>();
    public long LJI = 3000;
    public int LJIIIIZZ = 64;

    @Override // X.InterfaceC1491580ouy
    public final void LIZJ() {
        if (this.LJFF || System.currentTimeMillis() - this.LJ < this.LJI) {
            return;
        }
        this.LJ = System.currentTimeMillis();
        if (this.LJII) {
            LJIILLIIL();
        }
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative != null) {
            sparkTracingNative.update();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update end, ");
        sbLIZ.append(System.currentTimeMillis() - this.LJ);
        sbLIZ.append(" ms");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIILLIIL() {
        if (this.LIZLLL.isEmpty()) {
            return;
        }
        ConcurrentLinkedQueue<Pair<String, Map<Object, Object>>> concurrentLinkedQueue = this.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<String, Map<Object, Object>> pair : concurrentLinkedQueue) {
            String first = pair.getFirst();
            Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((List) arrayList).add(pair);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList<Map.Entry> arrayList2 = new ArrayList();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((Map) ((Pair) it2.next()).getSecond()).entrySet(), arrayList2);
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ);
            for (Map.Entry entry2 : arrayList2) {
                Pair pair2 = new Pair(C1955407lI.LIZJ(String.valueOf(entry2.getKey())), C1955407lI.LIZIZ(entry2.getValue()));
                linkedHashMap3.put(pair2.getFirst(), pair2.getSecond());
            }
            linkedHashMap2.put(key, linkedHashMap3);
        }
        this.LIZLLL.clear();
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            String str = (String) entry3.getKey();
            Map map = (Map) entry3.getValue();
            SparkTracingNative sparkTracingNative = this.LIZIZ;
            if (sparkTracingNative != null) {
                sparkTracingNative.setProperties(str, C786410Ut5.J3(new JSONObject(map)), EnumC1491540ouu.DEFAULT.getNativeValue(), EnumC1491530out.MEMORY_AND_DISK.getNativeValue());
            }
        }
    }

    public final int LJIIZILJ() {
        Iterator<Pair<String, Map<Object, Object>>> it2 = this.LIZLLL.iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += it2.next().getSecond().size();
        }
        return size;
    }

    @Override // X.InterfaceC1491580ouy
    public final String snapshot() {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative == null) {
            return null;
        }
        return sparkTracingNative.snapshot();
    }

    @Override // X.InterfaceC1491580ouy
    public final Map<String, Object> LIZIZ(String str) {
        Object obj;
        String properties;
        boolean z;
        Object obj2 = null;
        try {
            HashMap map = new HashMap();
            SparkTracingNative sparkTracingNative = this.LIZIZ;
            if (sparkTracingNative != null) {
                properties = sparkTracingNative.getProperties(str);
            } else {
                properties = null;
            }
            if (properties == null || properties.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                JSONObject jSONObject = new JSONObject(properties);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, C1955407lI.LIZ(jSONObject.optString(next)));
                }
            }
            C189200o6.m2constructorimpl(map);
            obj = map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (Map) obj2;
    }

    @Override // X.InterfaceC1491580ouy
    public final String[] LIZLLL(String str) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative == null) {
            return null;
        }
        return sparkTracingNative.getChildIds(str);
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJIIIIZZ(String str) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative != null) {
            sparkTracingNative.setManifest(str);
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final void LIZ(String str, boolean z) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative != null) {
            sparkTracingNative.setContextPropsAliveState(str, z);
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final C1491690ov9 LJFF(String str, String str2) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative != null && sparkTracingNative.isContextPropsExists(str)) {
            return new C1491690ov9(28, 0L, str, str2, false, false);
        }
        return null;
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJI(String str, boolean z) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative != null) {
            sparkTracingNative.setContextPropsFinalState(str, z);
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final String LJIIIZ(String str, String str2) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative == null) {
            return null;
        }
        return sparkTracingNative.computeExpr(str, str2);
    }

    @Override // X.InterfaceC1491580ouy
    public final boolean LJIIJ(String str, EnumC1491540ouu enumC1491540ouu) {
        if (this.LIZ && enumC1491540ouu != EnumC1491540ouu.IMPORTANT) {
            if (enumC1491540ouu == EnumC1491540ouu.DEFAULT) {
                return this.LIZJ.contains(str);
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1491580ouy
    public final String LJIIJJI(String str, String str2) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative == null) {
            return null;
        }
        return sparkTracingNative.compute(str, str2);
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJII(String str, String str2, EnumC1491500ouq enumC1491500ouq) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative != null) {
            sparkTracingNative.updateLink(str, str2, enumC1491500ouq.getNativeValue());
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJIIL(C1491510our c1491510our, C1491770ovH c1491770ovH, C1491760ovG c1491760ovG) {
        this.LIZ = c1491510our.LIZ;
        JSONObject jSONObject = new JSONObject(c1491510our.LIZIZ);
        this.LJI = jSONObject.optLong("_exp_polling_interval", this.LJI);
        this.LJFF = jSONObject.optBoolean("_exp_polling_active_enabled", this.LJFF);
        this.LJIIIIZZ = jSONObject.optInt("_exp_batch_write_size", this.LJIIIIZZ);
        this.LJII = jSONObject.optBoolean("_exp_batch_write_enabled", this.LJII);
        long jOptLong = jSONObject.optLong("_exp_init_delay_ms", 0L);
        C1491570oux c1491570oux = C1491570oux.LIZ;
        ARunnableS15S0500000_23 aRunnableS15S0500000_23 = new ARunnableS15S0500000_23(this, c1491510our, c1491770ovH, jSONObject, c1491760ovG, 0);
        c1491570oux.getClass();
        BPEAHandler bPEAHandler = C1491570oux.LJII;
        if (bPEAHandler != null) {
            C786410Ut5.LJLIIL(jOptLong, bPEAHandler, aRunnableS15S0500000_23);
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final Object LJIILL(String str, String str2, boolean z) {
        String property;
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative == null) {
            property = null;
        } else {
            property = sparkTracingNative.getProperty(str, str2, z);
        }
        return C1955407lI.LIZ(property);
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJ(String str, Map<?, ?> map, EnumC1491540ouu enumC1491540ouu, EnumC1491530out enumC1491530out) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(C1955407lI.LIZJ(String.valueOf(entry.getKey())), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C1955407lI.LIZIZ(entry2.getValue()));
        }
        if (!linkedHashMap2.isEmpty()) {
            if (this.LJII) {
                this.LIZLLL.add(new Pair<>(str, linkedHashMap2));
                if (LJIIZILJ() >= this.LJIIIIZZ) {
                    LJIILLIIL();
                    return;
                }
                return;
            }
            SparkTracingNative sparkTracingNative = this.LIZIZ;
            if (sparkTracingNative == null) {
                return;
            }
            sparkTracingNative.setProperties(str, C786410Ut5.J3(new JSONObject(linkedHashMap2)), enumC1491540ouu.getNativeValue(), enumC1491530out.getNativeValue());
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJIILJJIL(long j, String str, boolean z, boolean z2) {
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative != null) {
            sparkTracingNative.newContextProps(str, j, z, z2);
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJIILIIL(String str, String str2, Object obj, EnumC1491540ouu enumC1491540ouu, EnumC1491530out enumC1491530out) {
        if (this.LJII) {
            this.LIZLLL.add(new Pair<>(str, C2097908Jt.LIZJ(new Pair(str2, obj))));
            if (LJIIZILJ() >= this.LJIIIIZZ) {
                LJIILLIIL();
                return;
            }
            return;
        }
        SparkTracingNative sparkTracingNative = this.LIZIZ;
        if (sparkTracingNative == null) {
            return;
        }
        sparkTracingNative.setProperty(str, str2, C1955407lI.LIZIZ(obj), enumC1491540ouu.getNativeValue(), enumC1491530out.getNativeValue());
    }
}
