package X;

/* JADX INFO: renamed from: X.0mn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409780mn2 extends AbstractC1409800mn4 {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1409780mn2) && this.LIZ == ((C1409780mn2) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadingPage(dataSentinel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1409780mn2() {
        this(0L);
    }

    public C1409780mn2(long j) {
        this.LIZ = j;
    }
}
