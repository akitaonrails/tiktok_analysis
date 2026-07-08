package X;

/* JADX INFO: renamed from: X.0Xr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861610Xr5 {
    public final boolean LIZ;

    public C861610Xr5() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C861610Xr5) && this.LIZ == ((C861610Xr5) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageGateState(hasTopBarData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C861610Xr5(boolean z) {
        this.LIZ = z;
    }
}
