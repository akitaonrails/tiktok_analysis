package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC922900a7k {
    public static final EnumC922900a7k FAILED;
    public static final /* synthetic */ EnumC922900a7k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC922900a7k NONE;
    public static final EnumC922900a7k SUCCEED;

    public static InterfaceC2044707zh<EnumC922900a7k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC922900a7k enumC922900a7k = new EnumC922900a7k("NONE", 0);
        NONE = enumC922900a7k;
        EnumC922900a7k enumC922900a7k2 = new EnumC922900a7k("SUCCEED", 1);
        SUCCEED = enumC922900a7k2;
        EnumC922900a7k enumC922900a7k3 = new EnumC922900a7k("FAILED", 2);
        FAILED = enumC922900a7k3;
        EnumC922900a7k[] enumC922900a7kArr = {enumC922900a7k, enumC922900a7k2, enumC922900a7k3};
        LL = enumC922900a7kArr;
        LLILLJJLI = new C2254308sP(enumC922900a7kArr);
    }

    public static EnumC922900a7k[] values() {
        return (EnumC922900a7k[]) LL.clone();
    }

    public static EnumC922900a7k valueOf(String str) {
        return (EnumC922900a7k) C08FF.LIZ(EnumC922900a7k.class, str);
    }

    public EnumC922900a7k(String str, int i) {
    }
}
