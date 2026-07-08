package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC343601Va {
    public static final /* synthetic */ EnumC343601Va[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC343601Va MANUALLY_OPEN;
    public static final EnumC343601Va RETURN;
    public static final EnumC343601Va UNKNOWN_HABITS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC343601Va> getEntries() {
        return LLILLL;
    }

    static {
        EnumC343601Va enumC343601Va = new EnumC343601Va("UNKNOWN_HABITS", 0, "unknown_habits");
        UNKNOWN_HABITS = enumC343601Va;
        EnumC343601Va enumC343601Va2 = new EnumC343601Va("RETURN", 1, "return");
        RETURN = enumC343601Va2;
        EnumC343601Va enumC343601Va3 = new EnumC343601Va("MANUALLY_OPEN", 2, "manually_open");
        MANUALLY_OPEN = enumC343601Va3;
        EnumC343601Va[] enumC343601VaArr = {enumC343601Va, enumC343601Va2, enumC343601Va3};
        LLILLJJLI = enumC343601VaArr;
        LLILLL = new C2254308sP(enumC343601VaArr);
    }

    public static EnumC343601Va[] values() {
        return (EnumC343601Va[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC343601Va valueOf(String str) {
        return (EnumC343601Va) C08FF.LIZ(EnumC343601Va.class, str);
    }

    public EnumC343601Va(String str, int i, String str2) {
        this.LL = str2;
    }
}
