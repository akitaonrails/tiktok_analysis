package X;

/* JADX INFO: renamed from: X.0TB7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TB7 extends C0TB8 {
    public final int LIZ;

    public C0TB7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0TB7) && this.LIZ == ((C0TB7) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DOWNLOADING(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TB7(int i) {
        this.LIZ = i;
    }
}
