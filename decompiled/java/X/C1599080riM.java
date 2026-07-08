package X;

/* JADX INFO: renamed from: X.0riM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599080riM extends AbstractC624280OeA<C1599080riM> {
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;

    public C1599080riM() {
        super("inbox_skylight_cache_hit");
        this.LJIIIZ = "";
        this.LJIIJ = -1L;
    }

    @Override // X.AbstractC624280OeA
    public final void LIZLLL() {
        super.LIZLLL();
        LIZIZ("cache_age_ms", String.valueOf(this.LJIIJ));
        LIZJ("story_not_hit_reason", this.LJIIIZ);
        LIZ(this.LJI, "hit_live_cache");
        LIZ(this.LJII, "hit_story_cache");
        LIZ(this.LJIIIIZZ, "hit_friends_cache");
        LIZ(this.LJIIJJI, "is_real_data_not_ready");
        LIZ(0, "live_count");
        LIZ(this.LJIIL, "story_count");
        LIZ(this.LJIILIIL, "friends_count");
        LIZ(this.LJIILJJIL, "total_count");
        LIZ(this.LJIILL, "is_first_enter");
    }
}
