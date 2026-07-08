package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512060K6i extends AbstractC509530JyZ {
    public final C512220K6y LIZJ;
    public final C512210K6x LIZLLL;
    public final C0KAH LJ;

    public C512060K6i() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C512060K6i)) {
            return false;
        }
        C512060K6i c512060K6i = (C512060K6i) obj;
        return Intrinsics.LJFF(this.LIZJ, c512060K6i.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c512060K6i.LIZLLL) && Intrinsics.LJFF(this.LJ, c512060K6i.LJ);
    }

    public final int hashCode() {
        C512220K6y c512220K6y = this.LIZJ;
        int iHashCode = (c512220K6y == null ? 0 : c512220K6y.hashCode()) * 31;
        C512210K6x c512210K6x = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c512210K6x == null ? 0 : c512210K6x.hashCode())) * 31;
        C0KAH c0kah = this.LJ;
        return iHashCode2 + (c0kah != null ? c0kah.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribedNotExpired(subscribeSuccessData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resubscribeSuccessData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", planChangeSuccessData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512060K6i(C512220K6y c512220K6y, C512210K6x c512210K6x, C0KAH c0kah, int i) {
        super(true, "subscribed_not_expired");
        c512220K6y = (i & 1) != 0 ? null : c512220K6y;
        c512210K6x = (i & 2) != 0 ? null : c512210K6x;
        c0kah = (i & 4) != 0 ? null : c0kah;
        this.LIZJ = c512220K6y;
        this.LIZLLL = c512210K6x;
        this.LJ = c0kah;
    }
}
