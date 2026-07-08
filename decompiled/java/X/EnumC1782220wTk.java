package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782220wTk {
    public static final /* synthetic */ EnumC1782220wTk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782220wTk MAIN_PAGE;
    public static final EnumC1782220wTk OPT_IN;

    public static InterfaceC2044707zh<EnumC1782220wTk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782220wTk enumC1782220wTk = new EnumC1782220wTk("MAIN_PAGE", 0);
        MAIN_PAGE = enumC1782220wTk;
        EnumC1782220wTk enumC1782220wTk2 = new EnumC1782220wTk("OPT_IN", 1);
        OPT_IN = enumC1782220wTk2;
        EnumC1782220wTk[] enumC1782220wTkArr = {enumC1782220wTk, enumC1782220wTk2};
        LL = enumC1782220wTkArr;
        LLILLJJLI = new C2254308sP(enumC1782220wTkArr);
    }

    public static EnumC1782220wTk[] values() {
        return (EnumC1782220wTk[]) LL.clone();
    }

    public static EnumC1782220wTk valueOf(String str) {
        return (EnumC1782220wTk) C08FF.LIZ(EnumC1782220wTk.class, str);
    }

    public EnumC1782220wTk(String str, int i) {
    }
}
