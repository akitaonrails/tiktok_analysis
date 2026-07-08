package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0339009x {
    public static final EnumC0339009x FAIL;
    public static final /* synthetic */ EnumC0339009x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0339009x SKIP;
    public static final EnumC0339009x SUCCESS;

    public static InterfaceC2044707zh<EnumC0339009x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0339009x enumC0339009x = new EnumC0339009x("SUCCESS", 0);
        SUCCESS = enumC0339009x;
        EnumC0339009x enumC0339009x2 = new EnumC0339009x("FAIL", 1);
        FAIL = enumC0339009x2;
        EnumC0339009x enumC0339009x3 = new EnumC0339009x("SKIP", 2);
        SKIP = enumC0339009x3;
        EnumC0339009x[] enumC0339009xArr = {enumC0339009x, enumC0339009x2, enumC0339009x3};
        LL = enumC0339009xArr;
        LLILLJJLI = new C2254308sP(enumC0339009xArr);
    }

    public static EnumC0339009x[] values() {
        return (EnumC0339009x[]) LL.clone();
    }

    public static EnumC0339009x valueOf(String str) {
        return (EnumC0339009x) C08FF.LIZ(EnumC0339009x.class, str);
    }

    public EnumC0339009x(String str, int i) {
    }
}
