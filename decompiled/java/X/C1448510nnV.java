package X;

/* JADX INFO: renamed from: X.0nnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448510nnV extends AbstractC1448530nnX {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1448510nnV) && this.LIZ == ((C1448510nnV) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessRunningError(ret=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1448510nnV(int i) {
        this.LIZ = i;
    }
}
