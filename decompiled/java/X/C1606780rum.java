package X;

/* JADX INFO: renamed from: X.0rum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606780rum implements InterfaceC713050Ry3 {
    public final float LIZ;
    public final EnumC727930Sgx LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1606780rum)) {
            return false;
        }
        C1606780rum c1606780rum = (C1606780rum) obj;
        return Float.compare(this.LIZ, c1606780rum.LIZ) == 0 && this.LIZIZ == c1606780rum.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryData(process=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progressMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
        EnumC727930Sgx enumC727930Sgx = this.LIZIZ;
        return iFloatToIntBits + (enumC727930Sgx == null ? 0 : enumC727930Sgx.hashCode());
    }

    public C1606780rum(float f, EnumC727930Sgx enumC727930Sgx) {
        this.LIZ = f;
        this.LIZIZ = enumC727930Sgx;
    }
}
