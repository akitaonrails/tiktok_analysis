package X;

/* JADX INFO: renamed from: X.0SJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0SJJ extends C0SJL<C719000SIg> {
    public String LLJ;
    public String LLJI;

    @Override // X.C0SFJ
    public String LIZ() {
        String str = this.LLJ;
        return str == null ? "" : str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [METADATA] */
    public final void LJ(C0SJL<C719000SIg> c0sjl) {
        C0SJJ c0sjj;
        this.LLILLL = c0sjl.LLILLL;
        this.LLILZ = c0sjl.LLILZ;
        this.LLILZIL = c0sjl.LLILZIL;
        this.LLILZLL = c0sjl.LLILZLL;
        this.LLIZ = c0sjl.LLIZ;
        this.LLIZLLLIL.addAll(c0sjl.LLIZLLLIL);
        if ((c0sjl instanceof C0SJJ) && (c0sjj = (C0SJJ) c0sjl) != null) {
            this.LLJ = c0sjj.LLJ;
            this.LLJI = c0sjj.LLJI;
        }
    }

    public C0SJJ(int i, int i2) {
        super(i, i2);
    }
}
