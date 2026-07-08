package X;

/* JADX INFO: renamed from: X.0tXC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669040tXC implements InterfaceC1160240gIY {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1669040tXC) && C1668650tWZ.LIZJ(this.LIZ, ((C1669040tXC) obj).LIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CornerSize(size = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".dp)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1669040tXC(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC1160240gIY
    public final float LIZ(long j, InterfaceC1690500u5o interfaceC1690500u5o) {
        return interfaceC1690500u5o.LJJJJLL(this.LIZ);
    }
}
