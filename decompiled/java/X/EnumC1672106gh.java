package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1672106gh {
    public static final EnumC1672106gh DM_CHAT_REQUEST_PAGE;
    public static final EnumC1672106gh DM_SETTINGS_BOTTOM_SHEET;
    public static final EnumC1672106gh DM_SETTINGS_POPUP;
    public static final /* synthetic */ EnumC1672106gh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1672106gh SEND_MESSAGE_NO_ONE_PERMISSION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1672106gh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1672106gh enumC1672106gh = new EnumC1672106gh("SEND_MESSAGE_NO_ONE_PERMISSION", 0, 1);
        SEND_MESSAGE_NO_ONE_PERMISSION = enumC1672106gh;
        EnumC1672106gh enumC1672106gh2 = new EnumC1672106gh("DM_SETTINGS_BOTTOM_SHEET", 1, 1);
        DM_SETTINGS_BOTTOM_SHEET = enumC1672106gh2;
        EnumC1672106gh enumC1672106gh3 = new EnumC1672106gh("DM_SETTINGS_POPUP", 2, 2);
        DM_SETTINGS_POPUP = enumC1672106gh3;
        EnumC1672106gh enumC1672106gh4 = new EnumC1672106gh("DM_CHAT_REQUEST_PAGE", 3, 3);
        DM_CHAT_REQUEST_PAGE = enumC1672106gh4;
        EnumC1672106gh[] enumC1672106ghArr = {enumC1672106gh, enumC1672106gh2, enumC1672106gh3, enumC1672106gh4};
        LLILLJJLI = enumC1672106ghArr;
        LLILLL = new C2254308sP(enumC1672106ghArr);
    }

    public static EnumC1672106gh[] values() {
        return (EnumC1672106gh[]) LLILLJJLI.clone();
    }

    public final int getEventTrackingConstant() {
        return this.LL;
    }

    public static EnumC1672106gh valueOf(String str) {
        return (EnumC1672106gh) C08FF.LIZ(EnumC1672106gh.class, str);
    }

    public EnumC1672106gh(String str, int i, int i2) {
        this.LL = i2;
    }
}
