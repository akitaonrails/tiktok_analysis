package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ejH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1099930ejH {
    public static final EnumC1099930ejH ICON;
    public static final EnumC1099930ejH ICON_WITH_TEXT;
    public static final EnumC1099930ejH LANDSCAPE_ICON;
    public static final /* synthetic */ EnumC1099930ejH[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final EnumC1099940ejI LL;
    public final C1099950ejJ LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1099930ejH> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1099930ejH enumC1099930ejH = new EnumC1099930ejH("ICON", 0, EnumC1099940ejI.ICON, new C1099950ejJ(false));
        ICON = enumC1099930ejH;
        EnumC1099930ejH enumC1099930ejH2 = new EnumC1099930ejH("ICON_WITH_TEXT", 1, EnumC1099940ejI.ICON_WITH_TEXT, new C1099950ejJ(true));
        ICON_WITH_TEXT = enumC1099930ejH2;
        EnumC1099930ejH enumC1099930ejH3 = new EnumC1099930ejH("LANDSCAPE_ICON", 2, EnumC1099940ejI.ICON_LAND, new C1099950ejJ(false));
        LANDSCAPE_ICON = enumC1099930ejH3;
        EnumC1099930ejH[] enumC1099930ejHArr = {enumC1099930ejH, enumC1099930ejH2, enumC1099930ejH3};
        LLILLL = enumC1099930ejHArr;
        LLILZ = new C2254308sP(enumC1099930ejHArr);
    }

    public static EnumC1099930ejH[] values() {
        return (EnumC1099930ejH[]) LLILLL.clone();
    }

    public final EnumC1099940ejI getLayoutStyle() {
        return this.LL;
    }

    public final C1099950ejJ getStyleDesc() {
        return this.LLILLJJLI;
    }

    public static EnumC1099930ejH valueOf(String str) {
        return (EnumC1099930ejH) C08FF.LIZ(EnumC1099930ejH.class, str);
    }

    public EnumC1099930ejH(String str, int i, EnumC1099940ejI enumC1099940ejI, C1099950ejJ c1099950ejJ) {
        this.LL = enumC1099940ejI;
        this.LLILLJJLI = c1099950ejJ;
    }
}
