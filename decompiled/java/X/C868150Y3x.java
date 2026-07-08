package X;

/* JADX INFO: renamed from: X.0Y3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868150Y3x implements InterfaceC871310YGb {
    public final C0YMI LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C868150Y3x) && this.LJIIIZ == ((C868150Y3x) obj).LJIIIZ;
    }

    public final int hashCode() {
        return this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalInitStateChanged(state=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C868150Y3x(C0YMI c0ymi) {
        this.LJIIIZ = c0ymi;
    }
}
