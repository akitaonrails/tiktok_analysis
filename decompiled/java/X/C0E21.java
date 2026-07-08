package X;

/* JADX INFO: renamed from: X.0E21, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E21 {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0E21) && this.LIZ == ((C0E21) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioMetaDataInfo(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0E21() {
        this(4000);
    }

    public C0E21(int i) {
        this.LIZ = i;
    }
}
