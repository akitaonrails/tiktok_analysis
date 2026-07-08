package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584510MwD {
    public static final /* synthetic */ EnumC584510MwD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584510MwD S_PAGE_SELECT;
    public static final EnumC584510MwD S_PAGE_SETTLING;
    public static final EnumC584510MwD S_PAGE_TRY_PLAY;
    public static final EnumC584510MwD S_SCROLL_TO_ITEM;

    public static InterfaceC2044707zh<EnumC584510MwD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584510MwD enumC584510MwD = new EnumC584510MwD("S_PAGE_SETTLING", 0);
        S_PAGE_SETTLING = enumC584510MwD;
        EnumC584510MwD enumC584510MwD2 = new EnumC584510MwD("S_SCROLL_TO_ITEM", 1);
        S_SCROLL_TO_ITEM = enumC584510MwD2;
        EnumC584510MwD enumC584510MwD3 = new EnumC584510MwD("S_PAGE_SELECT", 2);
        S_PAGE_SELECT = enumC584510MwD3;
        EnumC584510MwD enumC584510MwD4 = new EnumC584510MwD("S_PAGE_TRY_PLAY", 3);
        S_PAGE_TRY_PLAY = enumC584510MwD4;
        EnumC584510MwD[] enumC584510MwDArr = {enumC584510MwD, enumC584510MwD2, enumC584510MwD3, enumC584510MwD4};
        LL = enumC584510MwDArr;
        LLILLJJLI = new C2254308sP(enumC584510MwDArr);
    }

    public static EnumC584510MwD[] values() {
        return (EnumC584510MwD[]) LL.clone();
    }

    public static EnumC584510MwD valueOf(String str) {
        return (EnumC584510MwD) C08FF.LIZ(EnumC584510MwD.class, str);
    }

    public EnumC584510MwD(String str, int i) {
    }
}
