package X;

/* JADX INFO: renamed from: X.0Hok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452480Hok extends AbstractC456780Hvg {
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C452480Hok) && this.LIZIZ == ((C452480Hok) obj).LIZIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("None(triggerTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC456780Hvg
    public final long LIZ() {
        return this.LIZIZ;
    }

    public C452480Hok(long j) {
        super(j);
        this.LIZIZ = j;
    }
}
