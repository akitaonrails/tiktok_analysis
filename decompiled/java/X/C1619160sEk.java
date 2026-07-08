package X;

/* JADX INFO: renamed from: X.0sEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619160sEk implements InterfaceC1619130sEh {
    public final EnumC1790480wh4 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1619160sEk) && this.LIZ == ((C1619160sEk) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Intercepted(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1619160sEk(EnumC1790480wh4 enumC1790480wh4) {
        this.LIZ = enumC1790480wh4;
    }
}
