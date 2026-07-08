package X;

/* JADX INFO: renamed from: X.0pn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525080pn0 extends AbstractC1525130pn5 {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1525080pn0) && this.LIZ == ((C1525080pn0) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return "Numeric(value=" + this.LIZ + ")";
    }

    public C1525080pn0(int i) {
        this.LIZ = i;
    }
}
