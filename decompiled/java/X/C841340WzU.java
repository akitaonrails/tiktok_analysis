package X;

/* JADX INFO: renamed from: X.0WzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841340WzU extends AbstractC841440Wze {
    public final boolean LIZ;

    public C841340WzU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C841340WzU) && this.LIZ == ((C841340WzU) obj).LIZ;
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
        sbLIZ.append("Report(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C841340WzU(int i) {
        this.LIZ = true;
    }
}
