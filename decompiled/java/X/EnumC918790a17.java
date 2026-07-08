package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a17, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918790a17 {
    public static final EnumC918790a17 CLOSE_MODE;
    public static final EnumC918790a17 CLOSE_PERMISSION_FROM_VIEWERS;
    public static final EnumC918790a17 DEFAULT_MODE;
    public static final EnumC918790a17 LINK_MANAGEMENT_PANEL;
    public static final /* synthetic */ EnumC918790a17[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC918790a17 MANUAL_SETTING;
    public static final EnumC918790a17 OPEN_MODE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC918790a17> getEntries() {
        return LLILLL;
    }

    static {
        EnumC918790a17 enumC918790a17 = new EnumC918790a17("DEFAULT_MODE", 0, "default_mode");
        DEFAULT_MODE = enumC918790a17;
        EnumC918790a17 enumC918790a172 = new EnumC918790a17("MANUAL_SETTING", 1, "manual_setting");
        MANUAL_SETTING = enumC918790a172;
        EnumC918790a17 enumC918790a173 = new EnumC918790a17("CLOSE_MODE", 2, "close_mode");
        CLOSE_MODE = enumC918790a173;
        EnumC918790a17 enumC918790a174 = new EnumC918790a17("CLOSE_PERMISSION_FROM_VIEWERS", 3, "close_permission_from_viewers");
        CLOSE_PERMISSION_FROM_VIEWERS = enumC918790a174;
        EnumC918790a17 enumC918790a175 = new EnumC918790a17("OPEN_MODE", 4, "open_mode");
        OPEN_MODE = enumC918790a175;
        EnumC918790a17 enumC918790a176 = new EnumC918790a17("LINK_MANAGEMENT_PANEL", 5, "link_management_panel");
        LINK_MANAGEMENT_PANEL = enumC918790a176;
        EnumC918790a17[] enumC918790a17Arr = {enumC918790a17, enumC918790a172, enumC918790a173, enumC918790a174, enumC918790a175, enumC918790a176};
        LLILLJJLI = enumC918790a17Arr;
        LLILLL = new C2254308sP(enumC918790a17Arr);
    }

    public static EnumC918790a17[] values() {
        return (EnumC918790a17[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC918790a17 valueOf(String str) {
        return (EnumC918790a17) C08FF.LIZ(EnumC918790a17.class, str);
    }

    public EnumC918790a17(String str, int i, String str2) {
        this.LL = str2;
    }
}
