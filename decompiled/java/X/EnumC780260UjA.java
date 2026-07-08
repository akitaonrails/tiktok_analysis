package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC780260UjA {
    public static final EnumC780260UjA LEFT_BOTTOM;
    public static final EnumC780260UjA LEFT_TOP;
    public static final /* synthetic */ EnumC780260UjA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC780260UjA RIGHT_BOTTOM;
    public static final EnumC780260UjA RIGHT_TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC780260UjA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC780260UjA enumC780260UjA = new EnumC780260UjA("RIGHT_BOTTOM", 0, 1);
        RIGHT_BOTTOM = enumC780260UjA;
        EnumC780260UjA enumC780260UjA2 = new EnumC780260UjA("RIGHT_TOP", 1, 2);
        RIGHT_TOP = enumC780260UjA2;
        EnumC780260UjA enumC780260UjA3 = new EnumC780260UjA("LEFT_BOTTOM", 2, 3);
        LEFT_BOTTOM = enumC780260UjA3;
        EnumC780260UjA enumC780260UjA4 = new EnumC780260UjA("LEFT_TOP", 3, 4);
        LEFT_TOP = enumC780260UjA4;
        EnumC780260UjA[] enumC780260UjAArr = {enumC780260UjA, enumC780260UjA2, enumC780260UjA3, enumC780260UjA4};
        LLILLJJLI = enumC780260UjAArr;
        LLILLL = new C2254308sP(enumC780260UjAArr);
    }

    public static EnumC780260UjA[] values() {
        return (EnumC780260UjA[]) LLILLJJLI.clone();
    }

    public final boolean isLeft() {
        return this == LEFT_TOP || this == LEFT_BOTTOM;
    }

    public final boolean isTop() {
        return this == LEFT_TOP || this == RIGHT_TOP;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC780260UjA valueOf(String str) {
        return (EnumC780260UjA) C08FF.LIZ(EnumC780260UjA.class, str);
    }

    public EnumC780260UjA(String str, int i, int i2) {
        this.LL = i2;
    }
}
