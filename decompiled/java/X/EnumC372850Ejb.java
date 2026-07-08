package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ejb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC372850Ejb {
    public static final /* synthetic */ EnumC372850Ejb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC372850Ejb NAV_BAR_AT_BOTTOM;
    public static final EnumC372850Ejb NAV_BAR_AT_TOP;
    public static final EnumC372850Ejb NAV_BAR_OVERLAY_AT_TOP;
    public static final EnumC372850Ejb NAV_BAR_STYLE_V2;
    public static final EnumC372850Ejb NO_NAV_BAR;

    public static InterfaceC2044707zh<EnumC372850Ejb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC372850Ejb enumC372850Ejb = new EnumC372850Ejb("NAV_BAR_AT_TOP", 0);
        NAV_BAR_AT_TOP = enumC372850Ejb;
        EnumC372850Ejb enumC372850Ejb2 = new EnumC372850Ejb("NAV_BAR_AT_BOTTOM", 1);
        NAV_BAR_AT_BOTTOM = enumC372850Ejb2;
        EnumC372850Ejb enumC372850Ejb3 = new EnumC372850Ejb("NO_NAV_BAR", 2);
        NO_NAV_BAR = enumC372850Ejb3;
        EnumC372850Ejb enumC372850Ejb4 = new EnumC372850Ejb("NAV_BAR_STYLE_V2", 3);
        NAV_BAR_STYLE_V2 = enumC372850Ejb4;
        EnumC372850Ejb enumC372850Ejb5 = new EnumC372850Ejb("NAV_BAR_OVERLAY_AT_TOP", 4);
        NAV_BAR_OVERLAY_AT_TOP = enumC372850Ejb5;
        EnumC372850Ejb[] enumC372850EjbArr = {enumC372850Ejb, enumC372850Ejb2, enumC372850Ejb3, enumC372850Ejb4, enumC372850Ejb5};
        LL = enumC372850EjbArr;
        LLILLJJLI = new C2254308sP(enumC372850EjbArr);
    }

    public static EnumC372850Ejb[] values() {
        return (EnumC372850Ejb[]) LL.clone();
    }

    public final boolean isExist$tools_creative_ui_release() {
        return this != NO_NAV_BAR;
    }

    public final boolean isInBottom$tools_creative_ui_release() {
        return this == NAV_BAR_AT_BOTTOM;
    }

    public final boolean isInTop$tools_creative_ui_release() {
        return this == NAV_BAR_AT_TOP || this == NAV_BAR_STYLE_V2;
    }

    public final boolean isNewStyle$tools_creative_ui_release() {
        return this == NAV_BAR_STYLE_V2;
    }

    public final boolean isOverlayAtTop$tools_creative_ui_release() {
        return this == NAV_BAR_OVERLAY_AT_TOP;
    }

    public static EnumC372850Ejb valueOf(String str) {
        return (EnumC372850Ejb) C08FF.LIZ(EnumC372850Ejb.class, str);
    }

    public EnumC372850Ejb(String str, int i) {
    }
}
