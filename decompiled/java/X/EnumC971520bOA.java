package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC971520bOA {
    public static final EnumC971520bOA ADD_TO_TEMPLATES;
    public static final EnumC971520bOA CLICK_SHORTCUT;
    public static final EnumC971520bOA DELETE;
    public static final EnumC971520bOA DISABLE;
    public static final EnumC971520bOA EDIT;
    public static final /* synthetic */ EnumC971520bOA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC971520bOA REMOVE_FROM_TEMPLATES;
    public static final EnumC971520bOA SAVE;
    public static final EnumC971520bOA SELECT;
    public static final EnumC971520bOA SET_AS_PRIVATE;
    public static final EnumC971520bOA SET_AS_PUBLIC;
    public static final EnumC971520bOA SET_TITLE_CLICK;
    public static final EnumC971520bOA SET_TITLE_CONFIRM;
    public static final EnumC971520bOA SET_TITLE_SHOW;
    public static final EnumC971520bOA SHOW;
    public static final EnumC971520bOA USE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC971520bOA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC971520bOA enumC971520bOA = new EnumC971520bOA("SHOW", 0, "show");
        SHOW = enumC971520bOA;
        EnumC971520bOA enumC971520bOA2 = new EnumC971520bOA("CLICK_SHORTCUT", 1, "click_shortcut");
        CLICK_SHORTCUT = enumC971520bOA2;
        EnumC971520bOA enumC971520bOA3 = new EnumC971520bOA("USE", 2, "use");
        USE = enumC971520bOA3;
        EnumC971520bOA enumC971520bOA4 = new EnumC971520bOA("SELECT", 3, "select");
        SELECT = enumC971520bOA4;
        EnumC971520bOA enumC971520bOA5 = new EnumC971520bOA("SAVE", 4, "save");
        SAVE = enumC971520bOA5;
        EnumC971520bOA enumC971520bOA6 = new EnumC971520bOA("ADD_TO_TEMPLATES", 5, "add_to_templates");
        ADD_TO_TEMPLATES = enumC971520bOA6;
        EnumC971520bOA enumC971520bOA7 = new EnumC971520bOA("REMOVE_FROM_TEMPLATES", 6, "remove_from_templates");
        REMOVE_FROM_TEMPLATES = enumC971520bOA7;
        EnumC971520bOA enumC971520bOA8 = new EnumC971520bOA("DELETE", 7, "delete");
        DELETE = enumC971520bOA8;
        EnumC971520bOA enumC971520bOA9 = new EnumC971520bOA("SET_AS_PUBLIC", 8, "set_as_public");
        SET_AS_PUBLIC = enumC971520bOA9;
        EnumC971520bOA enumC971520bOA10 = new EnumC971520bOA("SET_AS_PRIVATE", 9, "set_as_private");
        SET_AS_PRIVATE = enumC971520bOA10;
        EnumC971520bOA enumC971520bOA11 = new EnumC971520bOA("EDIT", 10, "edit");
        EDIT = enumC971520bOA11;
        EnumC971520bOA enumC971520bOA12 = new EnumC971520bOA("DISABLE", 11, "disable");
        DISABLE = enumC971520bOA12;
        EnumC971520bOA enumC971520bOA13 = new EnumC971520bOA("SET_TITLE_SHOW", 12, "set_title_show");
        SET_TITLE_SHOW = enumC971520bOA13;
        EnumC971520bOA enumC971520bOA14 = new EnumC971520bOA("SET_TITLE_CLICK", 13, "set_title_click");
        SET_TITLE_CLICK = enumC971520bOA14;
        EnumC971520bOA enumC971520bOA15 = new EnumC971520bOA("SET_TITLE_CONFIRM", 14, "set_title_confirm");
        SET_TITLE_CONFIRM = enumC971520bOA15;
        EnumC971520bOA[] enumC971520bOAArr = {enumC971520bOA, enumC971520bOA2, enumC971520bOA3, enumC971520bOA4, enumC971520bOA5, enumC971520bOA6, enumC971520bOA7, enumC971520bOA8, enumC971520bOA9, enumC971520bOA10, enumC971520bOA11, enumC971520bOA12, enumC971520bOA13, enumC971520bOA14, enumC971520bOA15};
        LLILLJJLI = enumC971520bOAArr;
        LLILLL = new C2254308sP(enumC971520bOAArr);
    }

    public static EnumC971520bOA[] values() {
        return (EnumC971520bOA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC971520bOA valueOf(String str) {
        return (EnumC971520bOA) C08FF.LIZ(EnumC971520bOA.class, str);
    }

    public EnumC971520bOA(String str, int i, String str2) {
        this.LL = str2;
    }
}
