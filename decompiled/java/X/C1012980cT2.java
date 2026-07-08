package X;

/* JADX INFO: renamed from: X.0cT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012980cT2 extends AbstractC1013000cT4 {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1012980cT2) && this.LIZ == ((C1012980cT2) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Progress(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1012980cT2(int i) {
        this.LIZ = i;
    }
}
