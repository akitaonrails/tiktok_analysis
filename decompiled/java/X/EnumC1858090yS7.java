package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yS7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1858090yS7 {
    public static final EnumC1858090yS7 ACTION_BAR;
    public static final EnumC1858090yS7 CUSTOM;
    public static final EnumC1858090yS7 CUSTOM_EDIT;
    public static final EnumC1858090yS7 DIALOG_SUG;
    public static final EnumC1858090yS7 ENTITY_WORD;
    public static final EnumC1858090yS7 FLOATING_SUG;
    public static final /* synthetic */ EnumC1858090yS7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1858090yS7 NORMAL_SUG;
    public static final EnumC1858090yS7 PUSH;
    public static final EnumC1858090yS7 RETRY;
    public static final EnumC1858090yS7 SEARCH_SUG;
    public static final EnumC1858090yS7 VOICE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1858090yS7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1858090yS7 enumC1858090yS7 = new EnumC1858090yS7("NORMAL_SUG", 0, "NORMAL_SUG");
        NORMAL_SUG = enumC1858090yS7;
        EnumC1858090yS7 enumC1858090yS72 = new EnumC1858090yS7("SEARCH_SUG", 1, "SEARCH_SUG");
        SEARCH_SUG = enumC1858090yS72;
        EnumC1858090yS7 enumC1858090yS73 = new EnumC1858090yS7("DIALOG_SUG", 2, "DIALOG_SUG");
        DIALOG_SUG = enumC1858090yS73;
        EnumC1858090yS7 enumC1858090yS74 = new EnumC1858090yS7("PUSH", 3, "PUSH");
        PUSH = enumC1858090yS74;
        EnumC1858090yS7 enumC1858090yS75 = new EnumC1858090yS7("CUSTOM", 4, "CUSTOM");
        CUSTOM = enumC1858090yS75;
        EnumC1858090yS7 enumC1858090yS76 = new EnumC1858090yS7("VOICE", 5, "VOICE");
        VOICE = enumC1858090yS76;
        EnumC1858090yS7 enumC1858090yS77 = new EnumC1858090yS7("RETRY", 6, "RETRY");
        RETRY = enumC1858090yS77;
        EnumC1858090yS7 enumC1858090yS78 = new EnumC1858090yS7("CUSTOM_EDIT", 7, "CUSTOM_EDIT");
        CUSTOM_EDIT = enumC1858090yS78;
        EnumC1858090yS7 enumC1858090yS79 = new EnumC1858090yS7("ACTION_BAR", 8, "ACTION_BAR");
        ACTION_BAR = enumC1858090yS79;
        EnumC1858090yS7 enumC1858090yS710 = new EnumC1858090yS7("FLOATING_SUG", 9, "FLOATING_SUG");
        FLOATING_SUG = enumC1858090yS710;
        EnumC1858090yS7 enumC1858090yS711 = new EnumC1858090yS7("ENTITY_WORD", 10, "ENTITY_WORD");
        ENTITY_WORD = enumC1858090yS711;
        EnumC1858090yS7[] enumC1858090yS7Arr = {enumC1858090yS7, enumC1858090yS72, enumC1858090yS73, enumC1858090yS74, enumC1858090yS75, enumC1858090yS76, enumC1858090yS77, enumC1858090yS78, enumC1858090yS79, enumC1858090yS710, enumC1858090yS711};
        LLILLJJLI = enumC1858090yS7Arr;
        LLILLL = new C2254308sP(enumC1858090yS7Arr);
    }

    public static EnumC1858090yS7[] values() {
        return (EnumC1858090yS7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1858090yS7 valueOf(String str) {
        return (EnumC1858090yS7) C08FF.LIZ(EnumC1858090yS7.class, str);
    }

    public EnumC1858090yS7(String str, int i, String str2) {
        this.LL = str2;
    }
}
