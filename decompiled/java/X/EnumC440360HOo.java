package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440360HOo {
    public static final EnumC440360HOo DIRECT;
    public static final EnumC440360HOo HOME_PAGE;
    public static final /* synthetic */ EnumC440360HOo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440360HOo TEXT_INPUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440360HOo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440360HOo enumC440360HOo = new EnumC440360HOo("TEXT_INPUT", 0, "studio_text_input_page");
        TEXT_INPUT = enumC440360HOo;
        EnumC440360HOo enumC440360HOo2 = new EnumC440360HOo("HOME_PAGE", 1, "studio_home_page");
        HOME_PAGE = enumC440360HOo2;
        EnumC440360HOo enumC440360HOo3 = new EnumC440360HOo("DIRECT", 2, "direct");
        DIRECT = enumC440360HOo3;
        EnumC440360HOo[] enumC440360HOoArr = {enumC440360HOo, enumC440360HOo2, enumC440360HOo3};
        LLILLJJLI = enumC440360HOoArr;
        LLILLL = new C2254308sP(enumC440360HOoArr);
    }

    public static EnumC440360HOo[] values() {
        return (EnumC440360HOo[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440360HOo valueOf(String str) {
        return (EnumC440360HOo) C08FF.LIZ(EnumC440360HOo.class, str);
    }

    public EnumC440360HOo(String str, int i, String str2) {
        this.LL = str2;
    }
}
