package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YME, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YME implements InterfaceC871310YGb {
    public final int LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final long LJIIL;
    public final int LJIILIIL;
    public final Map<String, Object> LJIILJJIL;
    public final Integer LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YME)) {
            return false;
        }
        C0YME c0yme = (C0YME) obj;
        return this.LJIIIZ == c0yme.LJIIIZ && this.LJIIJ == c0yme.LJIIJ && this.LJIIJJI == c0yme.LJIIJJI && this.LJIIL == c0yme.LJIIL && this.LJIILIIL == c0yme.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c0yme.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c0yme.LJIILL);
    }

    public final int hashCode() {
        int iZ2 = ((((((((this.LJIIIZ * 31) + this.LJIIJ) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Y2(this.LJIIL)) * 31) + this.LJIILIIL) * 31;
        Map<String, Object> map = this.LJIILJJIL;
        int iHashCode = (iZ2 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.LJIILL;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PullCompleted(inbox=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", messageCount=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", triggerParams=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YME(int i, int i2, boolean z, long j, int i3, Map<String, ? extends Object> map, Integer num) {
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = z;
        this.LJIIL = j;
        this.LJIILIIL = i3;
        this.LJIILJJIL = map;
        this.LJIILL = num;
    }
}
