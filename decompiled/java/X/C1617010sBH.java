package X;

/* JADX INFO: renamed from: X.0sBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617010sBH extends AbstractC1617020sBI {
    public final EnumC1614850s7n LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1617010sBH) && this.LIZ == ((C1617010sBH) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1617010sBH(EnumC1614850s7n enumC1614850s7n) {
        this.LIZ = enumC1614850s7n;
    }
}
