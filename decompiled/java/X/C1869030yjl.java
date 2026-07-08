package X;

/* JADX INFO: renamed from: X.0yjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869030yjl extends C1869040yjm {
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1869030yjl) && this.LIZIZ == ((C1869030yjl) obj).LIZIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGateComponentData(shouldTryAgeGate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1869030yjl(boolean z) {
        super(null);
        this.LIZIZ = z;
    }
}
