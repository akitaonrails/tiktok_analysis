package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Psj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC658790Psj {
    public static final /* synthetic */ EnumC658790Psj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC658790Psj MIXED_CREATIVE_SUB_CARD;
    public static final EnumC658790Psj MIXED_CREATIVE_SUB_SINGLE_CARD;
    public static final EnumC658790Psj NORMAL_CAROUSEL;
    public static final EnumC658790Psj OLE_PAC_SUB_CARD;
    public static final EnumC658790Psj PRODUCT_PHOTO_OLD;

    public static InterfaceC2044707zh<EnumC658790Psj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC658790Psj enumC658790Psj = new EnumC658790Psj("NORMAL_CAROUSEL", 0);
        NORMAL_CAROUSEL = enumC658790Psj;
        EnumC658790Psj enumC658790Psj2 = new EnumC658790Psj("MIXED_CREATIVE_SUB_CARD", 1);
        MIXED_CREATIVE_SUB_CARD = enumC658790Psj2;
        EnumC658790Psj enumC658790Psj3 = new EnumC658790Psj("MIXED_CREATIVE_SUB_SINGLE_CARD", 2);
        MIXED_CREATIVE_SUB_SINGLE_CARD = enumC658790Psj3;
        EnumC658790Psj enumC658790Psj4 = new EnumC658790Psj("PRODUCT_PHOTO_OLD", 3);
        PRODUCT_PHOTO_OLD = enumC658790Psj4;
        EnumC658790Psj enumC658790Psj5 = new EnumC658790Psj("OLE_PAC_SUB_CARD", 4);
        OLE_PAC_SUB_CARD = enumC658790Psj5;
        EnumC658790Psj[] enumC658790PsjArr = {enumC658790Psj, enumC658790Psj2, enumC658790Psj3, enumC658790Psj4, enumC658790Psj5};
        LL = enumC658790PsjArr;
        LLILLJJLI = new C2254308sP(enumC658790PsjArr);
    }

    public static EnumC658790Psj[] values() {
        return (EnumC658790Psj[]) LL.clone();
    }

    public static EnumC658790Psj valueOf(String str) {
        return (EnumC658790Psj) C08FF.LIZ(EnumC658790Psj.class, str);
    }

    public EnumC658790Psj(String str, int i) {
    }
}
