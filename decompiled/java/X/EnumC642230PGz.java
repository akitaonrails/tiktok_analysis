package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC642230PGz {
    public static final EnumC642230PGz ENTER_MIDDLE_PAGE;
    public static final EnumC642230PGz ENTER_OTHER_BUSINESS;
    public static final EnumC642230PGz ENTER_SUG_PAGE;
    public static final /* synthetic */ EnumC642230PGz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC642230PGz ON_BACKGROUND;
    public static final EnumC642230PGz OTHERS;
    public static final EnumC642230PGz SEND_NEW_SEARCH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC642230PGz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC642230PGz enumC642230PGz = new EnumC642230PGz("ON_BACKGROUND", 0, 1);
        ON_BACKGROUND = enumC642230PGz;
        EnumC642230PGz enumC642230PGz2 = new EnumC642230PGz("ENTER_MIDDLE_PAGE", 1, 2);
        ENTER_MIDDLE_PAGE = enumC642230PGz2;
        EnumC642230PGz enumC642230PGz3 = new EnumC642230PGz("SEND_NEW_SEARCH", 2, 3);
        SEND_NEW_SEARCH = enumC642230PGz3;
        EnumC642230PGz enumC642230PGz4 = new EnumC642230PGz("ENTER_OTHER_BUSINESS", 3, 4);
        ENTER_OTHER_BUSINESS = enumC642230PGz4;
        EnumC642230PGz enumC642230PGz5 = new EnumC642230PGz("ENTER_SUG_PAGE", 4, 5);
        ENTER_SUG_PAGE = enumC642230PGz5;
        EnumC642230PGz enumC642230PGz6 = new EnumC642230PGz("OTHERS", 5, 6);
        OTHERS = enumC642230PGz6;
        EnumC642230PGz[] enumC642230PGzArr = {enumC642230PGz, enumC642230PGz2, enumC642230PGz3, enumC642230PGz4, enumC642230PGz5, enumC642230PGz6};
        LLILLJJLI = enumC642230PGzArr;
        LLILLL = new C2254308sP(enumC642230PGzArr);
    }

    public static EnumC642230PGz[] values() {
        return (EnumC642230PGz[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC642230PGz valueOf(String str) {
        return (EnumC642230PGz) C08FF.LIZ(EnumC642230PGz.class, str);
    }

    public EnumC642230PGz(String str, int i, int i2) {
        this.LL = i2;
    }
}
