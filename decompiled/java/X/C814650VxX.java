package X;

/* JADX INFO: renamed from: X.0VxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814650VxX extends AbstractC814660VxY {
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C814650VxX) && this.LIZIZ == ((C814650VxX) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClearBeforeHour(hour=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C814650VxX(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear_before_");
        sbLIZ.append(i);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = i;
    }
}
