package X;

/* JADX INFO: renamed from: X.0ftR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144670ftR {
    public final EnumC0300008k LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Long LIZLLL;
    public final Long LJ;
    public final Long LJFF;
    public final Integer LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedMessageParams(messageSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", battleId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", msgType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1144670ftR(EnumC0300008k enumC0300008k, long j, long j2, Long l, Long l2, Long l3, Integer num) {
        this.LIZ = enumC0300008k;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = l;
        this.LJ = l2;
        this.LJFF = l3;
        this.LJI = num;
    }
}
