package X;

/* JADX INFO: renamed from: X.00IH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IH implements C00II {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00IH)) {
            return false;
        }
        C00IH c00ih = (C00IH) obj;
        return this.LIZ == c00ih.LIZ && this.LIZIZ == c00ih.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loop(loopStartTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loopEndTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00IH(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
