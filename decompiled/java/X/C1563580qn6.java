package X;

/* JADX INFO: renamed from: X.0qn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563580qn6 {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1563580qn6)) {
            return false;
        }
        C1563580qn6 c1563580qn6 = (C1563580qn6) obj;
        return this.LIZ == c1563580qn6.LIZ && this.LIZIZ == c1563580qn6.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrimEvent(deletedCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", trimOffset=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1563580qn6(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
