package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2174421A8a implements InterfaceC19211810Ea {
    public static final EnumC2174421A8a ABOUT;
    public static final EnumC2174421A8a ACCOUNT_DELETION;
    public static final EnumC2174421A8a BASE_SETTINGS;
    public static final EnumC2174421A8a FEEDBACK;
    public static final /* synthetic */ EnumC2174421A8a[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC2174421A8a OPEN_DEBUG;
    public static final EnumC2174421A8a POLICY_UPDATE;
    public static final EnumC2174421A8a PRIVACY_CENTER;
    public static final EnumC2174421A8a PRIVACY_CHECKUP;
    public static final EnumC2174421A8a SECTION_HEADER;
    public static final EnumC2174421A8a SUPPORT;
    public static final EnumC2174421A8a WHATS_NEW;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public static InterfaceC2044707zh<EnumC2174421A8a> getEntries() {
        return LLIZ;
    }

    static {
        EnumC2174421A8a enumC2174421A8a = new EnumC2174421A8a("SECTION_HEADER", "support_settings_group", "sectionSupport", "sectionSupport", null, 0, true, 16);
        SECTION_HEADER = enumC2174421A8a;
        EnumC2174421A8a enumC2174421A8a2 = new EnumC2174421A8a("BASE_SETTINGS", "beta", "beta", null, "tiktok_beta", 1, false, 12);
        BASE_SETTINGS = enumC2174421A8a2;
        EnumC2174421A8a enumC2174421A8a3 = new EnumC2174421A8a("FEEDBACK", "feedback_and_help", "feedback", null, "feed_back", 2, false, 12);
        FEEDBACK = enumC2174421A8a3;
        EnumC2174421A8a enumC2174421A8a4 = new EnumC2174421A8a("PRIVACY_CENTER", "privacy_center_settings", "privacy_center", null, "privacy_center", 3, false, 12);
        PRIVACY_CENTER = enumC2174421A8a4;
        EnumC2174421A8a enumC2174421A8a5 = new EnumC2174421A8a("PRIVACY_CHECKUP", "privacy_checkup_settings", "privacy_checkup", null, "privacy_checkup", 4, false, 12);
        PRIVACY_CHECKUP = enumC2174421A8a5;
        EnumC2174421A8a enumC2174421A8a6 = new EnumC2174421A8a("SUPPORT", "support", "support", null, "support", 5, false, 12);
        SUPPORT = enumC2174421A8a6;
        EnumC2174421A8a enumC2174421A8a7 = new EnumC2174421A8a("ACCOUNT_DELETION", "account_deletion", "account_deletion", null, "deactivate_or_delete_account", 6, false, 12);
        ACCOUNT_DELETION = enumC2174421A8a7;
        EnumC2174421A8a enumC2174421A8a8 = new EnumC2174421A8a("ABOUT", "about_settings", "about", null, "terms_and_policies", 7, false, 12);
        ABOUT = enumC2174421A8a8;
        EnumC2174421A8a enumC2174421A8a9 = new EnumC2174421A8a("POLICY_UPDATE", "policy_update", "policyUpdate", null, "policy_update", 8, false, 12);
        POLICY_UPDATE = enumC2174421A8a9;
        EnumC2174421A8a enumC2174421A8a10 = new EnumC2174421A8a("OPEN_DEBUG", "open_debug", "openDebug", null, "open_debug", 9, false, 12);
        OPEN_DEBUG = enumC2174421A8a10;
        EnumC2174421A8a enumC2174421A8a11 = new EnumC2174421A8a("WHATS_NEW", "whats_new", "whatsNew", null, "whats_new", 10, false, 12);
        WHATS_NEW = enumC2174421A8a11;
        EnumC2174421A8a[] enumC2174421A8aArr = {enumC2174421A8a, enumC2174421A8a2, enumC2174421A8a3, enumC2174421A8a4, enumC2174421A8a5, enumC2174421A8a6, enumC2174421A8a7, enumC2174421A8a8, enumC2174421A8a9, enumC2174421A8a10, enumC2174421A8a11};
        LLILZLL = enumC2174421A8aArr;
        LLIZ = new C2254308sP(enumC2174421A8aArr);
    }

    public static EnumC2174421A8a[] values() {
        return (EnumC2174421A8a[]) LLILZLL.clone();
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

    public static EnumC2174421A8a valueOf(String str) {
        return (EnumC2174421A8a) C08FF.LIZ(EnumC2174421A8a.class, str);
    }

    public EnumC2174421A8a(String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2) {
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
