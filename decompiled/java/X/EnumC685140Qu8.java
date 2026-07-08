package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC685140Qu8 {
    public static final EnumC685140Qu8 FIXED;
    public static final EnumC685140Qu8 FLEX;
    public static final EnumC685140Qu8 HALF_FLEX;
    public static final /* synthetic */ EnumC685140Qu8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC685140Qu8 RATIO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC685140Qu8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC685140Qu8 enumC685140Qu8 = new EnumC685140Qu8("FIXED", 0, "fixed");
        FIXED = enumC685140Qu8;
        EnumC685140Qu8 enumC685140Qu82 = new EnumC685140Qu8("HALF_FLEX", 1, "half_flex");
        HALF_FLEX = enumC685140Qu82;
        EnumC685140Qu8 enumC685140Qu83 = new EnumC685140Qu8("FLEX", 2, "flex");
        FLEX = enumC685140Qu83;
        EnumC685140Qu8 enumC685140Qu84 = new EnumC685140Qu8("RATIO", 3, "ratio");
        RATIO = enumC685140Qu84;
        EnumC685140Qu8[] enumC685140Qu8Arr = {enumC685140Qu8, enumC685140Qu82, enumC685140Qu83, enumC685140Qu84};
        LLILLJJLI = enumC685140Qu8Arr;
        LLILLL = new C2254308sP(enumC685140Qu8Arr);
    }

    public static EnumC685140Qu8[] values() {
        return (EnumC685140Qu8[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC685140Qu8 valueOf(String str) {
        return (EnumC685140Qu8) C08FF.LIZ(EnumC685140Qu8.class, str);
    }

    public EnumC685140Qu8(String str, int i, String str2) {
        this.LL = str2;
    }
}
