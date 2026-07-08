package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15To, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20526215To {
    public static final EnumC20526215To ACTIVITY_H5;
    public static final EnumC20526215To BOTTOM_BANNER;
    public static final EnumC20526215To CLICK_BUTTON_ICON;
    public static final EnumC20526215To CLICK_TOP_ICON;
    public static final C15U1 Companion;
    public static final /* synthetic */ EnumC20526215To[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20526215To SLIDE;
    public static final EnumC20526215To SPECIAL_SHAPED_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20526215To> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.15U1] */
    static {
        EnumC20526215To enumC20526215To = new EnumC20526215To("CLICK_BUTTON_ICON", 0, "click_button_icon");
        CLICK_BUTTON_ICON = enumC20526215To;
        EnumC20526215To enumC20526215To2 = new EnumC20526215To("CLICK_TOP_ICON", 1, "click_top_icon");
        CLICK_TOP_ICON = enumC20526215To2;
        EnumC20526215To enumC20526215To3 = new EnumC20526215To("SLIDE", 2, "slide");
        SLIDE = enumC20526215To3;
        EnumC20526215To enumC20526215To4 = new EnumC20526215To("BOTTOM_BANNER", 3, "bottom_banner");
        BOTTOM_BANNER = enumC20526215To4;
        EnumC20526215To enumC20526215To5 = new EnumC20526215To("SPECIAL_SHAPED_CARD", 4, "special_shaped_card");
        SPECIAL_SHAPED_CARD = enumC20526215To5;
        EnumC20526215To enumC20526215To6 = new EnumC20526215To("ACTIVITY_H5", 5, "activity_h5");
        ACTIVITY_H5 = enumC20526215To6;
        EnumC20526215To[] enumC20526215ToArr = {enumC20526215To, enumC20526215To2, enumC20526215To3, enumC20526215To4, enumC20526215To5, enumC20526215To6};
        LLILLJJLI = enumC20526215ToArr;
        LLILLL = new C2254308sP(enumC20526215ToArr);
        Companion = new Object() { // from class: X.15U1
        };
    }

    public static EnumC20526215To[] values() {
        return (EnumC20526215To[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20526215To valueOf(String str) {
        return (EnumC20526215To) C08FF.LIZ(EnumC20526215To.class, str);
    }

    public EnumC20526215To(String str, int i, String str2) {
        this.LL = str2;
    }
}
