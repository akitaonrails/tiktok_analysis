package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0525, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0525 implements InterfaceC1463805oC {
    public String LIZ;
    public Map<String, ? extends Object> LIZIZ;

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
    public final Map<String, Object> convert() {
        Map<String, ? extends Object> map = this.LIZIZ;
        boolean z = map == null || map.isEmpty();
        String str = this.LIZ;
        if ((str == null || str.length() == 0) && z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = this.LIZ;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        linkedHashMap.put("filePath", obj);
        Map<String, ? extends Object> mapLJ = this.LIZIZ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        linkedHashMap.put("editInfo", mapLJ);
        return linkedHashMap;
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
    public final JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object obj = this.LIZ;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("filePath", obj);
        Map<String, ? extends Object> map = this.LIZIZ;
        jSONObject.put("editInfo", map != null ? new JSONObject(map) : new JSONObject());
        return jSONObject;
    }

    @Override // X.InterfaceC1463805oC
    public final Map<String, Object> getEditInfo() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1463805oC
    public final String getFilePath() {
        return this.LIZ;
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
    public final List<String> provideResultList() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1463805oC
    public final void setEditInfo(Map<String, ? extends Object> map) {
        this.LIZIZ = map;
    }

    @Override // X.InterfaceC1463805oC
    public final void setFilePath(String str) {
        this.LIZ = str;
    }

    public AnonymousClass0525(String str, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
