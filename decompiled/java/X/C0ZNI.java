package X;

/* JADX INFO: renamed from: X.0ZNI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNI implements C0ZNT {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZNI) && this.LIZ == ((C0ZNI) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMCameraMessageExpired(stringRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZNI(int i) {
        this.LIZ = i;
    }
}
