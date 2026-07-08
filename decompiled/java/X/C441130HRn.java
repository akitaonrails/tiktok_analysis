package X;

/* JADX INFO: renamed from: X.0HRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441130HRn extends AbstractC440540HPg {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C441130HRn) && this.LIZ == ((C441130HRn) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Completed(idType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC440540HPg
    public final int LIZ() {
        return this.LIZ;
    }

    public C441130HRn(int i) {
        this.LIZ = i;
    }
}
