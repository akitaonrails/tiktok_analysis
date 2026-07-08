package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x9Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1808150x9Z {
    public static final EnumC1808150x9Z BOTTOM_BAR_FAQ;
    public static final EnumC1808150x9Z JOIN_CREATOR_TEAM_BTN;
    public static final /* synthetic */ EnumC1808150x9Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1808150x9Z SEND_GIFT_BTN;
    public static final EnumC1808150x9Z SET_RANKING_STICKER_BTN;
    public static final EnumC1808150x9Z SUPPORT_CREATOR_TEAM_BTN;
    public static final EnumC1808150x9Z VIEW_CREATOR_TEAM_DETAIL_PAGE_BTN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1808150x9Z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1808150x9Z enumC1808150x9Z = new EnumC1808150x9Z("SEND_GIFT_BTN", 0, "send_gift");
        SEND_GIFT_BTN = enumC1808150x9Z;
        EnumC1808150x9Z enumC1808150x9Z2 = new EnumC1808150x9Z("JOIN_CREATOR_TEAM_BTN", 1, "join");
        JOIN_CREATOR_TEAM_BTN = enumC1808150x9Z2;
        EnumC1808150x9Z enumC1808150x9Z3 = new EnumC1808150x9Z("VIEW_CREATOR_TEAM_DETAIL_PAGE_BTN", 2, "view_team");
        VIEW_CREATOR_TEAM_DETAIL_PAGE_BTN = enumC1808150x9Z3;
        EnumC1808150x9Z enumC1808150x9Z4 = new EnumC1808150x9Z("SUPPORT_CREATOR_TEAM_BTN", 3, "support");
        SUPPORT_CREATOR_TEAM_BTN = enumC1808150x9Z4;
        EnumC1808150x9Z enumC1808150x9Z5 = new EnumC1808150x9Z("SET_RANKING_STICKER_BTN", 4, "set_sticker");
        SET_RANKING_STICKER_BTN = enumC1808150x9Z5;
        EnumC1808150x9Z enumC1808150x9Z6 = new EnumC1808150x9Z("BOTTOM_BAR_FAQ", 5, "faq");
        BOTTOM_BAR_FAQ = enumC1808150x9Z6;
        EnumC1808150x9Z[] enumC1808150x9ZArr = {enumC1808150x9Z, enumC1808150x9Z2, enumC1808150x9Z3, enumC1808150x9Z4, enumC1808150x9Z5, enumC1808150x9Z6};
        LLILLJJLI = enumC1808150x9ZArr;
        LLILLL = new C2254308sP(enumC1808150x9ZArr);
    }

    public static EnumC1808150x9Z[] values() {
        return (EnumC1808150x9Z[]) LLILLJJLI.clone();
    }

    public final String getButtonType() {
        return this.LL;
    }

    public static EnumC1808150x9Z valueOf(String str) {
        return (EnumC1808150x9Z) C08FF.LIZ(EnumC1808150x9Z.class, str);
    }

    public EnumC1808150x9Z(String str, int i, String str2) {
        this.LL = str2;
    }
}
