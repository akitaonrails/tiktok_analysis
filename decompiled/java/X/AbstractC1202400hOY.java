package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1202400hOY implements Cert {
    public final String certToken;
    public final String certType;
    public Map<String, Object> customInfo;

    @Override // com.bytedance.bpea.basics.Cert
    public String authKey() {
        return null;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("certToken", this.certToken);
            jSONObject.put("certType", this.certType);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    public String toString() {
        return C786410Ut5.J3(toJSON());
    }

    @Override // com.bytedance.bpea.basics.Cert
    public String certToken() {
        return this.certToken;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public String certType() {
        return this.certType;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public Map<String, Object> customInfo() {
        return this.customInfo;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public void attachCustomInfo(Map<String, ? extends Object> map) {
        Map<String, Object> map2;
        if (this.customInfo == null) {
            this.customInfo = new LinkedHashMap();
        }
        if (map != null && (map2 = this.customInfo) != null) {
            map2.putAll(map);
        }
    }

    @Override // com.bytedance.bpea.basics.Cert
    public void validate(C825940Wae c825940Wae) throws C838130WuJ {
        String str = this.certToken;
        if (str != null && str.length() != 0) {
        } else {
            throw new C838130WuJ(-1, "certToken is empty");
        }
    }

    public AbstractC1202400hOY(String str, String str2) {
        this.certToken = str;
        this.certType = str2;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public void attachCustomInfo(String str, Object obj) {
        if (this.customInfo == null) {
            this.customInfo = new LinkedHashMap();
        }
        Map<String, Object> map = this.customInfo;
        if (map != null) {
            map.put(str, obj);
        }
    }
}
