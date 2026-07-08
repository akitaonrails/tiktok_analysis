package X;

/* JADX INFO: renamed from: X.0bPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972290bPP {
    public final long LIZ;
    public final String LIZIZ;
    public final C968100bIe LIZJ;
    public final C1AZU LIZLLL;

    public final C2236241Cfm LIZ() {
        Long lValueOf = Long.valueOf(this.LIZ);
        String str = this.LIZIZ;
        C968100bIe c968100bIe = this.LIZJ;
        C2236271Cfp c2236271Cfp = null;
        if (c968100bIe != null) {
            EnumC2231891CXb enumC2231891CXbInto = c968100bIe.LIZ.into();
            EnumC972810bQF enumC972810bQFInto = c968100bIe.LIZIZ.into();
            Long lValueOf2 = Long.valueOf(c968100bIe.LIZJ);
            C972300bPQ c972300bPQ = c968100bIe.LIZLLL;
            c2236271Cfp = new C2236271Cfp(enumC2231891CXbInto, enumC972810bQFInto, lValueOf2, c972300bPQ != null ? new C2236781Cge(c972300bPQ.LIZ.into(), c972300bPQ.LIZIZ.into(), c972300bPQ.LIZJ.into(), c972300bPQ.LIZLLL.into(), c972300bPQ.LJ, Boolean.FALSE) : null);
        }
        return new C2236241Cfm("", lValueOf, str, c2236271Cfp, this.LIZLLL.into());
    }

    public C972290bPP(long j, String str, C968100bIe c968100bIe, C1AZU c1azu) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = c968100bIe;
        this.LIZLLL = c1azu;
    }
}
