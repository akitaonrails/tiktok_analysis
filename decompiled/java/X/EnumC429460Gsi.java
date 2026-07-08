package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429460Gsi {
    public static final EnumC429460Gsi ACTIVE;
    public static final EnumC429460Gsi INACTIVE;
    public static final /* synthetic */ EnumC429460Gsi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC429460Gsi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC429460Gsi enumC429460Gsi = new EnumC429460Gsi("ACTIVE", 0, 0);
        ACTIVE = enumC429460Gsi;
        EnumC429460Gsi enumC429460Gsi2 = new EnumC429460Gsi("INACTIVE", 1, 1);
        INACTIVE = enumC429460Gsi2;
        EnumC429460Gsi[] enumC429460GsiArr = {enumC429460Gsi, enumC429460Gsi2};
        LLILLJJLI = enumC429460GsiArr;
        LLILLL = new C2254308sP(enumC429460GsiArr);
    }

    public static EnumC429460Gsi[] values() {
        return (EnumC429460Gsi[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC429460Gsi valueOf(String str) {
        return (EnumC429460Gsi) C08FF.LIZ(EnumC429460Gsi.class, str);
    }

    public EnumC429460Gsi(String str, int i, int i2) {
        this.LL = i2;
    }
}
