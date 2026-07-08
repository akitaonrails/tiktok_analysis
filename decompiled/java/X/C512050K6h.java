package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512050K6h extends AbstractC511920K5u {
    public final C512140K6q LIZIZ;
    public final C1166804hO LIZJ;
    public final C512070K6j LIZLLL;

    public C512050K6h() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C512050K6h)) {
            return false;
        }
        C512050K6h c512050K6h = (C512050K6h) obj;
        return Intrinsics.LJFF(this.LIZIZ, c512050K6h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c512050K6h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c512050K6h.LIZLLL);
    }

    public final int hashCode() {
        C512140K6q c512140K6q = this.LIZIZ;
        int iHashCode = (c512140K6q == null ? 0 : c512140K6q.hashCode()) * 31;
        C1166804hO c1166804hO = this.LIZJ;
        int iHashCode2 = (iHashCode + (c1166804hO == null ? 0 : c1166804hO.hashCode())) * 31;
        C512070K6j c512070K6j = this.LIZLLL;
        return iHashCode2 + (c512070K6j != null ? c512070K6j.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribedNotExpired(subscribeSuccessData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resubscribeSuccessData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", planChangeSuccessData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512050K6h(C512140K6q c512140K6q, C1166804hO c1166804hO, C512070K6j c512070K6j, int i) {
        super("subscribed_not_expired");
        c512140K6q = (i & 1) != 0 ? null : c512140K6q;
        c1166804hO = (i & 2) != 0 ? null : c1166804hO;
        c512070K6j = (i & 4) != 0 ? null : c512070K6j;
        this.LIZIZ = c512140K6q;
        this.LIZJ = c1166804hO;
        this.LIZLLL = c512070K6j;
    }
}
