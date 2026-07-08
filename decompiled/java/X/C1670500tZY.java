package X;

/* JADX INFO: renamed from: X.0tZY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670500tZY implements InterfaceC1667140tU8 {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1670500tZY) && C1685910tyP.LJ(this.LIZ, ((C1670500tZY) obj).LIZ);
    }

    public final int hashCode() {
        return C1685910tyP.LJIIJ(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalImageColor(color=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1670500tZY(long j) {
        this.LIZ = j;
    }
}
