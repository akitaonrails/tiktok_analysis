package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1672210tcJ implements InterfaceC1688870u3B {
    public static final EnumC1672210tcJ BLOCKED_ACCOUNT;
    public static final /* synthetic */ EnumC1672210tcJ[] LLIZ;
    public static final /* synthetic */ C2254308sP LLIZLLLIL;
    public static final EnumC1672210tcJ PRIVATE_ACCOUNT;
    public static final EnumC1672210tcJ VISIBILITY_SECTION_HEADER;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;

    public static InterfaceC2044707zh<EnumC1672210tcJ> getEntries() {
        return LLIZLLLIL;
    }

    static {
        EnumC1672210tcJ enumC1672210tcJ = new EnumC1672210tcJ("VISIBILITY_SECTION_HEADER", null, "visibility_section_group", "sectionVisibility", 0, true, "sectionVisibility", 33);
        VISIBILITY_SECTION_HEADER = enumC1672210tcJ;
        EnumC1672210tcJ enumC1672210tcJ2 = new EnumC1672210tcJ("PRIVATE_ACCOUNT", "private_account_entrance", null, null, 1, false, null, 62);
        PRIVATE_ACCOUNT = enumC1672210tcJ2;
        EnumC1672210tcJ enumC1672210tcJ3 = new EnumC1672210tcJ("BLOCKED_ACCOUNT", "blocked_accounts_entrance", null, null, 2, false, null, 62);
        BLOCKED_ACCOUNT = enumC1672210tcJ3;
        EnumC1672210tcJ[] enumC1672210tcJArr = {enumC1672210tcJ, enumC1672210tcJ2, enumC1672210tcJ3};
        LLIZ = enumC1672210tcJArr;
        LLIZLLLIL = new C2254308sP(enumC1672210tcJArr);
    }

    public static EnumC1672210tcJ[] values() {
        return (EnumC1672210tcJ[]) LLIZ.clone();
    }

    @Override // X.InterfaceC19211810Ea
    public String getContentType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19211810Ea
    public boolean getHeadingItem() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19211810Ea
    public String getIdentifier() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC19211810Ea
    public String getKey() {
        return this.LLILLL;
    }

    public final String getPageTag() {
        return this.LL;
    }

    @Override // X.InterfaceC19211910Eb
    public String getTag() {
        return this.LLILLJJLI;
    }

    public static EnumC1672210tcJ valueOf(String str) {
        return (EnumC1672210tcJ) C08FF.LIZ(EnumC1672210tcJ.class, str);
    }

    public EnumC1672210tcJ(String str, String str2, String str3, String str4, int i, boolean z, String str5, int i2) {
        String str6;
        str2 = (i2 & 1) != 0 ? "" : str2;
        str3 = (i2 & 2) != 0 ? str2 : str3;
        str4 = (i2 & 4) != 0 ? str2 : str4;
        str5 = (i2 & 8) != 0 ? "cellDisclosure" : str5;
        z = (i2 & 16) != 0 ? false : z;
        if ((i2 & 32) != 0) {
            str6 = str2;
        } else {
            str6 = null;
        }
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
        this.LLILZ = str5;
        this.LLILZIL = z;
        this.LLILZLL = str6;
    }
}
