package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440220HOa {
    public static final EnumC440220HOa CHANGE_ID;
    public static final EnumC440220HOa CLOSE;
    public static final EnumC440220HOa GENERATE;
    public static final EnumC440220HOa GENERATION_HISTORY;
    public static final /* synthetic */ EnumC440220HOa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440220HOa REMOVE_ELEMENT;
    public static final EnumC440220HOa SELECT_ELEMENT;
    public static final EnumC440220HOa SHOW_ID_DROPDOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440220HOa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440220HOa enumC440220HOa = new EnumC440220HOa("CLOSE", 0, "close");
        CLOSE = enumC440220HOa;
        EnumC440220HOa enumC440220HOa2 = new EnumC440220HOa("REMOVE_ELEMENT", 1, "remove_element");
        REMOVE_ELEMENT = enumC440220HOa2;
        EnumC440220HOa enumC440220HOa3 = new EnumC440220HOa("SELECT_ELEMENT", 2, "select_element");
        SELECT_ELEMENT = enumC440220HOa3;
        EnumC440220HOa enumC440220HOa4 = new EnumC440220HOa("GENERATE", 3, "generate");
        GENERATE = enumC440220HOa4;
        EnumC440220HOa enumC440220HOa5 = new EnumC440220HOa("GENERATION_HISTORY", 4, "generation_history");
        GENERATION_HISTORY = enumC440220HOa5;
        EnumC440220HOa enumC440220HOa6 = new EnumC440220HOa("CHANGE_ID", 5, "change_id");
        CHANGE_ID = enumC440220HOa6;
        EnumC440220HOa enumC440220HOa7 = new EnumC440220HOa("SHOW_ID_DROPDOWN", 6, "show_id_dropdown");
        SHOW_ID_DROPDOWN = enumC440220HOa7;
        EnumC440220HOa[] enumC440220HOaArr = {enumC440220HOa, enumC440220HOa2, enumC440220HOa3, enumC440220HOa4, enumC440220HOa5, enumC440220HOa6, enumC440220HOa7};
        LLILLJJLI = enumC440220HOaArr;
        LLILLL = new C2254308sP(enumC440220HOaArr);
    }

    public static EnumC440220HOa[] values() {
        return (EnumC440220HOa[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440220HOa valueOf(String str) {
        return (EnumC440220HOa) C08FF.LIZ(EnumC440220HOa.class, str);
    }

    public EnumC440220HOa(String str, int i, String str2) {
        this.LL = str2;
    }
}
