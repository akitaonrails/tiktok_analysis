package X;

/* JADX INFO: renamed from: X.0j9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270090j9j implements InterfaceC1277930jMN {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1270090j9j)) {
            return false;
        }
        C1270090j9j c1270090j9j = (C1270090j9j) obj;
        return this.LIZ == c1270090j9j.LIZ && this.LIZIZ == c1270090j9j.LIZIZ && this.LIZJ == c1270090j9j.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoBitrate(minBitrateBps=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultBitrateBps=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxBitrateBps=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1277930jMN
    public final boolean isValid() {
        return this.LIZ > 0 && this.LIZIZ > 0 && this.LIZJ > 0;
    }

    public C1270090j9j(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
