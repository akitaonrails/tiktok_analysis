package X;

/* JADX INFO: renamed from: X.12Ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19747512Ob {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19747512Ob)) {
            return false;
        }
        C19747512Ob c19747512Ob = (C19747512Ob) obj;
        return this.LIZ == c19747512Ob.LIZ && this.LIZIZ == c19747512Ob.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerformanceMetricStreak(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19747512Ob(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
