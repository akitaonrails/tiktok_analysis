package X;

/* JADX INFO: renamed from: X.0KlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526850KlP implements InterfaceC526830KlN {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C526850KlP) && this.LIZ == ((C526850KlP) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClearAll(isFromClearLastSelection=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C526850KlP(boolean z) {
        this.LIZ = z;
    }
}
