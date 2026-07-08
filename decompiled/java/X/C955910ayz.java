package X;

/* JADX INFO: renamed from: X.0ayz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955910ayz extends AbstractC957610b1j {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955910ayz)) {
            return false;
        }
        C955910ayz c955910ayz = (C955910ayz) obj;
        return this.LIZ == c955910ayz.LIZ && this.LIZIZ == c955910ayz.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleRejectIM(inviteType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inviteeUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955910ayz(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
