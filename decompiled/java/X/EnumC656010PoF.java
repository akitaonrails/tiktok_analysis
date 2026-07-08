package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656010PoF {
    public static final EnumC656010PoF AUTHOR;
    public static final EnumC656010PoF LIKE;
    public static final /* synthetic */ EnumC656010PoF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC656010PoF NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC656010PoF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC656010PoF enumC656010PoF = new EnumC656010PoF("LIKE", 0, 0);
        LIKE = enumC656010PoF;
        EnumC656010PoF enumC656010PoF2 = new EnumC656010PoF("AUTHOR", 1, 1);
        AUTHOR = enumC656010PoF2;
        EnumC656010PoF enumC656010PoF3 = new EnumC656010PoF("NONE", 2, 2);
        NONE = enumC656010PoF3;
        EnumC656010PoF[] enumC656010PoFArr = {enumC656010PoF, enumC656010PoF2, enumC656010PoF3};
        LLILLJJLI = enumC656010PoFArr;
        LLILLL = new C2254308sP(enumC656010PoFArr);
    }

    public static EnumC656010PoF[] values() {
        return (EnumC656010PoF[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC656010PoF valueOf(String str) {
        return (EnumC656010PoF) C08FF.LIZ(EnumC656010PoF.class, str);
    }

    public EnumC656010PoF(String str, int i, int i2) {
        this.LL = i2;
    }
}
