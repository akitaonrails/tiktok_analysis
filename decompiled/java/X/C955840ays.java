package X;

/* JADX INFO: renamed from: X.0ays, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955840ays extends AbstractC957610b1j {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955840ays)) {
            return false;
        }
        C955840ays c955840ays = (C955840ays) obj;
        return this.LIZ == c955840ays.LIZ && this.LIZIZ == c955840ays.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleCancelIM(inviteType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inviterUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955840ays(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
