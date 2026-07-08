package X;

/* JADX INFO: renamed from: X.0qsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567190qsv {
    public final boolean LIZ;
    public final EnumC587590N2v LIZIZ;

    public C1567190qsv() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567190qsv)) {
            return false;
        }
        C1567190qsv c1567190qsv = (C1567190qsv) obj;
        return this.LIZ == c1567190qsv.LIZ && this.LIZIZ == c1567190qsv.LIZIZ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        EnumC587590N2v enumC587590N2v = this.LIZIZ;
        return iZ2 + (enumC587590N2v == null ? 0 : enumC587590N2v.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyStatus(pass=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", limit=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1567190qsv(boolean z, int i) {
        this((i & 1) != 0 ? false : z, (EnumC587590N2v) null);
    }

    public C1567190qsv(boolean z, EnumC587590N2v enumC587590N2v) {
        this.LIZ = z;
        this.LIZIZ = enumC587590N2v;
    }
}
