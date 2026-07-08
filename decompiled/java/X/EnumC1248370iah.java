package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1248370iah {
    public static final EnumC1248370iah ACCOUNT_STATUS;
    public static final EnumC1248370iah AVATAR;
    public static final EnumC1248370iah BACKGROUND;
    public static final EnumC1248370iah BIO;
    public static final EnumC1248370iah CTA;
    public static final EnumC1248370iah INFO;
    public static final EnumC1248370iah INTERACTION;
    public static final /* synthetic */ EnumC1248370iah[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1248370iah NAV;
    public static final EnumC1248370iah STUDIO_APP;
    public static final EnumC1248370iah TAB;

    public static InterfaceC2044707zh<EnumC1248370iah> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1248370iah enumC1248370iah = new EnumC1248370iah("NAV", 0);
        NAV = enumC1248370iah;
        EnumC1248370iah enumC1248370iah2 = new EnumC1248370iah("CTA", 1);
        CTA = enumC1248370iah2;
        EnumC1248370iah enumC1248370iah3 = new EnumC1248370iah("BIO", 2);
        BIO = enumC1248370iah3;
        EnumC1248370iah enumC1248370iah4 = new EnumC1248370iah("INTERACTION", 3);
        INTERACTION = enumC1248370iah4;
        EnumC1248370iah enumC1248370iah5 = new EnumC1248370iah("TAB", 4);
        TAB = enumC1248370iah5;
        EnumC1248370iah enumC1248370iah6 = new EnumC1248370iah("AVATAR", 5);
        AVATAR = enumC1248370iah6;
        EnumC1248370iah enumC1248370iah7 = new EnumC1248370iah("INFO", 6);
        INFO = enumC1248370iah7;
        EnumC1248370iah enumC1248370iah8 = new EnumC1248370iah("ACCOUNT_STATUS", 7);
        ACCOUNT_STATUS = enumC1248370iah8;
        EnumC1248370iah enumC1248370iah9 = new EnumC1248370iah("STUDIO_APP", 8);
        STUDIO_APP = enumC1248370iah9;
        EnumC1248370iah enumC1248370iah10 = new EnumC1248370iah("BACKGROUND", 9);
        BACKGROUND = enumC1248370iah10;
        EnumC1248370iah[] enumC1248370iahArr = {enumC1248370iah, enumC1248370iah2, enumC1248370iah3, enumC1248370iah4, enumC1248370iah5, enumC1248370iah6, enumC1248370iah7, enumC1248370iah8, enumC1248370iah9, enumC1248370iah10};
        LL = enumC1248370iahArr;
        LLILLJJLI = new C2254308sP(enumC1248370iahArr);
    }

    public static EnumC1248370iah[] values() {
        return (EnumC1248370iah[]) LL.clone();
    }

    public static EnumC1248370iah valueOf(String str) {
        return (EnumC1248370iah) C08FF.LIZ(EnumC1248370iah.class, str);
    }

    public EnumC1248370iah(String str, int i) {
    }
}
