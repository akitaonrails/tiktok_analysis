package X;

/* JADX INFO: renamed from: X.0Z7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z7Y {
    public final int LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public C0Z7Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z7Y)) {
            return false;
        }
        C0Z7Y c0z7y = (C0Z7Y) obj;
        return this.LIZ == c0z7y.LIZ && this.LIZIZ == c0z7y.LIZIZ && this.LIZJ == c0z7y.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMImagePreloadConfig(maxConcurrentTasks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Z7Y(int i) {
        this.LIZ = 5;
        this.LIZIZ = 15000L;
        this.LIZJ = 2;
    }
}
