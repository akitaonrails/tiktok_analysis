package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01Qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC332601Qu {
    public static final /* synthetic */ EnumC332601Qu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC332601Qu STORY_TAB;
    public static final EnumC332601Qu THOUGHT_TAB;
    public static final EnumC332601Qu UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC332601Qu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC332601Qu enumC332601Qu = new EnumC332601Qu("UNKNOWN", 0, 0);
        UNKNOWN = enumC332601Qu;
        EnumC332601Qu enumC332601Qu2 = new EnumC332601Qu("STORY_TAB", 1, 1);
        STORY_TAB = enumC332601Qu2;
        EnumC332601Qu enumC332601Qu3 = new EnumC332601Qu("THOUGHT_TAB", 2, 2);
        THOUGHT_TAB = enumC332601Qu3;
        EnumC332601Qu[] enumC332601QuArr = {enumC332601Qu, enumC332601Qu2, enumC332601Qu3};
        LLILLJJLI = enumC332601QuArr;
        LLILLL = new C2254308sP(enumC332601QuArr);
    }

    public static EnumC332601Qu[] values() {
        return (EnumC332601Qu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC332601Qu valueOf(String str) {
        return (EnumC332601Qu) C08FF.LIZ(EnumC332601Qu.class, str);
    }

    public EnumC332601Qu(String str, int i, int i2) {
        this.LL = i2;
    }
}
