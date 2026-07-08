package X;

/* JADX INFO: renamed from: X.0KA1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KA1 extends C0KA2 {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0KA1) && this.LIZ == ((C0KA1) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeToLive(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KA1(long j) {
        this.LIZ = j;
    }
}
