package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677770QiF extends AbstractC677910QiT {
    public final C676770Qgd LIZ;
    public final Map<String, Object> LIZIZ;

    public C677770QiF() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C677770QiF)) {
            return false;
        }
        C677770QiF c677770QiF = (C677770QiF) obj;
        return Intrinsics.LJFF(this.LIZ, c677770QiF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c677770QiF.LIZIZ);
    }

    public final int hashCode() {
        C676770Qgd c676770Qgd = this.LIZ;
        return ((c676770Qgd == null ? 0 : c676770Qgd.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", eventMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C677770QiF(C676770Qgd c676770Qgd) {
        Map<String, Object> mapLJ = C2097608Jq.LJ();
        this.LIZ = c676770Qgd;
        this.LIZIZ = mapLJ;
    }
}
