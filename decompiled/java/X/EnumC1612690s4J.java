package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1612690s4J implements Serializable {
    public static final C1612980s4m Companion;
    public static final EnumC1612690s4J DRAMA_SUBS_DETAIL_PAGE;
    public static final EnumC1612690s4J EPISODE_SELECTION_CLICK_LOCKED_VIDEO;
    public static final EnumC1612690s4J EPISODE_SELECTION_CLICK_PURCHASE_BUTTON;
    public static final EnumC1612690s4J INNERFEED_AUTO_SHOW_WHEN_ENTER;
    public static final EnumC1612690s4J INNERFEED_CLICK_PURCHASE_BUTTON;
    public static final /* synthetic */ EnumC1612690s4J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1612690s4J LOCKED_PAGE;
    public static final EnumC1612690s4J PAIDVIDEO_SLIDETO_LOCKED_VIDEO;
    public static final EnumC1612690s4J PREVIEW_SLIDETO_LOCKED_VIDEO;
    public static final EnumC1612690s4J SDP_CLICK_LOCKED_VIDEO;
    public static final EnumC1612690s4J SDP_CLICK_PURCHASE_BUTTON;
    public static final EnumC1612690s4J TRAILER_SLIDETO_LOCKED_VIDEO;
    public static final EnumC1612690s4J UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1612690s4J> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1612690s4J enumC1612690s4J = new EnumC1612690s4J("SDP_CLICK_PURCHASE_BUTTON", 0, "sdp_click_purchase_button");
        SDP_CLICK_PURCHASE_BUTTON = enumC1612690s4J;
        EnumC1612690s4J enumC1612690s4J2 = new EnumC1612690s4J("SDP_CLICK_LOCKED_VIDEO", 1, "sdp_click_locked_video");
        SDP_CLICK_LOCKED_VIDEO = enumC1612690s4J2;
        EnumC1612690s4J enumC1612690s4J3 = new EnumC1612690s4J("TRAILER_SLIDETO_LOCKED_VIDEO", 2, "trailer_slideto_locked_video");
        TRAILER_SLIDETO_LOCKED_VIDEO = enumC1612690s4J3;
        EnumC1612690s4J enumC1612690s4J4 = new EnumC1612690s4J("PREVIEW_SLIDETO_LOCKED_VIDEO", 3, "preview_slideto_locked_video");
        PREVIEW_SLIDETO_LOCKED_VIDEO = enumC1612690s4J4;
        EnumC1612690s4J enumC1612690s4J5 = new EnumC1612690s4J("PAIDVIDEO_SLIDETO_LOCKED_VIDEO", 4, "paidvideo_slideto_locked_video");
        PAIDVIDEO_SLIDETO_LOCKED_VIDEO = enumC1612690s4J5;
        EnumC1612690s4J enumC1612690s4J6 = new EnumC1612690s4J("EPISODE_SELECTION_CLICK_PURCHASE_BUTTON", 5, "episode_selection_click_purchase_button");
        EPISODE_SELECTION_CLICK_PURCHASE_BUTTON = enumC1612690s4J6;
        EnumC1612690s4J enumC1612690s4J7 = new EnumC1612690s4J("EPISODE_SELECTION_CLICK_LOCKED_VIDEO", 6, "episode_selection_click_locked_video");
        EPISODE_SELECTION_CLICK_LOCKED_VIDEO = enumC1612690s4J7;
        EnumC1612690s4J enumC1612690s4J8 = new EnumC1612690s4J("INNERFEED_CLICK_PURCHASE_BUTTON", 7, "innerfeed_click_purchase_button");
        INNERFEED_CLICK_PURCHASE_BUTTON = enumC1612690s4J8;
        EnumC1612690s4J enumC1612690s4J9 = new EnumC1612690s4J("INNERFEED_AUTO_SHOW_WHEN_ENTER", 8, "innerfeed_auto_show_when_enter");
        INNERFEED_AUTO_SHOW_WHEN_ENTER = enumC1612690s4J9;
        EnumC1612690s4J enumC1612690s4J10 = new EnumC1612690s4J("LOCKED_PAGE", 9, "locked_page");
        LOCKED_PAGE = enumC1612690s4J10;
        EnumC1612690s4J enumC1612690s4J11 = new EnumC1612690s4J("DRAMA_SUBS_DETAIL_PAGE", 10, "drama_subs_detail_page");
        DRAMA_SUBS_DETAIL_PAGE = enumC1612690s4J11;
        EnumC1612690s4J enumC1612690s4J12 = new EnumC1612690s4J("UNKNOWN", 11, "unknown");
        UNKNOWN = enumC1612690s4J12;
        EnumC1612690s4J[] enumC1612690s4JArr = {enumC1612690s4J, enumC1612690s4J2, enumC1612690s4J3, enumC1612690s4J4, enumC1612690s4J5, enumC1612690s4J6, enumC1612690s4J7, enumC1612690s4J8, enumC1612690s4J9, enumC1612690s4J10, enumC1612690s4J11, enumC1612690s4J12};
        LLILLJJLI = enumC1612690s4JArr;
        LLILLL = new C2254308sP(enumC1612690s4JArr);
        Companion = new C1612980s4m();
    }

    public static EnumC1612690s4J[] values() {
        return (EnumC1612690s4J[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1612690s4J valueOf(String str) {
        return (EnumC1612690s4J) C08FF.LIZ(EnumC1612690s4J.class, str);
    }

    public EnumC1612690s4J(String str, int i, String str2) {
        this.LL = str2;
    }
}
