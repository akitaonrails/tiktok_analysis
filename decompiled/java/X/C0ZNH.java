package X;

/* JADX INFO: renamed from: X.0ZNH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNH implements C0ZNT {
    public final int LIZ = 2131831009;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZNH) && this.LIZ == ((C0ZNH) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMCameraGroupBanned(stringRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
