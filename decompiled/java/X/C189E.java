package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.189E, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189E extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C21241518Ar LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189E(C21241518Ar c21241518Ar) {
        super(0);
        this.LL = c21241518Ar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String strLIZIZ;
        C18G6 c18g6LIZJ = this.LL.LIZJ();
        if (c18g6LIZJ == null || (strLIZIZ = c18g6LIZJ.LIZIZ("btmId_btmPageInfo_map", "")) == null) {
            strLIZIZ = "";
        }
        if (strLIZIZ.length() > 0) {
            C21241518Ar c21241518Ar = this.LL;
            try {
                JSONObject jSONObject = new JSONObject(strLIZIZ);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString.length() > 0) {
                        C21248618Dk.LIZ.LJIIJ().put(next, (C21246818Cs) ((Gson) c21241518Ar.LIZ.getValue()).LJII(strOptString, C21246818Cs.class));
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C18G6 c18g6LIZJ2 = this.LL.LIZJ();
        if (c18g6LIZJ2 != null) {
            c18g6LIZJ2.LIZJ("btmId_btmPageInfo_map", "");
        }
        return Boolean.valueOf(strLIZIZ.length() > 0);
    }
}
