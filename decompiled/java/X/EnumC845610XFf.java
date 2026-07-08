package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC845610XFf {
    public static final EnumC845610XFf FORCE_REFRESH;
    public static final /* synthetic */ EnumC845610XFf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC845610XFf STARTUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC845610XFf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC845610XFf enumC845610XFf = new EnumC845610XFf("STARTUP", 0, "startup");
        STARTUP = enumC845610XFf;
        EnumC845610XFf enumC845610XFf2 = new EnumC845610XFf("FORCE_REFRESH", 1, "force_refresh");
        FORCE_REFRESH = enumC845610XFf2;
        EnumC845610XFf[] enumC845610XFfArr = {enumC845610XFf, enumC845610XFf2};
        LLILLJJLI = enumC845610XFfArr;
        LLILLL = new C2254308sP(enumC845610XFfArr);
    }

    public static EnumC845610XFf[] values() {
        return (EnumC845610XFf[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC845610XFf valueOf(String str) {
        return (EnumC845610XFf) C08FF.LIZ(EnumC845610XFf.class, str);
    }

    public EnumC845610XFf(String str, int i, String str2) {
        this.LL = str2;
    }
}
