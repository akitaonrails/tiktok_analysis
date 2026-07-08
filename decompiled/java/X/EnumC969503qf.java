package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC969503qf {
    public static final C969603qg Companion;
    public static final EnumC969503qf DEFAULT;
    public static final EnumC969503qf GLOBAL_PAYMENT_V1;
    public static final EnumC969503qf GLOBAL_PRODUCT_DETAIL_V1;
    public static final /* synthetic */ EnumC969503qf[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC969503qf TTF_SA_LOGISTICS;
    public static final EnumC969503qf TTF_UK_PRODUCT_DETAIL;
    public static final EnumC969503qf TTS_GLOBAL_ADDRESS_EDIT_V1;
    public static final EnumC969503qf TTS_US_ADDRESS_EDIT_V1;
    public static final EnumC969503qf TTS_US_ADDRESS_LIST_V1;
    public static final EnumC969503qf TTS_US_PRODUCT_DETAIL;
    public static final EnumC969503qf US_LOGISTICS;
    public static final EnumC969503qf US_LOGISTICS_ADDRESS;
    public static final EnumC969503qf US_OSP_V1;
    public static final EnumC969503qf US_PAYMENT_V1;
    public static final EnumC969503qf US_PRODUCT_REVIEW;
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC969503qf> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC969503qf enumC969503qf = new EnumC969503qf(0, 0, LivePreviewCTASmartDisplayManager.DEFAULT, "*", "sea");
        DEFAULT = enumC969503qf;
        EnumC969503qf enumC969503qf2 = new EnumC969503qf(1, 3, "TTS_US_ADDRESS_LIST_V1", "shipping_info", "us");
        TTS_US_ADDRESS_LIST_V1 = enumC969503qf2;
        EnumC969503qf enumC969503qf3 = new EnumC969503qf(2, 1, "TTS_GLOBAL_ADDRESS_EDIT_V1", "shipping_address", "global");
        TTS_GLOBAL_ADDRESS_EDIT_V1 = enumC969503qf3;
        EnumC969503qf enumC969503qf4 = new EnumC969503qf(3, 3, "TTS_US_ADDRESS_EDIT_V1", "shipping_address", "us");
        TTS_US_ADDRESS_EDIT_V1 = enumC969503qf4;
        EnumC969503qf enumC969503qf5 = new EnumC969503qf(4, 3, "US_OSP_V1", "order_submit", "us");
        US_OSP_V1 = enumC969503qf5;
        EnumC969503qf enumC969503qf6 = new EnumC969503qf(5, 1, "GLOBAL_PAYMENT_V1", "payment_method", "global");
        GLOBAL_PAYMENT_V1 = enumC969503qf6;
        EnumC969503qf enumC969503qf7 = new EnumC969503qf(6, 3, "US_PAYMENT_V1", "payment_method", "us");
        US_PAYMENT_V1 = enumC969503qf7;
        EnumC969503qf enumC969503qf8 = new EnumC969503qf(7, 1, "GLOBAL_PRODUCT_DETAIL_V1", "product_detail", "global");
        GLOBAL_PRODUCT_DETAIL_V1 = enumC969503qf8;
        EnumC969503qf enumC969503qf9 = new EnumC969503qf(8, 3, "TTS_US_PRODUCT_DETAIL", "product_detail", "us");
        TTS_US_PRODUCT_DETAIL = enumC969503qf9;
        EnumC969503qf enumC969503qf10 = new EnumC969503qf(9, 4, "TTF_UK_PRODUCT_DETAIL", "product_detail", "global");
        TTF_UK_PRODUCT_DETAIL = enumC969503qf10;
        EnumC969503qf enumC969503qf11 = new EnumC969503qf(10, 2, "TTF_SA_LOGISTICS", "logistics", "sa");
        TTF_SA_LOGISTICS = enumC969503qf11;
        EnumC969503qf enumC969503qf12 = new EnumC969503qf(11, 3, "US_LOGISTICS", "logistics", "us");
        US_LOGISTICS = enumC969503qf12;
        EnumC969503qf enumC969503qf13 = new EnumC969503qf(12, 3, "US_LOGISTICS_ADDRESS", "logistics_address", "us");
        US_LOGISTICS_ADDRESS = enumC969503qf13;
        EnumC969503qf enumC969503qf14 = new EnumC969503qf(13, 3, "US_PRODUCT_REVIEW", "product_review", "us");
        US_PRODUCT_REVIEW = enumC969503qf14;
        EnumC969503qf[] enumC969503qfArr = {enumC969503qf, enumC969503qf2, enumC969503qf3, enumC969503qf4, enumC969503qf5, enumC969503qf6, enumC969503qf7, enumC969503qf8, enumC969503qf9, enumC969503qf10, enumC969503qf11, enumC969503qf12, enumC969503qf13, enumC969503qf14};
        LLILZ = enumC969503qfArr;
        LLILZIL = new C2254308sP(enumC969503qfArr);
        Companion = new C969603qg();
    }

    public static EnumC969503qf[] values() {
        return (EnumC969503qf[]) LLILZ.clone();
    }

    public final String getEcMarket() {
        return this.LLILLL;
    }

    public final String getPage() {
        return this.LL;
    }

    public final int getTemplate() {
        return this.LLILLJJLI;
    }

    public static EnumC969503qf valueOf(String str) {
        return (EnumC969503qf) C08FF.LIZ(EnumC969503qf.class, str);
    }

    public EnumC969503qf(int i, int i2, String str, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = str3;
    }
}
