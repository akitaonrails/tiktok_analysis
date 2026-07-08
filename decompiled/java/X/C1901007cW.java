package X;

/* JADX INFO: renamed from: X.07cW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1901007cW implements InterfaceC1901107cX {
    public final EnumC333530D5r LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1901007cW) && this.LIZ == ((C1901007cW) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(errorType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1901007cW(EnumC333530D5r enumC333530D5r) {
        this.LIZ = enumC333530D5r;
    }
}
