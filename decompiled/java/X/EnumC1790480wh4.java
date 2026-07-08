package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1790480wh4 {
    public static final EnumC1790480wh4 EXIT;
    public static final EnumC1790480wh4 FCP_REGISTER;
    public static final EnumC1790480wh4 FREQUENCY;
    public static final /* synthetic */ EnumC1790480wh4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1790480wh4 NO_ANCHOR_TAB;
    public static final EnumC1790480wh4 OTHER_SHOWING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1790480wh4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1790480wh4 enumC1790480wh4 = new EnumC1790480wh4("EXIT", 0, "exit_strategy");
        EXIT = enumC1790480wh4;
        EnumC1790480wh4 enumC1790480wh42 = new EnumC1790480wh4("FREQUENCY", 1, "frequency_strategy");
        FREQUENCY = enumC1790480wh42;
        EnumC1790480wh4 enumC1790480wh43 = new EnumC1790480wh4("OTHER_SHOWING", 2, "other_tooltip_showing");
        OTHER_SHOWING = enumC1790480wh43;
        EnumC1790480wh4 enumC1790480wh44 = new EnumC1790480wh4("FCP_REGISTER", 3, "not_register_fcp");
        FCP_REGISTER = enumC1790480wh44;
        EnumC1790480wh4 enumC1790480wh45 = new EnumC1790480wh4("NO_ANCHOR_TAB", 4, "no_anchor_tab");
        NO_ANCHOR_TAB = enumC1790480wh45;
        EnumC1790480wh4[] enumC1790480wh4Arr = {enumC1790480wh4, enumC1790480wh42, enumC1790480wh43, enumC1790480wh44, enumC1790480wh45};
        LLILLJJLI = enumC1790480wh4Arr;
        LLILLL = new C2254308sP(enumC1790480wh4Arr);
    }

    public static EnumC1790480wh4[] values() {
        return (EnumC1790480wh4[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1790480wh4 valueOf(String str) {
        return (EnumC1790480wh4) C08FF.LIZ(EnumC1790480wh4.class, str);
    }

    public EnumC1790480wh4(String str, int i, String str2) {
        this.LL = str2;
    }
}
