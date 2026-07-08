package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733340vCu {
    public final Integer LIZ;
    public final Long LIZIZ;
    public final C1733350vCv LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1733340vCu)) {
            return false;
        }
        C1733340vCu c1733340vCu = (C1733340vCu) obj;
        return Intrinsics.LJFF(this.LIZ, c1733340vCu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1733340vCu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1733340vCu.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.LIZIZ;
        return ((iHashCode + (l != null ? l.hashCode() : 0)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLivePopupFragmentEvent(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1733340vCu(Integer num, Long l, C1733350vCv c1733350vCv) {
        this.LIZ = num;
        this.LIZIZ = l;
        this.LIZJ = c1733350vCv;
    }
}
