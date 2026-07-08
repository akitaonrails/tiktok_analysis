package X;

/* JADX INFO: renamed from: X.0573, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0573 extends AnonymousClass0576 {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0573) && this.LIZ == ((AnonymousClass0573) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Period(periodMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0573(long j) {
        this.LIZ = j;
    }
}
