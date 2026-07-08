package X;

/* JADX INFO: renamed from: X.0YGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871400YGk implements InterfaceC871310YGb {
    public final int LJIIIZ;
    public final C0YMI LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C871400YGk)) {
            return false;
        }
        C871400YGk c871400YGk = (C871400YGk) obj;
        return this.LJIIIZ == c871400YGk.LJIIIZ && this.LJIIJ == c871400YGk.LJIIJ;
    }

    public final int hashCode() {
        return (this.LJIIIZ * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxInitStateChanged(inbox=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C871400YGk(int i, C0YMI c0ymi) {
        this.LJIIIZ = i;
        this.LJIIJ = c0ymi;
    }
}
