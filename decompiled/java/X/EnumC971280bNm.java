package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC971280bNm {
    public static final EnumC971280bNm INVISIBLE;
    public static final /* synthetic */ EnumC971280bNm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC971280bNm SHOW_BORDER;
    public static final EnumC971280bNm SHOW_BTN_BORDER;
    public static final EnumC971280bNm SHOW_DEFAULT;
    public static final EnumC971280bNm SHOW_DOTTED;
    public static final EnumC971280bNm SHOW_DOTTED_DEFAULT;

    public static InterfaceC2044707zh<EnumC971280bNm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC971280bNm enumC971280bNm = new EnumC971280bNm("INVISIBLE", 0);
        INVISIBLE = enumC971280bNm;
        EnumC971280bNm enumC971280bNm2 = new EnumC971280bNm("SHOW_BTN_BORDER", 1);
        SHOW_BTN_BORDER = enumC971280bNm2;
        EnumC971280bNm enumC971280bNm3 = new EnumC971280bNm("SHOW_DEFAULT", 2);
        SHOW_DEFAULT = enumC971280bNm3;
        EnumC971280bNm enumC971280bNm4 = new EnumC971280bNm("SHOW_DOTTED_DEFAULT", 3);
        SHOW_DOTTED_DEFAULT = enumC971280bNm4;
        EnumC971280bNm enumC971280bNm5 = new EnumC971280bNm("SHOW_DOTTED", 4);
        SHOW_DOTTED = enumC971280bNm5;
        EnumC971280bNm enumC971280bNm6 = new EnumC971280bNm("SHOW_BORDER", 5);
        SHOW_BORDER = enumC971280bNm6;
        EnumC971280bNm[] enumC971280bNmArr = {enumC971280bNm, enumC971280bNm2, enumC971280bNm3, enumC971280bNm4, enumC971280bNm5, enumC971280bNm6};
        LL = enumC971280bNmArr;
        LLILLJJLI = new C2254308sP(enumC971280bNmArr);
    }

    public static EnumC971280bNm[] values() {
        return (EnumC971280bNm[]) LL.clone();
    }

    public static EnumC971280bNm valueOf(String str) {
        return (EnumC971280bNm) C08FF.LIZ(EnumC971280bNm.class, str);
    }

    public EnumC971280bNm(String str, int i) {
    }
}
