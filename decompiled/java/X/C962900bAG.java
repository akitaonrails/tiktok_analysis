package X;

/* JADX INFO: renamed from: X.0bAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962900bAG {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C962900bAG() {
        boolean z = false;
        this(z, z, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TeamPairFlagData(isInTeamPair=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transitToNone=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", soloAnchorAcceptedBattleInvitation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C962900bAG(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, false);
    }

    public C962900bAG(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
