package X;

/* JADX INFO: renamed from: X.0WzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841320WzS extends AbstractC841440Wze {
    public final boolean LIZ;

    public C841320WzS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C841320WzS) && this.LIZ == ((C841320WzS) obj).LIZ;
    }

    public final int hashCode() {
        boolean z = this.LIZ;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Inventory(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C841320WzS(int i) {
        this.LIZ = true;
    }
}
