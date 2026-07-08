package X;

/* JADX INFO: renamed from: X.0DAI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAI extends C0DAO {
    public final EnumC1984507pz LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAI) && this.LIZ == ((C0DAI) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompletingCheckout(step=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAI(EnumC1984507pz enumC1984507pz) {
        this.LIZ = enumC1984507pz;
    }
}
