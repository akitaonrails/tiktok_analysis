package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC841890X0x {
    public static final EnumC841890X0x CONTINUE;
    public static final EnumC841890X0x DROP;
    public static final EnumC841890X0x EXCEPTION;
    public static final EnumC841890X0x INTERCEPT;
    public static final /* synthetic */ EnumC841890X0x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC841890X0x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC841890X0x enumC841890X0x = new EnumC841890X0x("INTERCEPT", 0);
        INTERCEPT = enumC841890X0x;
        EnumC841890X0x enumC841890X0x2 = new EnumC841890X0x("CONTINUE", 1);
        CONTINUE = enumC841890X0x2;
        EnumC841890X0x enumC841890X0x3 = new EnumC841890X0x("DROP", 2);
        DROP = enumC841890X0x3;
        EnumC841890X0x enumC841890X0x4 = new EnumC841890X0x("EXCEPTION", 3);
        EXCEPTION = enumC841890X0x4;
        EnumC841890X0x[] enumC841890X0xArr = {enumC841890X0x, enumC841890X0x2, enumC841890X0x3, enumC841890X0x4};
        LL = enumC841890X0xArr;
        LLILLJJLI = new C2254308sP(enumC841890X0xArr);
    }

    public static EnumC841890X0x[] values() {
        return (EnumC841890X0x[]) LL.clone();
    }

    public static EnumC841890X0x valueOf(String str) {
        return (EnumC841890X0x) C08FF.LIZ(EnumC841890X0x.class, str);
    }

    public EnumC841890X0x(String str, int i) {
    }
}
