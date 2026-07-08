package X;

/* JADX INFO: renamed from: X.0fgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136650fgV {
    public final long LIZ;
    public final int LIZIZ;
    public boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveGiftGeneralTrayMessageMergedInfo(giftID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", comboCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isInterrupted=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1136650fgV)) {
            return false;
        }
        C1136650fgV c1136650fgV = (C1136650fgV) obj;
        if (this.LIZ == c1136650fgV.LIZ && this.LIZIZ == c1136650fgV.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1136650fgV(int i, long j, boolean z) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
