package X;

/* JADX INFO: renamed from: X.0Zy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916860Zy0 {
    public final long LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C916860Zy0)) {
            return false;
        }
        C916860Zy0 c916860Zy0 = (C916860Zy0) obj;
        return this.LIZ == c916860Zy0.LIZ && this.LIZIZ == c916860Zy0.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedInvitee(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C916860Zy0(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
