package X;

/* JADX INFO: renamed from: X.0tT5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666490tT5 {
    public final long LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1666490tT5)) {
            return false;
        }
        C1666490tT5 c1666490tT5 = (C1666490tT5) obj;
        return C1685910tyP.LJ(this.LIZ, c1666490tT5.LIZ) && C1685910tyP.LJ(this.LIZIZ, c1666490tT5.LIZIZ);
    }

    public final int hashCode() {
        return (C1685910tyP.LJIIJ(this.LIZ) * 31) + C1685910tyP.LJIIJ(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryPublishButtonColors(background=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZ));
        sbLIZ.append(", text=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1666490tT5(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
