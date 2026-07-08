package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1915270zwL {
    public static final C1915280zwM Companion;
    public static final EnumC1915270zwL DEFAULT_ON;
    public static final EnumC1915270zwL FORCE_ON;
    public static final /* synthetic */ EnumC1915270zwL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1915270zwL NOT_SHOW;
    public static final EnumC1915270zwL OFF;
    public static final EnumC1915270zwL ON;
    public static final EnumC1915270zwL PARENT_SET_ON;
    public static final EnumC1915270zwL UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1915270zwL> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0zwM] */
    static {
        EnumC1915270zwL enumC1915270zwL = new EnumC1915270zwL("FORCE_ON", 0, 1);
        FORCE_ON = enumC1915270zwL;
        EnumC1915270zwL enumC1915270zwL2 = new EnumC1915270zwL("ON", 1, 2);
        ON = enumC1915270zwL2;
        EnumC1915270zwL enumC1915270zwL3 = new EnumC1915270zwL("OFF", 2, 3);
        OFF = enumC1915270zwL3;
        EnumC1915270zwL enumC1915270zwL4 = new EnumC1915270zwL("PARENT_SET_ON", 3, 4);
        PARENT_SET_ON = enumC1915270zwL4;
        EnumC1915270zwL enumC1915270zwL5 = new EnumC1915270zwL("NOT_SHOW", 4, 5);
        NOT_SHOW = enumC1915270zwL5;
        EnumC1915270zwL enumC1915270zwL6 = new EnumC1915270zwL("DEFAULT_ON", 5, 6);
        DEFAULT_ON = enumC1915270zwL6;
        EnumC1915270zwL enumC1915270zwL7 = new EnumC1915270zwL("UNKNOWN", 6, -1);
        UNKNOWN = enumC1915270zwL7;
        EnumC1915270zwL[] enumC1915270zwLArr = {enumC1915270zwL, enumC1915270zwL2, enumC1915270zwL3, enumC1915270zwL4, enumC1915270zwL5, enumC1915270zwL6, enumC1915270zwL7};
        LLILLJJLI = enumC1915270zwLArr;
        LLILLL = new C2254308sP(enumC1915270zwLArr);
        Companion = new Object() { // from class: X.0zwM
        };
    }

    public static EnumC1915270zwL[] values() {
        return (EnumC1915270zwL[]) LLILLJJLI.clone();
    }

    public final boolean isOn() {
        return this == ON || this == FORCE_ON || this == DEFAULT_ON || this == PARENT_SET_ON;
    }

    public final boolean isSelfOrSystemOn() {
        return this == ON || this == FORCE_ON || this == DEFAULT_ON;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1915270zwL valueOf(String str) {
        return (EnumC1915270zwL) C08FF.LIZ(EnumC1915270zwL.class, str);
    }

    public EnumC1915270zwL(String str, int i, int i2) {
        this.LL = i2;
    }
}
