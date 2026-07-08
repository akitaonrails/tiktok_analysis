package X;

/* JADX INFO: renamed from: X.07ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZE extends C07ZF {
    public final EnumC1738320vKw LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07ZE) && this.LIZ == ((C07ZE) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonAssetCreateConfig(fromType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C07ZF
    public final EnumC1738320vKw LIZ() {
        return this.LIZ;
    }

    public C07ZE(EnumC1738320vKw enumC1738320vKw) {
        super(enumC1738320vKw);
        this.LIZ = enumC1738320vKw;
    }
}
