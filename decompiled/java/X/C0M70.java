package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M70, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M70 {
    public static final C0M70 AISELF_INVITE;
    public static final C0M70 ANCHOR;
    public static final C0M70 DM_SHARE_CARD;
    public static final C0M70 FEED_CARD;
    public static final /* synthetic */ C0M70[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0M70 REMIX_ORIGINAL_PAGE;
    public static final C0M70 SHARE_PANEL;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0M70> getEntries() {
        return LLILZ;
    }

    static {
        C0M70 c0m70 = new C0M70("SHARE_PANEL", 0, "share_panel", "share_panel_remix");
        SHARE_PANEL = c0m70;
        C0M70 c0m702 = new C0M70("ANCHOR", 1, "airemix_anchor", "feed_anchor_remix");
        ANCHOR = c0m702;
        C0M70 c0m703 = new C0M70("FEED_CARD", 2, "feed_airemix_card", "rec_card_remix");
        FEED_CARD = c0m703;
        C0M70 c0m704 = new C0M70("DM_SHARE_CARD", 3, "dm_share_card", "chat_remix");
        DM_SHARE_CARD = c0m704;
        C0M70 c0m705 = new C0M70("AISELF_INVITE", 4, "aiself_invite", "aiself_invite_remix");
        AISELF_INVITE = c0m705;
        C0M70 c0m706 = new C0M70("REMIX_ORIGINAL_PAGE", 5, "remix_original_page", "remix_original_page");
        REMIX_ORIGINAL_PAGE = c0m706;
        C0M70[] c0m70Arr = {c0m70, c0m702, c0m703, c0m704, c0m705, c0m706};
        LLILLL = c0m70Arr;
        LLILZ = new C2254308sP(c0m70Arr);
    }

    public static C0M70[] values() {
        return (C0M70[]) LLILLL.clone();
    }

    public final String getMobName() {
        return this.LL;
    }

    public final String getShootName() {
        return this.LLILLJJLI;
    }

    public static C0M70 valueOf(String str) {
        return (C0M70) C08FF.LIZ(C0M70.class, str);
    }

    public C0M70(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
