package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1751780vge {
    public static final EnumC1751780vge FLOAT_BTN;
    public static final /* synthetic */ EnumC1751780vge[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1751780vge NAV_TOP_BUTTON;
    public static final EnumC1751780vge REVIEW_TITLE;
    public static final EnumC1751780vge SHOP_CARD;
    public static final EnumC1751780vge SHOP_RECOMMEND;

    public static InterfaceC2044707zh<EnumC1751780vge> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1751780vge enumC1751780vge = new EnumC1751780vge("REVIEW_TITLE", 0);
        REVIEW_TITLE = enumC1751780vge;
        EnumC1751780vge enumC1751780vge2 = new EnumC1751780vge("SHOP_RECOMMEND", 1);
        SHOP_RECOMMEND = enumC1751780vge2;
        EnumC1751780vge enumC1751780vge3 = new EnumC1751780vge("FLOAT_BTN", 2);
        FLOAT_BTN = enumC1751780vge3;
        EnumC1751780vge enumC1751780vge4 = new EnumC1751780vge("SHOP_CARD", 3);
        SHOP_CARD = enumC1751780vge4;
        EnumC1751780vge enumC1751780vge5 = new EnumC1751780vge("NAV_TOP_BUTTON", 4);
        NAV_TOP_BUTTON = enumC1751780vge5;
        EnumC1751780vge[] enumC1751780vgeArr = {enumC1751780vge, enumC1751780vge2, enumC1751780vge3, enumC1751780vge4, enumC1751780vge5};
        LL = enumC1751780vgeArr;
        LLILLJJLI = new C2254308sP(enumC1751780vgeArr);
    }

    public static EnumC1751780vge[] values() {
        return (EnumC1751780vge[]) LL.clone();
    }

    public static EnumC1751780vge valueOf(String str) {
        return (EnumC1751780vge) C08FF.LIZ(EnumC1751780vge.class, str);
    }

    public EnumC1751780vge(String str, int i) {
    }
}
