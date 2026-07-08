package X;

/* JADX INFO: renamed from: X.096W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096W implements C096X {
    public final int LIZ;

    public C096W() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C096W) && this.LIZ == ((C096W) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompressImageConfig(maxSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C096W(int i) {
        this.LIZ = 1920;
    }
}
