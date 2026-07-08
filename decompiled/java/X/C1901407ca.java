package X;

/* JADX INFO: renamed from: X.07ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1901407ca implements C0D4F {
    public final EnumC333530D5r LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1901407ca) && this.LIZ == ((C1901407ca) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1901407ca(EnumC333530D5r enumC333530D5r) {
        this.LIZ = enumC333530D5r;
    }
}
