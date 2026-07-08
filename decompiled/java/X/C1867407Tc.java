package X;

/* JADX INFO: renamed from: X.07Tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1867407Tc {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867407Tc)) {
            return false;
        }
        C1867407Tc c1867407Tc = (C1867407Tc) obj;
        return this.LIZ == c1867407Tc.LIZ && this.LIZIZ == c1867407Tc.LIZIZ && this.LIZJ == c1867407Tc.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentEntryDiff(commentCountChanged=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasCommentChanged=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableCommentChanged=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1867407Tc(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
