package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC560410LyR {
    public static final EnumC560410LyR APP_KILLED;
    public static final EnumC560410LyR APP_LEAVE;
    public static final EnumC560410LyR CLOSE_UPLOAD_PAGE;
    public static final EnumC560410LyR CLOSE_VIDEO_SHOOT_PAGE;
    public static final /* synthetic */ EnumC560410LyR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC560410LyR OTHERS;
    public static final EnumC560410LyR PUBLISH;
    public static final EnumC560410LyR SAVE_DRAFT;
    public static final EnumC560410LyR SCREEN_LOCK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC560410LyR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC560410LyR enumC560410LyR = new EnumC560410LyR("PUBLISH", 0, "publish");
        PUBLISH = enumC560410LyR;
        EnumC560410LyR enumC560410LyR2 = new EnumC560410LyR("SAVE_DRAFT", 1, "save_draft");
        SAVE_DRAFT = enumC560410LyR2;
        EnumC560410LyR enumC560410LyR3 = new EnumC560410LyR("APP_LEAVE", 2, "app_leave");
        APP_LEAVE = enumC560410LyR3;
        EnumC560410LyR enumC560410LyR4 = new EnumC560410LyR("APP_KILLED", 3, "app_killed");
        APP_KILLED = enumC560410LyR4;
        EnumC560410LyR enumC560410LyR5 = new EnumC560410LyR("SCREEN_LOCK", 4, "screen_lock");
        SCREEN_LOCK = enumC560410LyR5;
        EnumC560410LyR enumC560410LyR6 = new EnumC560410LyR("CLOSE_VIDEO_SHOOT_PAGE", 5, "close_video_shoot_page");
        CLOSE_VIDEO_SHOOT_PAGE = enumC560410LyR6;
        EnumC560410LyR enumC560410LyR7 = new EnumC560410LyR("CLOSE_UPLOAD_PAGE", 6, "close_upload_page");
        CLOSE_UPLOAD_PAGE = enumC560410LyR7;
        EnumC560410LyR enumC560410LyR8 = new EnumC560410LyR("OTHERS", 7, "others");
        OTHERS = enumC560410LyR8;
        EnumC560410LyR[] enumC560410LyRArr = {enumC560410LyR, enumC560410LyR2, enumC560410LyR3, enumC560410LyR4, enumC560410LyR5, enumC560410LyR6, enumC560410LyR7, enumC560410LyR8};
        LLILLJJLI = enumC560410LyRArr;
        LLILLL = new C2254308sP(enumC560410LyRArr);
    }

    public static EnumC560410LyR[] values() {
        return (EnumC560410LyR[]) LLILLJJLI.clone();
    }

    public final String getWay() {
        return this.LL;
    }

    public static EnumC560410LyR valueOf(String str) {
        return (EnumC560410LyR) C08FF.LIZ(EnumC560410LyR.class, str);
    }

    public EnumC560410LyR(String str, int i, String str2) {
        this.LL = str2;
    }
}
