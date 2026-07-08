package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1057104Bl {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1057104Bl)) {
            return false;
        }
        C1057104Bl c1057104Bl = (C1057104Bl) obj;
        return Intrinsics.LJFF(this.LIZ, c1057104Bl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1057104Bl.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, Object> map = this.LIZIZ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionChainConfig(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1057104Bl(String str, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
