package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC539160LCo {
    public static final /* synthetic */ EnumC539160LCo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC539160LCo VIDEO_EDIT_PAGE;
    public static final EnumC539160LCo VIDEO_SHOOT_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC539160LCo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC539160LCo enumC539160LCo = new EnumC539160LCo("VIDEO_EDIT_PAGE", 0, "video_edit_page");
        VIDEO_EDIT_PAGE = enumC539160LCo;
        EnumC539160LCo enumC539160LCo2 = new EnumC539160LCo("VIDEO_SHOOT_PAGE", 1, "video_shoot_page");
        VIDEO_SHOOT_PAGE = enumC539160LCo2;
        EnumC539160LCo[] enumC539160LCoArr = {enumC539160LCo, enumC539160LCo2};
        LLILLJJLI = enumC539160LCoArr;
        LLILLL = new C2254308sP(enumC539160LCoArr);
    }

    public static EnumC539160LCo[] values() {
        return (EnumC539160LCo[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC539160LCo valueOf(String str) {
        return (EnumC539160LCo) C08FF.LIZ(EnumC539160LCo.class, str);
    }

    public EnumC539160LCo(String str, int i, String str2) {
        this.LL = str2;
    }
}
