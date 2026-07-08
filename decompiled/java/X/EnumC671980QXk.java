package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671980QXk {
    public static final EnumC671980QXk ALIEN_SEARCH_BTN;
    public static final EnumC671980QXk BLANK;
    public static final EnumC671980QXk BUBBLE;
    public static final /* synthetic */ EnumC671980QXk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC671980QXk NONE;
    public static final EnumC671980QXk RELATED;
    public static final EnumC671980QXk SINGLE_SEARCH_BTN;
    public static final EnumC671980QXk TO_SUG;
    public static final EnumC671980QXk WORD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC671980QXk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC671980QXk enumC671980QXk = new EnumC671980QXk("NONE", 0, "none");
        NONE = enumC671980QXk;
        EnumC671980QXk enumC671980QXk2 = new EnumC671980QXk("WORD", 1, "word");
        WORD = enumC671980QXk2;
        EnumC671980QXk enumC671980QXk3 = new EnumC671980QXk("BLANK", 2, "blank");
        BLANK = enumC671980QXk3;
        EnumC671980QXk enumC671980QXk4 = new EnumC671980QXk("BUBBLE", 3, "bubble");
        BUBBLE = enumC671980QXk4;
        EnumC671980QXk enumC671980QXk5 = new EnumC671980QXk("RELATED", 4, "related");
        RELATED = enumC671980QXk5;
        EnumC671980QXk enumC671980QXk6 = new EnumC671980QXk("TO_SUG", 5, "to_sug");
        TO_SUG = enumC671980QXk6;
        EnumC671980QXk enumC671980QXk7 = new EnumC671980QXk("SINGLE_SEARCH_BTN", 6, "single_search_btn");
        SINGLE_SEARCH_BTN = enumC671980QXk7;
        EnumC671980QXk enumC671980QXk8 = new EnumC671980QXk("ALIEN_SEARCH_BTN", 7, "alien_search_btn");
        ALIEN_SEARCH_BTN = enumC671980QXk8;
        EnumC671980QXk[] enumC671980QXkArr = {enumC671980QXk, enumC671980QXk2, enumC671980QXk3, enumC671980QXk4, enumC671980QXk5, enumC671980QXk6, enumC671980QXk7, enumC671980QXk8};
        LLILLJJLI = enumC671980QXkArr;
        LLILLL = new C2254308sP(enumC671980QXkArr);
    }

    public static EnumC671980QXk[] values() {
        return (EnumC671980QXk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC671980QXk valueOf(String str) {
        return (EnumC671980QXk) C08FF.LIZ(EnumC671980QXk.class, str);
    }

    public EnumC671980QXk(String str, int i, String str2) {
        this.LL = str2;
    }
}
