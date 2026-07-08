package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882807Za {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1882807Za)) {
            return false;
        }
        C1882807Za c1882807Za = (C1882807Za) obj;
        return Intrinsics.LJFF(this.LIZ, c1882807Za.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1882807Za.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, Object> map = this.LIZIZ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IAPAppEvent(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1882807Za(String str, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
