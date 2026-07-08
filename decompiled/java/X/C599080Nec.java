package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599080Nec extends AbstractC598980NeS {
    public final int LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C599080Nec)) {
            return false;
        }
        C599080Nec c599080Nec = (C599080Nec) obj;
        return this.LIZ == c599080Nec.LIZ && Intrinsics.LJFF(this.LIZIZ, c599080Nec.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c599080Nec.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Map<String, Object> map = this.LIZJ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C599080Nec(int i, String str, Map<String, ? extends Object> map) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
