package X;

/* JADX INFO: renamed from: X.0bgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982690bgB {
    public static final C982690bgB LIZLLL = new C982690bgB(EnumC962960bAM.UNKNOWN, -10000, -10000);
    public final EnumC962960bAM LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982690bgB)) {
            return false;
        }
        C982690bgB c982690bgB = (C982690bgB) obj;
        return this.LIZ == c982690bgB.LIZ && this.LIZIZ == c982690bgB.LIZIZ && this.LIZJ == c982690bgB.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionBaseInfo(competitionBizType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", competitionId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982690bgB(EnumC962960bAM enumC962960bAM, long j, long j2) {
        this.LIZ = enumC962960bAM;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
