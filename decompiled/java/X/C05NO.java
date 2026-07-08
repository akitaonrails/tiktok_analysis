package X;

/* JADX INFO: renamed from: X.05NO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05NO implements C05NT {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C05NO) && this.LIZ == ((C05NO) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InProgress(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05NO(int i) {
        this.LIZ = i;
    }
}
