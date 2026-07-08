package X;

/* JADX INFO: renamed from: X.0s7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614590s7N extends AbstractC1614600s7O {
    public final EnumC1614520s7G LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1614590s7N) && this.LIZ == ((C1614590s7N) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseConfirmed(sourceScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1614590s7N(EnumC1614520s7G enumC1614520s7G) {
        this.LIZ = enumC1614520s7G;
    }
}
