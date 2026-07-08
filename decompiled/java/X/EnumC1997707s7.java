package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07s7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1997707s7 {
    public static final EnumC1997707s7 LIKE_LIST_SCENARIO_BULLET;
    public static final EnumC1997707s7 LIKE_LIST_SCENARIO_DEFAULT;
    public static final EnumC1997707s7 LIKE_LIST_SCENARIO_NOW_BULLET;
    public static final EnumC1997707s7 LIKE_LIST_SCENARIO_NOW_REACTION_AVATAR;
    public static final /* synthetic */ EnumC1997707s7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1997707s7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1997707s7 enumC1997707s7 = new EnumC1997707s7("LIKE_LIST_SCENARIO_DEFAULT", 0, 0);
        LIKE_LIST_SCENARIO_DEFAULT = enumC1997707s7;
        EnumC1997707s7 enumC1997707s72 = new EnumC1997707s7("LIKE_LIST_SCENARIO_BULLET", 1, 1);
        LIKE_LIST_SCENARIO_BULLET = enumC1997707s72;
        EnumC1997707s7 enumC1997707s73 = new EnumC1997707s7("LIKE_LIST_SCENARIO_NOW_BULLET", 2, 2);
        LIKE_LIST_SCENARIO_NOW_BULLET = enumC1997707s73;
        EnumC1997707s7 enumC1997707s74 = new EnumC1997707s7("LIKE_LIST_SCENARIO_NOW_REACTION_AVATAR", 3, 3);
        LIKE_LIST_SCENARIO_NOW_REACTION_AVATAR = enumC1997707s74;
        EnumC1997707s7[] enumC1997707s7Arr = {enumC1997707s7, enumC1997707s72, enumC1997707s73, enumC1997707s74};
        LLILLJJLI = enumC1997707s7Arr;
        LLILLL = new C2254308sP(enumC1997707s7Arr);
    }

    public static EnumC1997707s7[] values() {
        return (EnumC1997707s7[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1997707s7 valueOf(String str) {
        return (EnumC1997707s7) C08FF.LIZ(EnumC1997707s7.class, str);
    }

    public EnumC1997707s7(String str, int i, int i2) {
        this.LL = i2;
    }
}
