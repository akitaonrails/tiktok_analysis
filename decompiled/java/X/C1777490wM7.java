package X;

/* JADX INFO: renamed from: X.0wM7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777490wM7 extends AbstractC1777520wMA {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777490wM7) && this.LIZ == ((C1777490wM7) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubmitSuccessHighRisk(industryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777490wM7(long j) {
        this.LIZ = j;
    }
}
