package X;

/* JADX INFO: renamed from: X.01Rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C334801Rq {
    public String LIZ;
    public final Long LIZIZ;
    public final String LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C334801Rq() {
        String str = null;
        this(str, str, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayTrafficData(entranceFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entranceFromPlaybookId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trafficSource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C334801Rq(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (Long) null, (i & 4) != 0 ? null : str2);
    }

    public C334801Rq(String str, Long l, String str2) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = str2;
    }
}
