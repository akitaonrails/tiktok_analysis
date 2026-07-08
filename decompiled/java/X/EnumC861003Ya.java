package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC861003Ya {
    public static final EnumC861003Ya ADD;
    public static final C861403Ye Companion;
    public static final EnumC861003Ya ENABLE;
    public static final EnumC861003Ya ENABLE_AND_ADD;
    public static final /* synthetic */ EnumC861003Ya[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC861003Ya UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC861003Ya> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.03Ye] */
    static {
        EnumC861003Ya enumC861003Ya = new EnumC861003Ya("UNKNOWN", 0, 0);
        UNKNOWN = enumC861003Ya;
        EnumC861003Ya enumC861003Ya2 = new EnumC861003Ya("ENABLE", 1, 1);
        ENABLE = enumC861003Ya2;
        EnumC861003Ya enumC861003Ya3 = new EnumC861003Ya("ADD", 2, 2);
        ADD = enumC861003Ya3;
        EnumC861003Ya enumC861003Ya4 = new EnumC861003Ya("ENABLE_AND_ADD", 3, 3);
        ENABLE_AND_ADD = enumC861003Ya4;
        EnumC861003Ya[] enumC861003YaArr = {enumC861003Ya, enumC861003Ya2, enumC861003Ya3, enumC861003Ya4};
        LLILLJJLI = enumC861003YaArr;
        LLILLL = new C2254308sP(enumC861003YaArr);
        Companion = new Object() { // from class: X.03Ye
        };
    }

    public static EnumC861003Ya[] values() {
        return (EnumC861003Ya[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC861003Ya valueOf(String str) {
        return (EnumC861003Ya) C08FF.LIZ(EnumC861003Ya.class, str);
    }

    public EnumC861003Ya(String str, int i, int i2) {
        this.LL = i2;
    }
}
