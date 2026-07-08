package X;

/* JADX INFO: renamed from: X.0JIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JIZ extends AbstractC489630JIb {
    public final C0JIV LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JIZ) && this.LIZ == ((C0JIZ) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicPeelBottomBanner(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JIZ(C0JIV c0jiv) {
        this.LIZ = c0jiv;
    }
}
