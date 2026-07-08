package X;

/* JADX INFO: renamed from: X.0uKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699640uKY {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1699640uKY) && this.LIZ == ((C1699640uKY) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return "MemoryWarningData(level=" + this.LIZ + ")";
    }

    public C1699640uKY(int i) {
        this.LIZ = i;
    }
}
