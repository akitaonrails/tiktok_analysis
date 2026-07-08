package X;

/* JADX INFO: renamed from: X.051y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12872051y implements InterfaceC1921807fs {
    public final long LIZ;

    @Override // X.InterfaceC1921807fs
    public final boolean LIZ() {
        return this.LIZ != 0;
    }

    @Override // X.InterfaceC1921807fs
    public final String LIZIZ() {
        return String.valueOf(this.LIZ);
    }

    @Override // X.InterfaceC1921807fs
    public final Double LIZJ() {
        return Double.valueOf(this.LIZ);
    }

    @Override // X.InterfaceC1921807fs
    public final Long LIZLLL() {
        return Long.valueOf(this.LIZ);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        long j = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntegerType(value=");
        sbLIZ.append(j);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C12872051y) || j != ((C12872051y) obj).LIZ) {
            return false;
        }
        return true;
    }
}
