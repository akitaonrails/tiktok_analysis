package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1602400rni {
    public static final EnumC1602400rni BACKGROUND;
    public static final /* synthetic */ EnumC1602400rni[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1602400rni SWITCH_PAGE;
    public static final EnumC1602400rni SWITCH_TAB;

    public static InterfaceC2044707zh<EnumC1602400rni> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1602400rni enumC1602400rni = new EnumC1602400rni("SWITCH_TAB", 0);
        SWITCH_TAB = enumC1602400rni;
        EnumC1602400rni enumC1602400rni2 = new EnumC1602400rni("SWITCH_PAGE", 1);
        SWITCH_PAGE = enumC1602400rni2;
        EnumC1602400rni enumC1602400rni3 = new EnumC1602400rni("BACKGROUND", 2);
        BACKGROUND = enumC1602400rni3;
        EnumC1602400rni[] enumC1602400rniArr = {enumC1602400rni, enumC1602400rni2, enumC1602400rni3};
        LL = enumC1602400rniArr;
        LLILLJJLI = new C2254308sP(enumC1602400rniArr);
    }

    public static EnumC1602400rni[] values() {
        return (EnumC1602400rni[]) LL.clone();
    }

    public static EnumC1602400rni valueOf(String str) {
        return (EnumC1602400rni) C08FF.LIZ(EnumC1602400rni.class, str);
    }

    public EnumC1602400rni(String str, int i) {
    }
}
