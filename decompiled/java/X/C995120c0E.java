package X;

/* JADX INFO: renamed from: X.0c0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995120c0E implements InterfaceC1627870sSn {
    public final EnumC995060c08 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C995120c0E) && this.LIZIZ == ((C995120c0E) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(colorType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995120c0E(EnumC995060c08 enumC995060c08) {
        this.LIZIZ = enumC995060c08;
    }
}
