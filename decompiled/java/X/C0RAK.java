package X;

/* JADX INFO: renamed from: X.0RAK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAK extends AbstractC1007980cKy {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0RAK) && this.LIZ == ((C0RAK) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiContentVideoState(playState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RAK(int i) {
        this.LIZ = i;
    }
}
