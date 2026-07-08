package X;

/* JADX INFO: renamed from: X.18NI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NI extends AbstractC21274718Nl {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public Integer LJIILIIL;
    public String LJIILJJIL;

    public C18NI() {
        super("product_anchor_show");
    }

    @Override // X.AbstractC21274718Nl
    public final void LIZIZ() {
        String str = this.LIZLLL;
        InterfaceC21276518Od.LIZ.getClass();
        LIZ("enter_from", str);
        LIZ("group_id", this.LJ);
        LIZ("request_id", this.LJI);
        LIZ("author_id", this.LJFF);
        LIZ("product_type", this.LJII);
        LIZ("page_type", this.LJIIIIZZ);
        LIZ("anchor_show_type", this.LJIIIZ);
        LIZ("product_source", this.LJIIJJI);
        LIZ("source", this.LJIIJ);
        LIZ("page_name", this.LJIILJJIL);
        Integer num = this.LJIILIIL;
        if (num != null) {
            LIZ("follow_status", String.valueOf(num.intValue()));
        }
        LIZ("entrance_form", this.LJIIL);
    }
}
