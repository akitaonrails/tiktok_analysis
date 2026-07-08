package X;

/* JADX INFO: renamed from: X.07U7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07U7 {
    public final int LIZ;

    public C07U7() {
        this(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07U7) && this.LIZ == ((C07U7) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAIReportResponse(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07U7(int i) {
        this.LIZ = i;
    }
}
