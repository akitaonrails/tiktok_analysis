package X;

/* JADX INFO: renamed from: X.0JUR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUR extends C0JUN {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL = 3;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JUR)) {
            return false;
        }
        C0JUR c0jur = (C0JUR) obj;
        return this.LL == c0jur.LL && this.LLILLJJLI == c0jur.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubWaveEmoteListAddData(curEmoteCnt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emoteLimitationCnt=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0JUN
    public final int getType() {
        return this.LLILLL;
    }

    public C0JUR(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
