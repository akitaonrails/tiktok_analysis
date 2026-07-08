package X;

/* JADX INFO: renamed from: X.0Ywf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890550Ywf extends AbstractC624280OeA<C890550Ywf> {
    public int LJI;
    public int LJII;
    public String LJIIIIZZ;

    public C890550Ywf() {
        super("show_im_tab");
    }

    @Override // X.AbstractC624280OeA
    public final void LIZLLL() {
        super.LIZLLL();
        LIZ(this.LJI, "full_tab_cnt");
        LIZ(this.LJII, "tab_cnt");
        String str = this.LJIIIIZZ;
        if (str != null) {
            LIZIZ("tab_show_rate", str);
        }
    }
}
