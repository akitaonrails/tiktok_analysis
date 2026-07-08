package X;

import java.util.List;

/* JADX INFO: renamed from: X.0cqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027660cqi extends C1041600dDC {
    public final C1028040crK LJJJJ = new C1028040crK("ad_id");
    public final C1028040crK LJJJJI = new C1028040crK("bundle_real_ad_id");
    public final C1041880dDe LJJJJIZL;
    public final C1028020crI LJJJJJ;
    public final C1028020crI LJJJJJL;
    public final C1041880dDe LJJJJL;
    public final C1041880dDe LJJJJLI;
    public final C1041880dDe LJJJJLL;
    public final C1041880dDe LJJJJZ;
    public final C1041880dDe LJJJJZI;
    public final C1041880dDe LJJJLIIL;
    public final C1041880dDe LJJJLL;
    public final C1041880dDe LJJJLZIJ;
    public final C1041880dDe LJJJZ;
    public final C1028030crJ LJJL;
    public final C1028020crI LJJLI;
    public final C1028020crI LJJLIIIIJ;
    public final C1028020crI LJJLIIIJ;
    public final C1028030crJ LJJLIIIJILLIZJL;
    public final C1028030crJ LJJLIIIJJI;
    public final C1028020crI LJJLIIIJJIZ;
    public final C1028030crJ LJJLIIIJL;
    public final C1041880dDe LJJLIIIJLJLI;
    public final C1041880dDe LJJLIIIJLLLLLLLZ;
    public final C1028030crJ LJJLIIJ;
    public final C1041880dDe LJJLIL;
    public final C1041880dDe LJJLJ;
    public final C1041880dDe LJJLJLI;
    public final C1041880dDe LJJLL;
    public final C1041880dDe LJJZ;
    public final C1041880dDe LJJZZI;
    public final C1041880dDe LJJZZIII;
    public final C1028020crI LJL;
    public final C1028020crI LJLI;
    public final C1041880dDe LJLIIIL;
    public final C1041880dDe LJLIIL;
    public final C1041880dDe LJLIL;
    public final C1041880dDe LJLILLLLZI;
    public final C1028020crI LJLJI;
    public final C1028030crJ LJLJJI;
    public final C1041880dDe LJLJJL;
    public final C1028020crI LJLJJLL;
    public final C1041880dDe LJLJL;
    public final C1028030crJ LJLJLJ;
    public final C1028040crK LJLJLLL;
    public final C1028040crK LJLL;
    public final C1041880dDe LJLLI;
    public final C1041880dDe LJLLILLLL;

    public final long LIZJ() {
        Long lLIZJ = this.LJJJJ.LIZJ();
        if (lLIZJ != null) {
            return lLIZJ.longValue();
        }
        return 0L;
    }

    public final String LIZLLL() {
        String str = (String) this.LJJJJIZL.LIZJ();
        return str == null ? "" : str;
    }

    public final String LJ() {
        String str = (String) this.LJJJJL.LIZJ();
        return str == null ? "" : str;
    }

    public C1027660cqi() {
        C1053010dVb c1053010dVb = C416501jf.LJ;
        this.LJJJJIZL = new C1041880dDe("aweme_group_id", c1053010dVb, null);
        this.LJJJJJ = new C1028020crI("ad_system_origin", 0);
        this.LJJJJJL = new C1028020crI("charge_type", 0);
        this.LJJJJL = new C1041880dDe("bundle_download_app_log_extra", c1053010dVb, null);
        this.LJJJJLI = new C1041880dDe("bundle_download_url", c1053010dVb, null);
        this.LJJJJLL = new C1041880dDe("aweme_package_name", c1053010dVb, null);
        this.LJJJJZ = new C1041880dDe("bundle_download_app_name", c1053010dVb, null);
        this.LJJJJZI = new C1041880dDe("bundle_open_url", c1053010dVb, null);
        this.LJJJLIIL = new C1041880dDe("bundle_web_url", c1053010dVb, null);
        this.LJJJLL = new C1041880dDe("bundle_ad_quick_app_url", c1053010dVb, null);
        this.LJJJLZIJ = new C1041880dDe("ad_type", c1053010dVb, null);
        this.LJJJZ = new C1041880dDe("bundle_web_title", c1053010dVb, null);
        this.LJJL = new C1028030crJ("show_report", false);
        this.LJJLI = new C1028020crI("web_type", 0);
        this.LJJLIIIIJ = new C1028020crI("bundle_download_mode", 0);
        this.LJJLIIIJ = new C1028020crI("bundle_link_mode", 0);
        this.LJJLIIIJILLIZJL = new C1028030crJ("bundle_support_multiple_download", false);
        this.LJJLIIIJJI = new C1028030crJ("bundle_disable_download_dialog", true);
        this.LJJLIIIJJIZ = new C1028020crI("bundle_webview_background", -2);
        this.LJJLIIIJL = new C1028030crJ("bundle_nav_bar_status_padding", false);
        this.LJJLIIIJLJLI = new C1041880dDe("track_url_list", c1053010dVb, null);
        this.LJJLIIIJLLLLLLLZ = new C1041880dDe("second_page_preload_channel_prefix", c1053010dVb, null);
        this.LJJLIIJ = new C1028030crJ("bundle_show_lynx_bottom_label", false);
        this.LJJLIL = new C1041880dDe("bundle_lynx_bottom_label_template_url", c1053010dVb, null);
        this.LJJLJ = new C1041880dDe("bundle_lynx_bottom_label_data", c1053010dVb, null);
        this.LJJLJLI = new C1041880dDe("bundle_full_screen_bg_image", c1053010dVb, null);
        this.LJJLL = new C1041880dDe("bundle_native_site_custom_data", c1053010dVb, null);
        this.LJJZ = new C1041880dDe("aweme_id", c1053010dVb, null);
        this.LJJZZI = new C1041880dDe("owner_id", c1053010dVb, null);
        this.LJJZZIII = new C1041880dDe("landing_page_info", c1053010dVb, null);
        this.LJL = new C1028020crI("preload_web_status", 0);
        this.LJLI = new C1028020crI("preload_is_web_url", 0);
        this.LJLIIIL = new C1041880dDe("preload_channel_name", c1053010dVb, null);
        this.LJLIIL = new C1041880dDe("bundle_second_page_gecko_channels", C416501jf.LJFF, null);
        this.LJLIL = new C1041880dDe("bundle_extra_param", c1053010dVb, null);
        this.LJLILLLLZI = new C1041880dDe("page_id", c1053010dVb, null);
        this.LJLJI = new C1028020crI("preload_web_second_page", 0);
        this.LJLJJI = new C1028030crJ("ad_landing_show_landing_page_survey", false);
        this.LJLJJL = new C1041880dDe("browser_config", c1053010dVb, null);
        this.LJLJJLL = new C1028020crI("is_nine_screen", 0);
        this.LJLJL = new C1041880dDe("req_id", c1053010dVb, null);
        this.LJLJLJ = new C1028030crJ("ad_landing_enable_landing_page_survey", false);
        this.LJLJLLL = new C1028040crK("ad_landing_show_survey_time_interval");
        this.LJLL = new C1028040crK("ad_landing_page_dwell_time");
        this.LJLLI = new C1041880dDe("ad_landing_page_schema_url", c1053010dVb, null);
        this.LJLLILLLL = new C1041880dDe("sheet_ratio", C416501jf.LIZIZ, null);
    }

    @Override // X.C1041600dDC, X.C1041720dDO, X.AbstractC1041890dDf
    public final List<InterfaceC1041910dDh<?>> LIZ() {
        return C13LP.LJLIL(C1697810uHb.LJIIJJI(this.LJJJJ, this.LJJJJI, this.LJJJJIZL, this.LJJJJJ, this.LJJJJJL, this.LJJJJL, this.LJJJJLI, this.LJJJJLL, this.LJJJJZ, this.LJJJJZI, this.LJJJLIIL, this.LJJJLL, this.LJJJLZIJ, this.LJJJZ, this.LJJL, this.LJJLI, this.LJJLIIIIJ, this.LJJLIIIJ, this.LJJLIIIJILLIZJL, this.LJJLIIIJJI, this.LJJLIIIJJIZ, this.LJJLIIIJL, this.LJJLIIIJLJLI, this.LJJLIIIJLLLLLLLZ, this.LJJLIIJ, this.LJJLIL, this.LJJLJ, this.LJJLJLI, this.LJJLL, this.LJJZ, this.LJJZZI, this.LJJZZIII, this.LJL, this.LJLI, this.LJLIIIL, this.LJLIIL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL), super.LIZ());
    }
}
