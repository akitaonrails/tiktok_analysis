package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083180eIG {
    public static final EnumC1083180eIG BACK_BUTTON;
    public static final EnumC1083180eIG FULL_SCREEN_BTN;
    public static final EnumC1083180eIG LINK_MIC;
    public static final /* synthetic */ EnumC1083180eIG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083180eIG OTHER;
    public static final EnumC1083180eIG PAUSE_LIVE;
    public static final EnumC1083180eIG ZOOM_OUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1083180eIG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1083180eIG enumC1083180eIG = new EnumC1083180eIG("ZOOM_OUT", 0, "zoom_out");
        ZOOM_OUT = enumC1083180eIG;
        EnumC1083180eIG enumC1083180eIG2 = new EnumC1083180eIG("BACK_BUTTON", 1, "back_btn");
        BACK_BUTTON = enumC1083180eIG2;
        EnumC1083180eIG enumC1083180eIG3 = new EnumC1083180eIG("LINK_MIC", 2, "anchor_start_multi");
        LINK_MIC = enumC1083180eIG3;
        EnumC1083180eIG enumC1083180eIG4 = new EnumC1083180eIG("PAUSE_LIVE", 3, "anchor_pause_live");
        PAUSE_LIVE = enumC1083180eIG4;
        EnumC1083180eIG enumC1083180eIG5 = new EnumC1083180eIG("FULL_SCREEN_BTN", 4, "fullscreen_btn");
        FULL_SCREEN_BTN = enumC1083180eIG5;
        EnumC1083180eIG enumC1083180eIG6 = new EnumC1083180eIG("OTHER", 5, "other");
        OTHER = enumC1083180eIG6;
        EnumC1083180eIG[] enumC1083180eIGArr = {enumC1083180eIG, enumC1083180eIG2, enumC1083180eIG3, enumC1083180eIG4, enumC1083180eIG5, enumC1083180eIG6};
        LLILLJJLI = enumC1083180eIGArr;
        LLILLL = new C2254308sP(enumC1083180eIGArr);
    }

    public static EnumC1083180eIG[] values() {
        return (EnumC1083180eIG[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1083180eIG valueOf(String str) {
        return (EnumC1083180eIG) C08FF.LIZ(EnumC1083180eIG.class, str);
    }

    public EnumC1083180eIG(String str, int i, String str2) {
        this.LL = str2;
    }
}
