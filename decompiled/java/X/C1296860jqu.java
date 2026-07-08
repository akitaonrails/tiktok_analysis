package X;

/* JADX INFO: renamed from: X.0jqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296860jqu implements InterfaceC1666960tTq {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1296860jqu) && Float.compare(this.LIZ, ((C1296860jqu) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Horizontal(bias=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C1296860jqu(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC1666960tTq
    public final int LIZ(int i, int i2, EnumC1671200tag enumC1671200tag) {
        float f;
        float f2 = (i2 - i) / 2.0f;
        if (enumC1671200tag == EnumC1671200tag.Ltr) {
            f = this.LIZ;
        } else {
            f = (-1) * this.LIZ;
        }
        return Math.round(f2 * (1 + f));
    }
}
