package X;

/* JADX INFO: renamed from: X.0ZRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899880ZRy {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899880ZRy)) {
            return false;
        }
        C899880ZRy c899880ZRy = (C899880ZRy) obj;
        return this.LIZ == c899880ZRy.LIZ && this.LIZIZ == c899880ZRy.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiffPayload(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C899880ZRy(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
