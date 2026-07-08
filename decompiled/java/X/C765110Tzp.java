package X;

/* JADX INFO: renamed from: X.0Tzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765110Tzp extends AbstractC764660Tz6 {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C765110Tzp)) {
            return false;
        }
        C765110Tzp c765110Tzp = (C765110Tzp) obj;
        return this.LIZ == c765110Tzp.LIZ && this.LIZIZ == c765110Tzp.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueueNewSongsCountState(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", queueListSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C765110Tzp(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
