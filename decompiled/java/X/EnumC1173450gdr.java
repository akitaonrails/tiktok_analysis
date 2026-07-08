package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1173450gdr {
    public static final EnumC1173450gdr ERROR;
    public static final EnumC1173450gdr FIRST_TIME_LOADING;
    public static final /* synthetic */ EnumC1173450gdr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1173450gdr LOADED_EMPTY;
    public static final EnumC1173450gdr LOADED_NOT_EMPTY;

    public static InterfaceC2044707zh<EnumC1173450gdr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1173450gdr enumC1173450gdr = new EnumC1173450gdr("ERROR", 0);
        ERROR = enumC1173450gdr;
        EnumC1173450gdr enumC1173450gdr2 = new EnumC1173450gdr("FIRST_TIME_LOADING", 1);
        FIRST_TIME_LOADING = enumC1173450gdr2;
        EnumC1173450gdr enumC1173450gdr3 = new EnumC1173450gdr("LOADED_EMPTY", 2);
        LOADED_EMPTY = enumC1173450gdr3;
        EnumC1173450gdr enumC1173450gdr4 = new EnumC1173450gdr("LOADED_NOT_EMPTY", 3);
        LOADED_NOT_EMPTY = enumC1173450gdr4;
        EnumC1173450gdr[] enumC1173450gdrArr = {enumC1173450gdr, enumC1173450gdr2, enumC1173450gdr3, enumC1173450gdr4};
        LL = enumC1173450gdrArr;
        LLILLJJLI = new C2254308sP(enumC1173450gdrArr);
    }

    public static EnumC1173450gdr[] values() {
        return (EnumC1173450gdr[]) LL.clone();
    }

    public static EnumC1173450gdr valueOf(String str) {
        return (EnumC1173450gdr) C08FF.LIZ(EnumC1173450gdr.class, str);
    }

    public EnumC1173450gdr(String str, int i) {
    }
}
