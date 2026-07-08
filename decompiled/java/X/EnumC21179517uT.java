package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17uT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21179517uT {
    public static final EnumC21179517uT ANCHOR_POP_CARD;
    public static final EnumC21179517uT AUDIENCE_POP_CARD;
    public static final EnumC21179517uT CHECK_ERROR;
    public static final EnumC21179517uT FYP_PRODUCT_CARD;
    public static final /* synthetic */ EnumC21179517uT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21179517uT POP_CARD_PREFETCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21179517uT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21179517uT enumC21179517uT = new EnumC21179517uT("ANCHOR_POP_CARD", 0, "anchor_pop_card");
        ANCHOR_POP_CARD = enumC21179517uT;
        EnumC21179517uT enumC21179517uT2 = new EnumC21179517uT("AUDIENCE_POP_CARD", 1, "audience_pop_card");
        AUDIENCE_POP_CARD = enumC21179517uT2;
        EnumC21179517uT enumC21179517uT3 = new EnumC21179517uT("POP_CARD_PREFETCH", 2, "pop_card_prefetch");
        POP_CARD_PREFETCH = enumC21179517uT3;
        EnumC21179517uT enumC21179517uT4 = new EnumC21179517uT("FYP_PRODUCT_CARD", 3, "fyp_product_card");
        FYP_PRODUCT_CARD = enumC21179517uT4;
        EnumC21179517uT enumC21179517uT5 = new EnumC21179517uT("CHECK_ERROR", 4, "error");
        CHECK_ERROR = enumC21179517uT5;
        EnumC21179517uT[] enumC21179517uTArr = {enumC21179517uT, enumC21179517uT2, enumC21179517uT3, enumC21179517uT4, enumC21179517uT5};
        LLILLJJLI = enumC21179517uTArr;
        LLILLL = new C2254308sP(enumC21179517uTArr);
    }

    public static EnumC21179517uT[] values() {
        return (EnumC21179517uT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21179517uT valueOf(String str) {
        return (EnumC21179517uT) C08FF.LIZ(EnumC21179517uT.class, str);
    }

    public EnumC21179517uT(String str, int i, String str2) {
        this.LL = str2;
    }
}
