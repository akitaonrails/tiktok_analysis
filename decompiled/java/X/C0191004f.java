package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0191004f {
    public final Map<String, String> LIZ;

    public C0191004f() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0191004f) && Intrinsics.LJFF(this.LIZ, ((C0191004f) obj).LIZ);
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
        sbLIZ.append("ResourceConfig(dynamicStringConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0191004f(Map<String, String> map) {
        this.LIZ = map;
    }
}
