package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0330009o {
    public static final EnumC0330009o AWARD_CARD;
    public static final /* synthetic */ EnumC0330009o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0330009o RIVAL_CARD_CLICK;
    public static final EnumC0330009o SHORT_TOUCH_CLICK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC0330009o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0330009o enumC0330009o = new EnumC0330009o("AWARD_CARD", 0, "award_card");
        AWARD_CARD = enumC0330009o;
        EnumC0330009o enumC0330009o2 = new EnumC0330009o("SHORT_TOUCH_CLICK", 1, "short_card_click");
        SHORT_TOUCH_CLICK = enumC0330009o2;
        EnumC0330009o enumC0330009o3 = new EnumC0330009o("RIVAL_CARD_CLICK", 2, "rival_card_click");
        RIVAL_CARD_CLICK = enumC0330009o3;
        EnumC0330009o[] enumC0330009oArr = {enumC0330009o, enumC0330009o2, enumC0330009o3};
        LLILLJJLI = enumC0330009oArr;
        LLILLL = new C2254308sP(enumC0330009oArr);
    }

    public static EnumC0330009o[] values() {
        return (EnumC0330009o[]) LLILLJJLI.clone();
    }

    public final String getSource() {
        return this.LL;
    }

    public static EnumC0330009o valueOf(String str) {
        return (EnumC0330009o) C08FF.LIZ(EnumC0330009o.class, str);
    }

    public EnumC0330009o(String str, int i, String str2) {
        this.LL = str2;
    }
}
