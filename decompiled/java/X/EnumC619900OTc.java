package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC619900OTc {
    public static final EnumC619900OTc ANALYTICS_TOOLTIP;
    public static final EnumC619900OTc CHAT_BUBBLE;
    public static final EnumC619900OTc COMMENT_ENTRY_TOOLTIP;
    public static final EnumC619900OTc GAMEPLAY_ACB_TOOLTIP;
    public static final EnumC619900OTc INSPIRATION_CARD;
    public static final /* synthetic */ EnumC619900OTc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC619900OTc SHARE_TOOLTIP;
    public static final EnumC619900OTc TOP_BANNER;
    public static final EnumC619900OTc VIDEO_TOOLTIP;
    public static final EnumC619900OTc VOICE_TOOLTIP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC619900OTc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC619900OTc enumC619900OTc = new EnumC619900OTc("TOP_BANNER", 0, "top_banner");
        TOP_BANNER = enumC619900OTc;
        EnumC619900OTc enumC619900OTc2 = new EnumC619900OTc("INSPIRATION_CARD", 1, "inspiration_card");
        INSPIRATION_CARD = enumC619900OTc2;
        EnumC619900OTc enumC619900OTc3 = new EnumC619900OTc("GAMEPLAY_ACB_TOOLTIP", 2, "gameplay_acb");
        GAMEPLAY_ACB_TOOLTIP = enumC619900OTc3;
        EnumC619900OTc enumC619900OTc4 = new EnumC619900OTc("VOICE_TOOLTIP", 3, "voice");
        VOICE_TOOLTIP = enumC619900OTc4;
        EnumC619900OTc enumC619900OTc5 = new EnumC619900OTc("CHAT_BUBBLE", 4, "chat_bubble");
        CHAT_BUBBLE = enumC619900OTc5;
        EnumC619900OTc enumC619900OTc6 = new EnumC619900OTc("COMMENT_ENTRY_TOOLTIP", 5, "comment_entry");
        COMMENT_ENTRY_TOOLTIP = enumC619900OTc6;
        EnumC619900OTc enumC619900OTc7 = new EnumC619900OTc("ANALYTICS_TOOLTIP", 6, "analytics");
        ANALYTICS_TOOLTIP = enumC619900OTc7;
        EnumC619900OTc enumC619900OTc8 = new EnumC619900OTc("SHARE_TOOLTIP", 7, "share");
        SHARE_TOOLTIP = enumC619900OTc8;
        EnumC619900OTc enumC619900OTc9 = new EnumC619900OTc("VIDEO_TOOLTIP", 8, "video");
        VIDEO_TOOLTIP = enumC619900OTc9;
        EnumC619900OTc[] enumC619900OTcArr = {enumC619900OTc, enumC619900OTc2, enumC619900OTc3, enumC619900OTc4, enumC619900OTc5, enumC619900OTc6, enumC619900OTc7, enumC619900OTc8, enumC619900OTc9};
        LLILLJJLI = enumC619900OTcArr;
        LLILLL = new C2254308sP(enumC619900OTcArr);
    }

    public static EnumC619900OTc[] values() {
        return (EnumC619900OTc[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC619900OTc valueOf(String str) {
        return (EnumC619900OTc) C08FF.LIZ(EnumC619900OTc.class, str);
    }

    public EnumC619900OTc(String str, int i, String str2) {
        this.LL = str2;
    }
}
