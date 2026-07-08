package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0025, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0025 {
    public final Map<String, List<String>> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0025) && Intrinsics.LJFF(this.LIZ, ((AnonymousClass0025) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackerBlockConfigModel(fieldBlockConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0025() {
        this(C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0025(Map<String, ? extends List<String>> map) {
        this.LIZ = map;
    }
}
