package X;

/* JADX INFO: renamed from: X.0M1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561770M1n extends AbstractC561800M1q {
    public final EnumC561760M1m LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C561770M1n) && this.LIZ == ((C561770M1n) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Time(timeBucket=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C561770M1n(EnumC561760M1m enumC561760M1m) {
        this.LIZ = enumC561760M1m;
    }
}
