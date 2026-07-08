package X;

/* JADX INFO: renamed from: X.0bgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982710bgD {
    public static final C982710bgD LIZLLL = new C982710bgD(-10000, EnumC982700bgC.UNKNOWN, -10000);
    public final long LIZ;
    public final EnumC982700bgC LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982710bgD)) {
            return false;
        }
        C982710bgD c982710bgD = (C982710bgD) obj;
        return this.LIZ == c982710bgD.LIZ && this.LIZIZ == c982710bgD.LIZIZ && this.LIZJ == c982710bgD.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionTeamMember(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", role=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982710bgD(long j, EnumC982700bgC enumC982700bgC, long j2) {
        this.LIZ = j;
        this.LIZIZ = enumC982700bgC;
        this.LIZJ = j2;
    }
}
