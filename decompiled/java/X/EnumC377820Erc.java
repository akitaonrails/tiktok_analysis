package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Erc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC377820Erc {
    public static final EnumC377820Erc CREATE_TAB_VIDEO;
    public static final EnumC377820Erc EP_AIGC_T2I;
    public static final EnumC377820Erc EP_AIGC_T2V;
    public static final /* synthetic */ EnumC377820Erc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC377820Erc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC377820Erc enumC377820Erc = new EnumC377820Erc("EP_AIGC_T2I", 0, "ep_aigc_t2i");
        EP_AIGC_T2I = enumC377820Erc;
        EnumC377820Erc enumC377820Erc2 = new EnumC377820Erc("EP_AIGC_T2V", 1, "ep_aigc_t2v");
        EP_AIGC_T2V = enumC377820Erc2;
        EnumC377820Erc enumC377820Erc3 = new EnumC377820Erc("CREATE_TAB_VIDEO", 2, "create_tab_video");
        CREATE_TAB_VIDEO = enumC377820Erc3;
        EnumC377820Erc[] enumC377820ErcArr = {enumC377820Erc, enumC377820Erc2, enumC377820Erc3};
        LLILLJJLI = enumC377820ErcArr;
        LLILLL = new C2254308sP(enumC377820ErcArr);
    }

    public static EnumC377820Erc[] values() {
        return (EnumC377820Erc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC377820Erc valueOf(String str) {
        return (EnumC377820Erc) C08FF.LIZ(EnumC377820Erc.class, str);
    }

    public EnumC377820Erc(String str, int i, String str2) {
        this.LL = str2;
    }
}
