package X;

/* JADX INFO: renamed from: X.0s7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614580s7M extends AbstractC1614600s7O {
    public final EnumC2198071B0z LIZ;
    public final EnumC1614520s7G LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614580s7M)) {
            return false;
        }
        C1614580s7M c1614580s7M = (C1614580s7M) obj;
        return this.LIZ == c1614580s7M.LIZ && this.LIZIZ == c1614580s7M.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapPanelShown(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1614580s7M(EnumC2198071B0z enumC2198071B0z, EnumC1614520s7G enumC1614520s7G) {
        this.LIZ = enumC2198071B0z;
        this.LIZIZ = enumC1614520s7G;
    }
}
