package X;

import java.util.List;

/* JADX INFO: renamed from: X.0dDC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1041600dDC extends C1041720dDO {
    public final C1028030crJ LIZJ = new C1028030crJ("hide_status_bar", false);
    public final C1028030crJ LIZLLL = new C1028030crJ("hide_nav_bar", false);
    public final C1028030crJ LJ = new C1028030crJ("trans_status_bar", false);
    public final C1041880dDe LJFF;
    public final C1041880dDe LJI;
    public final C1041880dDe LJII;
    public final C1041880dDe LJIIIIZZ;
    public final C1041880dDe LJIIIZ;
    public final C1041880dDe LJIIJ;
    public final C1028030crJ LJIIJJI;
    public final C1041880dDe LJIIL;
    public final C1041880dDe LJIILIIL;
    public final C1041880dDe LJIILJJIL;
    public final C1028030crJ LJIILL;
    public final C1028030crJ LJIILLIIL;
    public final C1028030crJ LJIIZILJ;
    public final C1041880dDe LJIJ;
    public final C1041880dDe LJIJI;
    public final C1028030crJ LJIJJ;
    public final C1028030crJ LJIJJLI;
    public final C1028030crJ LJIL;
    public final C1028020crI LJJ;
    public final C1028030crJ LJJI;
    public final C1028030crJ LJJIFFI;
    public final C1028030crJ LJJII;
    public final C1028030crJ LJJIII;
    public final C1028030crJ LJJIIJ;
    public final C1028030crJ LJJIIJZLJL;
    public final C1028030crJ LJJIIZ;
    public final C1041880dDe LJJIIZI;
    public final C1041880dDe LJJIJ;
    public final C1028030crJ LJJIJIIJI;
    public final C1028030crJ LJJIJIIJIL;
    public final C1028030crJ LJJIJIL;
    public final C1028040crK LJJIJL;
    public final C1028030crJ LJJIJLIJ;
    public final C1041880dDe LJJIL;
    public final C1041880dDe LJJIZ;
    public final C1028030crJ LJJJ;
    public final C1028030crJ LJJJI;
    public final C1028030crJ LJJJIL;

    public C1041600dDC() {
        C1053010dVb c1053010dVb = C1DQH.LIZ;
        this.LJFF = new C1041880dDe("nav_bar_color", c1053010dVb, new C1044210dHP(-2));
        this.LJI = new C1041880dDe("status_bar_color", c1053010dVb, new C1044210dHP(-2));
        this.LJII = new C1041880dDe("status_font_mode", C1DQH.LIZJ, C1DQL.AUTO);
        C1053010dVb c1053010dVb2 = C416501jf.LJ;
        this.LJIIIIZZ = new C1041880dDe("title", c1053010dVb2, null);
        this.LJIIIZ = new C1041880dDe("title_color", c1053010dVb, new C1044210dHP(-2));
        this.LJIIJ = new C1041880dDe("nav_btn_type", C1DQH.LIZIZ, C1DQ5.NONE);
        this.LJIIJJI = new C1028030crJ("show_more_button", false);
        this.LJIIL = new C1041880dDe("container_bgcolor", c1053010dVb, new C1044210dHP(-2));
        this.LJIILIIL = new C1041880dDe("loading_bgcolor", c1053010dVb, new C1044210dHP(-2));
        this.LJIILJJIL = new C1041880dDe("need_out_animation", C1DQH.LIZLLL, C1DQK.AUTO);
        this.LJIILL = new C1028030crJ("show_loading", true);
        this.LJIILLIIL = new C1028030crJ("show_error", true);
        this.LJIIZILJ = new C1028030crJ("show_keyboard", false);
        this.LJIJ = new C1041880dDe("report_bid", c1053010dVb2, null);
        this.LJIJI = new C1041880dDe("report_pid", c1053010dVb2, null);
        this.LJIJJ = new C1028030crJ("show_closeall", false);
        this.LJIJJLI = new C1028030crJ("is_adjust_pan", false);
        this.LJIL = new C1028030crJ("enable_immersion_keyboard_control", true);
        this.LJJ = new C1028020crI("title_bar_style", 0);
        this.LJJI = new C1028030crJ("no_hw", false);
        this.LJJIFFI = new C1028030crJ("_need_container_id", false);
        this.LJJII = new C1028030crJ("block_back_press", false);
        this.LJJIII = new C1028030crJ("status_font_dark", true);
        this.LJJIIJ = new C1028030crJ("hide_loading", false);
        this.LJJIIJZLJL = new C1028030crJ("show_load_dialog", true);
        this.LJJIIZ = new C1028030crJ("should_full_screen", false);
        this.LJJIIZI = new C1041880dDe("bg_color", c1053010dVb, new C1044210dHP(-2));
        this.LJJIJ = new C1041880dDe("top_bar_color", c1053010dVb, new C1044210dHP(-2));
        this.LJJIJIIJI = new C1028030crJ("need_bottom_out", false);
        this.LJJIJIIJIL = new C1028030crJ("status_bar_padding", false);
        this.LJJIJIL = new C1028030crJ("enable_xschema_interceptor", false);
        this.LJJIJL = new C1028040crK("load_url_delay_time", 0L);
        this.LJJIJLIJ = new C1028030crJ("use_ordinary_web", true);
        this.LJJIL = new C1041880dDe("topbar_type", c1053010dVb2, null);
        this.LJJIZ = new C1041880dDe("disable_pop_gesture", c1053010dVb2, null);
        this.LJJJ = new C1028030crJ("hide_more", true);
        this.LJJJI = new C1028030crJ("show_debug_title", false);
        this.LJJJIL = new C1028030crJ("copy_link_action", false);
    }

    @Override // X.C1041720dDO, X.AbstractC1041890dDf
    public List<InterfaceC1041910dDh<?>> LIZ() {
        return C13LP.LJLIL(C1697810uHb.LJIIJJI(this.LJJI, this.LJIILIIL, this.LIZJ, this.LJ, this.LJI, this.LIZLLL, this.LJJJI, this.LJIIL, this.LJIIIIZZ, this.LJJ, this.LJFF, this.LJIIIZ, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJIZ, this.LJJJ, this.LJIIJ, this.LJIIJJI, this.LJJIJLIJ, this.LJJIL, this.LJJIFFI, this.LJIJ, this.LJIJI, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJII, this.LJIILJJIL, this.LJJII, this.LJJIJIIJIL, this.LJJJIL, this.LJJIII, this.LJJIJIIJI, this.LJJIIZ, this.LJJIIJ, this.LJJIIZI, this.LJJIIJZLJL, this.LJJIJ, this.LJJIJIL, this.LJJIJL), super.LIZ());
    }
}
