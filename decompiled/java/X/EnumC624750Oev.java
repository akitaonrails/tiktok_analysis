package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624750Oev {
    public static final C624910OfB Companion;
    public static final /* synthetic */ EnumC624750Oev[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC624750Oev OFFLINE_MODE_PANEL;
    public static final EnumC624750Oev OFFLINE_MODE_SETTING_PANEL;
    public final String LL;
    public final String LLILLJJLI;
    public boolean LLILLL = false;
    public String LLILZ = "";

    public static InterfaceC2044707zh<EnumC624750Oev> getEntries() {
        return LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0OfB] */
    static {
        EnumC624750Oev enumC624750Oev = new EnumC624750Oev("OFFLINE_MODE_SETTING_PANEL", "offline_mode_setting_panel", 0, "show_offline_mode_setting_panel");
        OFFLINE_MODE_SETTING_PANEL = enumC624750Oev;
        EnumC624750Oev enumC624750Oev2 = new EnumC624750Oev("OFFLINE_MODE_PANEL", "offline_mode_panel", 1, "show_offline_mode_panel");
        OFFLINE_MODE_PANEL = enumC624750Oev2;
        EnumC624750Oev[] enumC624750OevArr = {enumC624750Oev, enumC624750Oev2};
        LLILZIL = enumC624750OevArr;
        LLILZLL = new C2254308sP(enumC624750OevArr);
        Companion = new Object() { // from class: X.0OfB
        };
    }

    public static EnumC624750Oev[] values() {
        return (EnumC624750Oev[]) LLILZIL.clone();
    }

    public final String getEnterFrom() {
        return this.LLILZ;
    }

    public final String getPageName() {
        return this.LL;
    }

    public final String getShowEventName() {
        return this.LLILLJJLI;
    }

    public final boolean getWithBack() {
        return this.LLILLL;
    }

    public static EnumC624750Oev valueOf(String str) {
        return (EnumC624750Oev) C08FF.LIZ(EnumC624750Oev.class, str);
    }

    public final void setEnterFrom(String str) {
        this.LLILZ = str;
    }

    public final void setWithBack(boolean z) {
        this.LLILLL = z;
    }

    public EnumC624750Oev(String str, String str2, int i, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
