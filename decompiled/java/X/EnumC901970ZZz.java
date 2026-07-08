package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC901970ZZz {
    public static final EnumC901970ZZz LL;
    public static final EnumC901970ZZz LLILLJJLI;
    public static final EnumC901970ZZz LLILLL;
    public static final EnumC901970ZZz LLILZ;
    public static final EnumC901970ZZz LLILZIL;
    public static final /* synthetic */ EnumC901970ZZz[] LLILZLL;

    static {
        EnumC901970ZZz enumC901970ZZz = new EnumC901970ZZz("INIT", 0);
        LL = enumC901970ZZz;
        EnumC901970ZZz enumC901970ZZz2 = new EnumC901970ZZz("LOADING", 1);
        LLILLJJLI = enumC901970ZZz2;
        EnumC901970ZZz enumC901970ZZz3 = new EnumC901970ZZz("SUCCESS", 2);
        LLILLL = enumC901970ZZz3;
        EnumC901970ZZz enumC901970ZZz4 = new EnumC901970ZZz("FAILED", 3);
        LLILZ = enumC901970ZZz4;
        EnumC901970ZZz enumC901970ZZz5 = new EnumC901970ZZz("ERROR", 4);
        LLILZIL = enumC901970ZZz5;
        EnumC901970ZZz[] enumC901970ZZzArr = {enumC901970ZZz, enumC901970ZZz2, enumC901970ZZz3, enumC901970ZZz4, enumC901970ZZz5};
        LLILZLL = enumC901970ZZzArr;
        new C2254308sP(enumC901970ZZzArr);
    }

    public static EnumC901970ZZz[] values() {
        return (EnumC901970ZZz[]) LLILZLL.clone();
    }

    public static EnumC901970ZZz valueOf(String str) {
        return (EnumC901970ZZz) C08FF.LIZ(EnumC901970ZZz.class, str);
    }

    public EnumC901970ZZz(String str, int i) {
    }
}
