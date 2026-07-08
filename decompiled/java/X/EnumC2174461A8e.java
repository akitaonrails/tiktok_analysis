package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2174461A8e implements InterfaceC19211810Ea {
    public static final EnumC2174461A8e ANALYTICS_CENTER;
    public static final EnumC2174461A8e CONTENT_PREFERENCE;
    public static final EnumC2174461A8e FAMILY_PAIRING;
    public static final EnumC2174461A8e LIVE_SETTINGS;
    public static final /* synthetic */ EnumC2174461A8e[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC2174461A8e MANAGE_POSTS;
    public static final EnumC2174461A8e NOTIFICATION_SETTINGS;
    public static final EnumC2174461A8e SCREEN_TIME;
    public static final EnumC2174461A8e SECTION_HEADER;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public static InterfaceC2044707zh<EnumC2174461A8e> getEntries() {
        return LLIZ;
    }

    static {
        EnumC2174461A8e enumC2174461A8e = new EnumC2174461A8e("SECTION_HEADER", "top_section_group", "sectionTop", "sectionTop", null, 0, true, 16);
        SECTION_HEADER = enumC2174461A8e;
        EnumC2174461A8e enumC2174461A8e2 = new EnumC2174461A8e("ANALYTICS_CENTER", "activity_center", "activityCenter", null, "activity_center", 1, false, 12);
        ANALYTICS_CENTER = enumC2174461A8e2;
        EnumC2174461A8e enumC2174461A8e3 = new EnumC2174461A8e("MANAGE_POSTS", "manage_posts", "manage_posts", null, "manage_posts", 2, false, 12);
        MANAGE_POSTS = enumC2174461A8e3;
        EnumC2174461A8e enumC2174461A8e4 = new EnumC2174461A8e("CONTENT_PREFERENCE", "content_preference", "top_contentPreference", null, "content_preferences", 3, false, 12);
        CONTENT_PREFERENCE = enumC2174461A8e4;
        EnumC2174461A8e enumC2174461A8e5 = new EnumC2174461A8e("LIVE_SETTINGS", "live", "live", null, "live", 4, false, 12);
        LIVE_SETTINGS = enumC2174461A8e5;
        EnumC2174461A8e enumC2174461A8e6 = new EnumC2174461A8e("NOTIFICATION_SETTINGS", "notification_manager", "top_notification", null, "notifications", 5, false, 12);
        NOTIFICATION_SETTINGS = enumC2174461A8e6;
        EnumC2174461A8e enumC2174461A8e7 = new EnumC2174461A8e("SCREEN_TIME", "digital_wellbeing", "top_screenTime", null, "time_and_well_being", 6, false, 12);
        SCREEN_TIME = enumC2174461A8e7;
        EnumC2174461A8e enumC2174461A8e8 = new EnumC2174461A8e("FAMILY_PAIRING", "family_pairing", "top_familyPairing", null, "family_pairing", 7, false, 12);
        FAMILY_PAIRING = enumC2174461A8e8;
        EnumC2174461A8e[] enumC2174461A8eArr = {enumC2174461A8e, enumC2174461A8e2, enumC2174461A8e3, enumC2174461A8e4, enumC2174461A8e5, enumC2174461A8e6, enumC2174461A8e7, enumC2174461A8e8};
        LLILZLL = enumC2174461A8eArr;
        LLIZ = new C2254308sP(enumC2174461A8eArr);
    }

    public static EnumC2174461A8e[] values() {
        return (EnumC2174461A8e[]) LLILZLL.clone();
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

    public static EnumC2174461A8e valueOf(String str) {
        return (EnumC2174461A8e) C08FF.LIZ(EnumC2174461A8e.class, str);
    }

    public EnumC2174461A8e(String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2) {
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
