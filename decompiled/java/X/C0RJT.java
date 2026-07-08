package X;

/* JADX INFO: renamed from: X.0RJT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJT implements InterfaceC0148002o {
    public final boolean LL;
    public final long LLILLJJLI;

    public C0RJT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RJT)) {
            return false;
        }
        C0RJT c0rjt = (C0RJT) obj;
        return this.LL == c0rjt.LL && this.LLILLJJLI == c0rjt.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedInfoAreaState(infoVisible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", animateDuration=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0RJT(int i) {
        this(true, -1L);
    }

    public C0RJT(boolean z, long j) {
        this.LL = z;
        this.LLILLJJLI = j;
    }
}
