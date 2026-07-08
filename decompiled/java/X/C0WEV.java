package X;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: X.0WEV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WEV {
    public final String LIZ;
    public final Map<Class<?>, Object> LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FieldDescriptor{name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", properties=");
        sbLIZ.append(this.LIZIZ.values());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0WEU LIZ(String str) {
        return new C0WEU(str);
    }

    public static C0WEV LIZIZ(String str) {
        return new C0WEV(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WEV)) {
            return false;
        }
        C0WEV c0wev = (C0WEV) obj;
        if (this.LIZ.equals(c0wev.LIZ) && this.LIZIZ.equals(c0wev.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C0WEV(String str, Map<Class<?>, Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
