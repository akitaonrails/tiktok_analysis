package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18EF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EF implements InterfaceC21252118Et {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public final C589920NBu<Object> LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC21252118Et
    public final Object LJIIJ() {
        return this.LLILZIL.get();
    }

    @Override // X.InterfaceC21252118Et
    public final C18EF LJIILIIL() {
        C18E9 tree;
        ConcurrentHashMap<String, C18EF> concurrentHashMap;
        String str = this.LLILZ;
        if (str == null || (tree = getTree()) == null || (concurrentHashMap = tree.LLILLJJLI) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    @Override // X.InterfaceC21252118Et
    public final C18EF getParentNode() {
        C18E9 tree;
        ConcurrentHashMap<String, C18EF> concurrentHashMap;
        String str = this.LLILLL;
        if (str == null || (tree = getTree()) == null || (concurrentHashMap = tree.LLILLJJLI) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    @Override // X.InterfaceC21252118Et
    public final C18E9 getTree() {
        return C18EN.LIZJ(this.LLILLJJLI);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_page", this.LLILZLL);
            jSONObject.put("is_container", this.LLIZ);
            jSONObject.put("node_id", this.LL);
            jSONObject.put("tree_id", this.LLILLJJLI);
            jSONObject.put("parent_node_id", this.LLILLL);
            jSONObject.put("pre_node_id", this.LLILZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public final String save() {
        return toString();
    }

    @Override // X.InterfaceC21252118Et
    public final boolean LJIIIZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC21252118Et
    public final String LJIIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC21252118Et
    public final String getNodeId() {
        return this.LL;
    }

    public C18EF(Object obj) {
        AtomicLong atomicLong = C801030VbZ.LIZ;
        AtomicLong atomicLong2 = C801030VbZ.LIZJ;
        long jIncrementAndGet = atomicLong2.incrementAndGet();
        if (jIncrementAndGet > 10000) {
            atomicLong2.set(0L);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('_');
        sbLIZ.append(jIncrementAndGet);
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZIL = new C589920NBu<>(obj);
    }

    public final void LIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.LLILZLL = jSONObject.optBoolean("is_page");
            this.LLIZ = jSONObject.optBoolean("is_container");
            this.LL = jSONObject.optString("node_id");
            this.LLILLJJLI = jSONObject.optString("tree_id");
            this.LLILLL = jSONObject.optString("parent_node_id");
            this.LLILZ = jSONObject.optString("pre_node_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(InterfaceC21252118Et interfaceC21252118Et) {
        String nodeId;
        String strLJIIL = null;
        if (interfaceC21252118Et != null) {
            nodeId = interfaceC21252118Et.getNodeId();
        } else {
            nodeId = null;
        }
        this.LLILLL = nodeId;
        if (interfaceC21252118Et != null) {
            strLJIIL = interfaceC21252118Et.LJIIL();
        }
        this.LLILLJJLI = strLJIIL;
    }

    @Override // X.InterfaceC21252118Et
    public final void LJIIJJI(InterfaceC21252118Et interfaceC21252118Et) {
        String nodeId;
        if (interfaceC21252118Et != null) {
            nodeId = interfaceC21252118Et.getNodeId();
        } else {
            nodeId = null;
        }
        this.LLILZ = nodeId;
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public final /* bridge */ /* synthetic */ InterfaceC21252118Et parse(String str) {
        LIZ(str);
        return this;
    }

    public final void LIZIZ(String str, C18E9 c18e9) {
        ConcurrentHashMap<String, C18EF> concurrentHashMap;
        ConcurrentHashMap<String, C18EF> concurrentHashMap2;
        if (c18e9 != null && (concurrentHashMap2 = c18e9.LLILLJJLI) != null) {
            concurrentHashMap2.remove(this.LL);
        }
        this.LL = str;
        if (c18e9 != null && (concurrentHashMap = c18e9.LLILLJJLI) != null) {
            concurrentHashMap.put(str, this);
        }
    }
}
