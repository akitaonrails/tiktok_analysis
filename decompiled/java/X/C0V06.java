package X;

/* JADX INFO: renamed from: X.0V06, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V06 implements InterfaceC1594830rbV {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0V06) && this.LIZ == ((C0V06) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RescheduleAfter(remainingMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V06(long j) {
        this.LIZ = j;
    }
}
