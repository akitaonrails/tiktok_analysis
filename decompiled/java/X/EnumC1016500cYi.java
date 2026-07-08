package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1016500cYi {
    public static final EnumC1016500cYi DOWNLOAD_SERVICE_CANCELLED;
    public static final EnumC1016500cYi DOWNLOAD_SERVICE_FAILED;
    public static final /* synthetic */ EnumC1016500cYi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1016500cYi VIDEO_ID_IS_EMPTY;
    public static final EnumC1016500cYi VIDEO_URL_LIST_EMPTY;
    public String LL;

    public static InterfaceC2044707zh<EnumC1016500cYi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1016500cYi enumC1016500cYi = new EnumC1016500cYi("VIDEO_URL_LIST_EMPTY", 0, "video_url_list_empty");
        VIDEO_URL_LIST_EMPTY = enumC1016500cYi;
        EnumC1016500cYi enumC1016500cYi2 = new EnumC1016500cYi("VIDEO_ID_IS_EMPTY", 1, "video_id_is_empty");
        VIDEO_ID_IS_EMPTY = enumC1016500cYi2;
        EnumC1016500cYi enumC1016500cYi3 = new EnumC1016500cYi("DOWNLOAD_SERVICE_FAILED", 2, "download_service_failed");
        DOWNLOAD_SERVICE_FAILED = enumC1016500cYi3;
        EnumC1016500cYi enumC1016500cYi4 = new EnumC1016500cYi("DOWNLOAD_SERVICE_CANCELLED", 3, "download_service_cancelled");
        DOWNLOAD_SERVICE_CANCELLED = enumC1016500cYi4;
        EnumC1016500cYi[] enumC1016500cYiArr = {enumC1016500cYi, enumC1016500cYi2, enumC1016500cYi3, enumC1016500cYi4};
        LLILLJJLI = enumC1016500cYiArr;
        LLILLL = new C2254308sP(enumC1016500cYiArr);
    }

    public static EnumC1016500cYi[] values() {
        return (EnumC1016500cYi[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1016500cYi valueOf(String str) {
        return (EnumC1016500cYi) C08FF.LIZ(EnumC1016500cYi.class, str);
    }

    public final void setReason(String str) {
        this.LL = str;
    }

    public EnumC1016500cYi(String str, int i, String str2) {
        this.LL = str2;
    }
}
