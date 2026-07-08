package X;

/* JADX INFO: renamed from: X.0MXK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXK {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0MXK) && this.LIZ == ((C0MXK) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiffPayload(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0MXK(boolean z) {
        this.LIZ = z;
    }
}
