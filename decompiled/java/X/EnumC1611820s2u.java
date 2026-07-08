package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1611820s2u {
    public static final EnumC1611820s2u DETAIL_FAILED;
    public static final EnumC1611820s2u DETAIL_SUCCESS;
    public static final EnumC1611820s2u FIRST_FRAME_RENDER;
    public static final EnumC1611820s2u FIRST_SERIES_LOCKED;
    public static final /* synthetic */ EnumC1611820s2u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1611820s2u START;
    public static final EnumC1611820s2u VIDEO_FAILED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1611820s2u> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1611820s2u enumC1611820s2u = new EnumC1611820s2u("START", 0, "start");
        START = enumC1611820s2u;
        EnumC1611820s2u enumC1611820s2u2 = new EnumC1611820s2u("DETAIL_SUCCESS", 1, "detail_success");
        DETAIL_SUCCESS = enumC1611820s2u2;
        EnumC1611820s2u enumC1611820s2u3 = new EnumC1611820s2u("FIRST_FRAME_RENDER", 2, "first_frame_success");
        FIRST_FRAME_RENDER = enumC1611820s2u3;
        EnumC1611820s2u enumC1611820s2u4 = new EnumC1611820s2u("FIRST_SERIES_LOCKED", 3, "first_series_locked");
        FIRST_SERIES_LOCKED = enumC1611820s2u4;
        EnumC1611820s2u enumC1611820s2u5 = new EnumC1611820s2u("DETAIL_FAILED", 4, "detail_api_failed");
        DETAIL_FAILED = enumC1611820s2u5;
        EnumC1611820s2u enumC1611820s2u6 = new EnumC1611820s2u("VIDEO_FAILED", 5, "video_api_failed");
        VIDEO_FAILED = enumC1611820s2u6;
        EnumC1611820s2u[] enumC1611820s2uArr = {enumC1611820s2u, enumC1611820s2u2, enumC1611820s2u3, enumC1611820s2u4, enumC1611820s2u5, enumC1611820s2u6};
        LLILLJJLI = enumC1611820s2uArr;
        LLILLL = new C2254308sP(enumC1611820s2uArr);
    }

    public static EnumC1611820s2u[] values() {
        return (EnumC1611820s2u[]) LLILLJJLI.clone();
    }

    public final String getStage() {
        return this.LL;
    }

    public static EnumC1611820s2u valueOf(String str) {
        return (EnumC1611820s2u) C08FF.LIZ(EnumC1611820s2u.class, str);
    }

    public EnumC1611820s2u(String str, int i, String str2) {
        this.LL = str2;
    }
}
