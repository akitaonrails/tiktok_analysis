package X;

/* JADX INFO: renamed from: X.158P, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158P extends AbstractC962030b8r {
    public long LJII;
    public boolean LJIIJ;
    public final String LJI = "ttlive_client_match_effect_lynx_view_load_monitor";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";

    public final void LJIL() {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "pk_id", this.LJIIIIZZ, true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "trigger_mode", this.LJIIIZ, true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "user_type", C915980Zwa.LIZLLL().J8() ? "anchor" : "user", true);
        LJIIL(Integer.valueOf(this.LJIIJ ? 1 : 0), "is_group_live", true);
    }

    @Override // X.AbstractC962030b8r
    public final boolean LJIJJ() {
        return C915980Zwa.LIZLLL().J8();
    }

    @Override // X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJI;
    }
}
