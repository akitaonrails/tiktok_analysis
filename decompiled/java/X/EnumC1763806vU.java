package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06vU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1763806vU {
    public static final EnumC1763806vU FAQ;
    public static final EnumC1763806vU LIVE_EVENT;
    public static final /* synthetic */ EnumC1763806vU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1763806vU TTEC_SHOP_BAR;
    public static final EnumC1763806vU TTEC_SHOWCASE_BAR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1763806vU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1763806vU enumC1763806vU = new EnumC1763806vU("FAQ", 0, "dm:faqs");
        FAQ = enumC1763806vU;
        EnumC1763806vU enumC1763806vU2 = new EnumC1763806vU("TTEC_SHOP_BAR", 1, "tts_seller:ttec_shop_bar");
        TTEC_SHOP_BAR = enumC1763806vU2;
        EnumC1763806vU enumC1763806vU3 = new EnumC1763806vU("TTEC_SHOWCASE_BAR", 2, "tts_creator:ttec_showcase_bar");
        TTEC_SHOWCASE_BAR = enumC1763806vU3;
        EnumC1763806vU enumC1763806vU4 = new EnumC1763806vU("LIVE_EVENT", 3, "group_live_event");
        LIVE_EVENT = enumC1763806vU4;
        EnumC1763806vU[] enumC1763806vUArr = {enumC1763806vU, enumC1763806vU2, enumC1763806vU3, enumC1763806vU4};
        LLILLJJLI = enumC1763806vUArr;
        LLILLL = new C2254308sP(enumC1763806vUArr);
    }

    public static EnumC1763806vU[] values() {
        return (EnumC1763806vU[]) LLILLJJLI.clone();
    }

    public final String getBtnId() {
        return this.LL;
    }

    public static EnumC1763806vU valueOf(String str) {
        return (EnumC1763806vU) C08FF.LIZ(EnumC1763806vU.class, str);
    }

    public EnumC1763806vU(String str, int i, String str2) {
        this.LL = str2;
    }
}
