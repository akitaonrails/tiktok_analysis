package X;

/* JADX INFO: renamed from: X.0Vc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801390Vc9 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public long LIZLLL;
    public long LJ;
    public final String LJFF;
    public final long LJI;
    public final long LJII;
    public final String LJIIIIZZ;

    static {
        new C1863450yal();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationEntityNew(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subConversationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", historyCursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", readCursor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", unreadCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", latestMessageTime=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", relatedVideo=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C801390Vc9 LIZ(C801390Vc9 c801390Vc9, int i, long j, long j2, int i2) {
        String str;
        String str2;
        String str3;
        long j3;
        long j4 = j2;
        long j5 = j;
        int i3 = i;
        String str4 = null;
        if ((i2 & 1) != 0) {
            str = c801390Vc9.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = c801390Vc9.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i3 = c801390Vc9.LIZJ;
        }
        if ((i2 & 8) != 0) {
            j5 = c801390Vc9.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            j4 = c801390Vc9.LJ;
        }
        if ((i2 & 32) != 0) {
            str3 = c801390Vc9.LJFF;
        } else {
            str3 = null;
        }
        long j6 = 0;
        if ((i2 & 64) != 0) {
            j3 = c801390Vc9.LJI;
        } else {
            j3 = 0;
        }
        if ((i2 & 128) != 0) {
            j6 = c801390Vc9.LJII;
        }
        if ((i2 & 256) != 0) {
            str4 = c801390Vc9.LJIIIIZZ;
        }
        return new C801390Vc9(i3, j5, j4, j3, j6, str, str2, str3, str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C801390Vc9(String str, String str2, int i, long j, String str3, long j2, long j3, String str4, int i2) {
        long j4;
        long j5 = j3;
        String str5 = str3;
        long j6 = j2;
        int i3 = i;
        String str6 = (i2 & 2) != 0 ? "" : str2;
        i3 = (i2 & 4) != 0 ? 0 : i3;
        if ((i2 & 8) != 0) {
            j4 = -1;
        } else {
            j4 = 0;
        }
        this(i3, j4, (i2 & 16) == 0 ? j : -1L, (i2 & 64) != 0 ? 0L : j6, (i2 & 128) != 0 ? 0L : j5, str, str6, (i2 & 32) != 0 ? null : str5, (i2 & 256) == 0 ? str4 : null);
    }

    public C801390Vc9(int i, long j, long j2, long j3, long j4, String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = str3;
        this.LJI = j3;
        this.LJII = j4;
        this.LJIIIIZZ = str4;
    }
}
