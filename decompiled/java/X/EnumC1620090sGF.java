package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1620090sGF {
    public static final /* synthetic */ EnumC1620090sGF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1620090sGF LOADING;
    public static final EnumC1620090sGF LOAD_ERROR;
    public static final EnumC1620090sGF SUCCEED;

    public static InterfaceC2044707zh<EnumC1620090sGF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1620090sGF enumC1620090sGF = new EnumC1620090sGF("SUCCEED", 0);
        SUCCEED = enumC1620090sGF;
        EnumC1620090sGF enumC1620090sGF2 = new EnumC1620090sGF("LOADING", 1);
        LOADING = enumC1620090sGF2;
        EnumC1620090sGF enumC1620090sGF3 = new EnumC1620090sGF("LOAD_ERROR", 2);
        LOAD_ERROR = enumC1620090sGF3;
        EnumC1620090sGF[] enumC1620090sGFArr = {enumC1620090sGF, enumC1620090sGF2, enumC1620090sGF3};
        LL = enumC1620090sGFArr;
        LLILLJJLI = new C2254308sP(enumC1620090sGFArr);
    }

    public static EnumC1620090sGF[] values() {
        return (EnumC1620090sGF[]) LL.clone();
    }

    public static EnumC1620090sGF valueOf(String str) {
        return (EnumC1620090sGF) C08FF.LIZ(EnumC1620090sGF.class, str);
    }

    public EnumC1620090sGF(String str, int i) {
    }
}
