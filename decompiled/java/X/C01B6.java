package X;

/* JADX INFO: renamed from: X.01B6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01B6 {
    public final long LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01B6)) {
            return false;
        }
        C01B6 c01b6 = (C01B6) obj;
        return this.LIZ == c01b6.LIZ && this.LIZIZ == c01b6.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComebackRule(windowMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01B6(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
