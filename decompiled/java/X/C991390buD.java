package X;

/* JADX INFO: renamed from: X.0buD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991390buD {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C991390buD() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991390buD)) {
            return false;
        }
        C991390buD c991390buD = (C991390buD) obj;
        return this.LIZ == c991390buD.LIZ && this.LIZIZ == c991390buD.LIZIZ && this.LIZJ == c991390buD.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentRepostItemDiff(noteChange=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stateChange=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", commentChange=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991390buD(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
