package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543440qGc {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Object LIZ;

    static {
        new C1543260qGK();
    }

    public final boolean LIZ() {
        try {
            Object obj = this.LIZ;
            return obj instanceof JSONObject ? ((JSONObject) obj).optInt("code", 0) == 1 : obj instanceof Map ? Intrinsics.LJFF(((Map) obj).get("code"), 1) : (obj instanceof JavaOnlyMap) && ((JavaOnlyMap) obj).getInt("code") == 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final JSONObject LIZIZ() {
        Object obj = this.LIZ;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof JavaOnlyMap) {
            C1297550js1.LIZ.getClass();
            return C1297550js1.LJ((JavaOnlyMap) obj);
        }
        if (!(obj instanceof Map)) {
            return new JSONObject();
        }
        C1543800qHC.LIZ.getClass();
        return C1543800qHC.LIZJ((Map) obj);
    }

    public final String toString() {
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        return C1543410qGZ.LJIILJJIL ? C786410Ut5.J3(LIZIZ()) : "";
    }

    public C1543440qGc(Object obj) {
        this.LIZ = obj;
    }

    public final JSONObject LIZJ(C1543910qHN c1543910qHN) {
        JSONObject jSONObject;
        Boolean bool;
        Object obj = this.LIZ;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else if (obj instanceof Map) {
            C1543800qHC.LIZ.getClass();
            jSONObject = C1543800qHC.LIZJ((Map) obj);
        } else if (obj instanceof JavaOnlyMap) {
            C1297550js1.LIZ.getClass();
            jSONObject = C1297550js1.LJ((JavaOnlyMap) obj);
        } else {
            jSONObject = new JSONObject();
        }
        if (c1543910qHN != null) {
            try {
                bool = c1543910qHN.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return jSONObject;
            }
        } else {
            bool = null;
        }
        C189200o6.m2constructorimpl(jSONObject.put("_jsb_secure_token_checked", bool));
        return jSONObject;
    }
}
