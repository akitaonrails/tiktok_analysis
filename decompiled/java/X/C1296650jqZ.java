package X;

/* JADX INFO: renamed from: X.0jqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296650jqZ implements InterfaceC1666960tTq {
    public C1296650jqZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1296650jqZ)) {
            return false;
        }
        obj.getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Horizontal(bias=");
        sbLIZ.append(0.0f);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1666960tTq
    public final int LIZ(int i, int i2, EnumC1671200tag enumC1671200tag) {
        return Math.round(((i2 - i) / 2.0f) * (1 + 0.0f));
    }
}
