package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC891840Yyk {
    public static final EnumC891840Yyk DISABLE;
    public static final EnumC891840Yyk ENABLE;
    public static final /* synthetic */ EnumC891840Yyk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC891840Yyk UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC891840Yyk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC891840Yyk enumC891840Yyk = new EnumC891840Yyk("UNKNOWN", 0, 0);
        UNKNOWN = enumC891840Yyk;
        EnumC891840Yyk enumC891840Yyk2 = new EnumC891840Yyk("ENABLE", 1, 1);
        ENABLE = enumC891840Yyk2;
        EnumC891840Yyk enumC891840Yyk3 = new EnumC891840Yyk("DISABLE", 2, 2);
        DISABLE = enumC891840Yyk3;
        EnumC891840Yyk[] enumC891840YykArr = {enumC891840Yyk, enumC891840Yyk2, enumC891840Yyk3};
        LLILLJJLI = enumC891840YykArr;
        LLILLL = new C2254308sP(enumC891840YykArr);
    }

    public static EnumC891840Yyk[] values() {
        return (EnumC891840Yyk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC891840Yyk valueOf(String str) {
        return (EnumC891840Yyk) C08FF.LIZ(EnumC891840Yyk.class, str);
    }

    public EnumC891840Yyk(String str, int i, int i2) {
        this.LL = i2;
    }
}
