package X;

/* JADX INFO: renamed from: X.0YCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870400YCo implements Cloneable {
    public String LL;
    public long LLILLJJLI;
    public long LLILZ;
    public long LLILLL = Long.MIN_VALUE;
    public long LLILZIL = -1;

    public final Object clone() {
        C870400YCo c870400YCo = new C870400YCo();
        c870400YCo.LL = this.LL;
        c870400YCo.LLILLJJLI = this.LLILLJJLI;
        long j = this.LLILLL;
        if (c870400YCo.LLILLL < j) {
            c870400YCo.LLILLL = j;
        }
        long j2 = this.LLILZ;
        if (c870400YCo.LLILZ < j2) {
            c870400YCo.LLILZ = j2;
        }
        long j3 = this.LLILZIL;
        if (c870400YCo.LLILZIL < j3) {
            c870400YCo.LLILZIL = j3;
        }
        return c870400YCo;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParticipantIndexInfo{conversationId='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", minIndex=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", readIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", readOrder=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
