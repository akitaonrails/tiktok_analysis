package X;

/* JADX INFO: renamed from: X.0ibq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249080ibq implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final long LLILLL;

    public C1249080ibq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1249080ibq)) {
            return false;
        }
        C1249080ibq c1249080ibq = (C1249080ibq) obj;
        return this.LL == c1249080ibq.LL && this.LLILLJJLI == c1249080ibq.LLILLJJLI && this.LLILLL == c1249080ibq.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Y2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileRelationState(followerCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", followingCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", digCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1249080ibq(int i) {
        this(0, 0, 0L);
    }

    public C1249080ibq(int i, int i2, long j) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = j;
    }
}
