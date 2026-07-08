package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2010207u8 {
    public static final EnumC2010207u8 EVE;
    public static final /* synthetic */ EnumC2010207u8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2010207u8 NONE;
    public static final EnumC2010207u8 PRESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2010207u8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2010207u8 enumC2010207u8 = new EnumC2010207u8("NONE", 0, 0);
        NONE = enumC2010207u8;
        EnumC2010207u8 enumC2010207u82 = new EnumC2010207u8("EVE", 1, 1);
        EVE = enumC2010207u82;
        EnumC2010207u8 enumC2010207u83 = new EnumC2010207u8("PRESS", 2, 2);
        PRESS = enumC2010207u83;
        EnumC2010207u8[] enumC2010207u8Arr = {enumC2010207u8, enumC2010207u82, enumC2010207u83};
        LLILLJJLI = enumC2010207u8Arr;
        LLILLL = new C2254308sP(enumC2010207u8Arr);
    }

    public static EnumC2010207u8[] values() {
        return (EnumC2010207u8[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2010207u8 valueOf(String str) {
        return (EnumC2010207u8) C08FF.LIZ(EnumC2010207u8.class, str);
    }

    public EnumC2010207u8(String str, int i, int i2) {
        this.LL = i2;
    }
}
