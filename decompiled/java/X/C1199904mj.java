package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1199904mj {
    public final String LIZ;
    public final Map<String, String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1199904mj)) {
            return false;
        }
        C1199904mj c1199904mj = (C1199904mj) obj;
        return Intrinsics.LJFF(this.LIZ, c1199904mj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1199904mj.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, String> map = this.LIZIZ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleRequest(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", headers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1199904mj(String str, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
