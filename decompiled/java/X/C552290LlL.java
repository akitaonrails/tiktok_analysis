package X;

/* JADX INFO: renamed from: X.0LlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552290LlL {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C552290LlL)) {
            return false;
        }
        C552290LlL c552290LlL = (C552290LlL) obj;
        return this.LIZ == c552290LlL.LIZ && this.LIZIZ == c552290LlL.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowQuotaOutput(quota=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", quotaRemain=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C552290LlL(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
