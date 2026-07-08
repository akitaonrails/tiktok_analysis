package X;

/* JADX INFO: renamed from: X.0SJM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SJM extends C0SJJ {
    public String LLJIJIL;

    public C0SJM() {
        throw null;
    }

    @Override // X.C0SJJ, X.C0SFJ
    public final String LIZ() {
        return C718910SHx.LIZ(this.LLJIJIL);
    }

    @Override // X.C0SJL
    /* JADX INFO: renamed from: LIZIZ */
    public final C0SJL<C719000SIg> clone() {
        C0SJM c0sjm = new C0SJM(this.LL, this.LLILLJJLI, this.LLJIJIL);
        c0sjm.LJ(this);
        return c0sjm;
    }

    @Override // X.C0SJL
    public final String LIZLLL() {
        return "";
    }

    public C0SJM(int i, int i2, CharSequence charSequence) {
        super(i, i2);
        this.LLJIJIL = charSequence.toString();
    }
}
