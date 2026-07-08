package X;

/* JADX INFO: renamed from: X.051w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12870051w implements InterfaceC1921807fs {
    public final boolean LIZ;

    @Override // X.InterfaceC1921807fs
    public final String LIZIZ() {
        return String.valueOf(this.LIZ);
    }

    @Override // X.InterfaceC1921807fs
    public final Double LIZJ() {
        return Double.valueOf(this.LIZ ? 1.0d : 0.0d);
    }

    @Override // X.InterfaceC1921807fs
    public final Long LIZLLL() {
        return Long.valueOf(this.LIZ ? 1L : 0L);
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        boolean z = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoolType(value=");
        sbLIZ.append(z);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1921807fs
    public final boolean LIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        boolean z = this.LIZ;
        if (!(obj instanceof C12870051w) || z != ((C12870051w) obj).LIZ) {
            return false;
        }
        return true;
    }
}
