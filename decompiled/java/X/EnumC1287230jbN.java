package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1287230jbN {
    public static final EnumC1287230jbN ILLEGAL;
    public static final /* synthetic */ EnumC1287230jbN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1287230jbN UNDEFINED;
    public static final EnumC1287230jbN VALID;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1287230jbN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1287230jbN enumC1287230jbN = new EnumC1287230jbN("ILLEGAL", 0, 0);
        ILLEGAL = enumC1287230jbN;
        EnumC1287230jbN enumC1287230jbN2 = new EnumC1287230jbN("VALID", 1, 1);
        VALID = enumC1287230jbN2;
        EnumC1287230jbN enumC1287230jbN3 = new EnumC1287230jbN("UNDEFINED", 2, 2);
        UNDEFINED = enumC1287230jbN3;
        EnumC1287230jbN[] enumC1287230jbNArr = {enumC1287230jbN, enumC1287230jbN2, enumC1287230jbN3};
        LLILLJJLI = enumC1287230jbNArr;
        LLILLL = new C2254308sP(enumC1287230jbNArr);
    }

    public static EnumC1287230jbN[] values() {
        return (EnumC1287230jbN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1287230jbN valueOf(String str) {
        return (EnumC1287230jbN) C08FF.LIZ(EnumC1287230jbN.class, str);
    }

    public EnumC1287230jbN(String str, int i, int i2) {
        this.LL = i2;
    }
}
