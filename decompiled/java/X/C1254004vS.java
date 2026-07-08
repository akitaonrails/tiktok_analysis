package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1254004vS extends AbstractC1254204vU {
    public final String LIZ;
    public final Map<String, String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1254004vS)) {
            return false;
        }
        C1254004vS c1254004vS = (C1254004vS) obj;
        return Intrinsics.LJFF(this.LIZ, c1254004vS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1254004vS.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkNotify(eventId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1254004vS(String str, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
