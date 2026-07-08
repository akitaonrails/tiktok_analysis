package X;

/* JADX INFO: renamed from: X.0aCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926120aCw extends AbstractC926030aCn {
    public final int LIZLLL;

    public C926120aCw() {
        this(2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C926120aCw) && this.LIZLLL == ((C926120aCw) obj).LIZLLL;
    }

    public final int hashCode() {
        return this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendApplyRequest(source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C926120aCw(int i) {
        this.LIZLLL = i;
    }
}
