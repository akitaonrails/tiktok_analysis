package X;

/* JADX INFO: renamed from: X.0bmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986690bmd extends AbstractC986700bme {
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C986690bmd) && this.LIZIZ == ((C986690bmd) obj).LIZIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enlarged(uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C986690bmd(long j) {
        this.LIZIZ = j;
    }
}
