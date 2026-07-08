package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0316009a {
    public static final /* synthetic */ EnumC0316009a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0316009a OKLAB;
    public static final EnumC0316009a OKLCH;

    public static InterfaceC2044707zh<EnumC0316009a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0316009a enumC0316009a = new EnumC0316009a("OKLAB", 0);
        OKLAB = enumC0316009a;
        EnumC0316009a enumC0316009a2 = new EnumC0316009a("OKLCH", 1);
        OKLCH = enumC0316009a2;
        EnumC0316009a[] enumC0316009aArr = {enumC0316009a, enumC0316009a2};
        LL = enumC0316009aArr;
        LLILLJJLI = new C2254308sP(enumC0316009aArr);
    }

    public static EnumC0316009a[] values() {
        return (EnumC0316009a[]) LL.clone();
    }

    public static EnumC0316009a valueOf(String str) {
        return (EnumC0316009a) C08FF.LIZ(EnumC0316009a.class, str);
    }

    public EnumC0316009a(String str, int i) {
    }
}
