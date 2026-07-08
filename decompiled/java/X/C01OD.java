package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01OD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01OD extends AbstractC1675210th9 {
    public final Map<String, String> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C01OD) && Intrinsics.LJFF(this.LIZ, ((C01OD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Edit(queryParameters=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01OD(Map<String, String> map) {
        this.LIZ = map;
    }
}
