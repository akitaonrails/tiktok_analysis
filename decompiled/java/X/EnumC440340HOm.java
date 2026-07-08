package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440340HOm {
    public static final EnumC440340HOm HOME_PAGE;
    public static final /* synthetic */ EnumC440340HOm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440340HOm TEXT_INPUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440340HOm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440340HOm enumC440340HOm = new EnumC440340HOm("HOME_PAGE", 0, "generating_avatar_page");
        HOME_PAGE = enumC440340HOm;
        EnumC440340HOm enumC440340HOm2 = new EnumC440340HOm("TEXT_INPUT", 1, "studio_text_input_page");
        TEXT_INPUT = enumC440340HOm2;
        EnumC440340HOm[] enumC440340HOmArr = {enumC440340HOm, enumC440340HOm2};
        LLILLJJLI = enumC440340HOmArr;
        LLILLL = new C2254308sP(enumC440340HOmArr);
    }

    public static EnumC440340HOm[] values() {
        return (EnumC440340HOm[]) LLILLJJLI.clone();
    }

    public final EnumC440360HOo toEnterGenerationPanelEnterMethod() {
        int i = C440350HOn.LIZ[ordinal()];
        if (i == 1) {
            return EnumC440360HOo.HOME_PAGE;
        }
        if (i == 2) {
            return EnumC440360HOo.TEXT_INPUT;
        }
        throw new C1954807lC();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440340HOm valueOf(String str) {
        return (EnumC440340HOm) C08FF.LIZ(EnumC440340HOm.class, str);
    }

    public EnumC440340HOm(String str, int i, String str2) {
        this.LL = str2;
    }
}
