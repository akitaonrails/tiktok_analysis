package X;

/* JADX INFO: renamed from: X.0eMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086040eMs {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1086040eMs)) {
            return false;
        }
        C1086040eMs c1086040eMs = (C1086040eMs) obj;
        return this.LIZ == c1086040eMs.LIZ && this.LIZIZ == c1086040eMs.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataPushFrequencyConfig(maxCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minIntervalMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1086040eMs() {
        this(5, 300000L);
    }

    public C1086040eMs(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
