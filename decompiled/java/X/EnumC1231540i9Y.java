package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i9Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1231540i9Y {
    public static final EnumC1231540i9Y DM_CARD;
    public static final EnumC1231540i9Y FRIENDS_INTRO_VIDEO;
    public static final EnumC1231540i9Y FRIENDS_POPUP;
    public static final EnumC1231540i9Y INBOX_POPUP;
    public static final /* synthetic */ EnumC1231540i9Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1231540i9Y MARKETING_POST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1231540i9Y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1231540i9Y enumC1231540i9Y = new EnumC1231540i9Y("INBOX_POPUP", 0, "inbox_popup");
        INBOX_POPUP = enumC1231540i9Y;
        EnumC1231540i9Y enumC1231540i9Y2 = new EnumC1231540i9Y("MARKETING_POST", 1, "marketing_post");
        MARKETING_POST = enumC1231540i9Y2;
        EnumC1231540i9Y enumC1231540i9Y3 = new EnumC1231540i9Y("FRIENDS_POPUP", 2, "friends_popup");
        FRIENDS_POPUP = enumC1231540i9Y3;
        EnumC1231540i9Y enumC1231540i9Y4 = new EnumC1231540i9Y("DM_CARD", 3, "dm_card");
        DM_CARD = enumC1231540i9Y4;
        EnumC1231540i9Y enumC1231540i9Y5 = new EnumC1231540i9Y("FRIENDS_INTRO_VIDEO", 4, "friends_intro_video");
        FRIENDS_INTRO_VIDEO = enumC1231540i9Y5;
        EnumC1231540i9Y[] enumC1231540i9YArr = {enumC1231540i9Y, enumC1231540i9Y2, enumC1231540i9Y3, enumC1231540i9Y4, enumC1231540i9Y5};
        LLILLJJLI = enumC1231540i9YArr;
        LLILLL = new C2254308sP(enumC1231540i9YArr);
    }

    public static EnumC1231540i9Y[] values() {
        return (EnumC1231540i9Y[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC1231540i9Y valueOf(String str) {
        return (EnumC1231540i9Y) C08FF.LIZ(EnumC1231540i9Y.class, str);
    }

    public EnumC1231540i9Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
