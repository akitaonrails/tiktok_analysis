package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009807u4 {
    public static final /* synthetic */ EnumC2009807u4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2009807u4 PHONE_LEVEL_HIGH;
    public static final EnumC2009807u4 PHONE_LEVEL_KNOWN;
    public static final EnumC2009807u4 PHONE_LEVEL_LOW;
    public static final EnumC2009807u4 PHONE_LEVEL_MIDDLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009807u4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009807u4 enumC2009807u4 = new EnumC2009807u4("PHONE_LEVEL_KNOWN", 0, 0);
        PHONE_LEVEL_KNOWN = enumC2009807u4;
        EnumC2009807u4 enumC2009807u42 = new EnumC2009807u4("PHONE_LEVEL_LOW", 1, 1);
        PHONE_LEVEL_LOW = enumC2009807u42;
        EnumC2009807u4 enumC2009807u43 = new EnumC2009807u4("PHONE_LEVEL_MIDDLE", 2, 2);
        PHONE_LEVEL_MIDDLE = enumC2009807u43;
        EnumC2009807u4 enumC2009807u44 = new EnumC2009807u4("PHONE_LEVEL_HIGH", 3, 3);
        PHONE_LEVEL_HIGH = enumC2009807u44;
        EnumC2009807u4[] enumC2009807u4Arr = {enumC2009807u4, enumC2009807u42, enumC2009807u43, enumC2009807u44};
        LLILLJJLI = enumC2009807u4Arr;
        LLILLL = new C2254308sP(enumC2009807u4Arr);
    }

    public static EnumC2009807u4[] values() {
        return (EnumC2009807u4[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2009807u4 valueOf(String str) {
        return (EnumC2009807u4) C08FF.LIZ(EnumC2009807u4.class, str);
    }

    public EnumC2009807u4(String str, int i, int i2) {
        this.LL = i2;
    }
}
