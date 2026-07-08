package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005V {
    public final String LIZ;
    public final Map<String, List<String>> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C005V)) {
            return false;
        }
        C005V c005v = (C005V) obj;
        return Intrinsics.LJFF(this.LIZ, c005v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c005v.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotTreeStructure(slotRoot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotChildren=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C005V(String str, Map<String, ? extends List<String>> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
