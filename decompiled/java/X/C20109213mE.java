package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13mE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20109213mE {
    public byte[] LIZ;
    public String LIZIZ;
    public Map<String, String> LIZJ;
    public Map<String, String> LJ;
    public int LIZLLL = -1;
    public int LJFF = EnumC20108613m8.FALLBACK.ordinal();

    public final String LIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.LIZ;
        if (bArr != null) {
            this.LIZIZ = new String(bArr, Charsets.UTF_8);
        }
        return this.LIZIZ;
    }

    @InterfaceC1294060jmO
    public final JSONObject LIZIZ() {
        Object c098200Yq;
        JSONObject jSONObject = new JSONObject();
        try {
            String strLIZ = LIZ();
            jSONObject.put("raw", strLIZ != null ? new JSONObject(strLIZ) : new JSONObject());
            jSONObject.put("headers", C20109613mI.LIZIZ(this.LIZJ));
            jSONObject.put("cached", this.LJFF);
            c098200Yq = jSONObject.put("status_code", this.LIZLLL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C20111613mc.LIZ.LIZIZ();
        }
        return jSONObject;
    }
}
