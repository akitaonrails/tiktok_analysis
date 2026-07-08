package X;

/* JADX INFO: renamed from: X.0LaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545480LaM extends AbstractC545470LaL {
    public final EnumC545450LaJ LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C545480LaM) && this.LIZ == ((C545480LaM) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.AbstractC545470LaL
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C545480LaM(EnumC545450LaJ enumC545450LaJ) {
        this.LIZ = enumC545450LaJ;
    }
}
