package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ulk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC781860Ulk {
    public static final EnumC781860Ulk ADVANCED_MESSAGE_BLOCK;
    public static final EnumC781860Ulk BANNER_EXPAND_BLOCK;
    public static final EnumC781860Ulk GIFT_EFFECT_BLOCK;
    public static final EnumC781860Ulk GIFT_LYNX_ANIMATION_BLOCK;
    public static final EnumC781860Ulk GIFT_TRACKING_BLOCK_FIRST;
    public static final EnumC781860Ulk GIFT_TRACKING_BLOCK_SECOND;
    public static final EnumC781860Ulk GIFT_TRAY_ANIMATION_BLOCK;
    public static final /* synthetic */ EnumC781860Ulk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC781860Ulk MIDDLE_TOUCH_EXPAND_DISABLE;
    public static final EnumC781860Ulk PRIVILEGE_BARRAGE_ANIMATION_FPS_REDUCE;
    public static final EnumC781860Ulk PRIVILEGE_BARRAGE_BLOCK;
    public static final EnumC781860Ulk RANK_BANNER_SWITCH_BLOCK;
    public static final EnumC781860Ulk RANK_BANNER_SWITCH_INTERVAL_INCREASE;
    public static final EnumC781860Ulk TOUCH_AREA_DOWNGRADE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC781860Ulk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC781860Ulk enumC781860Ulk = new EnumC781860Ulk("RANK_BANNER_SWITCH_INTERVAL_INCREASE", 0, "rank_banner_switch_interval_increase");
        RANK_BANNER_SWITCH_INTERVAL_INCREASE = enumC781860Ulk;
        EnumC781860Ulk enumC781860Ulk2 = new EnumC781860Ulk("RANK_BANNER_SWITCH_BLOCK", 1, "rank_banner_switch_block");
        RANK_BANNER_SWITCH_BLOCK = enumC781860Ulk2;
        EnumC781860Ulk enumC781860Ulk3 = new EnumC781860Ulk("ADVANCED_MESSAGE_BLOCK", 2, "advanced_message_block");
        ADVANCED_MESSAGE_BLOCK = enumC781860Ulk3;
        EnumC781860Ulk enumC781860Ulk4 = new EnumC781860Ulk("PRIVILEGE_BARRAGE_BLOCK", 3, "privilege_barrage_block");
        PRIVILEGE_BARRAGE_BLOCK = enumC781860Ulk4;
        EnumC781860Ulk enumC781860Ulk5 = new EnumC781860Ulk("PRIVILEGE_BARRAGE_ANIMATION_FPS_REDUCE", 4, "privilege_barrage_animation_fps_reduce");
        PRIVILEGE_BARRAGE_ANIMATION_FPS_REDUCE = enumC781860Ulk5;
        EnumC781860Ulk enumC781860Ulk6 = new EnumC781860Ulk("GIFT_TRAY_ANIMATION_BLOCK", 5, "gift_tray_animation_block");
        GIFT_TRAY_ANIMATION_BLOCK = enumC781860Ulk6;
        EnumC781860Ulk enumC781860Ulk7 = new EnumC781860Ulk("GIFT_LYNX_ANIMATION_BLOCK", 6, "gift_lynx_animation_block");
        GIFT_LYNX_ANIMATION_BLOCK = enumC781860Ulk7;
        EnumC781860Ulk enumC781860Ulk8 = new EnumC781860Ulk("GIFT_TRACKING_BLOCK_FIRST", 7, "gift_tracking_block_first");
        GIFT_TRACKING_BLOCK_FIRST = enumC781860Ulk8;
        EnumC781860Ulk enumC781860Ulk9 = new EnumC781860Ulk("GIFT_TRACKING_BLOCK_SECOND", 8, "gift_tracking_block_second");
        GIFT_TRACKING_BLOCK_SECOND = enumC781860Ulk9;
        EnumC781860Ulk enumC781860Ulk10 = new EnumC781860Ulk("GIFT_EFFECT_BLOCK", 9, "gift_effect_block");
        GIFT_EFFECT_BLOCK = enumC781860Ulk10;
        EnumC781860Ulk enumC781860Ulk11 = new EnumC781860Ulk("TOUCH_AREA_DOWNGRADE", 10, "touch_area_downgrade");
        TOUCH_AREA_DOWNGRADE = enumC781860Ulk11;
        EnumC781860Ulk enumC781860Ulk12 = new EnumC781860Ulk("BANNER_EXPAND_BLOCK", 11, "banner_expand_block");
        BANNER_EXPAND_BLOCK = enumC781860Ulk12;
        EnumC781860Ulk enumC781860Ulk13 = new EnumC781860Ulk("MIDDLE_TOUCH_EXPAND_DISABLE", 12, "middle_touch_expand_disable");
        MIDDLE_TOUCH_EXPAND_DISABLE = enumC781860Ulk13;
        EnumC781860Ulk[] enumC781860UlkArr = {enumC781860Ulk, enumC781860Ulk2, enumC781860Ulk3, enumC781860Ulk4, enumC781860Ulk5, enumC781860Ulk6, enumC781860Ulk7, enumC781860Ulk8, enumC781860Ulk9, enumC781860Ulk10, enumC781860Ulk11, enumC781860Ulk12, enumC781860Ulk13};
        LLILLJJLI = enumC781860UlkArr;
        LLILLL = new C2254308sP(enumC781860UlkArr);
    }

    public static EnumC781860Ulk[] values() {
        return (EnumC781860Ulk[]) LLILLJJLI.clone();
    }

    public final String getFeatureName() {
        return this.LL;
    }

    public static EnumC781860Ulk valueOf(String str) {
        return (EnumC781860Ulk) C08FF.LIZ(EnumC781860Ulk.class, str);
    }

    public EnumC781860Ulk(String str, int i, String str2) {
        this.LL = str2;
    }
}
