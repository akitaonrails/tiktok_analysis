package X;

/* JADX INFO: renamed from: X.0uBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694190uBl extends AbstractC1694180uBk {
    public final long LIZ;

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Open(offset=");
        sbLIZ.append((Object) C1378605aS.LJIIIIZZ(this.LIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1694190uBl(long j) {
        this.LIZ = j;
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            C1691080u6k.LIZJ("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1694190uBl)) {
            return false;
        }
        return C1378605aS.LIZJ(this.LIZ, ((C1694190uBl) obj).LIZ);
    }
}
