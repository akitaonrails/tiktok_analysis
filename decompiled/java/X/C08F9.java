package X;

/* JADX INFO: renamed from: X.08F9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F9 {
    public final long LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08F9)) {
            return false;
        }
        C08F9 c08f9 = (C08F9) obj;
        return this.LIZ == c08f9.LIZ && this.LIZIZ == c08f9.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entry(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08F9(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
