package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20654715s1 {
    public static final EnumC20654715s1 DEBUG_OUTREACH;
    public static final EnumC20654715s1 FEED_COMPONENT;
    public static final EnumC20654715s1 FEED_WIDGET;
    public static final EnumC20654715s1 FYP;
    public static final EnumC20654715s1 INBOX_BANNER;
    public static final EnumC20654715s1 IN_APP_PUSH;
    public static final /* synthetic */ EnumC20654715s1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20654715s1 OUT_APP_PUSH;
    public static final EnumC20654715s1 POPUP;
    public static final EnumC20654715s1 PROFILE_BANNER;
    public static final EnumC20654715s1 SPECIAL_CARD;
    public static final EnumC20654715s1 SURVEY_CARD;
    public static final EnumC20654715s1 TOOLTIP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20654715s1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20654715s1 enumC20654715s1 = new EnumC20654715s1("DEBUG_OUTREACH", 0, "debug");
        DEBUG_OUTREACH = enumC20654715s1;
        EnumC20654715s1 enumC20654715s12 = new EnumC20654715s1("POPUP", 1, "popup");
        POPUP = enumC20654715s12;
        EnumC20654715s1 enumC20654715s13 = new EnumC20654715s1("TOOLTIP", 2, "tooltip");
        TOOLTIP = enumC20654715s13;
        EnumC20654715s1 enumC20654715s14 = new EnumC20654715s1("SURVEY_CARD", 3, "survey_card");
        SURVEY_CARD = enumC20654715s14;
        EnumC20654715s1 enumC20654715s15 = new EnumC20654715s1("SPECIAL_CARD", 4, "special_shaped_card");
        SPECIAL_CARD = enumC20654715s15;
        EnumC20654715s1 enumC20654715s16 = new EnumC20654715s1("PROFILE_BANNER", 5, "profile_banner");
        PROFILE_BANNER = enumC20654715s16;
        EnumC20654715s1 enumC20654715s17 = new EnumC20654715s1("INBOX_BANNER", 6, "inbox_banner");
        INBOX_BANNER = enumC20654715s17;
        EnumC20654715s1 enumC20654715s18 = new EnumC20654715s1("IN_APP_PUSH", 7, "in_app_push");
        IN_APP_PUSH = enumC20654715s18;
        EnumC20654715s1 enumC20654715s19 = new EnumC20654715s1("FEED_WIDGET", 8, "feed_widget");
        FEED_WIDGET = enumC20654715s19;
        EnumC20654715s1 enumC20654715s110 = new EnumC20654715s1("OUT_APP_PUSH", 9, "out_app_push");
        OUT_APP_PUSH = enumC20654715s110;
        EnumC20654715s1 enumC20654715s111 = new EnumC20654715s1("FEED_COMPONENT", 10, "feed_component");
        FEED_COMPONENT = enumC20654715s111;
        EnumC20654715s1 enumC20654715s112 = new EnumC20654715s1("FYP", 11, "feed_fyp");
        FYP = enumC20654715s112;
        EnumC20654715s1[] enumC20654715s1Arr = {enumC20654715s1, enumC20654715s12, enumC20654715s13, enumC20654715s14, enumC20654715s15, enumC20654715s16, enumC20654715s17, enumC20654715s18, enumC20654715s19, enumC20654715s110, enumC20654715s111, enumC20654715s112};
        LLILLJJLI = enumC20654715s1Arr;
        LLILLL = new C2254308sP(enumC20654715s1Arr);
    }

    public static EnumC20654715s1[] values() {
        return (EnumC20654715s1[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC20654715s1 valueOf(String str) {
        return (EnumC20654715s1) C08FF.LIZ(EnumC20654715s1.class, str);
    }

    public EnumC20654715s1(String str, int i, String str2) {
        this.LL = str2;
    }
}
