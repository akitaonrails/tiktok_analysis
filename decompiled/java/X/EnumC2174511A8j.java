package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2174511A8j implements InterfaceC19211810Ea {
    public static final EnumC2174511A8j ACCOUNT_ITEM;
    public static final EnumC2174511A8j ANALYTICS;
    public static final /* synthetic */ EnumC2174511A8j[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC2174511A8j ORDERS;
    public static final EnumC2174511A8j PRIVACY;
    public static final EnumC2174511A8j QRCODE;
    public static final EnumC2174511A8j REFERRAL_INVITE_FRIENDS;
    public static final EnumC2174511A8j SECTION_HEADER;
    public static final EnumC2174511A8j SECURITY_AND_PERMISSIONS;
    public static final EnumC2174511A8j SHARE_PROFILE;
    public static final EnumC2174511A8j SIGNUP;
    public static final EnumC2174511A8j TIKTOK_PLUS;
    public static final EnumC2174511A8j WALLET;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public static InterfaceC2044707zh<EnumC2174511A8j> getEntries() {
        return LLIZ;
    }

    static {
        EnumC2174511A8j enumC2174511A8j = new EnumC2174511A8j("SECTION_HEADER", "account_section_group", "sectionAccount", "sectionAccount", null, 0, true, 16);
        SECTION_HEADER = enumC2174511A8j;
        EnumC2174511A8j enumC2174511A8j2 = new EnumC2174511A8j("SIGNUP", "sign_up", "signUp", null, "my_account", 1, false, 12);
        SIGNUP = enumC2174511A8j2;
        EnumC2174511A8j enumC2174511A8j3 = new EnumC2174511A8j("ACCOUNT_ITEM", "account_and_safety", "account", null, "account", 2, false, 12);
        ACCOUNT_ITEM = enumC2174511A8j3;
        EnumC2174511A8j enumC2174511A8j4 = new EnumC2174511A8j("PRIVACY", "privacy_manager", "privacy", null, "privacy", 3, false, 12);
        PRIVACY = enumC2174511A8j4;
        EnumC2174511A8j enumC2174511A8j5 = new EnumC2174511A8j("SECURITY_AND_PERMISSIONS", "security_center", "security", null, "security_and_permissions", 4, false, 12);
        SECURITY_AND_PERMISSIONS = enumC2174511A8j5;
        EnumC2174511A8j enumC2174511A8j6 = new EnumC2174511A8j("ANALYTICS", "analytics", "analytics", null, "analytics", 5, false, 12);
        ANALYTICS = enumC2174511A8j6;
        EnumC2174511A8j enumC2174511A8j7 = new EnumC2174511A8j("ORDERS", "order_center", "order", null, "orders", 6, false, 12);
        ORDERS = enumC2174511A8j7;
        EnumC2174511A8j enumC2174511A8j8 = new EnumC2174511A8j("WALLET", "my_wallet", "wallet", null, "wallet", 7, false, 12);
        WALLET = enumC2174511A8j8;
        EnumC2174511A8j enumC2174511A8j9 = new EnumC2174511A8j("QRCODE", "my_qr_code", "qrcode", null, "qr_code", 8, false, 12);
        QRCODE = enumC2174511A8j9;
        EnumC2174511A8j enumC2174511A8j10 = new EnumC2174511A8j("SHARE_PROFILE", "share_profile", "shareProfile", null, "share_profile", 9, false, 12);
        SHARE_PROFILE = enumC2174511A8j10;
        EnumC2174511A8j enumC2174511A8j11 = new EnumC2174511A8j("TIKTOK_PLUS", "tiktok_plus_benefits", "plus", null, "tiktok_plus", 10, false, 12);
        TIKTOK_PLUS = enumC2174511A8j11;
        EnumC2174511A8j enumC2174511A8j12 = new EnumC2174511A8j("REFERRAL_INVITE_FRIENDS", "referral_invite_friends", "referralInviteFriends", null, "referral_invite_friends", 11, false, 12);
        REFERRAL_INVITE_FRIENDS = enumC2174511A8j12;
        EnumC2174511A8j[] enumC2174511A8jArr = {enumC2174511A8j, enumC2174511A8j2, enumC2174511A8j3, enumC2174511A8j4, enumC2174511A8j5, enumC2174511A8j6, enumC2174511A8j7, enumC2174511A8j8, enumC2174511A8j9, enumC2174511A8j10, enumC2174511A8j11, enumC2174511A8j12};
        LLILZLL = enumC2174511A8jArr;
        LLIZ = new C2254308sP(enumC2174511A8jArr);
    }

    public static EnumC2174511A8j[] values() {
        return (EnumC2174511A8j[]) LLILZLL.clone();
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

    public static EnumC2174511A8j valueOf(String str) {
        return (EnumC2174511A8j) C08FF.LIZ(EnumC2174511A8j.class, str);
    }

    public EnumC2174511A8j(String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2) {
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
