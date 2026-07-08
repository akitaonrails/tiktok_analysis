package X;

import android.app.Activity;
import com.bytedance.android.btm.api.cache.ISavable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18E9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18E9 implements ISavable<C18E9> {
    public String LL;
    public final ConcurrentHashMap<String, C18EF> LLILLJJLI;
    public final C18EF LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public C18F7 LLIZ;
    public final C20322914fb LLIZLLLIL;
    public final List<C589920NBu<Object>> LLJ;
    public final List<C589920NBu<Object>> LLJI;
    public final Map<C589920NBu<Object>, EnumC21250718Ef> LLJIJIL;

    public final Collection<? extends InterfaceC21252118Et> LJ() {
        return this.LLILLJJLI.values();
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public final String save() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tree_id", this.LL);
            jSONObject.put("top_node_id", this.LLILZIL);
            jSONObject.put("root_node", this.LLILLL.toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tree_id", this.LL);
            jSONObject.put("root_node_id", this.LLILLL.LL);
            jSONObject.put("top_node_id", this.LLILZIL);
            jSONObject.put("mResumed", this.LLILZ);
            jSONObject.put("activityResumeOrigin", this.LLIZ);
            jSONObject.put("activityResumeOriginV2", this.LLIZLLLIL);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, C18EF> entry : this.LLILLJJLI.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue().toString());
            }
            jSONObject.put("nodes", jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C18E9(Activity activity) {
        AtomicLong atomicLong = C801030VbZ.LIZ;
        AtomicLong atomicLong2 = C801030VbZ.LIZIZ;
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
        ConcurrentHashMap<String, C18EF> concurrentHashMap = new ConcurrentHashMap<>();
        this.LLILLJJLI = concurrentHashMap;
        C18EF c18ef = new C18EF(activity);
        c18ef.LLILLJJLI = this.LL;
        concurrentHashMap.put(c18ef.LL, c18ef);
        this.LLILLL = c18ef;
        this.LLILZ = true;
        this.LLIZLLLIL = new C20322914fb();
        this.LLJ = new ArrayList();
        this.LLJI = new ArrayList();
        this.LLJIJIL = new LinkedHashMap();
    }

    public final InterfaceC21252118Et LIZIZ(Object obj) {
        for (InterfaceC21252118Et interfaceC21252118Et : LJ()) {
            if (Intrinsics.LJFF(interfaceC21252118Et.LJIIJ(), obj)) {
                return interfaceC21252118Et;
            }
        }
        return null;
    }

    public final InterfaceC21252118Et LIZJ(String str) {
        if (str != null && str.length() != 0) {
            return this.LLILLJJLI.get(str);
        }
        return null;
    }

    public final void LIZLLL(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.LL = jSONObject.optString("tree_id");
            this.LLILZIL = jSONObject.optString("top_node_id");
            this.LLILLL.LIZ(jSONObject.optString("root_node"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public final /* bridge */ /* synthetic */ C18E9 parse(String str) {
        LIZLLL(str);
        return this;
    }

    public final void LIZ(C18EF c18ef, InterfaceC21252118Et interfaceC21252118Et) {
        c18ef.LIZJ(interfaceC21252118Et);
        this.LLILLJJLI.put(c18ef.LL, c18ef);
    }
}
