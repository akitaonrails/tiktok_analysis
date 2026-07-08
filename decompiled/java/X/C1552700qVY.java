package X;

/* JADX INFO: renamed from: X.0qVY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552700qVY {
    public final C1552740qVc LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Long LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateChannelInfo(channelId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isBlocked=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isLazy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", exists=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", localVersion=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1552700qVY(C1552740qVc c1552740qVc, boolean z, boolean z2, boolean z3, Long l) {
        this.LIZ = c1552740qVc;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = l;
    }
}
