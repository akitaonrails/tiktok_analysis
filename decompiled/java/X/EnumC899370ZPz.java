package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC899370ZPz {
    public static final C0ZQ0 Companion;
    public static final EnumC899370ZPz DISABLED;
    public static final EnumC899370ZPz ENABLED;
    public static final /* synthetic */ EnumC899370ZPz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC899370ZPz UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC899370ZPz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC899370ZPz enumC899370ZPz = new EnumC899370ZPz("UNKNOWN", 0, 0);
        UNKNOWN = enumC899370ZPz;
        EnumC899370ZPz enumC899370ZPz2 = new EnumC899370ZPz("ENABLED", 1, 1);
        ENABLED = enumC899370ZPz2;
        EnumC899370ZPz enumC899370ZPz3 = new EnumC899370ZPz("DISABLED", 2, 2);
        DISABLED = enumC899370ZPz3;
        EnumC899370ZPz[] enumC899370ZPzArr = {enumC899370ZPz, enumC899370ZPz2, enumC899370ZPz3};
        LLILLJJLI = enumC899370ZPzArr;
        LLILLL = new C2254308sP(enumC899370ZPzArr);
        Companion = new C0ZQ0();
    }

    public static EnumC899370ZPz[] values() {
        return (EnumC899370ZPz[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC899370ZPz valueOf(String str) {
        return (EnumC899370ZPz) C08FF.LIZ(EnumC899370ZPz.class, str);
    }

    public EnumC899370ZPz(String str, int i, int i2) {
        this.LL = i2;
    }
}
