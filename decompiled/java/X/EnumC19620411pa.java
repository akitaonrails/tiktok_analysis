package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19620411pa {
    public static final C19620611pc Companion;
    public static final /* synthetic */ EnumC19620411pa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19620411pa STICKER_NORMAL_DARK;
    public static final EnumC19620411pa STICKER_NORMAL_WHITE;
    public static final EnumC19620411pa STICKER_WITH_BUTTON_DARK;
    public static final EnumC19620411pa STICKER_WITH_BUTTON_WITH_WHITE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19620411pa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19620411pa enumC19620411pa = new EnumC19620411pa("STICKER_NORMAL_WHITE", 0, 0);
        STICKER_NORMAL_WHITE = enumC19620411pa;
        EnumC19620411pa enumC19620411pa2 = new EnumC19620411pa("STICKER_NORMAL_DARK", 1, 1);
        STICKER_NORMAL_DARK = enumC19620411pa2;
        EnumC19620411pa enumC19620411pa3 = new EnumC19620411pa("STICKER_WITH_BUTTON_WITH_WHITE", 2, 2);
        STICKER_WITH_BUTTON_WITH_WHITE = enumC19620411pa3;
        EnumC19620411pa enumC19620411pa4 = new EnumC19620411pa("STICKER_WITH_BUTTON_DARK", 3, 3);
        STICKER_WITH_BUTTON_DARK = enumC19620411pa4;
        EnumC19620411pa[] enumC19620411paArr = {enumC19620411pa, enumC19620411pa2, enumC19620411pa3, enumC19620411pa4};
        LLILLJJLI = enumC19620411paArr;
        LLILLL = new C2254308sP(enumC19620411paArr);
        Companion = new C19620611pc();
    }

    public static EnumC19620411pa[] values() {
        return (EnumC19620411pa[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19620411pa valueOf(String str) {
        return (EnumC19620411pa) C08FF.LIZ(EnumC19620411pa.class, str);
    }

    public EnumC19620411pa(String str, int i, int i2) {
        this.LL = i2;
    }
}
