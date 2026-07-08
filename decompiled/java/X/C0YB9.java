package X;

/* JADX INFO: renamed from: X.0YB9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YB9 extends C0YB8 {
    public final C0YZX LIZIZ;
    public final boolean LIZJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YB9) && this.LIZIZ == ((C0YB9) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Equals(category=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0YB8
    public final boolean LIZ() {
        return this.LIZJ;
    }

    public C0YB9(C0YZX c0yzx) {
        this.LIZIZ = c0yzx;
    }
}
