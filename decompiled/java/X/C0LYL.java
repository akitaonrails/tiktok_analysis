package X;

/* JADX INFO: renamed from: X.0LYL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYL extends C0LYM {
    public final boolean LIZ;

    public C0LYL() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LYL) && this.LIZ == ((C0LYL) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnNavigateToEditFinished(removeAllRecordSegments=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYL(boolean z) {
        this.LIZ = z;
    }
}
