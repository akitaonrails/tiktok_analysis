package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kYN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323810kYN implements InterfaceC1871820yoG {
    public final Object LIZ;

    @Override // X.InterfaceC1871820yoG
    public final InterfaceC1871920yoQ asArray() {
        Object obj = this.LIZ;
        if (obj instanceof JSONArray) {
            return new C1323830kYP((JSONArray) obj);
        }
        throw new IllegalArgumentException("Dynamic is not JSONArray");
    }

    @Override // X.InterfaceC1871820yoG
    public final boolean asBoolean() {
        Object obj = this.LIZ;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalArgumentException("Dynamic is not Boolean");
    }

    @Override // X.InterfaceC1871820yoG
    public final double asDouble() {
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
        throw new IllegalArgumentException("Dynamic is not Double");
    }

    @Override // X.InterfaceC1871820yoG
    public final int asInt() {
        Object obj = this.LIZ;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalArgumentException("Dynamic is not Int");
    }

    @Override // X.InterfaceC1871820yoG
    public final InterfaceC1107590evd asMap() {
        Object obj = this.LIZ;
        if (obj instanceof JSONObject) {
            return new C1323820kYO((JSONObject) obj);
        }
        throw new IllegalArgumentException("Dynamic is not JSONObject");
    }

    @Override // X.InterfaceC1871820yoG
    public final String asString() {
        Object obj = this.LIZ;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException("Dynamic is not String");
    }

    @Override // X.InterfaceC1871820yoG
    public final EnumC1323480kXq getType() {
        Object obj = this.LIZ;
        return obj instanceof JSONArray ? EnumC1323480kXq.Array : obj instanceof Boolean ? EnumC1323480kXq.Boolean : obj instanceof JSONObject ? EnumC1323480kXq.Map : obj instanceof Integer ? EnumC1323480kXq.Int : obj instanceof Number ? EnumC1323480kXq.Number : obj instanceof String ? EnumC1323480kXq.String : obj instanceof byte[] ? EnumC1323480kXq.ByteArray : EnumC1323480kXq.Null;
    }

    public C1323810kYN(Object obj) {
        this.LIZ = obj;
    }
}
