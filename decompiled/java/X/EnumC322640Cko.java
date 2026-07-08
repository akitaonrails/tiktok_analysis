package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC322640Cko {
    public static final /* synthetic */ EnumC322640Cko[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC322640Cko LOCATE_BOTTOM_MESSAGE;
    public static final EnumC322640Cko LOCATE_BOTTOM_SUG;
    public static final EnumC322640Cko LOCATE_CUSTOM;
    public static final EnumC322640Cko LOCATE_TOP_COMPLETE_MESSAGE;
    public static final EnumC322640Cko LOCATE_TOP_MESSAGE;
    public static final EnumC322640Cko LOCATE_TOP_NOT_VISIBLE_MESSAGE;
    public static final EnumC322640Cko LOCATE_TOP_PARTIAL_MESSAGE;
    public static final EnumC322640Cko NORMAL;

    public static InterfaceC2044707zh<EnumC322640Cko> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC322640Cko enumC322640Cko = new EnumC322640Cko("NORMAL", 0);
        NORMAL = enumC322640Cko;
        EnumC322640Cko enumC322640Cko2 = new EnumC322640Cko("LOCATE_TOP_PARTIAL_MESSAGE", 1);
        LOCATE_TOP_PARTIAL_MESSAGE = enumC322640Cko2;
        EnumC322640Cko enumC322640Cko3 = new EnumC322640Cko("LOCATE_TOP_NOT_VISIBLE_MESSAGE", 2);
        LOCATE_TOP_NOT_VISIBLE_MESSAGE = enumC322640Cko3;
        EnumC322640Cko enumC322640Cko4 = new EnumC322640Cko("LOCATE_TOP_COMPLETE_MESSAGE", 3);
        LOCATE_TOP_COMPLETE_MESSAGE = enumC322640Cko4;
        EnumC322640Cko enumC322640Cko5 = new EnumC322640Cko("LOCATE_BOTTOM_MESSAGE", 4);
        LOCATE_BOTTOM_MESSAGE = enumC322640Cko5;
        EnumC322640Cko enumC322640Cko6 = new EnumC322640Cko("LOCATE_BOTTOM_SUG", 5);
        LOCATE_BOTTOM_SUG = enumC322640Cko6;
        EnumC322640Cko enumC322640Cko7 = new EnumC322640Cko("LOCATE_TOP_MESSAGE", 6);
        LOCATE_TOP_MESSAGE = enumC322640Cko7;
        EnumC322640Cko enumC322640Cko8 = new EnumC322640Cko("LOCATE_CUSTOM", 7);
        LOCATE_CUSTOM = enumC322640Cko8;
        EnumC322640Cko[] enumC322640CkoArr = {enumC322640Cko, enumC322640Cko2, enumC322640Cko3, enumC322640Cko4, enumC322640Cko5, enumC322640Cko6, enumC322640Cko7, enumC322640Cko8};
        LL = enumC322640CkoArr;
        LLILLJJLI = new C2254308sP(enumC322640CkoArr);
    }

    public static EnumC322640Cko[] values() {
        return (EnumC322640Cko[]) LL.clone();
    }

    public static EnumC322640Cko valueOf(String str) {
        return (EnumC322640Cko) C08FF.LIZ(EnumC322640Cko.class, str);
    }

    public EnumC322640Cko(String str, int i) {
    }
}
