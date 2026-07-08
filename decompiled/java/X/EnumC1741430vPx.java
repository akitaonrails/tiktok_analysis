package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741430vPx {
    public static final EnumC1741430vPx DIVERSION_BACK_BUTTON;
    public static final /* synthetic */ EnumC1741430vPx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1741430vPx MALL;
    public static final EnumC1741430vPx SHOP_TAB;
    public static final EnumC1741430vPx VIDEO_GUIDE;
    public static final EnumC1741430vPx VSA_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1741430vPx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1741430vPx enumC1741430vPx = new EnumC1741430vPx("MALL", 0, "mall");
        MALL = enumC1741430vPx;
        EnumC1741430vPx enumC1741430vPx2 = new EnumC1741430vPx("VIDEO_GUIDE", 1, "video_guide");
        VIDEO_GUIDE = enumC1741430vPx2;
        EnumC1741430vPx enumC1741430vPx3 = new EnumC1741430vPx("VSA_CARD", 2, "vsa_card");
        VSA_CARD = enumC1741430vPx3;
        EnumC1741430vPx enumC1741430vPx4 = new EnumC1741430vPx("SHOP_TAB", 3, "shop_tab");
        SHOP_TAB = enumC1741430vPx4;
        EnumC1741430vPx enumC1741430vPx5 = new EnumC1741430vPx("DIVERSION_BACK_BUTTON", 4, "diversion_back_button");
        DIVERSION_BACK_BUTTON = enumC1741430vPx5;
        EnumC1741430vPx[] enumC1741430vPxArr = {enumC1741430vPx, enumC1741430vPx2, enumC1741430vPx3, enumC1741430vPx4, enumC1741430vPx5};
        LLILLJJLI = enumC1741430vPxArr;
        LLILLL = new C2254308sP(enumC1741430vPxArr);
    }

    public static EnumC1741430vPx[] values() {
        return (EnumC1741430vPx[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1741430vPx valueOf(String str) {
        return (EnumC1741430vPx) C08FF.LIZ(EnumC1741430vPx.class, str);
    }

    public EnumC1741430vPx(String str, int i, String str2) {
        this.LL = str2;
    }
}
