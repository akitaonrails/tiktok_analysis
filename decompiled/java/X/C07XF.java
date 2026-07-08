package X;

/* JADX INFO: renamed from: X.07XF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XF implements C07XE {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07XF) && this.LIZ == ((C07XF) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OldModel(isPeopleDisclaimer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XF(boolean z) {
        this.LIZ = z;
    }
}
