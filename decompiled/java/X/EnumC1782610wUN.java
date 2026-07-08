package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782610wUN {
    public static final EnumC1782610wUN ENTER;
    public static final EnumC1782610wUN EXIT_BY_BUTTON;
    public static final EnumC1782610wUN EXIT_BY_VIDEO;
    public static final /* synthetic */ EnumC1782610wUN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1782610wUN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782610wUN enumC1782610wUN = new EnumC1782610wUN("ENTER", 0, "enter");
        ENTER = enumC1782610wUN;
        EnumC1782610wUN enumC1782610wUN2 = new EnumC1782610wUN("EXIT_BY_BUTTON", 1, "exit_by_button");
        EXIT_BY_BUTTON = enumC1782610wUN2;
        EnumC1782610wUN enumC1782610wUN3 = new EnumC1782610wUN("EXIT_BY_VIDEO", 2, "exit_by_video");
        EXIT_BY_VIDEO = enumC1782610wUN3;
        EnumC1782610wUN[] enumC1782610wUNArr = {enumC1782610wUN, enumC1782610wUN2, enumC1782610wUN3};
        LLILLJJLI = enumC1782610wUNArr;
        LLILLL = new C2254308sP(enumC1782610wUNArr);
    }

    public static EnumC1782610wUN[] values() {
        return (EnumC1782610wUN[]) LLILLJJLI.clone();
    }

    public final String getMob() {
        return this.LL;
    }

    public static EnumC1782610wUN valueOf(String str) {
        return (EnumC1782610wUN) C08FF.LIZ(EnumC1782610wUN.class, str);
    }

    public EnumC1782610wUN(String str, int i, String str2) {
        this.LL = str2;
    }
}
