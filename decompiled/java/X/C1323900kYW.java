package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323900kYW implements InterfaceC1871920yoQ {
    public final JSONArray LIZ;

    @Override // X.InterfaceC1871920yoQ
    public final int size() {
        return this.LIZ.length();
    }

    @Override // X.InterfaceC1871920yoQ
    public final List<Object> toList() {
        return C2348509Id.LIZ(this.LIZ);
    }

    public C1323900kYW(JSONArray jSONArray) {
        this.LIZ = jSONArray;
    }

    @Override // X.InterfaceC1871920yoQ
    public final InterfaceC1871820yoG get(int i) {
        return new C1323880kYU(this.LIZ.opt(i));
    }

    @Override // X.InterfaceC1871920yoQ
    public final InterfaceC1871920yoQ getArray(int i) {
        JSONArray jSONArrayOptJSONArray = this.LIZ.optJSONArray(i);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        return new C1323900kYW(jSONArrayOptJSONArray);
    }

    @Override // X.InterfaceC1871920yoQ
    public final boolean getBoolean(int i) {
        return this.LIZ.optBoolean(i);
    }

    @Override // X.InterfaceC1871920yoQ
    public final double getDouble(int i) {
        return this.LIZ.optDouble(i);
    }

    @Override // X.InterfaceC1871920yoQ
    public final int getInt(int i) {
        return this.LIZ.optInt(i);
    }

    @Override // X.InterfaceC1871920yoQ
    public final InterfaceC1107590evd getMap(int i) {
        JSONObject jSONObjectOptJSONObject = this.LIZ.optJSONObject(i);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new C1323890kYV(jSONObjectOptJSONObject);
    }

    @Override // X.InterfaceC1871920yoQ
    public final String getString(int i) {
        return this.LIZ.optString(i);
    }

    @Override // X.InterfaceC1871920yoQ
    public final EnumC1323480kXq getType(int i) {
        Object objOpt = this.LIZ.opt(i);
        if (objOpt instanceof JSONArray) {
            return EnumC1323480kXq.Array;
        }
        if (objOpt instanceof Boolean) {
            return EnumC1323480kXq.Boolean;
        }
        if (objOpt instanceof JSONObject) {
            return EnumC1323480kXq.Map;
        }
        if (objOpt instanceof Number) {
            return EnumC1323480kXq.Number;
        }
        if (objOpt instanceof String) {
            return EnumC1323480kXq.String;
        }
        return EnumC1323480kXq.Null;
    }

    @Override // X.InterfaceC1871920yoQ
    public final boolean isNull(int i) {
        return this.LIZ.isNull(i);
    }
}
