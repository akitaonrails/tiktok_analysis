package X;

/* JADX INFO: renamed from: X.0rqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public enum EnumC1604090rqR {
    PAGE_SELECT_VIEWPAGER_TOTAL("viewpager_page_select_total"),
    PAGE_SELECT_COMPONENT_TOTAL("component_page_select_total"),
    PAGE_SELECT_INTERNAL_TOTAL("page_select_total"),
    PAGE_SELECT_BEFORE("page_select_before"),
    PAGE_SELECT_INVOKE_SELECT("page_select_invoke_select"),
    PAGE_SELECT_UN_SELECT("page_select_un_select"),
    PAGE_SELECT_PLAYER("page_select_player"),
    PAGE_SELECT_AFTER("page_select_after"),
    PLAYER_PAUSE("player_pause"),
    PLAYER_PREPARE("player_prepare"),
    PLAYER_STOP("player_stop"),
    PLAYER_RENDER_READY("player_render_ready"),
    PLAYER_RENDER_FIRST("player_render_first"),
    PLAYER_RENDER_FIRST_DELAY("player_render_first_delay");

    public final String LL;

    public String getType() {
        return this.LL;
    }

    public static EnumC1604090rqR valueOf(String str) {
        return (EnumC1604090rqR) C08FF.LIZ(EnumC1604090rqR.class, str);
    }

    EnumC1604090rqR(String str) {
        this.LL = str;
    }
}
