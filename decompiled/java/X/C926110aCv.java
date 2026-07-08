package X;

/* JADX INFO: renamed from: X.0aCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926110aCv extends AbstractC926140aCy {
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C926110aCv) && this.LIZLLL == ((C926110aCv) obj).LIZLLL;
    }

    public final int hashCode() {
        return this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Immediate(source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C926110aCv(int i) {
        this.LIZLLL = i;
    }
}
