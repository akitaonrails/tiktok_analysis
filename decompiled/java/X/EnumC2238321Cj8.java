package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Cj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2238321Cj8 {
    public static final EnumC2238321Cj8 LL;
    public static final EnumC2238321Cj8 LLILLJJLI;
    public static final EnumC2238321Cj8 LLILLL;
    public static final EnumC2238321Cj8 LLILZ;
    public static final /* synthetic */ EnumC2238321Cj8[] LLILZIL;

    static {
        EnumC2238321Cj8 enumC2238321Cj8 = new EnumC2238321Cj8("CLOSED", 0);
        LL = enumC2238321Cj8;
        EnumC2238321Cj8 enumC2238321Cj82 = new EnumC2238321Cj8("OPENED", 1);
        LLILLJJLI = enumC2238321Cj82;
        EnumC2238321Cj8 enumC2238321Cj83 = new EnumC2238321Cj8("HALF_SCREEN", 2);
        LLILLL = enumC2238321Cj83;
        EnumC2238321Cj8 enumC2238321Cj84 = new EnumC2238321Cj8("FULL_SCREEN", 3);
        LLILZ = enumC2238321Cj84;
        EnumC2238321Cj8[] enumC2238321Cj8Arr = {enumC2238321Cj8, enumC2238321Cj82, enumC2238321Cj83, enumC2238321Cj84};
        LLILZIL = enumC2238321Cj8Arr;
        new C2254308sP(enumC2238321Cj8Arr);
    }

    public static EnumC2238321Cj8[] values() {
        return (EnumC2238321Cj8[]) LLILZIL.clone();
    }

    public static EnumC2238321Cj8 valueOf(String str) {
        return (EnumC2238321Cj8) C08FF.LIZ(EnumC2238321Cj8.class, str);
    }

    public EnumC2238321Cj8(String str, int i) {
    }
}
