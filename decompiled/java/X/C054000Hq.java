package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C054000Hq {
    public final Map<String, String> LIZ;
    public final List<C0QAR> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C054000Hq)) {
            return false;
        }
        C054000Hq c054000Hq = (C054000Hq) obj;
        return Intrinsics.LJFF(this.LIZ, c054000Hq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c054000Hq.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxPassthroughMobData(passthroughParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C054000Hq(Map<String, String> map, List<C0QAR> list) {
        this.LIZ = map;
        this.LIZIZ = list;
    }
}
