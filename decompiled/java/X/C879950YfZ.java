package X;

/* JADX INFO: renamed from: X.0YfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879950YfZ {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LIZ = "message_request_1";
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final int LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI) * 31) + this.LJII) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestEntrance(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", conversationUpdatedAt=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sortOrder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isStickyTop=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", unreadCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isUnreadMessagesUnexpired=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C879950YfZ(String str, String str2, long j, long j2, boolean z, int i, int i2, boolean z2) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = z;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = z2;
    }
}
