package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YMG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMG implements InterfaceC871310YGb {
    public final int LJIIIZ;
    public final int LJIIJ;
    public final Map<String, Object> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YMG)) {
            return false;
        }
        C0YMG c0ymg = (C0YMG) obj;
        return this.LJIIIZ == c0ymg.LJIIIZ && this.LJIIJ == c0ymg.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c0ymg.LJIIJJI);
    }

    public final int hashCode() {
        int i = ((this.LJIIIZ * 31) + this.LJIIJ) * 31;
        Map<String, Object> map = this.LJIIJJI;
        return i + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PullStarted(inbox=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", triggerParams=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YMG(int i, int i2, Map<String, ? extends Object> map) {
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = map;
    }
}
