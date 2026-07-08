package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0341009z {
    public static final EnumC0341009z FAIL;
    public static final /* synthetic */ EnumC0341009z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0341009z SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0341009z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0341009z enumC0341009z = new EnumC0341009z("SUCCESS", 0, 0);
        SUCCESS = enumC0341009z;
        EnumC0341009z enumC0341009z2 = new EnumC0341009z("FAIL", 1, 1);
        FAIL = enumC0341009z2;
        EnumC0341009z[] enumC0341009zArr = {enumC0341009z, enumC0341009z2};
        LLILLJJLI = enumC0341009zArr;
        LLILLL = new C2254308sP(enumC0341009zArr);
    }

    public static EnumC0341009z[] values() {
        return (EnumC0341009z[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC0341009z valueOf(String str) {
        return (EnumC0341009z) C08FF.LIZ(EnumC0341009z.class, str);
    }

    public EnumC0341009z(String str, int i, int i2) {
        this.LL = i2;
    }
}
