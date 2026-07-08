package X;

/* JADX INFO: renamed from: X.0HQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440790HQf extends AbstractC440840HQk {
    public final boolean LIZ;

    public C440790HQf() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C440790HQf) && this.LIZ == ((C440790HQf) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("COMPLETED(animationOn=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440790HQf(boolean z) {
        this.LIZ = z;
    }
}
