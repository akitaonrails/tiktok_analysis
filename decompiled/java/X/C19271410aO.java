package X;

/* JADX INFO: renamed from: X.10aO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19271410aO extends AbstractC1386130mAt {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;

    public C19271410aO() {
        super("qr_code_scanned");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJIILLIIL;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("url_content", str, c2082308Dt);
        LJFF("enter_method", this.LJIIZILJ, c2082308Dt);
        LJFF("landing_page", this.LJIJ, c2082308Dt);
        LJFF("from_user_code", this.LJIJI, c2082308Dt);
        LJFF("qr_code_type", this.LJIJJ, c2082308Dt);
        LJFF("url_content_tolong", this.LJIJJLI, c2082308Dt);
        LJFF("handler_name", this.LJIL, c2082308Dt);
    }
}
