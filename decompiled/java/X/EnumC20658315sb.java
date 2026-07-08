package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20658315sb {
    public static final EnumC20658315sb LLILLJJLI;
    public static final EnumC20658315sb LLILLL;
    public static final EnumC20658315sb LLILZ;
    public static final EnumC20658315sb LLILZIL;
    public static final EnumC20658315sb LLILZLL;
    public static final /* synthetic */ EnumC20658315sb[] LLIZ;
    public final String LL;

    static {
        EnumC20658315sb enumC20658315sb = new EnumC20658315sb("NOT_FILTER", 0, "not_filter");
        LLILLJJLI = enumC20658315sb;
        EnumC20658315sb enumC20658315sb2 = new EnumC20658315sb("NOT_IN_ELEMENT_LABEL", 1, "not_in_element_label");
        LLILLL = enumC20658315sb2;
        EnumC20658315sb enumC20658315sb3 = new EnumC20658315sb("NOT_IN_TRIGGER_ID", 2, "not_in_trigger_id");
        LLILZ = enumC20658315sb3;
        EnumC20658315sb enumC20658315sb4 = new EnumC20658315sb("SHOW_STRATEGY_BLACK", 3, "show_strategy_black");
        LLILZIL = enumC20658315sb4;
        EnumC20658315sb enumC20658315sb5 = new EnumC20658315sb("SHOW_STRATEGY_WHITE", 4, "show_strategy_white");
        LLILZLL = enumC20658315sb5;
        EnumC20658315sb[] enumC20658315sbArr = {enumC20658315sb, enumC20658315sb2, enumC20658315sb3, enumC20658315sb4, enumC20658315sb5};
        LLIZ = enumC20658315sbArr;
        new C2254308sP(enumC20658315sbArr);
    }

    public static EnumC20658315sb[] values() {
        return (EnumC20658315sb[]) LLIZ.clone();
    }

    public static EnumC20658315sb valueOf(String str) {
        return (EnumC20658315sb) C08FF.LIZ(EnumC20658315sb.class, str);
    }

    public EnumC20658315sb(String str, int i, String str2) {
        this.LL = str2;
    }
}
