package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1179510gnd {
    public static final EnumC1179510gnd ERROR;
    public static final /* synthetic */ EnumC1179510gnd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1179510gnd LOADING;
    public static final EnumC1179510gnd SUCCESS;

    public static InterfaceC2044707zh<EnumC1179510gnd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1179510gnd enumC1179510gnd = new EnumC1179510gnd("LOADING", 0);
        LOADING = enumC1179510gnd;
        EnumC1179510gnd enumC1179510gnd2 = new EnumC1179510gnd("ERROR", 1);
        ERROR = enumC1179510gnd2;
        EnumC1179510gnd enumC1179510gnd3 = new EnumC1179510gnd("SUCCESS", 2);
        SUCCESS = enumC1179510gnd3;
        EnumC1179510gnd[] enumC1179510gndArr = {enumC1179510gnd, enumC1179510gnd2, enumC1179510gnd3};
        LL = enumC1179510gndArr;
        LLILLJJLI = new C2254308sP(enumC1179510gndArr);
    }

    public static EnumC1179510gnd[] values() {
        return (EnumC1179510gnd[]) LL.clone();
    }

    public static EnumC1179510gnd valueOf(String str) {
        return (EnumC1179510gnd) C08FF.LIZ(EnumC1179510gnd.class, str);
    }

    public EnumC1179510gnd(String str, int i) {
    }
}
