package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20234414Fi {
    public static final /* synthetic */ EnumC20234414Fi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20234414Fi SEND_TYPE_COMMENT_TOP_WORD;
    public static final EnumC20234414Fi SEND_TYPE_ENTITY_SUG;
    public static final EnumC20234414Fi SEND_TYPE_ENTITY_WORD;
    public static final EnumC20234414Fi SEND_TYPE_EXPERIENCE_DECISION_SUG;
    public static final EnumC20234414Fi SEND_TYPE_FEED_BAR_INPUT;
    public static final EnumC20234414Fi SEND_TYPE_HIGHLIGHT_WORD;
    public static final EnumC20234414Fi SEND_TYPE_IMAGE_QA;
    public static final EnumC20234414Fi SEND_TYPE_KEYBOARD_INPUT;
    public static final EnumC20234414Fi SEND_TYPE_RECOMMEND_WORD;
    public static final EnumC20234414Fi SEND_TYPE_ROUND0_RECOMMEND_WORD;
    public static final EnumC20234414Fi SEND_TYPE_SEARCH_ASK_TAKO_CARD;
    public static final EnumC20234414Fi SEND_TYPE_SEARCH_SUG;
    public static final EnumC20234414Fi SEND_TYPE_UNKNOWN;
    public static final EnumC20234414Fi SEND_TYPE_USER_VOICE;

    public static InterfaceC2044707zh<EnumC20234414Fi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20234414Fi enumC20234414Fi = new EnumC20234414Fi("SEND_TYPE_UNKNOWN", 0);
        SEND_TYPE_UNKNOWN = enumC20234414Fi;
        EnumC20234414Fi enumC20234414Fi2 = new EnumC20234414Fi("SEND_TYPE_USER_VOICE", 1);
        SEND_TYPE_USER_VOICE = enumC20234414Fi2;
        EnumC20234414Fi enumC20234414Fi3 = new EnumC20234414Fi("SEND_TYPE_RECOMMEND_WORD", 2);
        SEND_TYPE_RECOMMEND_WORD = enumC20234414Fi3;
        EnumC20234414Fi enumC20234414Fi4 = new EnumC20234414Fi("SEND_TYPE_HIGHLIGHT_WORD", 3);
        SEND_TYPE_HIGHLIGHT_WORD = enumC20234414Fi4;
        EnumC20234414Fi enumC20234414Fi5 = new EnumC20234414Fi("SEND_TYPE_ROUND0_RECOMMEND_WORD", 4);
        SEND_TYPE_ROUND0_RECOMMEND_WORD = enumC20234414Fi5;
        EnumC20234414Fi enumC20234414Fi6 = new EnumC20234414Fi("SEND_TYPE_KEYBOARD_INPUT", 5);
        SEND_TYPE_KEYBOARD_INPUT = enumC20234414Fi6;
        EnumC20234414Fi enumC20234414Fi7 = new EnumC20234414Fi("SEND_TYPE_IMAGE_QA", 6);
        SEND_TYPE_IMAGE_QA = enumC20234414Fi7;
        EnumC20234414Fi enumC20234414Fi8 = new EnumC20234414Fi("SEND_TYPE_FEED_BAR_INPUT", 7);
        SEND_TYPE_FEED_BAR_INPUT = enumC20234414Fi8;
        EnumC20234414Fi enumC20234414Fi9 = new EnumC20234414Fi("SEND_TYPE_SEARCH_ASK_TAKO_CARD", 8);
        SEND_TYPE_SEARCH_ASK_TAKO_CARD = enumC20234414Fi9;
        EnumC20234414Fi enumC20234414Fi10 = new EnumC20234414Fi("SEND_TYPE_COMMENT_TOP_WORD", 9);
        SEND_TYPE_COMMENT_TOP_WORD = enumC20234414Fi10;
        EnumC20234414Fi enumC20234414Fi11 = new EnumC20234414Fi("SEND_TYPE_ENTITY_WORD", 10);
        SEND_TYPE_ENTITY_WORD = enumC20234414Fi11;
        EnumC20234414Fi enumC20234414Fi12 = new EnumC20234414Fi("SEND_TYPE_ENTITY_SUG", 11);
        SEND_TYPE_ENTITY_SUG = enumC20234414Fi12;
        EnumC20234414Fi enumC20234414Fi13 = new EnumC20234414Fi("SEND_TYPE_SEARCH_SUG", 12);
        SEND_TYPE_SEARCH_SUG = enumC20234414Fi13;
        EnumC20234414Fi enumC20234414Fi14 = new EnumC20234414Fi("SEND_TYPE_EXPERIENCE_DECISION_SUG", 13);
        SEND_TYPE_EXPERIENCE_DECISION_SUG = enumC20234414Fi14;
        EnumC20234414Fi[] enumC20234414FiArr = {enumC20234414Fi, enumC20234414Fi2, enumC20234414Fi3, enumC20234414Fi4, enumC20234414Fi5, enumC20234414Fi6, enumC20234414Fi7, enumC20234414Fi8, enumC20234414Fi9, enumC20234414Fi10, enumC20234414Fi11, enumC20234414Fi12, enumC20234414Fi13, enumC20234414Fi14};
        LL = enumC20234414FiArr;
        LLILLJJLI = new C2254308sP(enumC20234414FiArr);
    }

    public static EnumC20234414Fi[] values() {
        return (EnumC20234414Fi[]) LL.clone();
    }

    public static EnumC20234414Fi valueOf(String str) {
        return (EnumC20234414Fi) C08FF.LIZ(EnumC20234414Fi.class, str);
    }

    public EnumC20234414Fi(String str, int i) {
    }
}
