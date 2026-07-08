package X;

/* JADX INFO: renamed from: X.0IAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462160IAk implements InterfaceC0148002o {
    public final boolean LL;
    public final long LLILLJJLI;
    public final long LLILLL;

    public C462160IAk() {
        this(0L, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462160IAk)) {
            return false;
        }
        C462160IAk c462160IAk = (C462160IAk) obj;
        return this.LL == c462160IAk.LL && this.LLILLJJLI == c462160IAk.LLILLJJLI && this.LLILLL == c462160IAk.LLILLL;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecallMsgUIState(shouldShowRecallMessageTip=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", msgIdOfFirstRecalledMsgByMe=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", latestRecalledMsgId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C462160IAk(long j, int i) {
        this(false, (i & 2) != 0 ? 0L : j, 0L);
    }

    public C462160IAk(boolean z, long j, long j2) {
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }
}
