package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC900890ZVv {
    public static final EnumC900890ZVv DELETED_ON_SERVER;
    public static final EnumC900890ZVv FALLBACK_INFO;
    public static final /* synthetic */ EnumC900890ZVv[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC900890ZVv PHOTO_THUMBNAIL_EMPTY;
    public static final EnumC900890ZVv USER_REQUEST_REFRESH;
    public static final EnumC900890ZVv VIDEO_THUMBNAIL_EMPTY;
    public final String LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC900890ZVv> getEntries() {
        return LLILZ;
    }

    static {
        EnumC900890ZVv enumC900890ZVv = new EnumC900890ZVv("USER_REQUEST_REFRESH", 0, "isUserRequestMsgRefresh", false);
        USER_REQUEST_REFRESH = enumC900890ZVv;
        EnumC900890ZVv enumC900890ZVv2 = new EnumC900890ZVv("FALLBACK_INFO", 1, "Fallback info from server or video_model is empty", true);
        FALLBACK_INFO = enumC900890ZVv2;
        EnumC900890ZVv enumC900890ZVv3 = new EnumC900890ZVv("DELETED_ON_SERVER", 2, "msg is expired", true);
        DELETED_ON_SERVER = enumC900890ZVv3;
        EnumC900890ZVv enumC900890ZVv4 = new EnumC900890ZVv("PHOTO_THUMBNAIL_EMPTY", 3, "urlList is empty", false);
        PHOTO_THUMBNAIL_EMPTY = enumC900890ZVv4;
        EnumC900890ZVv enumC900890ZVv5 = new EnumC900890ZVv("VIDEO_THUMBNAIL_EMPTY", 4, "urlList is empty", true);
        VIDEO_THUMBNAIL_EMPTY = enumC900890ZVv5;
        EnumC900890ZVv[] enumC900890ZVvArr = {enumC900890ZVv, enumC900890ZVv2, enumC900890ZVv3, enumC900890ZVv4, enumC900890ZVv5};
        LLILLL = enumC900890ZVvArr;
        LLILZ = new C2254308sP(enumC900890ZVvArr);
    }

    public static EnumC900890ZVv[] values() {
        return (EnumC900890ZVv[]) LLILLL.clone();
    }

    public final String getMsg() {
        return this.LL;
    }

    public final boolean isTerminalState() {
        return this.LLILLJJLI;
    }

    public static EnumC900890ZVv valueOf(String str) {
        return (EnumC900890ZVv) C08FF.LIZ(EnumC900890ZVv.class, str);
    }

    public EnumC900890ZVv(String str, int i, String str2, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = z;
    }
}
