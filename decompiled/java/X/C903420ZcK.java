package X;

/* JADX INFO: renamed from: X.0ZcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903420ZcK extends AbstractC903430ZcL {
    public final boolean LIZIZ;

    public C903420ZcK() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C903420ZcK) && this.LIZIZ == ((C903420ZcK) obj).LIZIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Translating(autoTranslate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C903420ZcK(boolean z) {
        super(C0SKK.TRANSLATING);
        this.LIZIZ = z;
    }
}
