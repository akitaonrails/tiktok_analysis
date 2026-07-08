package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Bd3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2209071Bd3 {
    public static final C2209111Bd7 Companion;
    public static final EnumC2209071Bd3 DEFAULT_OFF;
    public static final EnumC2209071Bd3 DEFAULT_ON;
    public static final /* synthetic */ EnumC2209071Bd3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2209071Bd3 MANUALLY_OFF;
    public static final EnumC2209071Bd3 MANUALLY_ON;
    public static final EnumC2209071Bd3 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2209071Bd3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2209071Bd3 enumC2209071Bd3 = new EnumC2209071Bd3("UNKNOWN", 0, 0);
        UNKNOWN = enumC2209071Bd3;
        EnumC2209071Bd3 enumC2209071Bd32 = new EnumC2209071Bd3("MANUALLY_ON", 1, 1);
        MANUALLY_ON = enumC2209071Bd32;
        EnumC2209071Bd3 enumC2209071Bd33 = new EnumC2209071Bd3("DEFAULT_ON", 2, 2);
        DEFAULT_ON = enumC2209071Bd33;
        EnumC2209071Bd3 enumC2209071Bd34 = new EnumC2209071Bd3("MANUALLY_OFF", 3, 3);
        MANUALLY_OFF = enumC2209071Bd34;
        EnumC2209071Bd3 enumC2209071Bd35 = new EnumC2209071Bd3("DEFAULT_OFF", 4, 4);
        DEFAULT_OFF = enumC2209071Bd35;
        EnumC2209071Bd3[] enumC2209071Bd3Arr = {enumC2209071Bd3, enumC2209071Bd32, enumC2209071Bd33, enumC2209071Bd34, enumC2209071Bd35};
        LLILLJJLI = enumC2209071Bd3Arr;
        LLILLL = new C2254308sP(enumC2209071Bd3Arr);
        Companion = new C2209111Bd7();
    }

    public static EnumC2209071Bd3[] values() {
        return (EnumC2209071Bd3[]) LLILLJJLI.clone();
    }

    public final boolean isDefault() {
        int i = C2209091Bd5.LIZ[ordinal()];
        return i == 2 || i == 4;
    }

    public final boolean isManual() {
        int i = C2209091Bd5.LIZ[ordinal()];
        return i == 1 || i == 3;
    }

    public final boolean isOn() {
        int i = C2209091Bd5.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4 || i == 5) {
            return false;
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2209071Bd3 valueOf(String str) {
        return (EnumC2209071Bd3) C08FF.LIZ(EnumC2209071Bd3.class, str);
    }

    public EnumC2209071Bd3(String str, int i, int i2) {
        this.LL = i2;
    }
}
