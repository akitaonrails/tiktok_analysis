package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC314460CUi {
    public static final EnumC314460CUi FAIL;
    public static final /* synthetic */ EnumC314460CUi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC314460CUi PASS;
    public static final EnumC314460CUi SUCCESS;
    public static final EnumC314460CUi WAITING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC314460CUi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC314460CUi enumC314460CUi = new EnumC314460CUi("PASS", 0, "pass");
        PASS = enumC314460CUi;
        EnumC314460CUi enumC314460CUi2 = new EnumC314460CUi("WAITING", 1, "waiting");
        WAITING = enumC314460CUi2;
        EnumC314460CUi enumC314460CUi3 = new EnumC314460CUi("SUCCESS", 2, "success");
        SUCCESS = enumC314460CUi3;
        EnumC314460CUi enumC314460CUi4 = new EnumC314460CUi("FAIL", 3, "fail");
        FAIL = enumC314460CUi4;
        EnumC314460CUi[] enumC314460CUiArr = {enumC314460CUi, enumC314460CUi2, enumC314460CUi3, enumC314460CUi4};
        LLILLJJLI = enumC314460CUiArr;
        LLILLL = new C2254308sP(enumC314460CUiArr);
    }

    public static EnumC314460CUi[] values() {
        return (EnumC314460CUi[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC314460CUi valueOf(String str) {
        return (EnumC314460CUi) C08FF.LIZ(EnumC314460CUi.class, str);
    }

    public EnumC314460CUi(String str, int i, String str2) {
        this.LL = str2;
    }
}
