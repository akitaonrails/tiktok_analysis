package X;

/* JADX INFO: renamed from: X.0uAO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693340uAO {
    public static final C1693340uAO LIZLLL = new C1693340uAO(0L, 0L, 7);
    public final long LIZ;
    public final long LIZIZ;
    public final float LIZJ;

    public final int hashCode() {
        return (((C1685910tyP.LJIIJ(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Shadow(color=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZ));
        sbLIZ.append(", offset=");
        sbLIZ.append((Object) C1378605aS.LJIIIIZZ(this.LIZIZ));
        sbLIZ.append(", blurRadius=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693340uAO)) {
            return false;
        }
        C1693340uAO c1693340uAO = (C1693340uAO) obj;
        if (C1685910tyP.LJ(this.LIZ, c1693340uAO.LIZ) && C1378605aS.LIZJ(this.LIZIZ, c1693340uAO.LIZIZ) && this.LIZJ == c1693340uAO.LIZJ) {
            return true;
        }
        return false;
    }

    public C1693340uAO(long j, long j2, int i) {
        this(0.0f, (i & 1) != 0 ? C1685850tyJ.LIZLLL(4278190080L) : j, (i & 2) != 0 ? 0L : j2);
    }

    public C1693340uAO(float f, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = f;
    }
}
