package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1767640w6E {
    public static final EnumC1767640w6E BOTTOM_TAB;
    public static final /* synthetic */ EnumC1767640w6E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1767640w6E NON;
    public static final EnumC1767640w6E TOP_TAB;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1767640w6E> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1767640w6E enumC1767640w6E = new EnumC1767640w6E("NON", 0, -1);
        NON = enumC1767640w6E;
        EnumC1767640w6E enumC1767640w6E2 = new EnumC1767640w6E("BOTTOM_TAB", 1, 0);
        BOTTOM_TAB = enumC1767640w6E2;
        EnumC1767640w6E enumC1767640w6E3 = new EnumC1767640w6E("TOP_TAB", 2, 1);
        TOP_TAB = enumC1767640w6E3;
        EnumC1767640w6E[] enumC1767640w6EArr = {enumC1767640w6E, enumC1767640w6E2, enumC1767640w6E3};
        LLILLJJLI = enumC1767640w6EArr;
        LLILLL = new C2254308sP(enumC1767640w6EArr);
    }

    public static EnumC1767640w6E[] values() {
        return (EnumC1767640w6E[]) LLILLJJLI.clone();
    }

    public final boolean hasMallTab() {
        return this == BOTTOM_TAB || this == TOP_TAB;
    }

    public final boolean isMallBottomTab() {
        return this == BOTTOM_TAB;
    }

    public final boolean isMallTopTab() {
        return this == TOP_TAB;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1767640w6E valueOf(String str) {
        return (EnumC1767640w6E) C08FF.LIZ(EnumC1767640w6E.class, str);
    }

    public EnumC1767640w6E(String str, int i, int i2) {
        this.LL = i2;
    }
}
