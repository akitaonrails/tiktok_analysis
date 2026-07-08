package X;

/* JADX INFO: renamed from: X.0bFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966220bFc {
    public final C967180bHA LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final EnumC2231911CXd LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicImReplyGroupModel(approver=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAgree=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupChannelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", selfGroupLinkmicId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", targetGroupLinkmicId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", msgMode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C966220bFc(C967180bHA c967180bHA, boolean z, long j, String str, String str2, EnumC2231911CXd enumC2231911CXd) {
        this.LIZ = c967180bHA;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = enumC2231911CXd;
    }
}
