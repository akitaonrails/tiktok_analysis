package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731890vAZ implements InterfaceC1731910vAb {
    public String LIZ;
    public String LIZIZ;

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
    public final Map<String, Object> convert() {
        Pair[] pairArr = new Pair[2];
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("filePath", str);
        String str2 = this.LIZIZ;
        pairArr[1] = new Pair("errMessage", str2 != null ? str2 : "");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
    public final JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filePath", this.LIZ);
        jSONObject.put("errMessage", this.LIZIZ);
        return jSONObject;
    }

    @Override // X.InterfaceC1731910vAb
    public final String getErrMessage() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1731910vAb
    public final String getFilePath() {
        return this.LIZ;
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
    public final List<String> provideResultList() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1731910vAb
    public final void setErrMessage(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1731910vAb
    public final void setFilePath(String str) {
        this.LIZ = str;
    }
}
