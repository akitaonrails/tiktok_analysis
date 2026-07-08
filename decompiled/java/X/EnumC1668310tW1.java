package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1668310tW1 {
    public static final /* synthetic */ EnumC1668310tW1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1668310tW1 Normal;
    public static final EnumC1668310tW1 Wide;

    public static InterfaceC2044707zh<EnumC1668310tW1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1668310tW1 enumC1668310tW1 = new EnumC1668310tW1("Normal", 0);
        Normal = enumC1668310tW1;
        EnumC1668310tW1 enumC1668310tW12 = new EnumC1668310tW1("Wide", 1);
        Wide = enumC1668310tW12;
        EnumC1668310tW1[] enumC1668310tW1Arr = {enumC1668310tW1, enumC1668310tW12};
        LL = enumC1668310tW1Arr;
        LLILLJJLI = new C2254308sP(enumC1668310tW1Arr);
    }

    public static EnumC1668310tW1[] values() {
        return (EnumC1668310tW1[]) LL.clone();
    }

    public static EnumC1668310tW1 valueOf(String str) {
        return (EnumC1668310tW1) C08FF.LIZ(EnumC1668310tW1.class, str);
    }

    public EnumC1668310tW1(String str, int i) {
    }
}
