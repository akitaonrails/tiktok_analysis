package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1573280r2k {
    public static final /* synthetic */ EnumC1573280r2k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1573280r2k LOADING;
    public static final EnumC1573280r2k NETWORK_ERROR;
    public static final EnumC1573280r2k SUCCESS;

    public static InterfaceC2044707zh<EnumC1573280r2k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1573280r2k enumC1573280r2k = new EnumC1573280r2k("LOADING", 0);
        LOADING = enumC1573280r2k;
        EnumC1573280r2k enumC1573280r2k2 = new EnumC1573280r2k("SUCCESS", 1);
        SUCCESS = enumC1573280r2k2;
        EnumC1573280r2k enumC1573280r2k3 = new EnumC1573280r2k("NETWORK_ERROR", 2);
        NETWORK_ERROR = enumC1573280r2k3;
        EnumC1573280r2k[] enumC1573280r2kArr = {enumC1573280r2k, enumC1573280r2k2, enumC1573280r2k3};
        LL = enumC1573280r2kArr;
        LLILLJJLI = new C2254308sP(enumC1573280r2kArr);
    }

    public static EnumC1573280r2k[] values() {
        return (EnumC1573280r2k[]) LL.clone();
    }

    public static EnumC1573280r2k valueOf(String str) {
        return (EnumC1573280r2k) C08FF.LIZ(EnumC1573280r2k.class, str);
    }

    public EnumC1573280r2k(String str, int i) {
    }
}
