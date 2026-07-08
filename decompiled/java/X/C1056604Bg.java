package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1056604Bg {
    public final int LIZ;
    public final HashMap<String, Integer> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1056604Bg)) {
            return false;
        }
        C1056604Bg c1056604Bg = (C1056604Bg) obj;
        return this.LIZ == c1056604Bg.LIZ && Intrinsics.LJFF(this.LIZIZ, c1056604Bg.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpDailyMetrics(pv=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pdpFrequencyMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1056604Bg() {
        this(0, new HashMap());
    }

    public C1056604Bg(int i, HashMap<String, Integer> map) {
        this.LIZ = i;
        this.LIZIZ = map;
    }
}
