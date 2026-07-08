package X;

/* JADX INFO: renamed from: X.05VU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05VU extends C0M8P {
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C05VU) && this.LIZIZ == ((C05VU) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewPageIndexSet(idx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05VU(int i) {
        super(false);
        this.LIZIZ = i;
    }
}
