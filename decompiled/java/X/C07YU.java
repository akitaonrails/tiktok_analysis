package X;

/* JADX INFO: renamed from: X.07YU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YU implements C07YV {
    public final int LIZ = 2131835375;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07YU) && this.LIZ == ((C07YU) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Visible(textRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
