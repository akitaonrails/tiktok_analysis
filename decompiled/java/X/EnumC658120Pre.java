package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC658120Pre {
    public static final EnumC658120Pre AI_SUMMARY_CARD;
    public static final EnumC658120Pre EC_SHOP_CARD;
    public static final /* synthetic */ EnumC658120Pre[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC658120Pre MIXED_CREATIVE_CARD;
    public static final EnumC658120Pre MULTI_LIVE_CARD;
    public static final EnumC658120Pre NORMAL_VIDEO_AD;
    public static final EnumC658120Pre OLE_PAC;
    public static final EnumC658120Pre TOP_SINGLE_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC658120Pre> getEntries() {
        return LLILLL;
    }

    static {
        EnumC658120Pre enumC658120Pre = new EnumC658120Pre("NORMAL_VIDEO_AD", 0, "normal_video_ad");
        NORMAL_VIDEO_AD = enumC658120Pre;
        EnumC658120Pre enumC658120Pre2 = new EnumC658120Pre("EC_SHOP_CARD", 1, "shop_card");
        EC_SHOP_CARD = enumC658120Pre2;
        EnumC658120Pre enumC658120Pre3 = new EnumC658120Pre("MULTI_LIVE_CARD", 2, "mulit_live_card");
        MULTI_LIVE_CARD = enumC658120Pre3;
        EnumC658120Pre enumC658120Pre4 = new EnumC658120Pre("TOP_SINGLE_CARD", 3, "top_single_card");
        TOP_SINGLE_CARD = enumC658120Pre4;
        EnumC658120Pre enumC658120Pre5 = new EnumC658120Pre("MIXED_CREATIVE_CARD", 4, "mixed_creative_card");
        MIXED_CREATIVE_CARD = enumC658120Pre5;
        EnumC658120Pre enumC658120Pre6 = new EnumC658120Pre("OLE_PAC", 5, "ole_pac");
        OLE_PAC = enumC658120Pre6;
        EnumC658120Pre enumC658120Pre7 = new EnumC658120Pre("AI_SUMMARY_CARD", 6, "ai_summary_card");
        AI_SUMMARY_CARD = enumC658120Pre7;
        EnumC658120Pre[] enumC658120PreArr = {enumC658120Pre, enumC658120Pre2, enumC658120Pre3, enumC658120Pre4, enumC658120Pre5, enumC658120Pre6, enumC658120Pre7};
        LLILLJJLI = enumC658120PreArr;
        LLILLL = new C2254308sP(enumC658120PreArr);
    }

    public static EnumC658120Pre[] values() {
        return (EnumC658120Pre[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC658120Pre valueOf(String str) {
        return (EnumC658120Pre) C08FF.LIZ(EnumC658120Pre.class, str);
    }

    public EnumC658120Pre(String str, int i, String str2) {
        this.LL = str2;
    }
}
