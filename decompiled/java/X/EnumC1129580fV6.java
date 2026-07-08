package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1129580fV6 {
    public static final EnumC1129580fV6 GIFT_MATCH_TRAY_LEAF;
    public static final EnumC1129580fV6 GIFT_PANEL_LEAF;
    public static final EnumC1129580fV6 GIFT_PANEL_MULTI_GUEST_SWITCH_TARGET_LEAF;
    public static final EnumC1129580fV6 GIFT_PANEL_MULTI_GUEST_VIEW;
    public static final EnumC1129580fV6 GIFT_PANEL_SUB;
    public static final EnumC1129580fV6 GIFT_PANEL_TAKE_THE_STAGE_LEAF;
    public static final EnumC1129580fV6 GIFT_WIDGET_LEAF;
    public static final /* synthetic */ EnumC1129580fV6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1129580fV6> getEntries() {
        return LLILLL;
    }

    static {
        int i = C1130880fXC.LIZ;
        int i2 = i + 1;
        EnumC1129580fV6 enumC1129580fV6 = new EnumC1129580fV6("GIFT_WIDGET_LEAF", 0, i);
        GIFT_WIDGET_LEAF = enumC1129580fV6;
        int i3 = i2 + 1;
        EnumC1129580fV6 enumC1129580fV62 = new EnumC1129580fV6("GIFT_PANEL_SUB", 1, i2);
        GIFT_PANEL_SUB = enumC1129580fV62;
        int i4 = i3 + 1;
        EnumC1129580fV6 enumC1129580fV63 = new EnumC1129580fV6("GIFT_PANEL_LEAF", 2, i3);
        GIFT_PANEL_LEAF = enumC1129580fV63;
        int i5 = i4 + 1;
        EnumC1129580fV6 enumC1129580fV64 = new EnumC1129580fV6("GIFT_PANEL_MULTI_GUEST_VIEW", 3, i4);
        GIFT_PANEL_MULTI_GUEST_VIEW = enumC1129580fV64;
        int i6 = i5 + 1;
        EnumC1129580fV6 enumC1129580fV65 = new EnumC1129580fV6("GIFT_MATCH_TRAY_LEAF", 4, i5);
        GIFT_MATCH_TRAY_LEAF = enumC1129580fV65;
        int i7 = i6 + 1;
        EnumC1129580fV6 enumC1129580fV66 = new EnumC1129580fV6("GIFT_PANEL_MULTI_GUEST_SWITCH_TARGET_LEAF", 5, i6);
        GIFT_PANEL_MULTI_GUEST_SWITCH_TARGET_LEAF = enumC1129580fV66;
        C1130880fXC.LIZ = i7 + 1;
        EnumC1129580fV6 enumC1129580fV67 = new EnumC1129580fV6("GIFT_PANEL_TAKE_THE_STAGE_LEAF", 6, i7);
        GIFT_PANEL_TAKE_THE_STAGE_LEAF = enumC1129580fV67;
        EnumC1129580fV6[] enumC1129580fV6Arr = {enumC1129580fV6, enumC1129580fV62, enumC1129580fV63, enumC1129580fV64, enumC1129580fV65, enumC1129580fV66, enumC1129580fV67};
        LLILLJJLI = enumC1129580fV6Arr;
        LLILLL = new C2254308sP(enumC1129580fV6Arr);
    }

    public static EnumC1129580fV6[] values() {
        return (EnumC1129580fV6[]) LLILLJJLI.clone();
    }

    public final int getZIndex() {
        return this.LL;
    }

    public static EnumC1129580fV6 valueOf(String str) {
        return (EnumC1129580fV6) C08FF.LIZ(EnumC1129580fV6.class, str);
    }

    public EnumC1129580fV6(String str, int i, int i2) {
        this.LL = i2;
    }
}
