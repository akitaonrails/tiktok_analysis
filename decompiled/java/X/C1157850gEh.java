package X;

/* JADX INFO: renamed from: X.0gEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157850gEh<T> extends AbstractC1157840gEg<T> {
    public final EnumC1787180wbk LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157850gEh) && this.LIZ == ((C1157850gEh) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157850gEh(EnumC1787180wbk enumC1787180wbk) {
        this.LIZ = enumC1787180wbk;
    }
}
