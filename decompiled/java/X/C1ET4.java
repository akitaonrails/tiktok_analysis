package X;

/* JADX INFO: renamed from: X.1ET4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1ET4 {
    COMMON_APP_START(100001, "common_app_start"),
    COMMON_CAMERA_START(100002, "common_camera_start"),
    COMMON_WINDOW_SWITCH(100003, "common_window_switch"),
    COMMON_TAB_SWITCH(100004, "common_tab_switch"),
    DY_GO_DUET(200001, "dy_go_duet"),
    DY_GO_REACTION(200002, "dy_go_reaction"),
    DY_TAB_LIVING_LOAD(200003, "dy_tab_living_load"),
    DY_TAB_NEARBY_LOAD(200004, "dy_tab_nearby_load"),
    DY_TAB_FOLLOW_LOAD(200005, "dy_tab_follow_load"),
    DY_TAB_SEARCH_LOAD(200006, "dy_tab_search_load"),
    DY_TAB_HOME_LOAD(200007, "dy_tab_home_load"),
    DY_TAB_FAMILIAR_LOAD(200008, "dy_tab_familiar_load"),
    DY_TAB_PUBLISH_LOAD(200009, "dy_tab_publish_load"),
    DY_TAB_NOTIFICATION_LOAD(200010, "dy_tab_notification_load"),
    DY_TAB_USER_LOAD(200011, "dy_tab_user_load"),
    DY_CONCURRENT_UPLOAD_COMPILE(200012, "dy_concurrent_upload_compile"),
    DY_FEED_SCROLL(200013, "dy_feed_scroll"),
    DY_COMMENT_LOAD(200014, "dy_comment_load"),
    DY_TAB_MUSIC(200015, "dy_tab_music"),
    DY_15S_CAPTURE_START(200016, "dy_15s_capture_start"),
    DY_LIVING_SCROLL(200017, "dy_living_scroll"),
    DY_LIVING_ENTER_GIFT_PANEL(200018, "dy_living_enter_gift_panel"),
    DY_LIVING_ENTER_GOODS_LIST(200019, "dy_living_enter_goods_list"),
    TO_FIRST_FRAME_DRAW(300001, "to_first_frame_draw"),
    TO_TAB_SWITCH(300002, "to_tab_switch"),
    TO_CLICK_NEWS(300003, "to_click_news"),
    TO_SCROLL_NEWS(300004, "to_scroll_news"),
    TO_VIDEO_FIRST_FRAME(300005, "to_video_first_frame"),
    TL_FIRST_FRAME_DRAW(400001, "tl_first_frame_draw"),
    TL_TAB_SWITCH(400002, "tl_tab_switch"),
    TL_CLICK_NEWS(400003, "tl_click_news"),
    TL_SCROLL_NEWS(400004, "tl_scroll_news"),
    DC_SCROLL_HOME(500001, "dc_scroll_home"),
    DC_TAB_SWITCH(500002, "dc_tab_switch"),
    DC_SCROLL_MOMENTS(500003, "dc_scroll_moments"),
    DC_VIDEO_FIRST_DRAW(500004, "dc_video_first_draw"),
    TT_GO_DUET(600001, "tt_go_duet"),
    TT_GO_REACTION(600002, "tt_go_reaction"),
    TT_TAB_LIVING_LOAD(600003, "tt_tab_living_load"),
    TT_TAB_NEARBY_LOAD(600004, "tt_tab_nearby_load"),
    TT_TAB_FOLLOW_LOAD(600005, "tt_tab_follow_load"),
    TT_TAB_SEARCH_LOAD(600006, "tt_tab_search_load"),
    TT_TAB_HOME_LOAD(600007, "tt_tab_home_load"),
    TT_TAB_FAMILIAR_LOAD(600008, "tt_tab_familiar_load"),
    TT_TAB_PUBLISH_LOAD(600009, "tt_tab_publish_load"),
    TT_TAB_NOTIFICATION_LOAD(600010, "tt_tab_notification_load"),
    TT_TAB_USER_LOAD(600011, "tt_tab_user_load"),
    TT_CONCURRENT_UPLOAD_COMPILE(600012, "tt_concurrent_upload_compile"),
    TT_FEED_SCROLL(600013, "tt_feed_scroll"),
    TT_COMMENT_LOAD(600014, "tt_comment_load"),
    TT_TAB_MUSIC(600015, "tt_tab_music"),
    TT_15S_CAPTURE_START(600016, "tt_15s_capture_start"),
    TT_LIVING_SCROLL(600017, "tt_living_scroll"),
    TT_LIVING_ENTER_GIFT_PANEL(600018, "tt_living_enter_gift_panel"),
    TT_LIVING_ENTER_GOODS_LIST(600019, "tt_living_enter_goods_list");

    public static final int MAX_CLASS = 6;
    public final int LL;
    public final String LLILLJJLI;

    C1ET4(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }

    public static C1ET4 valueOf(String str) {
        return (C1ET4) C08FF.LIZ(C1ET4.class, str);
    }

    public String getDesc() {
        return this.LLILLJJLI;
    }

    public int getId() {
        return this.LL;
    }

    public static boolean isValidId(int i) {
        int i2 = i / 100000;
        int i3 = i % 100000;
        if (i2 <= 0 || i2 > MAX_CLASS) {
            return false;
        }
        switch (i2) {
            case 1:
                if (i3 <= 0 || i3 > 4) {
                }
                break;
            case 2:
                if (i3 <= 0 || i3 > 19) {
                }
                break;
            case 3:
                if (i3 <= 0 || i3 > 5) {
                }
                break;
            case 4:
                if (i3 <= 0 || i3 > 4) {
                }
                break;
            case 5:
                if (i3 <= 0 || i3 > 4) {
                }
                break;
            case 6:
                if (i3 <= 0 || i3 > 19) {
                }
                break;
        }
        return true;
    }
}
