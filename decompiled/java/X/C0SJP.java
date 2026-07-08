package X;

/* JADX INFO: renamed from: X.0SJP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SJP extends C0SJK implements C0SJE {
    public final String LLJI;

    @Override // X.C0SJK, X.C0SFJ
    public final String LIZ() {
        return "";
    }

    @Override // X.C0SJL
    /* JADX INFO: renamed from: LIZIZ */
    public final C0SJL<C719000SIg> clone() {
        C0SJP c0sjp = new C0SJP(this.LL, this.LLILLJJLI, this.LLJI);
        c0sjp.LJ(this);
        return c0sjp;
    }

    @Override // X.C0SJL
    public final String LIZLLL() {
        return this.LLJI;
    }

    public C0SJP(int i, int i2, String str) {
        super(i, i2);
        this.LLJI = str;
    }
}
