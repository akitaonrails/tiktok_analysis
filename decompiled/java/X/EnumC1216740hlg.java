package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216740hlg {
    public static final EnumC1216740hlg ADD_BIO;
    public static final EnumC1216740hlg EDIT_PROFILE_PAGE;
    public static final /* synthetic */ EnumC1216740hlg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1216740hlg PROFILE_EMPTY_GUIDE;
    public static final EnumC1216740hlg PROFILE_UPDATE_INTRO_BANNER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1216740hlg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1216740hlg enumC1216740hlg = new EnumC1216740hlg("EDIT_PROFILE_PAGE", 0, "edit_profile_page");
        EDIT_PROFILE_PAGE = enumC1216740hlg;
        EnumC1216740hlg enumC1216740hlg2 = new EnumC1216740hlg("ADD_BIO", 1, "add_bio");
        ADD_BIO = enumC1216740hlg2;
        EnumC1216740hlg enumC1216740hlg3 = new EnumC1216740hlg("PROFILE_EMPTY_GUIDE", 2, "profile_empty_guide");
        PROFILE_EMPTY_GUIDE = enumC1216740hlg3;
        EnumC1216740hlg enumC1216740hlg4 = new EnumC1216740hlg("PROFILE_UPDATE_INTRO_BANNER", 3, "profile_update_intro_banner");
        PROFILE_UPDATE_INTRO_BANNER = enumC1216740hlg4;
        EnumC1216740hlg[] enumC1216740hlgArr = {enumC1216740hlg, enumC1216740hlg2, enumC1216740hlg3, enumC1216740hlg4};
        LLILLJJLI = enumC1216740hlgArr;
        LLILLL = new C2254308sP(enumC1216740hlgArr);
    }

    public static EnumC1216740hlg[] values() {
        return (EnumC1216740hlg[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1216740hlg valueOf(String str) {
        return (EnumC1216740hlg) C08FF.LIZ(EnumC1216740hlg.class, str);
    }

    public EnumC1216740hlg(String str, int i, String str2) {
        this.LL = str2;
    }
}
