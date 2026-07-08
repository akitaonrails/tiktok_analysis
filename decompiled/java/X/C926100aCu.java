package X;

/* JADX INFO: renamed from: X.0aCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926100aCu extends AbstractC926140aCy {
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C926100aCu) && this.LIZLLL == ((C926100aCu) obj).LIZLLL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Delayed(delayMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C926100aCu(long j) {
        this.LIZLLL = j;
    }
}
