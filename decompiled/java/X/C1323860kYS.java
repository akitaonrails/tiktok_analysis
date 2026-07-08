package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323860kYS implements InterfaceC1107590evd {
    public final JSONObject LIZ;

    @Override // X.InterfaceC1107590evd
    public final Map<String, Object> LIZ() {
        return C2348409Ic.LIZIZ(this.LIZ);
    }

    @Override // X.InterfaceC1107590evd
    public final InterfaceC1107470evR LIZIZ() {
        final Iterator<String> itKeys = this.LIZ.keys();
        return new InterfaceC1107470evR(itKeys) { // from class: X.0kYY
            public final Iterator<String> LIZ;

            @Override // X.InterfaceC1107470evR
            public final boolean hasNextKey() {
                return this.LIZ.hasNext();
            }

            @Override // X.InterfaceC1107470evR
            public final String nextKey() {
                return this.LIZ.next();
            }

            {
                this.LIZ = itKeys;
            }
        };
    }

    public C1323860kYS(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }

    @Override // X.InterfaceC1107590evd
    public final InterfaceC1871820yoG get(String str) {
        return new C1323850kYR(this.LIZ.opt(str));
    }

    @Override // X.InterfaceC1107590evd
    public final InterfaceC1871920yoQ getArray(String str) {
        JSONArray jSONArrayOptJSONArray = this.LIZ.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        return new C1323870kYT(jSONArrayOptJSONArray);
    }

    @Override // X.InterfaceC1107590evd
    public final boolean getBoolean(String str) {
        return this.LIZ.optBoolean(str);
    }

    @Override // X.InterfaceC1107590evd
    public final double getDouble(String str) {
        return this.LIZ.optDouble(str);
    }

    @Override // X.InterfaceC1107590evd
    public final int getInt(String str) {
        return this.LIZ.optInt(str);
    }

    @Override // X.InterfaceC1107590evd
    public final long getLong(String str) {
        return this.LIZ.optLong(str);
    }

    @Override // X.InterfaceC1107590evd
    public final InterfaceC1107590evd getMap(String str) {
        JSONObject jSONObjectOptJSONObject = this.LIZ.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new C1323860kYS(jSONObjectOptJSONObject);
    }

    @Override // X.InterfaceC1107590evd
    public final String getString(String str) {
        return this.LIZ.optString(str);
    }

    @Override // X.InterfaceC1107590evd
    public final EnumC1323480kXq getType(String str) {
        Object objOpt = this.LIZ.opt(str);
        if (objOpt instanceof JSONArray) {
            return EnumC1323480kXq.Array;
        }
        if (objOpt instanceof Boolean) {
            return EnumC1323480kXq.Boolean;
        }
        if (objOpt instanceof JSONObject) {
            return EnumC1323480kXq.Map;
        }
        if (objOpt instanceof Integer) {
            return EnumC1323480kXq.Int;
        }
        if (objOpt instanceof Number) {
            return EnumC1323480kXq.Number;
        }
        if (objOpt instanceof String) {
            return EnumC1323480kXq.String;
        }
        if (objOpt instanceof byte[]) {
            return EnumC1323480kXq.ByteArray;
        }
        return EnumC1323480kXq.Null;
    }

    @Override // X.InterfaceC1107590evd
    public final boolean hasKey(String str) {
        return this.LIZ.has(str);
    }

    @Override // X.InterfaceC1107590evd
    public final boolean isNull(String str) {
        return this.LIZ.isNull(str);
    }
}
