package X;

/* JADX INFO: renamed from: X.0bgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983020bgi extends AbstractC982800bgM {
    public static final /* synthetic */ int LJI = 0;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C983020bgi) && this.LJFF == ((C983020bgi) obj).LJFF;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionWithdrawMessage(replierUid=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C983020bgi(C983710bhp c983710bhp) {
        this.LJFF = c983710bhp.LJFF;
    }
}
