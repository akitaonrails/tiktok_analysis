package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0T4J, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4J {
    public boolean LJII;
    public int LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int[] LJIJJ;
    public boolean LJIJJLI;
    public Boolean LJIL;
    public Boolean LJJ;
    public Boolean LJJI;
    public String LJJIFFI;
    public Long LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public String LJJIJ;
    public Integer LJJIJIIJI;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "share_panel";
    public String LJIIL = "";

    public final void LIZ(Bundle bundle) {
        C786410Ut5.LJJJI("tab_name", this.LIZ, bundle);
        C786410Ut5.LJJJI("impr_id", this.LIZIZ, bundle);
        bundle.putInt("screen_orientation", 0);
        bundle.putInt("video_share_page_type", 0);
        bundle.putInt("page_type", this.LJIILIIL);
        bundle.putBoolean("is_video_from_discover", this.LJII);
        bundle.putBoolean("isVideoHolder", this.LJIILLIIL);
        bundle.putBoolean("isTakoAiVideo", this.LJIIZILJ);
        bundle.putBoolean("icon_highlight_status", this.LJIJJLI);
        Boolean bool = this.LJJ;
        if (bool != null) {
            bundle.putBoolean("cancel_story_share_toast", bool.booleanValue());
        }
        Boolean bool2 = this.LJJI;
        if (bool2 != null) {
            bundle.putBoolean("is_feed_collection_vh", bool2.booleanValue());
        }
        String str = this.LJJIFFI;
        if (str != null) {
            C786410Ut5.LJJJI("explore_from_group_id", str, bundle);
        }
        Long l = this.LJJII;
        if (l != null) {
            bundle.putLong("explore_topic_id", l.longValue());
        }
        String str2 = this.LJJIII;
        if (str2 != null) {
            C786410Ut5.LJJJI("explore_topic", str2, bundle);
        }
        String str3 = this.LJJIIJ;
        if (str3 != null) {
            C786410Ut5.LJJJI("from_explore_page", str3, bundle);
        }
        String str4 = this.LIZJ;
        if (str4 != null && str4.length() != 0) {
            C786410Ut5.LJJJI("search_id", this.LIZJ, bundle);
        }
        String str5 = this.LIZLLL;
        if (str5 != null && str5.length() != 0) {
            C786410Ut5.LJJJI("search_result_id", this.LIZLLL, bundle);
        }
        String str6 = this.LJ;
        if (str6 != null && str6.length() != 0) {
            C786410Ut5.LJJJI("search_type", this.LJ, bundle);
        }
        String str7 = this.LJFF;
        if (str7 != null && str7.length() != 0) {
            C786410Ut5.LJJJI("tag_id", this.LJFF, bundle);
        }
        String str8 = this.LJI;
        if (str8 != null && str8.length() != 0) {
            C786410Ut5.LJJJI("extra_parent_tag_id", this.LJI, bundle);
        }
        String str9 = this.LJIILJJIL;
        if (str9 != null && str9.length() != 0) {
            C786410Ut5.LJJJI("collection_id", this.LJIILJJIL, bundle);
        }
        String str10 = this.LJIILL;
        if (str10 != null && str10.length() != 0) {
            C786410Ut5.LJJJI("collection_name", this.LJIILL, bundle);
        }
        int i = this.LJIJ;
        if (i > 0 || this.LJIJI > 0) {
            bundle.putInt("longPressDownX", i);
            bundle.putInt("longPressDownY", this.LJIJI);
        }
        Integer num = this.LJJIJIIJI;
        if (num != null) {
            bundle.putInt("is_enter_graphic_detail", num.intValue());
        }
        int[] iArr = this.LJIJJ;
        if (iArr != null) {
            bundle.putIntArray("share_button_location", iArr);
        }
        Boolean bool3 = this.LJIL;
        if (bool3 != null) {
            bundle.putBoolean("show_ad_transparency_center", bool3.booleanValue());
        }
    }
}
