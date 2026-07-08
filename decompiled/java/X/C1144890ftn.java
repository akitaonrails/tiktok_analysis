package X;

/* JADX INFO: renamed from: X.0ftn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144890ftn extends AbstractC1145640fv0 {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144890ftn)) {
            return false;
        }
        C1144890ftn c1144890ftn = (C1144890ftn) obj;
        return this.LIZ == c1144890ftn.LIZ && this.LIZIZ == c1144890ftn.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomTypeVirtualTicketGuide(leftIconRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", envelopeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1144890ftn(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
