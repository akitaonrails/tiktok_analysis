package X;

/* JADX INFO: renamed from: X.0cy9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032270cy9 {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1032270cy9)) {
            return false;
        }
        C1032270cy9 c1032270cy9 = (C1032270cy9) obj;
        return this.LIZ == c1032270cy9.LIZ && this.LIZIZ == c1032270cy9.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvoidOtherVisibilitySnapshot(bottomInteractVisibility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slideVisibility=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1032270cy9(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
