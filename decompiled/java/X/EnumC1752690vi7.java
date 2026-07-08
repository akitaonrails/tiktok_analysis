package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vi7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1752690vi7 {
    public static final EnumC1752690vi7 BLANK;
    public static final EnumC1752690vi7 BUY_TOGETHER;
    public static final EnumC1752690vi7 DESCRIPTION;
    public static final EnumC1752690vi7 GUESS_U_LIKE;
    public static final EnumC1752690vi7 HEADER;
    public static final /* synthetic */ EnumC1752690vi7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1752690vi7 LOGISTICS_INFO;
    public static final EnumC1752690vi7 PRODUCT_INFO;
    public static final EnumC1752690vi7 PRODUCT_MORE_FROM_SAME_SELLER;
    public static final EnumC1752690vi7 RECOMMENDATION;
    public static final EnumC1752690vi7 RETURN_POLICY;
    public static final EnumC1752690vi7 REVIEW;
    public static final EnumC1752690vi7 SEE_LESS;
    public static final EnumC1752690vi7 SELLER_INFO;
    public static final EnumC1752690vi7 SKU;
    public static final EnumC1752690vi7 SPOTLIGHT;
    public static final EnumC1752690vi7 UNSET;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1752690vi7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1752690vi7 enumC1752690vi7 = new EnumC1752690vi7("HEADER", 0, 101);
        HEADER = enumC1752690vi7;
        EnumC1752690vi7 enumC1752690vi72 = new EnumC1752690vi7("REVIEW", 1, 102);
        REVIEW = enumC1752690vi72;
        EnumC1752690vi7 enumC1752690vi73 = new EnumC1752690vi7("DESCRIPTION", 2, 103);
        DESCRIPTION = enumC1752690vi73;
        EnumC1752690vi7 enumC1752690vi74 = new EnumC1752690vi7("RECOMMENDATION", 3, 104);
        RECOMMENDATION = enumC1752690vi74;
        EnumC1752690vi7 enumC1752690vi75 = new EnumC1752690vi7("SKU", 4, 105);
        SKU = enumC1752690vi75;
        EnumC1752690vi7 enumC1752690vi76 = new EnumC1752690vi7("LOGISTICS_INFO", 5, 106);
        LOGISTICS_INFO = enumC1752690vi76;
        EnumC1752690vi7 enumC1752690vi77 = new EnumC1752690vi7("RETURN_POLICY", 6, 107);
        RETURN_POLICY = enumC1752690vi77;
        EnumC1752690vi7 enumC1752690vi78 = new EnumC1752690vi7("SELLER_INFO", 7, 108);
        SELLER_INFO = enumC1752690vi78;
        EnumC1752690vi7 enumC1752690vi79 = new EnumC1752690vi7("PRODUCT_INFO", 8, 109);
        PRODUCT_INFO = enumC1752690vi79;
        EnumC1752690vi7 enumC1752690vi710 = new EnumC1752690vi7("PRODUCT_MORE_FROM_SAME_SELLER", 9, 110);
        PRODUCT_MORE_FROM_SAME_SELLER = enumC1752690vi710;
        EnumC1752690vi7 enumC1752690vi711 = new EnumC1752690vi7("BUY_TOGETHER", 10, 111);
        BUY_TOGETHER = enumC1752690vi711;
        EnumC1752690vi7 enumC1752690vi712 = new EnumC1752690vi7("GUESS_U_LIKE", 11, 112);
        GUESS_U_LIKE = enumC1752690vi712;
        EnumC1752690vi7 enumC1752690vi713 = new EnumC1752690vi7("SPOTLIGHT", 12, 113);
        SPOTLIGHT = enumC1752690vi713;
        EnumC1752690vi7 enumC1752690vi714 = new EnumC1752690vi7("BLANK", 13, 999);
        BLANK = enumC1752690vi714;
        EnumC1752690vi7 enumC1752690vi715 = new EnumC1752690vi7("UNSET", 14, -1);
        UNSET = enumC1752690vi715;
        EnumC1752690vi7 enumC1752690vi716 = new EnumC1752690vi7("SEE_LESS", 15, LSPassThroughRecordSizeConfig.DEFAULT);
        SEE_LESS = enumC1752690vi716;
        EnumC1752690vi7[] enumC1752690vi7Arr = {enumC1752690vi7, enumC1752690vi72, enumC1752690vi73, enumC1752690vi74, enumC1752690vi75, enumC1752690vi76, enumC1752690vi77, enumC1752690vi78, enumC1752690vi79, enumC1752690vi710, enumC1752690vi711, enumC1752690vi712, enumC1752690vi713, enumC1752690vi714, enumC1752690vi715, enumC1752690vi716};
        LLILLJJLI = enumC1752690vi7Arr;
        LLILLL = new C2254308sP(enumC1752690vi7Arr);
    }

    public static EnumC1752690vi7[] values() {
        return (EnumC1752690vi7[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1752690vi7 valueOf(String str) {
        return (EnumC1752690vi7) C08FF.LIZ(EnumC1752690vi7.class, str);
    }

    public EnumC1752690vi7(String str, int i, int i2) {
        this.LL = i2;
    }
}
