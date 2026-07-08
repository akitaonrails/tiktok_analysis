package X;

/* JADX INFO: renamed from: X.07Xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1879307Xr extends AbstractC1879407Xs {
    public final long LIZ;

    @Override // X.AbstractC1879407Xs
    public final int LIZJ() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1879307Xr) && this.LIZ == ((C1879307Xr) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SinglePoint(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1879407Xs
    public final long LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC1879407Xs
    public final long LIZIZ() {
        return this.LIZ;
    }

    public C1879307Xr(long j) {
        this.LIZ = j;
    }
}
