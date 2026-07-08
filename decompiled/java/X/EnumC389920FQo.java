package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC389920FQo {
    public static final EnumC389920FQo LEFT_BOTTOM;
    public static final EnumC389920FQo LEFT_MIDDLE;
    public static final EnumC389920FQo LEFT_TOP;
    public static final /* synthetic */ EnumC389920FQo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC389920FQo MIDDLE_BOTTOM;
    public static final EnumC389920FQo MIDDLE_MIDDLE;
    public static final EnumC389920FQo MIDDLE_TOP;
    public static final EnumC389920FQo RIGHT_BOTTOM;
    public static final EnumC389920FQo RIGHT_MIDDLE;
    public static final EnumC389920FQo RIGHT_TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC389920FQo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC389920FQo enumC389920FQo = new EnumC389920FQo("LEFT_TOP", 0, 0);
        LEFT_TOP = enumC389920FQo;
        EnumC389920FQo enumC389920FQo2 = new EnumC389920FQo("MIDDLE_TOP", 1, 1);
        MIDDLE_TOP = enumC389920FQo2;
        EnumC389920FQo enumC389920FQo3 = new EnumC389920FQo("RIGHT_TOP", 2, 2);
        RIGHT_TOP = enumC389920FQo3;
        EnumC389920FQo enumC389920FQo4 = new EnumC389920FQo("LEFT_MIDDLE", 3, 3);
        LEFT_MIDDLE = enumC389920FQo4;
        EnumC389920FQo enumC389920FQo5 = new EnumC389920FQo("MIDDLE_MIDDLE", 4, 4);
        MIDDLE_MIDDLE = enumC389920FQo5;
        EnumC389920FQo enumC389920FQo6 = new EnumC389920FQo("RIGHT_MIDDLE", 5, 5);
        RIGHT_MIDDLE = enumC389920FQo6;
        EnumC389920FQo enumC389920FQo7 = new EnumC389920FQo("LEFT_BOTTOM", 6, 6);
        LEFT_BOTTOM = enumC389920FQo7;
        EnumC389920FQo enumC389920FQo8 = new EnumC389920FQo("MIDDLE_BOTTOM", 7, 7);
        MIDDLE_BOTTOM = enumC389920FQo8;
        EnumC389920FQo enumC389920FQo9 = new EnumC389920FQo("RIGHT_BOTTOM", 8, 8);
        RIGHT_BOTTOM = enumC389920FQo9;
        EnumC389920FQo[] enumC389920FQoArr = {enumC389920FQo, enumC389920FQo2, enumC389920FQo3, enumC389920FQo4, enumC389920FQo5, enumC389920FQo6, enumC389920FQo7, enumC389920FQo8, enumC389920FQo9};
        LLILLJJLI = enumC389920FQoArr;
        LLILLL = new C2254308sP(enumC389920FQoArr);
    }

    public static EnumC389920FQo[] values() {
        return (EnumC389920FQo[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC389920FQo valueOf(String str) {
        return (EnumC389920FQo) C08FF.LIZ(EnumC389920FQo.class, str);
    }

    public EnumC389920FQo(String str, int i, int i2) {
        this.LL = i2;
    }
}
