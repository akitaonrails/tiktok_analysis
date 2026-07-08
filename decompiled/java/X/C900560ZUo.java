package X;

/* JADX INFO: renamed from: X.0ZUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900560ZUo {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteEventInfo(inviteEvent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inviteEnterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inviteEnterMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", joinMemberLabel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", joinMemberType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C900560ZUo(String str, String str2, String str3) {
        this(str, str2, str3, null, null);
    }

    public C900560ZUo(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
