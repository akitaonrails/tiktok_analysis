package X;

/* JADX INFO: renamed from: X.0wSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781550wSf implements InterfaceC2753014t {
    public final long LL;
    public final boolean LLILLJJLI = false;
    public final int LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781550wSf)) {
            return false;
        }
        C1781550wSf c1781550wSf = (C1781550wSf) obj;
        return this.LL == c1781550wSf.LL && this.LLILLJJLI == c1781550wSf.LLILLJJLI && this.LLILLL == c1781550wSf.LLILLL && this.LLILZ == c1781550wSf.LLILZ;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsIndustrySelectResultSource(industryId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", canReselect=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", riskLevel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isHighRisk=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781550wSf(int i, long j, boolean z) {
        this.LL = j;
        this.LLILLL = i;
        this.LLILZ = z;
    }
}
