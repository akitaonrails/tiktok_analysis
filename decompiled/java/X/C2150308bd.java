package X;

/* JADX INFO: renamed from: X.08bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2150308bd implements InterfaceC2150408be {
    public final long LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2150308bd)) {
            return false;
        }
        C2150308bd c2150308bd = (C2150308bd) obj;
        return this.LIZ == c2150308bd.LIZ && this.LIZIZ == c2150308bd.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(errCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", attempts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2150308bd(long j, int i) {
        this.LIZ = j;
        this.LIZIZ = i;
    }
}
