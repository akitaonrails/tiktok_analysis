package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1570580qyO {
    public static final C1570570qyN Companion;
    public static final EnumC1570580qyO DRAMA_TAB;
    public static final EnumC1570580qyO FOLLOW;
    public static final EnumC1570580qyO FOR_YOU;
    public static final EnumC1570580qyO FRIENDS;
    public static final /* synthetic */ EnumC1570580qyO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1570580qyO PLAYMODE_MOODBOOST;
    public static final EnumC1570580qyO PLAYMODE_NEW;
    public static final EnumC1570580qyO PLAYMODE_TOP;
    public static final EnumC1570580qyO SHOP;
    public static final EnumC1570580qyO STEM;
    public final int LL;

    public static final EnumC1570580qyO from(int i) {
        Companion.getClass();
        return C1570570qyN.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC1570580qyO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1570580qyO enumC1570580qyO = new EnumC1570580qyO("FOLLOW", 0, 0);
        FOLLOW = enumC1570580qyO;
        EnumC1570580qyO enumC1570580qyO2 = new EnumC1570580qyO("FOR_YOU", 1, 1);
        FOR_YOU = enumC1570580qyO2;
        EnumC1570580qyO enumC1570580qyO3 = new EnumC1570580qyO("SHOP", 2, 101);
        SHOP = enumC1570580qyO3;
        EnumC1570580qyO enumC1570580qyO4 = new EnumC1570580qyO("FRIENDS", 3, 102);
        FRIENDS = enumC1570580qyO4;
        EnumC1570580qyO enumC1570580qyO5 = new EnumC1570580qyO("STEM", 4, 103);
        STEM = enumC1570580qyO5;
        EnumC1570580qyO enumC1570580qyO6 = new EnumC1570580qyO("PLAYMODE_NEW", 5, 104);
        PLAYMODE_NEW = enumC1570580qyO6;
        EnumC1570580qyO enumC1570580qyO7 = new EnumC1570580qyO("PLAYMODE_TOP", 6, 105);
        PLAYMODE_TOP = enumC1570580qyO7;
        EnumC1570580qyO enumC1570580qyO8 = new EnumC1570580qyO("PLAYMODE_MOODBOOST", 7, 106);
        PLAYMODE_MOODBOOST = enumC1570580qyO8;
        EnumC1570580qyO enumC1570580qyO9 = new EnumC1570580qyO("DRAMA_TAB", 8, 107);
        DRAMA_TAB = enumC1570580qyO9;
        EnumC1570580qyO[] enumC1570580qyOArr = {enumC1570580qyO, enumC1570580qyO2, enumC1570580qyO3, enumC1570580qyO4, enumC1570580qyO5, enumC1570580qyO6, enumC1570580qyO7, enumC1570580qyO8, enumC1570580qyO9};
        LLILLJJLI = enumC1570580qyOArr;
        LLILLL = new C2254308sP(enumC1570580qyOArr);
        Companion = new C1570570qyN();
    }

    public static EnumC1570580qyO[] values() {
        return (EnumC1570580qyO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1570580qyO valueOf(String str) {
        return (EnumC1570580qyO) C08FF.LIZ(EnumC1570580qyO.class, str);
    }

    public EnumC1570580qyO(String str, int i, int i2) {
        this.LL = i2;
    }
}
