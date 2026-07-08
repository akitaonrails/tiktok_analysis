package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741050vPL {
    public static final EnumC1741050vPL FULL_SCREEN;
    public static final /* synthetic */ EnumC1741050vPL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1741050vPL NON_FULL_SCREEN;
    public static final EnumC1741050vPL UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1741050vPL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1741050vPL enumC1741050vPL = new EnumC1741050vPL("UNKNOWN", 0, 0);
        UNKNOWN = enumC1741050vPL;
        EnumC1741050vPL enumC1741050vPL2 = new EnumC1741050vPL("FULL_SCREEN", 1, 1);
        FULL_SCREEN = enumC1741050vPL2;
        EnumC1741050vPL enumC1741050vPL3 = new EnumC1741050vPL("NON_FULL_SCREEN", 2, 2);
        NON_FULL_SCREEN = enumC1741050vPL3;
        EnumC1741050vPL[] enumC1741050vPLArr = {enumC1741050vPL, enumC1741050vPL2, enumC1741050vPL3};
        LLILLJJLI = enumC1741050vPLArr;
        LLILLL = new C2254308sP(enumC1741050vPLArr);
    }

    public static EnumC1741050vPL[] values() {
        return (EnumC1741050vPL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1741050vPL valueOf(String str) {
        return (EnumC1741050vPL) C08FF.LIZ(EnumC1741050vPL.class, str);
    }

    public EnumC1741050vPL(String str, int i, int i2) {
        this.LL = i2;
    }
}
