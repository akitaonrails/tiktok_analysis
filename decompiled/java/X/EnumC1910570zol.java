package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1910570zol {
    public static final /* synthetic */ EnumC1910570zol[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1910570zol PROFILE;
    public static final EnumC1910570zol STICKER;
    public static final EnumC1910570zol VIDEO_POST_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1910570zol> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1910570zol enumC1910570zol = new EnumC1910570zol("PROFILE", 0, "profile");
        PROFILE = enumC1910570zol;
        EnumC1910570zol enumC1910570zol2 = new EnumC1910570zol("STICKER", 1, "sticker");
        STICKER = enumC1910570zol2;
        EnumC1910570zol enumC1910570zol3 = new EnumC1910570zol("VIDEO_POST_PAGE", 2, "video_post_page");
        VIDEO_POST_PAGE = enumC1910570zol3;
        EnumC1910570zol[] enumC1910570zolArr = {enumC1910570zol, enumC1910570zol2, enumC1910570zol3};
        LLILLJJLI = enumC1910570zolArr;
        LLILLL = new C2254308sP(enumC1910570zolArr);
    }

    public static EnumC1910570zol[] values() {
        return (EnumC1910570zol[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1910570zol valueOf(String str) {
        return (EnumC1910570zol) C08FF.LIZ(EnumC1910570zol.class, str);
    }

    public EnumC1910570zol(String str, int i, String str2) {
        this.LL = str2;
    }
}
