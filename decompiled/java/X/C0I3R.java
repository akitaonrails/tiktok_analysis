package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I3R implements C0I40 {
    public final long LIZ;
    public final Long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I3R)) {
            return false;
        }
        C0I3R c0i3r = (C0I3R) obj;
        return this.LIZ == c0i3r.LIZ && Intrinsics.LJFF(this.LIZIZ, c0i3r.LIZIZ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        Long l = this.LIZIZ;
        return iY2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unclickable(refMsgId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I3R(long j, Long l) {
        this.LIZ = j;
        this.LIZIZ = l;
    }
}
