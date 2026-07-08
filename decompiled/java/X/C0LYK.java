package X;

/* JADX INFO: renamed from: X.0LYK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYK extends C0LYS {
    public final boolean LIZ;

    public C0LYK() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LYK) && this.LIZ == ((C0LYK) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HideComponent(hideCover=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYK(boolean z) {
        this.LIZ = z;
    }
}
