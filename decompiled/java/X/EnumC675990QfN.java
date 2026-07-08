package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC675990QfN {
    public static final EnumC675990QfN FAILED;
    public static final /* synthetic */ EnumC675990QfN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC675990QfN LOADING;
    public static final EnumC675990QfN START;
    public static final EnumC675990QfN SUCCESS;

    public static InterfaceC2044707zh<EnumC675990QfN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC675990QfN enumC675990QfN = new EnumC675990QfN("SUCCESS", 0);
        SUCCESS = enumC675990QfN;
        EnumC675990QfN enumC675990QfN2 = new EnumC675990QfN("FAILED", 1);
        FAILED = enumC675990QfN2;
        EnumC675990QfN enumC675990QfN3 = new EnumC675990QfN("START", 2);
        START = enumC675990QfN3;
        EnumC675990QfN enumC675990QfN4 = new EnumC675990QfN("LOADING", 3);
        LOADING = enumC675990QfN4;
        EnumC675990QfN[] enumC675990QfNArr = {enumC675990QfN, enumC675990QfN2, enumC675990QfN3, enumC675990QfN4};
        LL = enumC675990QfNArr;
        LLILLJJLI = new C2254308sP(enumC675990QfNArr);
    }

    public static EnumC675990QfN[] values() {
        return (EnumC675990QfN[]) LL.clone();
    }

    public static EnumC675990QfN valueOf(String str) {
        return (EnumC675990QfN) C08FF.LIZ(EnumC675990QfN.class, str);
    }

    public EnumC675990QfN(String str, int i) {
    }
}
