package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1908850zlz {
    public static final C1908900zm4 Companion;
    public static final EnumC1908850zlz INBOX_FIRST_PAGE;
    public static final /* synthetic */ EnumC1908850zlz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1908850zlz NEW_ACTIVITIES;
    public static final EnumC1908850zlz NEW_FOLLOWERS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1908850zlz> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0zm4] */
    static {
        EnumC1908850zlz enumC1908850zlz = new EnumC1908850zlz("INBOX_FIRST_PAGE", 0, "inbox_first_page");
        INBOX_FIRST_PAGE = enumC1908850zlz;
        EnumC1908850zlz enumC1908850zlz2 = new EnumC1908850zlz("NEW_FOLLOWERS", 1, "new_followers");
        NEW_FOLLOWERS = enumC1908850zlz2;
        EnumC1908850zlz enumC1908850zlz3 = new EnumC1908850zlz("NEW_ACTIVITIES", 2, "new_activities");
        NEW_ACTIVITIES = enumC1908850zlz3;
        EnumC1908850zlz[] enumC1908850zlzArr = {enumC1908850zlz, enumC1908850zlz2, enumC1908850zlz3};
        LLILLJJLI = enumC1908850zlzArr;
        LLILLL = new C2254308sP(enumC1908850zlzArr);
        Companion = new Object() { // from class: X.0zm4
        };
    }

    public static EnumC1908850zlz[] values() {
        return (EnumC1908850zlz[]) LLILLJJLI.clone();
    }

    public final String getPosition() {
        return this.LL;
    }

    public static EnumC1908850zlz valueOf(String str) {
        return (EnumC1908850zlz) C08FF.LIZ(EnumC1908850zlz.class, str);
    }

    public EnumC1908850zlz(String str, int i, String str2) {
        this.LL = str2;
    }
}
