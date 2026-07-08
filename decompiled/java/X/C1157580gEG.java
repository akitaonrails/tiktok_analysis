package X;

/* JADX INFO: renamed from: X.0gEG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157580gEG implements InterfaceC1157570gEF {
    public final int LIZ;

    public C1157580gEG() {
        this(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157580gEG) && this.LIZ == ((C1157580gEG) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157580gEG(int i) {
        this.LIZ = i;
    }
}
