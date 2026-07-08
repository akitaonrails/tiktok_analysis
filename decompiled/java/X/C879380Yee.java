package X;

/* JADX INFO: renamed from: X.0Yee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879380Yee {
    public final int LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public boolean LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMInnerPushMobParams(msgNumber=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dequeueTimeConsumption=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLightInteraction=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", interactionType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C879380Yee(String str, long j, int i, int i2) {
        i = (i2 & 1) != 0 ? -1 : i;
        str = (i2 & 2) != 0 ? "" : str;
        String str2 = (i2 & 16) == 0 ? null : "";
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = false;
        this.LJ = str2;
        this.LJFF = null;
    }
}
