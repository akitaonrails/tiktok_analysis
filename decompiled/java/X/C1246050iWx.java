package X;

/* JADX INFO: renamed from: X.0iWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246050iWx extends AbstractC1734470vEj {
    public final boolean LIZ;

    public C1246050iWx() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1246050iWx) && this.LIZ == ((C1246050iWx) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Editing(isContentReady=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1246050iWx(boolean z) {
        this.LIZ = z;
    }
}
