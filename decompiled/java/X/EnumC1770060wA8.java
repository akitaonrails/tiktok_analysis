package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770060wA8 {
    public static final EnumC1770060wA8 ANCHOR_PANEL_HIDE_HANDLED;
    public static final EnumC1770060wA8 DIVERSION_CONFIG_NULL;
    public static final /* synthetic */ EnumC1770060wA8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1770060wA8 ORDER_SUBMITTED;
    public static final EnumC1770060wA8 RESPONSE_NULL;
    public static final EnumC1770060wA8 TOOLTIP_SHOWING;
    public static final EnumC1770060wA8 VIDEO_GUIDE_SHOWED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1770060wA8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1770060wA8 enumC1770060wA8 = new EnumC1770060wA8("ORDER_SUBMITTED", 0, "order_submitted");
        ORDER_SUBMITTED = enumC1770060wA8;
        EnumC1770060wA8 enumC1770060wA82 = new EnumC1770060wA8("TOOLTIP_SHOWING", 1, "tooltip_showing");
        TOOLTIP_SHOWING = enumC1770060wA82;
        EnumC1770060wA8 enumC1770060wA83 = new EnumC1770060wA8("DIVERSION_CONFIG_NULL", 2, "diversion_config_null");
        DIVERSION_CONFIG_NULL = enumC1770060wA83;
        EnumC1770060wA8 enumC1770060wA84 = new EnumC1770060wA8("RESPONSE_NULL", 3, "response_null");
        RESPONSE_NULL = enumC1770060wA84;
        EnumC1770060wA8 enumC1770060wA85 = new EnumC1770060wA8("VIDEO_GUIDE_SHOWED", 4, "video_guide_showed");
        VIDEO_GUIDE_SHOWED = enumC1770060wA85;
        EnumC1770060wA8 enumC1770060wA86 = new EnumC1770060wA8("ANCHOR_PANEL_HIDE_HANDLED", 5, "anchor_panel_hide_handled");
        ANCHOR_PANEL_HIDE_HANDLED = enumC1770060wA86;
        EnumC1770060wA8[] enumC1770060wA8Arr = {enumC1770060wA8, enumC1770060wA82, enumC1770060wA83, enumC1770060wA84, enumC1770060wA85, enumC1770060wA86};
        LLILLJJLI = enumC1770060wA8Arr;
        LLILLL = new C2254308sP(enumC1770060wA8Arr);
    }

    public static EnumC1770060wA8[] values() {
        return (EnumC1770060wA8[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1770060wA8 valueOf(String str) {
        return (EnumC1770060wA8) C08FF.LIZ(EnumC1770060wA8.class, str);
    }

    public EnumC1770060wA8(String str, int i, String str2) {
        this.LL = str2;
    }
}
