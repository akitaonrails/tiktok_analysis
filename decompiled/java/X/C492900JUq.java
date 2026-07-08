package X;

/* JADX INFO: renamed from: X.0JUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492900JUq extends AbstractC492880JUo {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ = 3;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C492900JUq)) {
            return false;
        }
        C492900JUq c492900JUq = (C492900JUq) obj;
        return this.LL == c492900JUq.LL && this.LLILLJJLI == c492900JUq.LLILLJJLI && this.LLILLL == c492900JUq.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestEmoteListAddData(curEmoteCnt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emoteLimitationCnt=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reachAnchorUploadLimit=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC492880JUo
    public final int getType() {
        return this.LLILZ;
    }

    public C492900JUq(int i, int i2, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
    }
}
