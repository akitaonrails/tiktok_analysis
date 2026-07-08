package X;

/* JADX INFO: renamed from: X.0QIH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QIH implements InterfaceC663910Q2j {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0QIH) && this.LIZ == ((C0QIH) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateCursorAction(cursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QIH(int i) {
        this.LIZ = i;
    }
}
