package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1491380oue implements InterfaceC1491370oud {
    public final Object LIZ;
    public final Map<String, Object> LIZIZ;

    public AbstractC1491380oue() {
        throw null;
    }

    public abstract boolean LIZJ(C1491360ouc c1491360ouc);

    public AbstractC1491380oue(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = obj;
        this.LIZIZ = linkedHashMap;
    }

    public final Long LIZIZ(String str, AbstractC1491380oue abstractC1491380oue, JSONObject jSONObject) {
        Object objLIZ;
        Object obj = null;
        if (abstractC1491380oue == null) {
            objLIZ = null;
        } else {
            try {
                objLIZ = abstractC1491380oue.LIZ(jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objLIZ = new C098200Yq(th);
                C189200o6.m2constructorimpl(objLIZ);
            }
        }
        this.LIZIZ.put(str, objLIZ);
        C189200o6.m2constructorimpl(objLIZ);
        if (!C189200o6.m7isFailureimpl(objLIZ)) {
            obj = objLIZ;
        }
        return (Long) obj;
    }
}
