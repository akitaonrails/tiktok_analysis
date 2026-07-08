package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19357610oI {
    public static final EnumC19357610oI GLOBAL;
    public static final /* synthetic */ EnumC19357610oI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19357610oI LOCAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19357610oI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19357610oI enumC19357610oI = new EnumC19357610oI("LOCAL", 0, 1);
        LOCAL = enumC19357610oI;
        EnumC19357610oI enumC19357610oI2 = new EnumC19357610oI("GLOBAL", 1, 2);
        GLOBAL = enumC19357610oI2;
        EnumC19357610oI[] enumC19357610oIArr = {enumC19357610oI, enumC19357610oI2};
        LLILLJJLI = enumC19357610oIArr;
        LLILLL = new C2254308sP(enumC19357610oIArr);
    }

    public static EnumC19357610oI[] values() {
        return (EnumC19357610oI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19357610oI valueOf(String str) {
        return (EnumC19357610oI) C08FF.LIZ(EnumC19357610oI.class, str);
    }

    public EnumC19357610oI(String str, int i, int i2) {
        this.LL = i2;
    }
}
