package X;

/* JADX INFO: renamed from: X.0bgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982870bgT extends AbstractC982800bgM {
    public static final /* synthetic */ int LJII = 0;
    public final long LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982870bgT)) {
            return false;
        }
        C982870bgT c982870bgT = (C982870bgT) obj;
        return this.LJFF == c982870bgT.LJFF && this.LJI == c982870bgT.LJI;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionRejectMessage(replierUid=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", rejectReason=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982870bgT(C983680bhm c983680bhm) {
        long j = c983680bhm.LJFF;
        int i = c983680bhm.LJI;
        this.LJFF = j;
        this.LJI = i;
    }
}
