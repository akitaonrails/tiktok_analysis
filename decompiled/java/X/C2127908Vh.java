package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2127908Vh {
    public final HashMap<String, Object> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2127908Vh)) {
            return false;
        }
        C2127908Vh c2127908Vh = (C2127908Vh) obj;
        return Intrinsics.LJFF(this.LIZ, c2127908Vh.LIZ) && this.LIZIZ == c2127908Vh.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheEntry(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", expireAt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2127908Vh(HashMap<String, Object> map, long j) {
        this.LIZ = map;
        this.LIZIZ = j;
    }
}
