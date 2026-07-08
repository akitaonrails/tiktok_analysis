package X;

/* JADX INFO: renamed from: X.0KpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529220KpE implements InterfaceC529290KpL, InterfaceC529270KpJ<C529220KpE> {
    public final long LIZIZ;

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        long j = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InterceptResult(startTime=");
        sbLIZ.append(j);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZIZ;
        if (!(obj instanceof C529220KpE) || j != ((C529220KpE) obj).LIZIZ) {
            return false;
        }
        return true;
    }
}
