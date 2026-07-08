package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00IN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IN implements C00IO {
    public final Map<String, String> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00IN) && Intrinsics.LJFF(this.LIZ, ((C00IN) obj).LIZ);
    }

    public final int hashCode() {
        Map<String, String> map = this.LIZ;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapType(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C00IO
    public final Map<String, String> LIZ() {
        return this.LIZ;
    }

    public C00IN(Map<String, String> map) {
        this.LIZ = map;
    }
}
