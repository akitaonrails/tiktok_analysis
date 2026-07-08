package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1121470fI1 {
    public static final EnumC1121470fI1 BEACON_BUBBLE_TP;
    public static final EnumC1121470fI1 FAST_GIFT_TP;
    public static final EnumC1121470fI1 FIRST_RECHARGE_PANEL_TP;
    public static final EnumC1121470fI1 FOLLOW_EDUCATION_BUBBLE;
    public static final EnumC1121470fI1 GIFT_PANEL_TP;
    public static final EnumC1121470fI1 INBOX_EDUCATION_BUBBLE;
    public static final /* synthetic */ EnumC1121470fI1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1121470fI1 RECHARGE_BANNER_TP;
    public static final EnumC1121470fI1 RECHARGE_CONSUMPTION_PANEL_TP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1121470fI1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1121470fI1 enumC1121470fI1 = new EnumC1121470fI1("FIRST_RECHARGE_PANEL_TP", 0, "first_recharge_panel");
        FIRST_RECHARGE_PANEL_TP = enumC1121470fI1;
        EnumC1121470fI1 enumC1121470fI12 = new EnumC1121470fI1("BEACON_BUBBLE_TP", 1, "beacon_bubble");
        BEACON_BUBBLE_TP = enumC1121470fI12;
        EnumC1121470fI1 enumC1121470fI13 = new EnumC1121470fI1("RECHARGE_BANNER_TP", 2, "recharge_banner");
        RECHARGE_BANNER_TP = enumC1121470fI13;
        EnumC1121470fI1 enumC1121470fI14 = new EnumC1121470fI1("GIFT_PANEL_TP", 3, "gift_insert_item");
        GIFT_PANEL_TP = enumC1121470fI14;
        EnumC1121470fI1 enumC1121470fI15 = new EnumC1121470fI1("FOLLOW_EDUCATION_BUBBLE", 4, "follow_educating_bubble");
        FOLLOW_EDUCATION_BUBBLE = enumC1121470fI15;
        EnumC1121470fI1 enumC1121470fI16 = new EnumC1121470fI1("INBOX_EDUCATION_BUBBLE", 5, "inbox_educating_bubble");
        INBOX_EDUCATION_BUBBLE = enumC1121470fI16;
        EnumC1121470fI1 enumC1121470fI17 = new EnumC1121470fI1("RECHARGE_CONSUMPTION_PANEL_TP", 6, "recharge_consumption_panel");
        RECHARGE_CONSUMPTION_PANEL_TP = enumC1121470fI17;
        EnumC1121470fI1 enumC1121470fI18 = new EnumC1121470fI1("FAST_GIFT_TP", 7, "gift_fast_view");
        FAST_GIFT_TP = enumC1121470fI18;
        EnumC1121470fI1[] enumC1121470fI1Arr = {enumC1121470fI1, enumC1121470fI12, enumC1121470fI13, enumC1121470fI14, enumC1121470fI15, enumC1121470fI16, enumC1121470fI17, enumC1121470fI18};
        LLILLJJLI = enumC1121470fI1Arr;
        LLILLL = new C2254308sP(enumC1121470fI1Arr);
    }

    public static EnumC1121470fI1[] values() {
        return (EnumC1121470fI1[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1121470fI1 valueOf(String str) {
        return (EnumC1121470fI1) C08FF.LIZ(EnumC1121470fI1.class, str);
    }

    public EnumC1121470fI1(String str, int i, String str2) {
        this.LL = str2;
    }
}
