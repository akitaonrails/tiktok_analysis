package X;

/* JADX INFO: renamed from: X.0IQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQ1 {
    public final EnumC466180IPw LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IQ1)) {
            return false;
        }
        C0IQ1 c0iq1 = (C0IQ1) obj;
        return this.LIZ == c0iq1.LIZ && this.LIZIZ == c0iq1.LIZIZ && this.LIZJ == c0iq1.LIZJ && this.LIZLLL == c0iq1.LIZLLL && this.LJ == c0iq1.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusDegradeNotifyConfig(issueType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", issueTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", displayDuration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IQ1(EnumC466180IPw enumC466180IPw, int i, int i2, long j, int i3) {
        i2 = (i3 & 4) != 0 ? 0 : i2;
        j = (i3 & 8) != 0 ? 0L : j;
        long j2 = (i3 & 16) != 0 ? 10000L : 0L;
        this.LIZ = enumC466180IPw;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = j2;
    }
}
