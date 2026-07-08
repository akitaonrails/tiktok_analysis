package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vi9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1752710vi9 {
    public static final EnumC1752710vi9 AUTHORIZED_SHOP;
    public static final EnumC1752710vi9 BRAND_AUTHORIZED_SHOP;
    public static final EnumC1752710vi9 DEFAULT;
    public static final EnumC1752710vi9 DTC_SHOP;
    public static final EnumC1752710vi9 GOLDEN_SHOP;
    public static final /* synthetic */ EnumC1752710vi9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1752710vi9 OFFICIAL_SHOP;
    public static final EnumC1752710vi9 SILVER_SHOP;
    public static final EnumC1752710vi9 TOP_BRAND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1752710vi9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1752710vi9 enumC1752710vi9 = new EnumC1752710vi9(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1752710vi9;
        EnumC1752710vi9 enumC1752710vi92 = new EnumC1752710vi9("TOP_BRAND", 1, 1);
        TOP_BRAND = enumC1752710vi92;
        EnumC1752710vi9 enumC1752710vi93 = new EnumC1752710vi9("OFFICIAL_SHOP", 2, 2);
        OFFICIAL_SHOP = enumC1752710vi93;
        EnumC1752710vi9 enumC1752710vi94 = new EnumC1752710vi9("AUTHORIZED_SHOP", 3, 3);
        AUTHORIZED_SHOP = enumC1752710vi94;
        EnumC1752710vi9 enumC1752710vi95 = new EnumC1752710vi9("GOLDEN_SHOP", 4, 4);
        GOLDEN_SHOP = enumC1752710vi95;
        EnumC1752710vi9 enumC1752710vi96 = new EnumC1752710vi9("SILVER_SHOP", 5, 5);
        SILVER_SHOP = enumC1752710vi96;
        EnumC1752710vi9 enumC1752710vi97 = new EnumC1752710vi9("BRAND_AUTHORIZED_SHOP", 6, 10);
        BRAND_AUTHORIZED_SHOP = enumC1752710vi97;
        EnumC1752710vi9 enumC1752710vi98 = new EnumC1752710vi9("DTC_SHOP", 7, 11);
        DTC_SHOP = enumC1752710vi98;
        EnumC1752710vi9[] enumC1752710vi9Arr = {enumC1752710vi9, enumC1752710vi92, enumC1752710vi93, enumC1752710vi94, enumC1752710vi95, enumC1752710vi96, enumC1752710vi97, enumC1752710vi98};
        LLILLJJLI = enumC1752710vi9Arr;
        LLILLL = new C2254308sP(enumC1752710vi9Arr);
    }

    public static EnumC1752710vi9[] values() {
        return (EnumC1752710vi9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1752710vi9 valueOf(String str) {
        return (EnumC1752710vi9) C08FF.LIZ(EnumC1752710vi9.class, str);
    }

    public EnumC1752710vi9(String str, int i, int i2) {
        this.LL = i2;
    }
}
