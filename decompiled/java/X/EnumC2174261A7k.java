package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2174261A7k implements InterfaceC19211810Ea {
    public static final /* synthetic */ EnumC2174261A7k[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC2174261A7k LOGOUT;
    public static final EnumC2174261A7k SECTION_HEADER;
    public static final EnumC2174261A7k SWITCH_ACCOUNT;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public static InterfaceC2044707zh<EnumC2174261A7k> getEntries() {
        return LLIZ;
    }

    static {
        EnumC2174261A7k enumC2174261A7k = new EnumC2174261A7k("SECTION_HEADER", "login_group", "sectionLogin", "sectionLogin", null, 0, true, 16);
        SECTION_HEADER = enumC2174261A7k;
        EnumC2174261A7k enumC2174261A7k2 = new EnumC2174261A7k("SWITCH_ACCOUNT", "switch_account", "switchAccount", null, "switch_account", 1, false, 12);
        SWITCH_ACCOUNT = enumC2174261A7k2;
        EnumC2174261A7k enumC2174261A7k3 = new EnumC2174261A7k("LOGOUT", "log_out", "logout", null, "log_out", 2, false, 12);
        LOGOUT = enumC2174261A7k3;
        EnumC2174261A7k[] enumC2174261A7kArr = {enumC2174261A7k, enumC2174261A7k2, enumC2174261A7k3};
        LLILZLL = enumC2174261A7kArr;
        LLIZ = new C2254308sP(enumC2174261A7kArr);
    }

    public static EnumC2174261A7k[] values() {
        return (EnumC2174261A7k[]) LLILZLL.clone();
    }

    @Override // X.InterfaceC19211810Ea
    public String getContentType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC19211810Ea
    public boolean getHeadingItem() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19211810Ea
    public String getIdentifier() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19211810Ea
    public String getKey() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19211910Eb
    public String getTag() {
        return this.LL;
    }

    public static EnumC2174261A7k valueOf(String str) {
        return (EnumC2174261A7k) C08FF.LIZ(EnumC2174261A7k.class, str);
    }

    public EnumC2174261A7k(String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2) {
        str4 = (i2 & 4) != 0 ? "cellDisclosure" : str4;
        z = (i2 & 8) != 0 ? false : z;
        str5 = (i2 & 16) != 0 ? "" : str5;
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
        this.LLILZ = z;
        this.LLILZIL = str5;
    }
}
