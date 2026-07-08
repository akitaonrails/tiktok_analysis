package X;

/* JADX INFO: renamed from: X.07ZD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZD extends C07ZF {
    public final EnumC1738320vKw LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZD)) {
            return false;
        }
        C07ZD c07zd = (C07ZD) obj;
        return this.LIZ == c07zd.LIZ && this.LIZIZ == c07zd.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlipYAssetCreateConfig(fromType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", flipY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C07ZF
    public final EnumC1738320vKw LIZ() {
        return this.LIZ;
    }

    public C07ZD(EnumC1738320vKw enumC1738320vKw, boolean z) {
        super(enumC1738320vKw);
        this.LIZ = enumC1738320vKw;
        this.LIZIZ = z;
    }
}
