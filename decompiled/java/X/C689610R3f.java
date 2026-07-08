package X;

/* JADX INFO: renamed from: X.0R3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689610R3f {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C689610R3f)) {
            return false;
        }
        C689610R3f c689610R3f = (C689610R3f) obj;
        return this.LIZ == c689610R3f.LIZ && this.LIZIZ == c689610R3f.LIZIZ && this.LIZJ == c689610R3f.LIZJ && this.LIZLLL == c689610R3f.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomVisibility(showLike=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showNickname=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showVerifiedBadge=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C689610R3f(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
