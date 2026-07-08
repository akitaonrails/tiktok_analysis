package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kYR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323850kYR implements InterfaceC1871820yoG {
    public final Object LIZ;

    @Override // X.InterfaceC1871820yoG
    public final InterfaceC1871920yoQ asArray() throws Exception {
        Object obj = this.LIZ;
        if (obj instanceof JSONArray) {
            return new C1323870kYT((JSONArray) obj);
        }
        throw new Exception("Dynamic is not JSONArray");
    }

    @Override // X.InterfaceC1871820yoG
    public final boolean asBoolean() throws Exception {
        Object obj = this.LIZ;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new Exception("Dynamic is not Boolean");
    }

    @Override // X.InterfaceC1871820yoG
    public final double asDouble() throws Exception {
        Object obj = this.LIZ;
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Float) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        throw new Exception("Dynamic is not Double");
    }

    @Override // X.InterfaceC1871820yoG
    public final int asInt() throws Exception {
        Object obj = this.LIZ;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new Exception("Dynamic is not Int");
    }

    @Override // X.InterfaceC1871820yoG
    public final InterfaceC1107590evd asMap() throws Exception {
        Object obj = this.LIZ;
        if (obj instanceof JSONObject) {
            return new C1323860kYS((JSONObject) obj);
        }
        throw new Exception("Dynamic is not JSONObject");
    }

    @Override // X.InterfaceC1871820yoG
    public final String asString() throws Exception {
        Object obj = this.LIZ;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new Exception("Dynamic is not String");
    }

    @Override // X.InterfaceC1871820yoG
    public final EnumC1323480kXq getType() {
        Object obj = this.LIZ;
        return obj instanceof JSONArray ? EnumC1323480kXq.Array : obj instanceof Boolean ? EnumC1323480kXq.Boolean : obj instanceof JSONObject ? EnumC1323480kXq.Map : obj instanceof Integer ? EnumC1323480kXq.Int : obj instanceof Number ? EnumC1323480kXq.Number : obj instanceof String ? EnumC1323480kXq.String : EnumC1323480kXq.Null;
    }

    public C1323850kYR(Object obj) {
        this.LIZ = obj;
    }
}
