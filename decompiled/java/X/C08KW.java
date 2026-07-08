package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08KW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KW {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 105));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(985));

    public final Map<String, Object> LIZIZ() {
        return (Map) this.LIZLLL.getValue();
    }

    public final Number LIZ(String str) {
        Object objOpt;
        JSONObject jSONObject = this.LIZIZ;
        if (jSONObject == null) {
            objOpt = LIZIZ().get(str);
        } else {
            objOpt = jSONObject.opt(str);
        }
        if (objOpt != null) {
            if (objOpt instanceof Number) {
                return (Number) objOpt;
            }
            try {
                if (objOpt instanceof String) {
                    return C2327809Ae.LJII((String) objOpt);
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public C08KW(String str, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
