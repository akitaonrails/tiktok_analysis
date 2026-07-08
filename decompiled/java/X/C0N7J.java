package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7J, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7J {
    public static final C0N7J CARD_TYPE_FINANCIAL_PRODUCT_BIG;
    public static final C0N7J CARD_TYPE_FINANCIAL_PRODUCT_MEDIUM;
    public static final C0N7J CARD_TYPE_FINANCIAL_PRODUCT_SMALL;
    public static final C0N7J CARD_TYPE_GROUP_HEADER;
    public static final C0N7J CARD_TYPE_PI_FULL_WIDTH_ADD;
    public static final C0N7J CARD_TYPE_PI_ITEM;
    public static final /* synthetic */ C0N7J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0N7J> getEntries() {
        return LLILLL;
    }

    static {
        C0N7J c0n7j = new C0N7J("CARD_TYPE_GROUP_HEADER", 0, "card_type_group_header");
        CARD_TYPE_GROUP_HEADER = c0n7j;
        C0N7J c0n7j2 = new C0N7J("CARD_TYPE_PI_ITEM", 1, "card_type_pi_item");
        CARD_TYPE_PI_ITEM = c0n7j2;
        C0N7J c0n7j3 = new C0N7J("CARD_TYPE_PI_FULL_WIDTH_ADD", 2, "card_type_pi_full_width_add");
        CARD_TYPE_PI_FULL_WIDTH_ADD = c0n7j3;
        C0N7J c0n7j4 = new C0N7J("CARD_TYPE_FINANCIAL_PRODUCT_BIG", 3, "financial_product_big");
        CARD_TYPE_FINANCIAL_PRODUCT_BIG = c0n7j4;
        C0N7J c0n7j5 = new C0N7J("CARD_TYPE_FINANCIAL_PRODUCT_MEDIUM", 4, "financial_product_medium");
        CARD_TYPE_FINANCIAL_PRODUCT_MEDIUM = c0n7j5;
        C0N7J c0n7j6 = new C0N7J("CARD_TYPE_FINANCIAL_PRODUCT_SMALL", 5, "financial_product_small");
        CARD_TYPE_FINANCIAL_PRODUCT_SMALL = c0n7j6;
        C0N7J[] c0n7jArr = {c0n7j, c0n7j2, c0n7j3, c0n7j4, c0n7j5, c0n7j6};
        LLILLJJLI = c0n7jArr;
        LLILLL = new C2254308sP(c0n7jArr);
    }

    public static C0N7J[] values() {
        return (C0N7J[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N7J valueOf(String str) {
        return (C0N7J) C08FF.LIZ(C0N7J.class, str);
    }

    public C0N7J(String str, int i, String str2) {
        this.LL = str2;
    }
}
